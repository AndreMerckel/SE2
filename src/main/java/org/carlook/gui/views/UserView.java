package org.carlook.gui.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.*;
import com.vaadin.ui.renderers.ButtonRenderer;
import com.vaadin.ui.renderers.ClickableRenderer;
import com.vaadin.ui.renderers.TextRenderer;
import org.carlook.controller.FahrzeugControl;
import org.carlook.controller.ReservationControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.gui.components.Footer;
import org.carlook.gui.components.Header;
import org.carlook.gui.components.Search;
import org.carlook.gui.windows.ConfirmationWindow;
import org.carlook.model.objects.dto.ReservationDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kunde;
import org.carlook.model.objects.entities.User;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.GridCreator;
import org.carlook.services.util.Roles;
import org.carlook.services.util.Views;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserView extends VerticalLayout implements View {

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {


        User user = (User) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER);

        if(user == null) {
            UI.getCurrent().getNavigator().navigateTo(Views.LOGIN);

        } else {
            try {
                this.setUp();
            } catch (DatabaseException e) {
                e.printStackTrace();
            }
        };
    }

    public UserView(){};

    public void setUp() throws DatabaseException{
        addComponent(new Header(false));

        Grid<Fahrzeug> grid = new GridCreator<Fahrzeug>(new Fahrzeug(), "Vertrieblersicht", Grid.SelectionMode.SINGLE, "headerStyle", "tableStyle").createTable();
        addComponent(new Search<>(grid));

        List<Fahrzeug> allFahrzeuge = FahrzeugControl.fetchAllFahrzeuge();

        grid.setSizeFull();
        grid.setHeightMode(HeightMode.ROW);
        grid.setHeightByRows(allFahrzeuge.size());
        grid.setItems(allFahrzeuge);
        grid.addComponentColumn(fahrzeug -> {
            boolean check = false;
            /*
            if(ReservationControl.checkReserved(((Kunde) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER)).getKundennummer(), fahrzeug.getKennzeichen())) {
                check = true;
            }
            */
             if(ReservationControl.checkReservedSession(fahrzeug.getKennzeichen())){
                 check = true;
             }
            if(check){
                Button button = new Button("Reservierung aufheben");
                button.addClickListener(e -> loescheReservierung(fahrzeug));
                button.addStyleName("redButton");
                return button;
            } else {
                Button button = new Button("Reservieren");
                button.addClickListener(e -> reservieren(fahrzeug));
                button.addStyleName("blueButton");

                return button;
            }
        }).setCaption("Reserviert");
        grid.setRowHeight(60);

        this.addComponent(grid);
        this.addComponent(new Footer());
    }

    private void reservieren(Fahrzeug f){
        ReservationDTO r = new ReservationDTO();
        r.setFahrzeug(f);
        Kunde k = new Kunde();
        k.setKundennummer(((Kunde) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER)).getKundennummer());
        r.setKunde(k);
        r.setKunde(k);
        r.setFahrzeug(f);
        boolean state = false;
        try {
            state = ReservationControl.register(r);
        } catch (DatabaseException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        if (state) {
            UI.getCurrent().addWindow(new ConfirmationWindow("Fahrzeug: " + f.getKennzeichen() + " erfolgreich reserviert!"));
        } else {
            UI.getCurrent().addWindow(new ConfirmationWindow("Error beim Reservieren von Fahrzeug: " + f.getKennzeichen()));
        }
        List<String> res = (List<String>)UI.getCurrent().getSession().getAttribute(Roles.RESERVATIONS);
        res.add(f.getKennzeichen());
        UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
    }

    private void loescheReservierung(Fahrzeug f){
        ReservationDTO r = new ReservationDTO();
        r.setFahrzeug(f);
        Kunde k = new Kunde();
        k.setKundennummer(((Kunde) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER)).getKundennummer());
        r.setKunde(k);
        r.setKunde(k);
        r.setFahrzeug(f);
        boolean state = false;
        try {
            state = ReservationControl.unregister(r);
        } catch (DatabaseException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        if (state) {
            UI.getCurrent().addWindow(new ConfirmationWindow("Reservierung für Fahrzeug: " + f.getKennzeichen() + " erfolgreich aufgehoben!"));
        } else {
            UI.getCurrent().addWindow(new ConfirmationWindow("Error beim löschen von Fahrzeugreservierung: " + f.getKennzeichen()));
        }
        List<String> res = (List<String>)UI.getCurrent().getSession().getAttribute(Roles.RESERVATIONS);
        for (String e : res){
            if(e.equals(f.getKennzeichen())){
                res.remove(e);
                break;
            }
        }
        UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
    }

}

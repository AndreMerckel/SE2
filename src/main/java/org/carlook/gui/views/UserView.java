package org.carlook.gui.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.renderers.ButtonRenderer;
import org.carlook.controller.FahrzeugControl;
import org.carlook.controller.ReservationControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.gui.components.Footer;
import org.carlook.gui.components.Header;
import org.carlook.gui.windows.ConfirmationWindow;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.objects.dto.ReservationDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kunde;
import org.carlook.model.objects.entities.User;
import org.carlook.model.objects.entities.Vertriebler;
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
            this.setUp();
        };
    }

    public UserView(){};

    public void setUp() {
        addComponent(new Header(false));

        List<Fahrzeug> allFahrzeuge = FahrzeugControl.fetchAllFahrzeuge();

        Grid<Fahrzeug> grid = new GridCreator<Fahrzeug>(new Fahrzeug(), "Vertrieblersicht", Grid.SelectionMode.SINGLE, "headerStyle", "tableStyle").createTable();
        grid.setSizeFull();
        grid.setHeightMode(HeightMode.ROW);
        grid.setHeightByRows(allFahrzeuge.size());
        grid.setItems(allFahrzeuge);

        grid.addColumn(fahrzeug -> "Reservieren", new ButtonRenderer<>(clickEvent->{
            Fahrzeug f = new Fahrzeug();
            f = clickEvent.getItem();
            ReservationDTO r = new ReservationDTO();
            r.setFahrzeug(f);
            Kunde k = new Kunde();
            k.setKundennummer(((Kunde)UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER)).getKundennummer());
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
            UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
            clickEvent.getColumn().setCaption("Reserviert!");
        }));

        this.addComponent(grid);
        this.addComponent(new Footer());

    }

}

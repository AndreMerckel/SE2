package org.carlook.gui.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.*;
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
import org.carlook.model.objects.entities.User;
import org.carlook.model.objects.entities.Vertriebler;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.GridCreator;
import org.carlook.services.util.Roles;
import org.carlook.services.util.Views;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalesView extends VerticalLayout implements View {

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {


        User user = (User) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER);

        if(user == null) {
            UI.getCurrent().getNavigator().navigateTo(Views.LOGIN);

        } else {
            this.setUp();
        };
    }

    public SalesView(){};

    public void setUp() {
        addComponent(new Header(false));
        List<Fahrzeug> salesFahrzeuge = FahrzeugControl.fetchFahrzeugeVonVertriebler((Vertriebler) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER));

       Grid<Fahrzeug> grid = new GridCreator<Fahrzeug>(new Fahrzeug(), "Kundensicht", Grid.SelectionMode.SINGLE, "headerStyle", "tableStyle").createTable();
        grid.setSizeFull();
        grid.setHeightMode(HeightMode.ROW);
        grid.setHeightByRows(salesFahrzeuge.size());
        grid.setItems(salesFahrzeuge);

        grid.addColumn(fahrzeug -> "Delete", new ButtonRenderer<>(clickEvent->{
            Fahrzeug f = new Fahrzeug();
            f.setFahrgestellnummer(clickEvent.getItem().getFahrgestellnummer());
            f.setKennzeichen(clickEvent.getItem().getKennzeichen());
            f.setVertriebler(clickEvent.getItem().getVertriebler());
            boolean state = false;
            try {
                state = FahrzeugControl.delete(f, ((Vertriebler) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER)).getVertriebnummer());
            } catch (DatabaseException ex) {
                Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
            if (state) {
                UI.getCurrent().addWindow(new ConfirmationWindow("Fahrzeug: " + f.getKennzeichen() + " erfolgreich gelöscht!"));
            } else {
                UI.getCurrent().addWindow(new ConfirmationWindow("Error beim Löschen von Fahrzeug: " + f.getKennzeichen()));
            }
            salesFahrzeuge.remove(clickEvent.getItem());
            UI.getCurrent().getNavigator().navigateTo(Views.SALESVIEW);
        }));

        this.addComponent(grid);
        this.addComponent(new Footer());

    }

}

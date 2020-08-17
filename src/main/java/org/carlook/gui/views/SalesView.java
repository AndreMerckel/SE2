package org.carlook.gui.views;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.*;
import com.vaadin.ui.renderers.ButtonRenderer;
import org.carlook.controller.LoginControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.NoSuchUserOrPassword;
import org.carlook.gui.components.Footer;
import org.carlook.gui.components.Header;
import org.carlook.gui.components.TextFieldWithIcon.TextFieldWithIcon;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.User;
import org.carlook.model.objects.entities.Vertriebler;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.exampleData.ListSupplier;
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
        this.setSizeFull();
        List<Fahrzeug> salesFahrzeuge = fetchFahrzeugeVonVertriebler((Vertriebler) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER));

       Grid<Fahrzeug> grid = new GridCreator<Fahrzeug>(new Fahrzeug(), "Vertrieblersicht", Grid.SelectionMode.SINGLE, "headerStyle", "tableStyle").createTable();
        grid.setSizeFull();
        grid.setHeightMode(HeightMode.ROW);
        grid.setItems(salesFahrzeuge);

        grid.addColumn(fahrzeug -> "Delete", new ButtonRenderer<>(clickEvent->{
       /*     try {
               FahrzeugDAO.getInstance().
            } catch (DatabaseException ex) {
                Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
*/
            salesFahrzeuge.remove(clickEvent.getItem());
            grid.setItems(salesFahrzeuge);
        }));

        this.addComponent(grid);
        this.addComponent(new Footer());

    }

    public List<Fahrzeug> fetchFahrzeugeVonVertriebler(Vertriebler vertriebler){
        List<Fahrzeug> fahrzeuglist = new ArrayList<>();

        try{
            fahrzeuglist = FahrzeugDAO.getInstance().getFahrzeugeCreatedByVertriebler(vertriebler);
        } catch(Error | DatabaseException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fahrzeuglist;
    }

}

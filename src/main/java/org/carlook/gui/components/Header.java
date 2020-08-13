package org.carlook.gui.components;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.*;
import org.carlook.model.objects.dto.CustomerDTO;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.model.objects.dto.VertrieblerDTO;
import org.carlook.services.util.Roles;
import org.carlook.services.util.Views;

public class Header extends HorizontalLayout {

    //Style
    UserDTO user = null;
    public Header(boolean logo){
        this.setStyleName("header_main");
     Image headLogo = new Image(null, new ThemeResource("img/logo_Mortys.png"));
     headLogo.setWidth(150, Unit.PIXELS);
     headLogo.setStyleName("header_main_logo");
     if(logo) {
         this.addComponent(headLogo);
     }
    HorizontalLayout header_menuBox = new HorizontalLayout();
    header_menuBox.setStyleName("header_main_menuBox");

        // USER FETCHING
        UserDTO user = (UserDTO) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER);

            Label headLabel = new Label("Logged in as: " + (user instanceof VertrieblerDTO ? "Vertriebler: " + ((VertrieblerDTO) user).getVorname() + " " + user.getNachname() + ", "+ user.getNachname() : user instanceof CustomerDTO ? "Kunde: " + user.getVorname() + ", " + user.getNachname() : ""));
            headLabel.addStyleName("header_main_menuBox_headLabel");

        headLogo.addClickListener(e ->{
            if(user instanceof VertrieblerDTO){
                UI.getCurrent().getNavigator().navigateTo(Views.SALESVIEW);
            } else {
                UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
            }
        });



    MenuBar bar = new MenuBar();
    MenuBar.MenuItem item1 = bar.addItem("", null);

    //Loggout
        item1.addItem("Logout", VaadinIcons.SIGN_OUT, new MenuBar.Command() {
            @Override
            public void menuSelected(MenuBar.MenuItem menuItem) {
                /*LoginControl.logoutUser()*/;
            }
        });


        item1.addItem("Suche", VaadinIcons.SEARCH, new MenuBar.Command() {
            @Override
            public void menuSelected(MenuBar.MenuItem menuItem) {
                if(user instanceof VertrieblerDTO){
                    UI.getCurrent().getNavigator().navigateTo(Views.SALESVIEW);
                } else {
                    UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
                }
            }
        });

        this.addComponent(header_menuBox);

    }

    }


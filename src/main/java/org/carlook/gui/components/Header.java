package org.carlook.gui.components;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.*;
import org.carlook.controller.LoginControl;
import org.carlook.model.objects.dto.CustomerDTO;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.model.objects.dto.VertrieblerDTO;
import org.carlook.model.objects.entities.User;
import org.carlook.services.util.Roles;
import org.carlook.services.util.StatusUser;
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
     System.out.println("ok");

    HorizontalLayout header_menuBox = new HorizontalLayout();
    header_menuBox.setStyleName("header_main_menuBox");

        // USER FETCHING
        User user = (User) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER);
        StatusUser statusUser = (StatusUser) UI.getCurrent().getSession().getAttribute(Roles.STATUS);

        //TODO - Rolle anhand einer Datanbank abfrage erfragen
            Label headLabel = new Label(user != null ? "Logged in as: " + ((statusUser == StatusUser.VERTRIEBLER ? Roles.VERTRIEBLER : Roles.KUNDE) + ": " + user.getVorname() + " " + user.getNachname() + ", " + user.getNachname()): "");
            headLabel.addStyleName("header_main_menuBox_headLabel");

        headLogo.addClickListener(e ->{
            if(statusUser == StatusUser.VERTRIEBLER){
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
                LoginControl.logoutUser();
            }
        });


        item1.addItem("Suche", VaadinIcons.SEARCH, new MenuBar.Command() {
            @Override
            public void menuSelected(MenuBar.MenuItem menuItem) {
                if(statusUser == StatusUser.VERTRIEBLER){
                    UI.getCurrent().getNavigator().navigateTo(Views.SALESVIEW);
                } else {
                    UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
                }
            }
        });

            if(user != null) {
                header_menuBox.addComponent(headLabel);
                header_menuBox.addComponent(bar);
            }
        this.addComponent(header_menuBox);

    }

    }


package org.carlook.gui.components;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.*;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import org.carlook.controller.LoginControl;
import org.carlook.gui.windows.CreateFahrzeug;
import org.carlook.model.objects.dto.UserDTO;
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

    HorizontalLayout header_menuBox = new HorizontalLayout();
    header_menuBox.setStyleName("header_main_menuBox");

        // USER FETCHING
        User user = (User) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER);
        StatusUser statusUser = (StatusUser) UI.getCurrent().getSession().getAttribute(Roles.STATUS);

            Label headLabel = new Label(user != null ? "Logged in as " + ((statusUser == StatusUser.VERTRIEBLER ? Roles.VERTRIEBLER : Roles.KUNDE) + ": " + user.getVorname() + " " + user.getNachname() + ", " + user.getEmail()): "");
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


        if (statusUser == StatusUser.VERTRIEBLER){
            item1.addItem("Meine Fahrzeuge", VaadinIcons.CAR, new MenuBar.Command() {
                @Override
                public void menuSelected(MenuBar.MenuItem menuItem) {
                        UI.getCurrent().getNavigator().navigateTo(Views.SALESVIEW);
                }
            });
        } else {
            item1.addItem("Suche", VaadinIcons.SEARCH, new MenuBar.Command() {
                @Override
                public void menuSelected(MenuBar.MenuItem menuItem) {
                        UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
                }
            });
        }

        if(statusUser == StatusUser.VERTRIEBLER) {
            item1.addItem("Fahrzeug hinzufügen", VaadinIcons.PLUS_CIRCLE, new MenuBar.Command() {
                @Override
                public void menuSelected(MenuBar.MenuItem selectedItem) {
                    UI.getCurrent().addWindow(new CreateFahrzeug());
                }
            });
        }


            if(user != null) {
                header_menuBox.addComponent(headLabel);
                header_menuBox.addComponent(bar);
            }
        this.addComponent(header_menuBox);

    }

    }


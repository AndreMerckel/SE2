package org.carlook.gui.components;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

public class Footer extends HorizontalLayout{
    public Footer(){
        this.setStyleName("footer_main");
        HorizontalLayout hlayout = new HorizontalLayout();
        hlayout.setStyleName("footer_main_container");

        //USER FETCHING BITTE AUSKOMMENTIEREN WENN USER VERFÜGBAR
        //    User user = (User) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER);


        Label copyRight = new Label("- Carlook, coded by: André Merkel, Martin Müller -");
        copyRight.addStyleName("footer_main_container_copyRight");

        hlayout.addComponent(copyRight);
        this.addComponent(hlayout);

    }
}

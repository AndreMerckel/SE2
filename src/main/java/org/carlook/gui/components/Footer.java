package org.carlook.gui.components;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import org.carlook.services.util.Parameter;

/**
 * Fusszeile
 */
public class Footer extends HorizontalLayout {

    /**
     * Standart - Konstruktor
     */
    public Footer() {

        this.setStyleName("footer_main");
        HorizontalLayout hlayout = new HorizontalLayout();
        hlayout.setStyleName("footer_main_container");

        Label copyRight = new Label(Parameter.COPY_RIGHT);
        hlayout.addComponent(copyRight);
        hlayout.setComponentAlignment(copyRight, Alignment.MIDDLE_CENTER);
        this.addComponent(hlayout);
    }
}

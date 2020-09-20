package org.carlook.gui.windows;


import com.vaadin.ui.*;

/**
 * Bestaetigungsfenster
 */
public class ConfirmationWindow extends Window {

    /**
     * Konstruktor, der einen String annimmt
     * @param text
     */
    public ConfirmationWindow(String text){
        super("Confirmation");
        center();
        setModal(true);
        setResizable(false);

        //Some basic content for the window
        VerticalLayout content = new VerticalLayout();
        content.addComponent(new Label(text));
        content.setMargin(true);
        setContent(content);

        Button confirmButton = new Button("OK");
        confirmButton.addStyleName("confirmButton");
        confirmButton.addClickListener(event -> {
           close();
        });
        content.addComponent(confirmButton);
        content.setComponentAlignment(confirmButton, Alignment.MIDDLE_CENTER);
    }

}

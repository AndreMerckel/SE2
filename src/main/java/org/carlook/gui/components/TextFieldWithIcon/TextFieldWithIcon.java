package org.carlook.gui.components.TextFieldWithIcon;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

/**
 * Komponent zur Erstellung von Textfelder mit Icons
 */
public class TextFieldWithIcon extends HorizontalLayout {
    Label textlabel;
    Label label;
    String placeholder;
    HorizontalLayout innerLayout;
    HorizontalLayout overLayout;
    TextField textField;

    /**
     *
     * @param textField
     * @param placeholder
     * @param label
     */
    public TextFieldWithIcon(TextField textField, String placeholder, Label label) {
        this.textField = textField;
        textField.setWidth("20rem");
        textField.setId(placeholder);
        this.setWidth("" + textField.getWidth());
        this.placeholder = placeholder;
        this.SetUpComponent(placeholder, label);
    }

    /**
     *
     * @param placeholder
     * @param label
     */
    public void SetUpComponent(String placeholder, Label label) {
        textField.setStyleName("textfieldwidth");
        this.setStyleName("textfieldwidth");
        this.setStyleName("textfieldWithIcon");
        overLayout = new HorizontalLayout();
        innerLayout = new HorizontalLayout();
        innerLayout.setStyleName("innerLayout");
        this.label = label;
        this.label.setStyleName("textfieldicon");


        textlabel = new Label(placeholder);
        textlabel.setStyleName("textfieldplaceholder");

        innerLayout.addComponents(this.label, textlabel);
        overLayout.addComponents(this.textField, innerLayout);
        overLayout.setStyleName("overLayout");
        this.addComponents(overLayout);


        this.textField.addFocusListener(focusEvent -> {
            if(innerLayout.isAttached()) this.detachPlaceHolder();
        });

        this.textField.addBlurListener(blurEvent -> {
            if (this.textField.isEmpty()) this.attachPlaceHolder();
        });

        this.addLayoutClickListener(layoutClickEvent -> {
            this.textField.focus();
        });

    }
    private void detachPlaceHolder() {
        overLayout.removeComponent(innerLayout);
    }

    private void attachPlaceHolder() { overLayout.addComponent(innerLayout);    }

    /**
     * gibt den Wert des Textfeldes zurueck
     */
    public String getValue() {
        return this.textField.getValue();
    }

    /**
     * gibt die Überschrift des Textfeldes zurueck
     */
    public String getCaption(){return this.placeholder;}

    /**
     * setzt einen Wert im Textfeld
     * @param value
     */
    public void setValue(String value){
        this.textField.setValue(value);
    }


}

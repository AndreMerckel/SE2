package org.carlook.gui.components;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class TextFieldWithIcon<T extends String> extends HorizontalLayout {
    TextField textField = new TextField();
    Label textlabel;
    Label label;
    T placeholder;
    HorizontalLayout innerLayout;
    HorizontalLayout overLayout;

    public TextFieldWithIcon(T placeholder, Label label) {
        this.textField.setWidth("8%");
        this.setWidth("" + textField.getWidth());
        this.placeholder = placeholder;

        this.SetUpComponent(placeholder, label);
    }


    public void SetUpComponent(T placeholder, Label label) {
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

    public String getValue() {
        return this.textField.getValue();
    }




}

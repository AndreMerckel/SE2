package org.carlook.gui.components;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import org.carlook.gui.components.TextFieldWithIcon.TextFieldWithIcon;

public class Search extends HorizontalLayout {
    public Search() {

        Label markeFieldLabel = new Label();
        markeFieldLabel.setIcon(VaadinIcons.USER);
        TextFieldWithIcon<String> markeField = new TextFieldWithIcon<String>("Hersteller", markeFieldLabel, false);

        Label modelFieldLabel = new Label();
        modelFieldLabel.setIcon(VaadinIcons.USER);
        TextFieldWithIcon<String> modelField = new TextFieldWithIcon<String>("Modell", modelFieldLabel, false);

        Label baujahrFieldLabel = new Label();
        baujahrFieldLabel.setIcon(VaadinIcons.USER);
        TextFieldWithIcon<String> baujahrField = new TextFieldWithIcon<String>("Baujahr", baujahrFieldLabel, false);

        Label kraftstoffFieldLabel = new Label();
        kraftstoffFieldLabel.setIcon(VaadinIcons.USER);
        TextFieldWithIcon<String> kraftstoffField = new TextFieldWithIcon<String>("Kraftstoff", kraftstoffFieldLabel, false);

    }
}

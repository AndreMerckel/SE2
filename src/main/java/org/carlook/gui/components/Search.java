package org.carlook.gui.components;

import com.vaadin.data.HasValue;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import org.carlook.gui.components.TextFieldWithIcon.TextFieldWithIcon;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.services.util.DBTables;
import org.carlook.services.util.OtherMethods;

public class Search<T> extends HorizontalLayout {
    Grid<T> grid;
    public Search(Grid<T> grid) {
        this.grid = grid;
        this.setup();

    }

    public void setup() {

        Label markeFieldLabel = new Label();
        markeFieldLabel.setIcon(VaadinIcons.USER);
        TextField makeField = new TextField();
        TextFieldWithIcon markeTextField = new TextFieldWithIcon(makeField, OtherMethods.getStringWithFirstUpperLetter(DBTables.Fahrzeug.COL_HERSTELLER), markeFieldLabel);

        Label modelFieldLabel = new Label();
        modelFieldLabel.setIcon(VaadinIcons.USER);
        TextField modelField = new TextField();
        TextFieldWithIcon modelTextField = new TextFieldWithIcon(modelField, OtherMethods.getStringWithFirstUpperLetter(DBTables.Fahrzeug.COL_MODELL), modelFieldLabel);

        Label baujahrFieldLabel = new Label();
        baujahrFieldLabel.setIcon(VaadinIcons.USER);
        TextField baujahrField = new TextField();
        TextFieldWithIcon baujahrTextField = new TextFieldWithIcon(baujahrField, OtherMethods.getStringWithFirstUpperLetter(DBTables.Fahrzeug.COL_BAUJAHR), baujahrFieldLabel);

        Label kraftstoffFieldLabel = new Label();
        kraftstoffFieldLabel.setIcon(VaadinIcons.USER);
        TextField kraftstoffField = new TextField();
        TextFieldWithIcon kraftstoffTextField = new TextFieldWithIcon(kraftstoffField, OtherMethods.getStringWithFirstUpperLetter(DBTables.Fahrzeug.COL_KRAFTSTOFF), kraftstoffFieldLabel);

        makeField.addValueChangeListener(this::filter);
        modelField.addValueChangeListener(this::filter);
        baujahrField.addValueChangeListener(this::filter);
        kraftstoffField.addValueChangeListener(this::filter);

        this.addComponent(markeTextField);
        this.addComponent(modelTextField);
        this.addComponent(baujahrTextField);
        this.addComponent(kraftstoffTextField);

        this.setWidth("100%");

    }

    void filter(HasValue.ValueChangeEvent<String> event){
        ListDataProvider<Fahrzeug> dataProvider = (ListDataProvider<Fahrzeug>) grid.getDataProvider();
        dataProvider.setFilter(Fahrzeug::getHersteller, s -> caseInsensitiveContainsString(s, event.getValue()));
        dataProvider.setFilter(Fahrzeug::getModell, s -> caseInsensitiveContainsString(s, event.getValue()));
        dataProvider.setFilter(Fahrzeug::getBaujahr, s -> caseInsensitiveContainsString(s+"", event.getValue()));
        dataProvider.setFilter(Fahrzeug::getKraftstoff, s -> caseInsensitiveContainsString(s, event.getValue()));
    }

    Boolean caseInsensitiveContainsString(String where, String what) {
        return where.toLowerCase().contains(what.toLowerCase());
    }

}

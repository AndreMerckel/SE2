package org.carlook.gui.components;

import com.vaadin.data.HasValue;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.ui.*;
import org.carlook.controller.ReservationControl;
import org.carlook.gui.components.TextFieldWithIcon.TextFieldWithIcon;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.services.util.DBTables;
import org.carlook.services.util.OtherMethods;

public class Search<T> extends HorizontalLayout {
    Grid<T> grid;
    TextFieldWithIcon markeTextField;
    TextFieldWithIcon modelTextField;
    TextFieldWithIcon baujahrTextField;
    TextFieldWithIcon kraftstoffTextField;
    CheckBox reserviert;
    public Search(Grid<T> grid) {
        this.grid = grid;
        this.setup();

    }



    public void setup() {

        Label markeFieldLabel = new Label();
        markeFieldLabel.setIcon(VaadinIcons.USER);
        TextField markeField = new TextField();
        markeTextField = new TextFieldWithIcon(markeField, OtherMethods.getStringWithFirstUpperLetter(DBTables.Fahrzeug.COL_HERSTELLER), markeFieldLabel);

        Label modelFieldLabel = new Label();
        modelFieldLabel.setIcon(VaadinIcons.USER);
        TextField modelField = new TextField();
        modelField.setValueChangeMode(ValueChangeMode.EAGER);
        modelTextField = new TextFieldWithIcon(modelField, OtherMethods.getStringWithFirstUpperLetter(DBTables.Fahrzeug.COL_MODELL), modelFieldLabel);

        Label baujahrFieldLabel = new Label();
        baujahrFieldLabel.setIcon(VaadinIcons.USER);
        TextField baujahrField = new TextField();
        baujahrField.setValueChangeMode(ValueChangeMode.EAGER);
        baujahrTextField = new TextFieldWithIcon(baujahrField, OtherMethods.getStringWithFirstUpperLetter(DBTables.Fahrzeug.COL_BAUJAHR), baujahrFieldLabel);

        Label kraftstoffFieldLabel = new Label();
        kraftstoffFieldLabel.setIcon(VaadinIcons.USER);
        TextField kraftstoffField = new TextField();
        kraftstoffField.setValueChangeMode(ValueChangeMode.EAGER);
        kraftstoffTextField = new TextFieldWithIcon(kraftstoffField, OtherMethods.getStringWithFirstUpperLetter(DBTables.Fahrzeug.COL_KRAFTSTOFF), kraftstoffFieldLabel);

        reserviert = new CheckBox("Nur reservierte");

        markeField.addValueChangeListener(event -> filter(event));
        modelField.addValueChangeListener(event -> filter(event));
        baujahrField.addValueChangeListener(event -> filter(event));
        kraftstoffField.addValueChangeListener(event -> filter(event));
        reserviert.addValueChangeListener(event -> filter(event));

        this.addComponent(markeTextField);
        this.addComponent(modelTextField);
        this.addComponent(baujahrTextField);
        this.addComponent(kraftstoffTextField);
        this.addComponent(reserviert);

        this.setWidth("100%");

    }

    private void filter(HasValue.ValueChangeEvent event){
        ListDataProvider<Fahrzeug> dataProvider = (ListDataProvider<Fahrzeug>) grid.getDataProvider();
        dataProvider.setFilter((item) -> {
            boolean hersteller = item.getHersteller().toLowerCase().contains(markeTextField.getValue().toLowerCase());
            boolean modell = item.getModell().toLowerCase().contains(modelTextField.getValue().toLowerCase());
            String bj = item.getBaujahr()+"".toLowerCase();
            boolean baujahr = bj.contains(baujahrTextField.getValue().toLowerCase());
            boolean kraftstoff = item.getKraftstoff().toLowerCase().contains(kraftstoffTextField.getValue().toLowerCase());

            if(event.getSource() instanceof CheckBox && (boolean) event.getValue()){
                boolean check = reserviert.getValue() && ReservationControl.checkReservedSession(item.getKennzeichen());
                return hersteller && modell && baujahr && kraftstoff && check;
            } else {
               return hersteller && modell && baujahr && kraftstoff;
            }
        });
    }


}

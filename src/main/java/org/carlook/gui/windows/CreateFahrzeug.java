package org.carlook.gui.windows;


import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.*;
import org.carlook.controller.FahrzeugControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.RegisterFailedException;
import org.carlook.factories.Factories;
import org.carlook.gui.components.TextFieldWithIcon.TextFieldWithIcon;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Vertriebler;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.Roles;
import org.carlook.services.util.Views;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateFahrzeug extends Window {
    public CreateFahrzeug() {
        super("Fahrzeug hinzufügen");
        center();

        this.setWidth("250px");
        this.setHeight("650px");

        GridLayout grid = new GridLayout(1, 9);

        Label herstellerLabel = new Label();
        herstellerLabel.setIcon(VaadinIcons.PASSWORD);
        TextField herstellerField = new TextField();
        TextFieldWithIcon herstellerTextField = new TextFieldWithIcon(herstellerField,"Hersteller", herstellerLabel);
        grid.addComponent(herstellerTextField);

        Label beschreibungLabel = new Label();
        beschreibungLabel.setIcon(VaadinIcons.PASSWORD);
        TextField beschreibungField = new TextField();
        TextFieldWithIcon beschreibungTextField = new TextFieldWithIcon(beschreibungField,"Beschreibung", beschreibungLabel);
        grid.addComponent(beschreibungTextField);

        Label kraftstoffLabel = new Label();
        kraftstoffLabel.setIcon(VaadinIcons.PASSWORD);
        TextField kraftstoffField = new TextField();
        TextFieldWithIcon kraftstoffTextField = new TextFieldWithIcon(kraftstoffField,"Kraftstoff", kraftstoffLabel);
        grid.addComponent(kraftstoffTextField);

        Label baujahrLabel = new Label();
        baujahrLabel.setIcon(VaadinIcons.PASSWORD);
        TextField baujahrField = new TextField();
        TextFieldWithIcon baujahrTextField = new TextFieldWithIcon(baujahrField,"Baujahr", baujahrLabel);
        grid.addComponent(baujahrTextField);

        Label modelLabel = new Label();
        modelLabel.setIcon(VaadinIcons.PASSWORD);
        TextField modelField = new TextField();
        TextFieldWithIcon modelTextField = new TextFieldWithIcon(modelField,"Model", modelLabel);
        grid.addComponent(modelTextField);

        Label fahrgestellnummberLabel = new Label();
        fahrgestellnummberLabel.setIcon(VaadinIcons.PASSWORD);
        TextField fahrgestellnummberField = new TextField();
        TextFieldWithIcon fahrgestellnummberTextField = new TextFieldWithIcon(fahrgestellnummberField,"Fahrgestell", fahrgestellnummberLabel);
        grid.addComponent(fahrgestellnummberTextField);

        Label kennzeichenLabel = new Label();
        kennzeichenLabel.setIcon(VaadinIcons.PASSWORD);
        TextField kennzeichenField = new TextField();
        TextFieldWithIcon kennzeichenTextField = new TextFieldWithIcon(kennzeichenField,"Kennzeichen", kennzeichenLabel);
        grid.addComponent(kennzeichenTextField);

        Label locationLabel = new Label();
        locationLabel.setIcon(VaadinIcons.PASSWORD);
        TextField locationField = new TextField();
        TextFieldWithIcon locationTextField = new TextFieldWithIcon(locationField,"Standort", locationLabel);
        grid.addComponent(locationTextField);

        Button addCarButton = new Button("Speichern");
        addCarButton.setStyleName("addCarButton");
        grid.addComponent(addCarButton);

        setContent(grid);

        addCarButton.addClickListener(e -> {

            try {

                boolean test =Integer.parseInt(baujahrField.getValue()) > 1750 && Integer.parseInt(baujahrField.getValue()) < Calendar.getInstance().get(Calendar.YEAR) + 1;
                if(!test){
                    Notification.show("Falsches Jahr als Baujahr eingegeben. Akzeptiert werden nur viertellige realistische Jahreszahlen");
                    return;
                }
            }catch(NumberFormatException err){
                Notification.show("Falsches Jahr als Baujahr eingegeben. Akzeptiert werden nur viertellige realistische Jahreszahlen");
                //UI.getCurrent().addWindow(new ConfirmationWindow("Fahrzeug erfolgreich hinzugefügt!" ));
                return;
            }

            Fahrzeug fz = Factories.createNewFahrzeug()
            .setBaujahr(Integer.parseInt(baujahrField.getValue()))
            .setBeschreibung(beschreibungField.getValue())
            .setFahrgestellnummer(fahrgestellnummberField.getValue())
            .setKennzeichen(kennzeichenField.getValue())
            .setKraftstoff(kraftstoffField.getValue())
            .setLocation(locationField.getValue())
            .setModell(modelField.getValue())
            .setHersteller(herstellerField.getValue());

            Vertriebler v = (Vertriebler) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER);
            fz.setVertriebler(v.getVertriebnummer());
            try {
                FahrzeugControl.register(fz,v);
            } catch (DatabaseException | RegisterFailedException ex) {
                Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            UI.getCurrent().addWindow(new ConfirmationWindow("Fahrzeug erfolgreich hinzugefügt!" ));
            UI.getCurrent().getNavigator().navigateTo(Views.SALESVIEW);
            close();
        });
    }
}

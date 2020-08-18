package org.carlook.gui.windows;


import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.*;
import org.carlook.controller.FahrzeugControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.RegisterFailedException;
import org.carlook.gui.components.TextFieldWithIcon.TextFieldWithIcon;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.objects.dto.FahrzeugDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Vertriebler;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.Roles;
import org.carlook.services.util.Views;

import javax.management.NotificationFilter;
import javax.swing.text.View;
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
        TextFieldWithIcon herstellerField = new TextFieldWithIcon("Hersteller", herstellerLabel, false);
        grid.addComponent(herstellerField);

        Label beschreibungLabel = new Label();
        beschreibungLabel.setIcon(VaadinIcons.PASSWORD);
        TextFieldWithIcon beschreibungField = new TextFieldWithIcon("Beschreibung", beschreibungLabel, false);
        grid.addComponent(beschreibungField);

        Label kraftstoffLabel = new Label();
        kraftstoffLabel.setIcon(VaadinIcons.PASSWORD);
        TextFieldWithIcon kraftstoffField = new TextFieldWithIcon("Kraftstoff", kraftstoffLabel, false);
        grid.addComponent(kraftstoffField);

        Label baujahrLabel = new Label();
        baujahrLabel.setIcon(VaadinIcons.PASSWORD);
        TextFieldWithIcon baujahrField = new TextFieldWithIcon("Baujahr", baujahrLabel, false);
        grid.addComponent(baujahrField);

        Label modelLabel = new Label();
        modelLabel.setIcon(VaadinIcons.PASSWORD);
        TextFieldWithIcon modelField = new TextFieldWithIcon("Model", modelLabel, false);
        grid.addComponent(modelField);

        Label fahrgestellnummberLabel = new Label();
        fahrgestellnummberLabel.setIcon(VaadinIcons.PASSWORD);
        TextFieldWithIcon fahrgestellnummberField = new TextFieldWithIcon("Fahrgestell", fahrgestellnummberLabel, false);
        grid.addComponent(fahrgestellnummberField);

        Label kennzeichenLabel = new Label();
        kennzeichenLabel.setIcon(VaadinIcons.PASSWORD);
        TextFieldWithIcon kennzeichenField = new TextFieldWithIcon("Kennzeichen", kennzeichenLabel, false);
        grid.addComponent(kennzeichenField);

        Label locationLabel = new Label();
        locationLabel.setIcon(VaadinIcons.PASSWORD);
        TextFieldWithIcon locationField = new TextFieldWithIcon("Standort", locationLabel, false);
        grid.addComponent(locationField);

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

            Fahrzeug fz = new Fahrzeug();
            fz.setBaujahr(Integer.parseInt(baujahrField.getValue()));
            fz.setBeschreibung(beschreibungField.getValue());
            fz.setFahrgestellnummer(fahrgestellnummberField.getValue());
            fz.setKennzeichen(kennzeichenField.getValue());
            fz.setKraftstoff(kraftstoffField.getValue());
            fz.setLocation(locationField.getValue());
            fz.setModell(modelField.getValue());
            fz.setHersteller(herstellerField.getValue());
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

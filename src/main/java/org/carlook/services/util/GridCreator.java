package org.carlook.services.util;

import com.vaadin.data.ValueProvider;
import com.vaadin.ui.Grid;

import java.util.ArrayList;
import java.util.function.Function;


public class GridCreator <A extends GridProps<String, Integer>>{
    private Grid.SelectionMode selectionMode;
    private String caption;
    private String headerStyle;
    private String tableStyle;
    Grid<A> table;


    public GridCreator(Object functionObject, String caption, Grid.SelectionMode selectionMode, String headerStyle, String tableStyle){
        this.caption = caption;
        this.selectionMode = selectionMode;
        this.headerStyle = headerStyle;
        this.tableStyle = tableStyle;
    }

    public Grid<A> createTableUser() {
        table = new Grid<A>();
        table.setCaption("Treffer");
        table.addColumn(A::getHersteller).setCaption("Hersteller");
        table.addColumn(A::getModell).setCaption("Modell");
        table.addColumn(A::getBaujahr).setCaption("Baujahr");
        table.addColumn(A::getKraftstoff).setCaption("Kraftstoff");
        table.addColumn(A::getBeschreibung).setCaption("Beschreibung");
        table.addColumn(A::getLocation).setCaption("Ort");
   //     table.addColumn(A::getFahrgestellnummer).setCaption("Fahrgestellnummer");
        table.addColumn(A::getKennzeichen).setCaption("Kennzeichen");
        table.addColumn(A::getVertriebler).setCaption("Vertriebler");
        table.setSelectionMode(selectionMode);
        table.getDefaultHeaderRow().setStyleName(headerStyle);
        table.setStyleName(tableStyle);
        return table;
    }

    public Grid<A> createTableVertriebler() {
        table = new Grid<A>();
        table.setCaption("Treffer");
        table.addColumn(A::getHersteller).setCaption("Hersteller");
        table.addColumn(A::getModell).setCaption("Modell");
        table.addColumn(A::getBaujahr).setCaption("Baujahr");
        table.addColumn(A::getKraftstoff).setCaption("Kraftstoff");
        table.addColumn(A::getBeschreibung).setCaption("Beschreibung");
        table.addColumn(A::getLocation).setCaption("Ort");
        table.addColumn(A::getFahrgestellnummer).setCaption("Fahrgestellnummer");
        table.addColumn(A::getKennzeichen).setCaption("Kennzeichen");
        table.addColumn(A::getVertriebler).setCaption("Vertriebler");
        table.setSelectionMode(selectionMode);
        table.getDefaultHeaderRow().setStyleName(headerStyle);
        table.setStyleName(tableStyle);
        return table;
    }

    public void addColumn(Grid table, ValueProvider func) {
        table.addColumn(func);
    }
}

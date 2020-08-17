package org.carlook.services.util;

public interface GridProps<T,E> {
     T getHersteller();
     T getBeschreibung();
     T getKraftstoff();
     T getLocation();
     E getBaujahr();
     T getFahrgestellnummer();
     E getVertriebler();
     T getKennzeichen();
     T getModell();
}
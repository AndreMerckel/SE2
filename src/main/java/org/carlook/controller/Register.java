package org.carlook.controller;

import org.carlook.controller.exception.DatabaseException;

/**
 * Interface zur Realisierung der register-Funktion (einfuegen von Objekte in DB
 * @param <T>
 */
public interface Register<T> {

    /**
     * fuegt Objekte in der DB hinzu
     * @param obj
     * @throws DatabaseException
     */
    default void register(T obj) throws DatabaseException {
        throw new UnsupportedOperationException();
    }

    default <G> void register(T obj, G obj2) throws DatabaseException {
        throw new UnsupportedOperationException();
    }

}

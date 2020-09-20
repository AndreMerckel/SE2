package org.carlook.AdminMain;

import org.carlook.controller.UserControl;

/**
 * Main zum manuellen testen diverse Methoden
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 150; ++i) {
            UserControl.getRndUser();
        }
    }
}

package com.github.lucasm21.linksfavoritos.gui;

import javax.swing.SwingUtilities;

/**
 *
 * @author lucas-mendes
 */
public class Init {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Init teste = new Init();
        });
    }

    public Init() {
        FramePrincipal frame = new FramePrincipal();
        frame.createAndShow();
    }

}

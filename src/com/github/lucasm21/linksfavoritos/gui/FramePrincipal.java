package com.github.lucasm21.linksfavoritos.gui;

import com.github.lucasm21.linksfavoritos.gui.cadastro.Cadastro;
import com.github.lucasm21.linksfavoritos.gui.util.Cor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author lucas-mendes
 */
public class FramePrincipal extends JFrame {

    private Cor cor;
    private Container container;

    public FramePrincipal() {

    }

    public void createAndShow() {
        setSize(960, 360);
        container = getContentPane();

        initComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponentes() {
        cor = new Cor();
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Arquivo");
        JMenu menu2 = new JMenu("Opção2");
        JMenu menu3 = new JMenu("Opção3");
        JMenuItem menuItem1 = new JMenuItem("Sair");
        JPanel painelCentral = new JPanel();
        JPanel painelStatus = new JPanel();

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menu1.add(menuItem1);

        JButton buttonDefault = new JButton("Default");
        buttonDefault.setBackground(Color.decode(cor.getButtonBackgroundDefault()));
        buttonDefault.setForeground(Color.decode(cor.getButtonForegroundDefault()));
        buttonDefault.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.decode(cor.getButtonBorderDefault()), 1), 
                BorderFactory.createEmptyBorder(4, 15, 4, 15)));
//        buttonDefault.setBorderPainted(false);
        buttonDefault.setFocusPainted(false);
        JButton buttonEdit = new JButton("Edit");
        buttonEdit.setBackground(Color.decode(cor.getButtonBackgroundEdit()));
        buttonEdit.setForeground(Color.decode(cor.getButtonForegroundEdit()));
        buttonEdit.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.decode(cor.getButtonBorderEdit()), 1), 
                BorderFactory.createEmptyBorder(4, 15, 4, 15)));
//        buttonEdit.setBorderPainted(false);
        buttonEdit.setFocusPainted(false);
        JButton buttonOK = new JButton("OK");
        buttonOK.setBackground(Color.decode(cor.getButtonBackgroundOK()));
        buttonOK.setForeground(Color.decode(cor.getButtonForegroundOK()));
        buttonOK.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.decode(cor.getButtonBorderOK()), 1), 
                BorderFactory.createEmptyBorder(4, 15, 4, 15)));
//        buttonOK.setBorderPainted(false);
        buttonOK.setFocusPainted(false);
        JButton buttonWarning = new JButton("Warning");
        buttonWarning.setBackground(Color.decode(cor.getButtonBackgroundWarning()));
        buttonWarning.setForeground(Color.decode(cor.getButtonForegroundWarning()));
//        buttonWarning.setMargin(new Insets(2, 15, 2, 15));
        buttonWarning.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.decode(cor.getButtonBorderWarning()), 1), 
                BorderFactory.createEmptyBorder(4, 15, 4, 15)));
//        buttonWarning.setBorderPainted(false);
        buttonWarning.setFocusPainted(false);

        painelCentral.setBackground(Color.decode(cor.getPanelCorDefault()));
        painelCentral.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));
        painelCentral.add(buttonDefault);
        painelCentral.add(buttonEdit);
        painelCentral.add(buttonOK);
        painelCentral.add(buttonWarning);
        
        painelStatus.setBackground(Color.decode(cor.getPanelCorDefault()));
        painelStatus.add(new JLabel("status"));

        container.setLayout(new BorderLayout());

//        container.add(menuBar, BorderLayout.NORTH);
//        container.add(painelCentral, BorderLayout.CENTER);
//        container.add(painelStatus, BorderLayout.SOUTH);
        container.add(new Cadastro(), BorderLayout.CENTER);
    }
}

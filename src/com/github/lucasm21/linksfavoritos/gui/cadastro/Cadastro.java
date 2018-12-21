package com.github.lucasm21.linksfavoritos.gui.cadastro;

import com.github.lucasm21.linksfavoritos.modelo.Tag;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lucasm21
 */
public class Cadastro extends JPanel {

    private final List<Tag> tags = new ArrayList<>();
    
    public Cadastro() {
        mostrar();
    }
    
    private void mostrar() {
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.WHITE);
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTHWEST;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.5;
        c.weighty = 0.5;
        
        c.gridy = 0;
        c.gridx = 0;
        c.gridwidth = 5;
        this.add(createLabelCenter("Adicionar Link"), c);
        
        c.gridy = 1;
        c.gridx = 0;
        c.gridwidth = 1;
        this.add(createLabelLeft("Link: "), c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.add(createLabelLeft2("http:\\www.abc.com"), c);
        
        c.gridy = 2;
        c.gridx = 0;
        c.gridwidth = 1;
        this.add(createLabelLeft("Estrelas: "), c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.add(createLabelLeft2("4"), c);
        
        c.gridy = 3;
        c.gridx = 0;
        c.gridwidth = 1;
        this.add(createLabelLeft("Categoria: "), c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.add(createLabelLeft2("abc"), c);
        
        c.gridy = 4;
        c.gridx = 0;
        c.gridwidth = 1;
        this.add(createLabelLeft("Sub-Categoria: "), c);
        c.gridx = 1;
        c.gridwidth = 2;
        this.add(createLabelLeft2("abc"), c);
        
        c.gridy = 5;
        c.gridx = 0;
        c.gridwidth = 1;
        this.add(createLabelLeft("Tags: "), c);
        c.gridx = 1;
        c.gridwidth = 3;
        this.add(createPanelTags(), c);
        c.gridx = 4;
        c.gridwidth = 1;
        this.add(new JButton("Adicionar"), c);
    }

    private JLabel createLabelCenter(String text) {
        JLabel label = new JLabel(text, JLabel.CENTER);
        label.setForeground(Color.RED);
        label.setFont(new Font("san-serif", Font.BOLD, 20));
        return label;
    }

    private JLabel createLabelTag(String text) {
        JLabel label = new JLabel(text, JLabel.CENTER);
        label.setMinimumSize(new Dimension(50, 50));
        label.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.decode("#1063af")), 
                BorderFactory.createEmptyBorder(2, 6, 2, 6)));
        label.setBackground(Color.decode("#1086f4"));
        label.setForeground(Color.WHITE);
        label.setOpaque(true);
        label.setFont(new Font("san-serif", Font.BOLD, 20));
        return label;
    }

    private JLabel createLabelLeft(String text) {
        JLabel label = new JLabel(text, JLabel.LEFT);
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("san-serif", Font.BOLD, 14));
        return label;
    }

    private JLabel createLabelLeft2(String text) {
        JLabel label = new JLabel(text, JLabel.LEFT);
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("san-serif", Font.PLAIN, 14));
        return label;
    }

    private JPanel createPanelTags() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING, 2, 2));
        panel.setBackground(Color.WHITE);
        
        tags.add(new Tag(1, "TAG 1"));
        tags.add(new Tag(2, "TAG 2"));
        tags.add(new Tag(3, "TAG 3"));
        tags.add(new Tag(4, "T 4"));
        
        tags.forEach((t) -> {
            panel.add(createLabelTag(t.getNome()));
        });
        
        return panel;
    }
}

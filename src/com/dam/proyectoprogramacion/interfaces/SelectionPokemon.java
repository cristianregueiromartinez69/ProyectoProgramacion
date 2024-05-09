package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;

import javax.swing.*;
import java.awt.*;

public class SelectionPokemon extends JFrame {

    private JPanel globalPanelPlayer1;
    private JPanel globalPanelSelectionPokemon;
    private JPanel globalPanelPlayer2;
    private JPanel goToBattlePanel;

    public SelectionPokemon(){
        setTitle("Seleccion de POkemon");
        setSize(600, 400);
        setVisible(true);


        Image backgroundImage = new ImageIcon("imagenes/backSeleccionPokemon.png").getImage();

        BackgroundMainMenuPanel backgroundPanel = new BackgroundMainMenuPanel(backgroundImage);
        backgroundPanel.setLayout(new BorderLayout());

        JPanel contentPanel = makeContentPanel();
        GridBagConstraints gbc = new GridBagConstraints();

        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


        add(backgroundPanel);


    }

    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

}

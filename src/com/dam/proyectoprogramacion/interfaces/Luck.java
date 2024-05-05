package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.panels.luck.EnterPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.EnterPanelPlayer2Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer2Luck;

import javax.swing.*;
import java.awt.*;

public class Luck extends JFrame {

    private JPanel globalPanelPLayer1;
    private JPanel globalPanelPLayer2;
    private JPanel resultPanel;

    public Luck() {
        setTitle("¿Quien escoge el primer pokemon?");
        setSize(600, 400);
        setVisible(true);

        Image backgroundImage = new ImageIcon("imagenes/fondoluck.png").getImage();

        BackgroundMainMenuPanel backgroundPanel = new BackgroundMainMenuPanel(backgroundImage);
        backgroundPanel.setLayout(new BorderLayout());

        JPanel contentPanel = makeContentPanel();
        GridBagConstraints gbc = new GridBagConstraints();

        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


        add(backgroundPanel);

        globalPanelPLayer1 = new JPanel();
        globalPanelPLayer1.setLayout(new GridBagLayout());


        globalPanelPLayer2 = new JPanel();
        globalPanelPLayer2.setLayout(new GridBagLayout());


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(50, 200, 50, 200);


        contentPanel.add(globalPanelPLayer1, gbc);


        gbc.gridx = 1;
        gbc.gridy = 0;
        contentPanel.add(globalPanelPLayer2, gbc);

        JPanel informationPanelPlayer1 = new InformationPanelPlayer1Luck();
        globalPanelPLayer1.add(informationPanelPlayer1);

        JPanel informationPanelPlayer2 = new InformationPanelPlayer2Luck();
        globalPanelPLayer2.add(informationPanelPlayer2);


        gbc.gridx = 0;
        gbc.gridy = 1;
        JPanel enterPanelPlayer1 = new EnterPanelPlayer1Luck();
        globalPanelPLayer1.add(enterPanelPlayer1);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JPanel enterPanelPlayer2 = new EnterPanelPlayer2Luck();
        globalPanelPLayer2.add(enterPanelPlayer2);






    }

    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

}

package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.panels.accountcreate.*;

import javax.swing.*;
import java.awt.*;

public class AccountCreate extends JFrame {

    private JPanel globalPlayerPanel1;
    private JPanel globalPlayerPanel2;

    private JPanel informationPlayerPanel1;
    private JPanel informationPLayerPanel2;

    private JPanel confirmAreaPlayer1;
    private JPanel ConfirmAreaPlayer2;

    private JPanel startAreaPanel;

    public AccountCreate(){
        setTitle("Crear una cuenta");
        setSize(600, 400);
        setVisible(true);

        Image backgroundImage = new ImageIcon("imagenes/fondosPreparacion.png").getImage();

        BackgroundMainMenuPanel backgroundPanel = new BackgroundMainMenuPanel(backgroundImage);
        backgroundPanel.setLayout(new BorderLayout());

        JPanel contentPanel = makeContentPanel();
        GridBagConstraints gbc = new GridBagConstraints();

        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


        add(backgroundPanel);

        globalPlayerPanel1 = new JPanel();
        globalPlayerPanel1.setLayout(new GridBagLayout());

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20,20,20,20);

        contentPanel.add(globalPlayerPanel1, gbc);
        JPanel informationPanelPlayer1 = new InformationPlayerPanel1AccountCreate();
        globalPlayerPanel1.add(informationPanelPlayer1);


    }

    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

}

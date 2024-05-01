package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;

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

        Image backgroundImage = new ImageIcon("imagenes/fondosPreparacion.jpg").getImage();

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

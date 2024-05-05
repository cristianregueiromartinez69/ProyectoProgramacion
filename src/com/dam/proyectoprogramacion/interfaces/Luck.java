package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;

import javax.swing.*;
import java.awt.*;

public class Luck extends JFrame {

private JPanel globalPanelPLayer1;
private JPanel globalPanelPLayer2;
private JPanel resultPanel;

public Luck(){
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



}

    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

}

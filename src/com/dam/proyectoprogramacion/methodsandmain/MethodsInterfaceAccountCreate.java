package com.dam.proyectoprogramacion.methodsandmain;

import javax.swing.*;
import  com.dam.proyectoprogramacion.buttons.*;

import java.awt.*;

public class MethodsInterfaceAccountCreate {


    public static JPanel makePanelImage1Row1Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        ImageIcon imageIcon = new ImageIcon("imagenes/icono1");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);
        JButton icon1Button = new ButtonInterfaceCreateAccount().makeIcon1Player1Button();
        icon1Button.setPreferredSize(new Dimension(100,50));
        icon1Button.setForeground(Color.WHITE);
        contentPanel.add(icon1Button);

    return contentPanel;
    }
}

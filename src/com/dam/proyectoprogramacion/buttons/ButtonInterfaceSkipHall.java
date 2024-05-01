package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonInterfaceSkipHall extends JPanel {

    private JButton playAgainButton;
    private JButton backToMenuButton;



    public JButton makeBackButton(){
        ImageIcon iconBack = new ImageIcon("imagenes/backMenu.png");
        backToMenuButton = new CreateButtons("ir la menu", iconBack);
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return backToMenuButton;
    }
}

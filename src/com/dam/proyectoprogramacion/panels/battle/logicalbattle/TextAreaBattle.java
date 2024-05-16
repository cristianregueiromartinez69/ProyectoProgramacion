package com.dam.proyectoprogramacion.panels.battle.logicalbattle;

import javax.swing.*;
import java.awt.*;

public class TextAreaBattle extends JTextArea {

    private Image backgroundImage;

    public TextAreaBattle() {
        super();

        backgroundImage = new ImageIcon("imagenes/fondosPreparacion.png").getImage();
        setOpaque(false);
        setForeground(Color.BLACK);
        setFont(new Font("Arial", Font.BOLD, 14));

    }

    @Override
    protected void paintComponent(Graphics g) {

        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        super.paintComponent(g);
    }


}

package com.dam.proyectoprogramacion.view.background;

import javax.swing.*;
import java.awt.*;


public class BackgroundHallOfFame extends JPanel {


    private Image backgroundImage;


    public BackgroundHallOfFame(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }


    public void setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
        repaint();
    }

}

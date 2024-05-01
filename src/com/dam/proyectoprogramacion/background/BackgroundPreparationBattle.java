package com.dam.proyectoprogramacion.background;

import javax.swing.*;
import java.awt.*;

public class BackgroundPreparationBattle extends JPanel {

    private Image backgroundImage;

    public BackgroundPreparationBattle(Image backgroundImage) {
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

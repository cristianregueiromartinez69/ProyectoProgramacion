package com.dam.proyectoprogramacion.background;

import javax.swing.*;
import java.awt.*;

/**
 * Clase con  imagen de fondo del menú principal
 * @author cristian
 * @version v1.0
 */
public class BackgroundMainMenuPanel extends JPanel {

    /**
     * atributo privado de tipo imagen que contendrá la ruta de la imagen del menu principal
     */
    private Image backgroundImage;

    /**
     * contructor de la clase
     * @param backgroundImage el atributo de tipo imagen
     */
    public BackgroundMainMenuPanel(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    /**
     * metodo para poder pintar la imagen en el fondo del panel
     * @param g the <code>Graphics</code> object to protect el objeto que va a pintar la imagen
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    /**
     * setter para establecer la imagen de fondo
      * @param backgroundImage el atributo de tipo imagen
     */
    public void setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
        repaint();
    }

}

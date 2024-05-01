package com.dam.proyectoprogramacion.background;

import javax.swing.*;
import java.awt.*;

/**
 * clase que será el panel con la imagen de fondo de la interfaz crear cuenta
 * @author cristian
 * @version v1.0
 */
public class BackgroundPreparationBattle extends JPanel {

    /**
     * atributo privado de tipo Image que será el path de la ruta del fondo
     */
    private Image backgroundImage;

    /**
     * constructor de la clase
     * @param backgroundImage la variable de tipo Image
     */
    public BackgroundPreparationBattle(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }


    /**
     * Metodo para pintar la imagen en el panel
     * @param g the <code>Graphics</code> object to protect el objeto que se encarga de pintar
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }


    /**
     * setter para la variable de tipo Image
     * @param backgroundImage la variable de tipo Image
     */
    public void setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
        repaint();
    }

}

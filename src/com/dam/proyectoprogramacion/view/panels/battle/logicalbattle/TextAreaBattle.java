package com.dam.proyectoprogramacion.view.panels.battle.logicalbattle;

import javax.swing.*;
import java.awt.*;

/**
 * clase que hereda de jtextarea para poner la imagen de fondo
 */
public class TextAreaBattle extends JTextArea {

    /**
     * atributo de tipo imagen de la clase
     */
    private Image backgroundImage;

    /**
     * constructor de la clase
     */
    public TextAreaBattle() {
        super();

        /**
         * establecemos la imagen de fondo
         */
        backgroundImage = new ImageIcon("imagenes/fondosPreparacion.png").getImage();
        /**
         * indicamos que sea invisible
         */
        setOpaque(false);
        setForeground(Color.BLACK);
        setFont(new Font("Arial", Font.BOLD, 14));

    }

    /**
     * pintamos a imagen de fondo
     * @param g the <code>Graphics</code> object to protect el objeto que pinta la imagen
     */
    @Override
    protected void paintComponent(Graphics g) {

        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        super.paintComponent(g);
    }


}

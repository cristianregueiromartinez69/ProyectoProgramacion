package com.dam.proyectoprogramacion.view.panels.battle.logicalbattle;
import javax.swing.*;
import java.awt.*;
/**
 * Clase con  imagen de fondo del pokemon del jugador 1 en batalla
 * @author cristian
 * @version v3.0
 */
public class PanelImagePokemonInBattlePlayer1 extends JPanel{
    /**
     * atributo privado de tipo Image que será el path de la ruta del fondo
     */
    private Image backgroundImage;

    /**
     * constructor de la clase
     * @param backgroundImage la variable de tipo Image
     */
    public PanelImagePokemonInBattlePlayer1(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
        setPreferredSize(new Dimension(170,170));
        setMaximumSize(new Dimension(170,170));
        setMinimumSize(new Dimension(170,170));

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

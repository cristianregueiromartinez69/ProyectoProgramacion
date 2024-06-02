package com.dam.proyectoprogramacion.view.panels.luck;

import javax.swing.*;
import java.awt.*;
/**
 * clase que tiene el panel de enter del jugador 2
 * @author cristian
 * @version v1.0
 */
public class EnterPanelPlayer2Luck extends JPanel {
    /**
     * atributo de tipo jButton que será el boton de enter
     */
    private static JButton enterButtonPlayer2;

    public EnterPanelPlayer2Luck() {
        /**
         * iniciamos el boton y lo añadimos al panel
         */
        enterButtonPlayer2 = new JButton("enter");
        enterButtonPlayer2.setBackground(Color.GREEN);
        enterButtonPlayer2.setForeground(Color.WHITE);
        enterButtonPlayer2.setPreferredSize(new Dimension(100, 50));
        this.add(enterButtonPlayer2);
    }

    /**
     * getter y setter del boton de enter del jugador 2
     * @return el boton de enter del jugador 2
     */

    public static JButton getEnterButtonPlayer2() {
        return enterButtonPlayer2;
    }

    public static void setEnterButtonPlayer2(JButton enterButtonPlayer2) {
        EnterPanelPlayer2Luck.enterButtonPlayer2 = enterButtonPlayer2;
    }
}

package com.dam.proyectoprogramacion.view.panels.selectionpokemon;

import com.dam.proyectoprogramacion.view.buttons.ButtonInterfacePokemonSelect;

import javax.swing.*;
import java.awt.*;

/**
 * clase con el panel para poner el boton de ir a la batalla
 * @author cristian
 * @version v2.0
 */
public class GoToBattlePanel extends JPanel {

    /**
     * constructor de la clase
     */
    public GoToBattlePanel(){
        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        /**
         * instanciamos un jButton igual a un metodo que crea el boton
         */
        JButton battleButton = new ButtonInterfacePokemonSelect().makeStartButton();
        battleButton.setBackground(Color.RED);
        battleButton.setForeground(Color.WHITE);
        /**
         * lo añadimos
         */
        this.add(battleButton);

    }
}

package com.dam.proyectoprogramacion.panels.battle.battlePlayer1;

import javax.swing.*;
import com.dam.proyectoprogramacion.buttons.*;

import java.awt.*;

/**
 * clase con los botones de ataque y cambio de pokemon para la interfaz de combate
 * @author cristian
 * @version v3.0
 */
public class AttacksAndChangesPokemonPlayer1 extends JPanel {


    /**
     * atributos privados de tipo JButton
     */
    private static JButton attackButton;
    private static JButton changeButton;

    /**
     * constructor de la clase
     */
    public AttacksAndChangesPokemonPlayer1(){

        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        /**
         * instanciamos el boton de ataque y le damos unos valores
         */
        attackButton = new ButtonInterfaceCombat().makeAttackButton();
        attackButton.setBackground(Color.RED);
        attackButton.setForeground(Color.WHITE);
        /**
         * instanciamos el boton de cambio y le damos unos valores
         */
        changeButton = new ButtonInterfaceCombat().makeChangePokemonButton();
        changeButton.setBackground(Color.GREEN);
        changeButton.setForeground(Color.WHITE);
        /**
         * añadimos los botones
         */
        this.add(attackButton);
        this.add(changeButton);

    }

    /**
     * getter y setter de los botones de la clase
     * @return los atributos correspondientes
     */
    public static JButton getAttackButton() {
        return attackButton;
    }

    public static JButton getChangeButton() {
        return changeButton;
    }
}

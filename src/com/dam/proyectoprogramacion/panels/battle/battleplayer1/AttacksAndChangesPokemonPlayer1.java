package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

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
    private static JButton attackButtonPlayer1;
    private static JButton changeButtonPlayer1;

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
        attackButtonPlayer1 = new ButtonInterfaceCombat().makeAttackButtonPlayer1();
        attackButtonPlayer1.setBackground(Color.RED);
        attackButtonPlayer1.setForeground(Color.WHITE);
        attackButtonPlayer1.setPreferredSize(new Dimension(200,300));
        attackButtonPlayer1.setMaximumSize(new Dimension(250,150));
        attackButtonPlayer1.setMinimumSize(new Dimension(250,150));
        /**
         * instanciamos el boton de cambio y le damos unos valores
         */
        changeButtonPlayer1 = new ButtonInterfaceCombat().makeChangePokemonButtonPLayer1();
        changeButtonPlayer1.setBackground(Color.GREEN);
        changeButtonPlayer1.setForeground(Color.WHITE);
        changeButtonPlayer1.setPreferredSize(new Dimension(200,300));
        changeButtonPlayer1.setMaximumSize(new Dimension(250,150));
        changeButtonPlayer1.setMinimumSize(new Dimension(250,150));
        /**
         * añadimos los botones
         */
        this.add(attackButtonPlayer1);
        this.add(changeButtonPlayer1);

    }

    /**
     * getter y setter de los botones de la clase
     * @return los atributos correspondientes
     */
    public static JButton getAttackButtonPlayer1() {
        return attackButtonPlayer1;
    }

    public static void setAttackButtonPlayer1(JButton attackButtonPlayer1) {
        AttacksAndChangesPokemonPlayer1.attackButtonPlayer1 = attackButtonPlayer1;
    }

    public static JButton getChangeButtonPlayer1() {
        return changeButtonPlayer1;
    }

    public static void setChangeButtonPlayer1(JButton changeButtonPlayer1) {
        AttacksAndChangesPokemonPlayer1.changeButtonPlayer1 = changeButtonPlayer1;
    }
}

package com.dam.proyectoprogramacion.panels.battle.battleplayer2;

import javax.swing.*;
import com.dam.proyectoprogramacion.buttons.*;

import java.awt.*;

/**
 * clase con los botones de ataque y cambio de pokemon para la interfaz de combate
 * @author cristian
 * @version v3.0
 */
public class AttacksAndChangesPokemonPlayer2 extends JPanel {


    /**
     * atributos privados de tipo JButton
     */
    private static JButton attackButtonPlayer2;
    private static JButton changeButtonPlayer2;

    /**
     * constructor de la clase
     */
    public AttacksAndChangesPokemonPlayer2(){

        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        /**
         * instanciamos el boton de ataque y le damos unos valores
         */
        attackButtonPlayer2 = new ButtonInterfaceCombat().makeAttackButtonPlayer2();
        attackButtonPlayer2.setBackground(Color.RED);
        attackButtonPlayer2.setForeground(Color.WHITE);
        attackButtonPlayer2.setPreferredSize(new Dimension(200,300));
        attackButtonPlayer2.setMaximumSize(new Dimension(250,150));
        attackButtonPlayer2.setMinimumSize(new Dimension(250,150));
        /**
         * instanciamos el boton de cambio y le damos unos valores
         */
        changeButtonPlayer2 = new ButtonInterfaceCombat().makeChangePokemonButtonPLayer2();
        changeButtonPlayer2.setBackground(Color.GREEN);
        changeButtonPlayer2.setForeground(Color.WHITE);
        changeButtonPlayer2.setPreferredSize(new Dimension(200,300));
        changeButtonPlayer2.setMaximumSize(new Dimension(250,150));
        changeButtonPlayer2.setMinimumSize(new Dimension(250,150));
        /**
         * añadimos los botones
         */
        this.add(attackButtonPlayer2);
        this.add(changeButtonPlayer2);

    }

    /**
     * getter y setter de los botones de la clase
     * @return los atributos correspondientes
     */
    public static JButton getAttackButtonPlayer2() {
        return attackButtonPlayer2;
    }

    public static void setAttackButtonPlayer2(JButton attackButtonPlayer2) {
        AttacksAndChangesPokemonPlayer2.attackButtonPlayer2 = attackButtonPlayer2;
    }

    public static JButton getChangeButtonPlayer2() {
        return changeButtonPlayer2;
    }

    public static void setChangeButtonPlayer2(JButton changeButtonPlayer2) {
        AttacksAndChangesPokemonPlayer2.changeButtonPlayer2 = changeButtonPlayer2;
    }
}

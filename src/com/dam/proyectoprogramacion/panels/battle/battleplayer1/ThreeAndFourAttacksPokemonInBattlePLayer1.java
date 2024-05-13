package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;
import com.dam.proyectoprogramacion.methodsandmain.DataNamesIconsColorsAttacksPlayer1;

import javax.swing.*;
import java.awt.*;

/**
 * Clase con los paneles de los ataques 3 y 4 del jugador 1
 * @author cristian
 * @version v3.0
 */
public class ThreeAndFourAttacksPokemonInBattlePLayer1 extends JPanel {
    /**
     * atributos de la clase
     */
    private static JPanel attack3Player1;
    private static JPanel attack4Player1;

    public ThreeAndFourAttacksPokemonInBattlePLayer1(){

        /**
         * hacemos el panel visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        /**
         * iniciamos el panel del primer ataque y metemos el boton
         */
        attack3Player1 = new JPanel();
        JButton attack1 = new ButtonInterfaceAttacks().makeAttack3ButtonPlayer1();
        attack1.setBackground(DataNamesIconsColorsAttacksPlayer1.getColorBackgroundAttack1());
        attack1.setForeground(Color.WHITE);
        attack1.setPreferredSize(new Dimension(170,100));
        attack1.setMaximumSize(new Dimension(170,100));
        attack1.setMinimumSize(new Dimension(170,100));
        attack3Player1.add(attack1);

        /**
         * iniciamos el panel del segundo ataque y metemos el boton
         */
        attack4Player1 = new JPanel();
        JButton attack2 = new ButtonInterfaceAttacks().makeAttack4ButtonPlayer1();
        attack2.setBackground(DataNamesIconsColorsAttacksPlayer1.getColorBackgroundAttack2());
        attack2.setForeground(Color.WHITE);
        attack2.setPreferredSize(new Dimension(170,100));
        attack2.setMaximumSize(new Dimension(170,100));
        attack2.setMinimumSize(new Dimension(170,100));
        attack4Player1.add(attack2);

        /**
         * lo añadimos al panel
         */
        this.add(attack3Player1);
        this.add(attack4Player1);

    }

}

package com.dam.proyectoprogramacion.panels.battle.battleplayer2;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;
import com.dam.proyectoprogramacion.methodsandmain.DataNamesIconsColorsAttacksAndPokemonsPlayer1;
import com.dam.proyectoprogramacion.methodsandmain.DataNamesIconsColorsAttacksAndPokemonsPlayer2;

import javax.swing.*;
import java.awt.*;

/**
 * Clase con los paneles de los ataques 1 y 2 del jugador 2
 * @author cristian
 * @version v3.0
 */
public class OneAndTwoAttacksPokemonInBattlePLayer2 extends JPanel {

    /**
     * atributos de la clase
     */
    private static JPanel attack1Player1;
    private static JPanel attack2Player1;

    public OneAndTwoAttacksPokemonInBattlePLayer2(){

        /**
         * hacemos el panel visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        /**
         * iniciamos el panel del primer ataque y metemos el boton
         */
        attack1Player1 = new JPanel();
        JButton attack1 = new ButtonInterfaceAttacks().makeAttack1ButtonPlayer2();
        attack1.setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getColorBackgroundAttack1());
        attack1.setForeground(Color.WHITE);
        attack1.setPreferredSize(new Dimension(170,100));
        attack1.setMaximumSize(new Dimension(170,100));
        attack1.setMinimumSize(new Dimension(170,100));
        attack1Player1.add(attack1);

        /**
         * iniciamos el panel del segundo ataque y metemos el boton
         */
        attack2Player1 = new JPanel();
        JButton attack2 = new ButtonInterfaceAttacks().makeAttack2ButtonPlayer2();
        attack2.setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getColorBackgroundAttack2());
        attack2.setForeground(Color.WHITE);
        attack2.setPreferredSize(new Dimension(170,100));
        attack2.setMaximumSize(new Dimension(170,100));
        attack2.setMinimumSize(new Dimension(170,100));
        attack2Player1.add(attack2);

        /**
         * lo añadimos al panel
         */
        this.add(attack1Player1);
        this.add(attack2Player1);

    }
}

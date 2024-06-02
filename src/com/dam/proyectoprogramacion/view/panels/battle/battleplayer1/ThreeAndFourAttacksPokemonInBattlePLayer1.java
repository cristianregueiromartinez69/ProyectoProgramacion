package com.dam.proyectoprogramacion.view.panels.battle.battleplayer1;

import com.dam.proyectoprogramacion.view.buttons.ButtonInterfaceAttacks;
import com.dam.proyectoprogramacion.controller.methods.battle.DataNamesIconsColorsAttacksAndPokemonsPlayer1;

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
        JButton attack3 = new ButtonInterfaceAttacks().makeAttack3ButtonPlayer1();
        attack3.setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getColorBackgroundAttack3());
        attack3.setForeground(Color.WHITE);
        attack3.setPreferredSize(new Dimension(170,100));
        attack3.setMaximumSize(new Dimension(170,100));
        attack3.setMinimumSize(new Dimension(170,100));
        attack3Player1.add(attack3);

        /**
         * iniciamos el panel del segundo ataque y metemos el boton
         */
        attack4Player1 = new JPanel();
        JButton attack4 = new ButtonInterfaceAttacks().makeAttack4ButtonPLayer1();
        attack4.setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getColorBackgroundAttack4());
        attack4.setForeground(Color.WHITE);
        attack4.setPreferredSize(new Dimension(170,100));
        attack4.setMaximumSize(new Dimension(170,100));
        attack4.setMinimumSize(new Dimension(170,100));
        attack4Player1.add(attack4);

        /**
         * lo añadimos al panel
         */
        this.add(attack3Player1);
        this.add(attack4Player1);


    }

}

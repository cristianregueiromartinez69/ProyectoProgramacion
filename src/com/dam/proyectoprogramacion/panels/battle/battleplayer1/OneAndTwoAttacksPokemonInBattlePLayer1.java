package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;

import javax.swing.*;
import java.awt.*;

public class OneAndTwoAttacksPokemonInBattlePLayer1 extends JPanel {

    private static JPanel attack1Player1;
    private static JPanel attack2Player1;

    public OneAndTwoAttacksPokemonInBattlePLayer1(){

        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        attack1Player1 = new JPanel();
        JButton attack1 = new ButtonInterfaceAttacks().makeAttack1ButtonPlayer1();
        attack1.setBackground(Color.ORANGE);
        attack1.setForeground(Color.WHITE);
        attack1.setPreferredSize(new Dimension(250,150));
        attack1.setMaximumSize(new Dimension(250,150));
        attack1.setMinimumSize(new Dimension(250,150));
        attack1Player1.add(attack1);


        this.add(attack1Player1);

    }

}

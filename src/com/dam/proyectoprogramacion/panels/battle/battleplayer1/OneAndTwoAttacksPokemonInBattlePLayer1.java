package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;

import javax.swing.*;
import java.awt.*;

public class OneAndTwoAttacksPokemonInBattlePLayer1 extends JPanel {

    private JPanel attack1Player1;
    private JPanel attack2Player1;

    public OneAndTwoAttacksPokemonInBattlePLayer1(){

        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        JButton attack1 = new ButtonInterfaceAttacks().makeAttack1ButtonPlayer1();
        attack1.setBackground(Color.ORANGE);
        attack1.setForeground(Color.WHITE);
        this.add(attack1);

    }
}

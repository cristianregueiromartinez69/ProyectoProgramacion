package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;

import javax.swing.*;
import java.awt.*;

public class BackAttacksPokemonPlayer1 extends JPanel {

    private JPanel backPanel;

    public BackAttacksPokemonPlayer1(){

        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        backPanel = new JPanel();
        backPanel.setLayout(new BoxLayout(backPanel, BoxLayout.X_AXIS));

        JButton backToAttackChange = new ButtonInterfaceAttacks().makeBackButtonPLayer1();
        backToAttackChange.setBackground(Color.BLUE);
        backToAttackChange.setForeground(Color.WHITE);

        backPanel.add(backToAttackChange);
        this.add(backPanel);
    }
}

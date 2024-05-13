package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemon;

import javax.swing.*;
import java.awt.*;

public class BackChangePokemonPlayer1 extends JPanel {
    private JPanel backPanel;

    public BackChangePokemonPlayer1(){

        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        backPanel = new JPanel();
        backPanel.setLayout(new BoxLayout(backPanel, BoxLayout.X_AXIS));

        JButton backToAttackChange = new ButtonInterfaceChangePokemon().makeBackButton();
        backToAttackChange.setBackground(Color.BLUE);
        backToAttackChange.setForeground(Color.WHITE);

        backPanel.add(backToAttackChange);
        this.add(backPanel);
    }

}

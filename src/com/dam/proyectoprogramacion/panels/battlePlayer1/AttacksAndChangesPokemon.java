package com.dam.proyectoprogramacion.panels.battlePlayer1;

import javax.swing.*;
import com.dam.proyectoprogramacion.buttons.*;

import java.awt.*;

public class AttacksAndChangesPokemon extends JPanel {


    private static JButton attackButton;
    private static JButton changeButton;

    public AttacksAndChangesPokemon(){

        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        attackButton = new ButtonInterfaceCombat().makeAttackButton();
        attackButton.setBackground(Color.RED);
        attackButton.setForeground(Color.WHITE);
        changeButton = new ButtonInterfaceCombat().makeChangePokemonButton();
        changeButton.setBackground(Color.GREEN);
        changeButton.setForeground(Color.WHITE);
        this.add(attackButton);
        this.add(changeButton);

    }

}

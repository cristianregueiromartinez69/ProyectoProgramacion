package com.dam.proyectoprogramacion.panels.selectionpokemon;

import com.dam.proyectoprogramacion.buttons.ButtonInterfacePokemonSelect;

import javax.swing.*;
import java.awt.*;

public class GoToBattlePanel extends JPanel {

    public GoToBattlePanel(){
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JButton battleButton = new ButtonInterfacePokemonSelect().makeStartButton();
        battleButton.setBackground(Color.RED);
        battleButton.setForeground(Color.WHITE);
        this.add(battleButton);

    }
}

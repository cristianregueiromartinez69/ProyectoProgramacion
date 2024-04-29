package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonInterfaceCombat extends JPanel {

    private JButton attackButton;
    private JButton changePokemonButton;

    public JButton makeAttackButton(){
        attackButton = new JButton("Atacar");
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
        setBorder(borderboton);
        return attackButton;
    }
    public JButton makeChangePokemonButton(){
        changePokemonButton = new JButton("Pokemon");
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
        setBorder(borderboton);
        return changePokemonButton;
    }
}

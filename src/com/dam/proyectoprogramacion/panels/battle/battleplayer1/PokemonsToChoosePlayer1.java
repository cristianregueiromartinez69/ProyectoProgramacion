package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemon;

import javax.swing.*;
import java.awt.*;

public class PokemonsToChoosePlayer1 extends JPanel {

    private JPanel pokemon1;
    private JPanel pokemon2;
    private JPanel pokemon3;

    public PokemonsToChoosePlayer1(){
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        pokemon1 = new JPanel();

        JButton pokemon1Button = new ButtonInterfaceChangePokemon().makePokemon1TeamButton();
        pokemon1Button.setBackground(Color.GREEN);
        pokemon1Button.setForeground(Color.WHITE);
        pokemon1Button.setPreferredSize(new Dimension(170,100));
        pokemon1Button.setMaximumSize(new Dimension(170, 100));
        pokemon1Button.setMinimumSize(new Dimension(170,100));

        pokemon1.add(pokemon1Button);

        pokemon2 = new JPanel();

        JButton pokemon2Button = new ButtonInterfaceChangePokemon().makePokemon2TeamButton();
        pokemon2Button.setBackground(Color.GREEN);
        pokemon2Button.setForeground(Color.WHITE);
        pokemon2Button.setPreferredSize(new Dimension(170,100));
        pokemon2Button.setMaximumSize(new Dimension(170, 100));
        pokemon2Button.setMinimumSize(new Dimension(170,100));

        pokemon2.add(pokemon2Button);

        pokemon3 = new JPanel();

        JButton pokemon3Button = new ButtonInterfaceChangePokemon().makePokemon3TeamButton();
        pokemon3Button.setBackground(Color.GREEN);
        pokemon3Button.setForeground(Color.WHITE);
        pokemon3Button.setPreferredSize(new Dimension(170,100));
        pokemon3Button.setMaximumSize(new Dimension(170, 100));
        pokemon3Button.setMinimumSize(new Dimension(170,100));

        pokemon3.add(pokemon3Button);




        this.add(pokemon1);
        this.add(pokemon2);
        this.add(pokemon3);
    }



}

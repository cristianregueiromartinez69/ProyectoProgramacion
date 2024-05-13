package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemon;

import javax.swing.*;
import java.awt.*;

/**
 * clase que será el panel con los botones de cambio de pokemons
 * @author cristian
 * @version v3.0
 */
public class PokemonsToChoosePlayer1 extends JPanel {

    /**
     * atributos privados de la clase
     */
    private JPanel pokemon1;
    private JPanel pokemon2;
    private JPanel pokemon3;
    private JPanel backToBattlePanel;

    public PokemonsToChoosePlayer1(){
        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        /**
         * iniciamos el panel del pokemon1
         */
        pokemon1 = new JPanel();

        /**
         * instanciamos el boton del pokemon 1
         */
        JButton pokemon1Button = new ButtonInterfaceChangePokemon().makePokemon1TeamButton();
        pokemon1Button.setBackground(Color.GREEN);
        pokemon1Button.setForeground(Color.WHITE);
        pokemon1Button.setPreferredSize(new Dimension(170,100));
        pokemon1Button.setMaximumSize(new Dimension(170, 100));
        pokemon1Button.setMinimumSize(new Dimension(170,100));

        /**
         * lo añadimos
         */
        pokemon1.add(pokemon1Button);

        /**
         * iniciamos el panel del pokemon1
         */
        pokemon2 = new JPanel();
        /**
         * instanciamos el boton del pokemon 1
         */
        JButton pokemon2Button = new ButtonInterfaceChangePokemon().makePokemon2TeamButton();
        pokemon2Button.setBackground(Color.GREEN);
        pokemon2Button.setForeground(Color.WHITE);
        pokemon2Button.setPreferredSize(new Dimension(170,100));
        pokemon2Button.setMaximumSize(new Dimension(170, 100));
        pokemon2Button.setMinimumSize(new Dimension(170,100));

        /**
         * lo añadimos
         */
        pokemon2.add(pokemon2Button);

        /**
         * iniciamos el panel del pokemon1
         */
        pokemon3 = new JPanel();

        /**
         * instanciamos el boton del pokemon 1
         */
        JButton pokemon3Button = new ButtonInterfaceChangePokemon().makePokemon3TeamButton();
        pokemon3Button.setBackground(Color.GREEN);
        pokemon3Button.setForeground(Color.WHITE);
        pokemon3Button.setPreferredSize(new Dimension(170,100));
        pokemon3Button.setMaximumSize(new Dimension(170, 100));
        pokemon3Button.setMinimumSize(new Dimension(170,100));
        /**
         * lo añadimos
         */
        pokemon3.add(pokemon3Button);

        /**
         * iniciamos el panel del volver atras del menu de cambio de pokemon
         */
        backToBattlePanel = new JPanel();
        backToBattlePanel.setLayout(new BoxLayout(backToBattlePanel, BoxLayout.X_AXIS));
        backToBattlePanel.add(new BackChangePokemonPlayer1());


        /**
         * lo añadimos todo
         */
        this.add(pokemon1);
        this.add(pokemon2);
        this.add(pokemon3);
        this.add(backToBattlePanel);
    }



}

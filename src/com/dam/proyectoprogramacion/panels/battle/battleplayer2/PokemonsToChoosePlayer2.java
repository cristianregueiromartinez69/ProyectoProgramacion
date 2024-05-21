package com.dam.proyectoprogramacion.panels.battle.battleplayer2;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer1;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer2;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.BackChangePokemonPlayer1;

import javax.swing.*;
import java.awt.*;

/**
 * clase que será el panel con los botones de cambio de pokemons del jugador 2
 * @author cristian
 * @version v3.0
 */
public class PokemonsToChoosePlayer2 extends JPanel {


    /**
     * atributos privados de la clase
     */
    private JPanel pokemon1;
    private JPanel pokemon2;
    private JPanel pokemon3;
    private boolean enableButtonPokemon1;
    private boolean enableButtonPokemon2;
    private boolean enableButtonPokemon3;
    private JPanel backToBattlePanel;

    public PokemonsToChoosePlayer2() {
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
        JButton pokemon1Button = new ButtonInterfaceChangePokemonPlayer2().makePokemon1TeamButton();
        pokemon1Button.setBackground(Color.GREEN);
        pokemon1Button.setForeground(Color.WHITE);
        enableButtonPokemon1 = ButtonInterfaceChangePokemonPlayer2.isEnableButtonPokemon1();
        pokemon1Button.setEnabled(enableButtonPokemon1);
        pokemon1Button.setPreferredSize(new Dimension(170, 100));
        pokemon1Button.setMaximumSize(new Dimension(170, 100));
        pokemon1Button.setMinimumSize(new Dimension(170, 100));

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
        JButton pokemon2Button = new ButtonInterfaceChangePokemonPlayer2().makePokemon2TeamButton();
        pokemon2Button.setBackground(Color.GREEN);
        pokemon2Button.setForeground(Color.WHITE);
        enableButtonPokemon2 = ButtonInterfaceChangePokemonPlayer2.isEnableButtonPokemon2();
        pokemon2Button.setEnabled(enableButtonPokemon2);
        pokemon2Button.setPreferredSize(new Dimension(170, 100));
        pokemon2Button.setMaximumSize(new Dimension(170, 100));
        pokemon2Button.setMinimumSize(new Dimension(170, 100));

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
        JButton pokemon3Button = new ButtonInterfaceChangePokemonPlayer2().makePokemon3TeamButton();
        pokemon3Button.setBackground(Color.GREEN);
        pokemon3Button.setForeground(Color.WHITE);
        enableButtonPokemon3 = ButtonInterfaceChangePokemonPlayer2.isEnableButtonPokemon3();
        pokemon3Button.setEnabled(enableButtonPokemon3);
        pokemon3Button.setPreferredSize(new Dimension(170, 100));
        pokemon3Button.setMaximumSize(new Dimension(170, 100));
        pokemon3Button.setMinimumSize(new Dimension(170, 100));
        /**
         * lo añadimos
         */
        pokemon3.add(pokemon3Button);

        /**
         * iniciamos el panel del volver atras del menu de cambio de pokemon
         */
        backToBattlePanel = new JPanel();
        backToBattlePanel.setLayout(new BoxLayout(backToBattlePanel, BoxLayout.X_AXIS));
        backToBattlePanel.add(new BackChangePokemonPlayer2());


        /**
         * lo añadimos todo
         */
        this.add(pokemon1);
        this.add(pokemon2);
        this.add(pokemon3);
        this.add(backToBattlePanel);
    }
}
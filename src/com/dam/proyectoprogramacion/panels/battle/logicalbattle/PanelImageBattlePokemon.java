package com.dam.proyectoprogramacion.panels.battle.logicalbattle;

import com.dam.proyectoprogramacion.background.BackgroundBattle;

import javax.swing.*;
import java.awt.*;

/**
 * clase con el panel de imagen de la batalla pokemon
 * @author cristian
 * @version v3.0
 */
public class PanelImageBattlePokemon extends JPanel {

    /**
     * atributos privados de la clase
     */
    private JPanel backgroundPanel;
    private JPanel imagePanelPokemonPlayer1;
    private JPanel imagePanelPokemonPlayer2;
    private static Image pokemonPlayer1;
    private static Image pokemonPlayer2;
    private static Image battleScenario;

    public PanelImageBattlePokemon(){

        /**
         * lo hacemos visible
         * le damos un layout
         */
         setVisible(true);
         setLayout(new BorderLayout());

        /**
         * iniciamos la imagen de fondo con el path de la imagen de batalla pokemon
         */
        battleScenario = new ImageIcon("imagenes/batalla.jpg").getImage();

        pokemonPlayer1 = new ImageIcon("imagenes/snorlaxSP.png").getImage();
        pokemonPlayer2 = new ImageIcon("imagenes/tinkatonSP.png").getImage();

        PanelImagePokemonInBattlePlayer1 pokemonImagePlayer1 = new PanelImagePokemonInBattlePlayer1(pokemonPlayer1);
        PanelImagePokemonInBattlePlayer2 pokemonImagePlayer2 = new PanelImagePokemonInBattlePlayer2(pokemonPlayer2);


        /**
         * instanciamos el panel de la imagen de batalla y le metemos el path
         */
         BackgroundBattle backBattle = new BackgroundBattle(battleScenario);

        /**
         * iniciamos el panel central que contendrá todas las imagenes
         * la de la batalla
         * la del pokemon en batalla del jugador 1
         * la del pokemon en batalla del jugador 2
         * añadimos las imagenes al panel
         */
        backgroundPanel = new JPanel();
         backgroundPanel.add(backBattle);

         imagePanelPokemonPlayer1 = new JPanel();
         imagePanelPokemonPlayer1.add(pokemonImagePlayer1);

        imagePanelPokemonPlayer2 = new JPanel();
        imagePanelPokemonPlayer2.add(pokemonImagePlayer2);


        /**
         * lo añadimos
         */
        this.add(backgroundPanel, BorderLayout.CENTER);
        //this.add(imagePanelPokemonPlayer1, BorderLayout.WEST);
        //this.add(imagePanelPokemonPlayer2, BorderLayout.EAST);

    }

    /**
     * getter y setter de los atributos de la clase
     * @return los atributos de la clase
     */
    public static Image getPokemonPlayer1() {
        return pokemonPlayer1;
    }

    public static void setPokemonPlayer1(Image pokemonPlayer1) {
        PanelImageBattlePokemon.pokemonPlayer1 = pokemonPlayer1;
    }

    public static Image getPokemonPlayer2() {
        return pokemonPlayer2;
    }

    public static void setPokemonPlayer2(Image pokemonPlayer2) {
        PanelImageBattlePokemon.pokemonPlayer2 = pokemonPlayer2;
    }

    public static Image getBattleScenario() {
        return battleScenario;
    }

    public static void setBattleScenario(Image battleScenario) {
        PanelImageBattlePokemon.battleScenario = battleScenario;
    }
}

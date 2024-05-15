package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import javax.swing.*;
import com.dam.proyectoprogramacion.methods.battle.*;

import java.awt.*;

/**
 * clase con el panel de la vida del pokemon en batalla
 * @author cristian
 * @version v3.0
 */
public class LifePokemonInBattlePlayer1 extends JPanel {

    /**
     * atributos privados de la clase
     */
    private JPanel panelLifePokemon;
    private static int lifePokemon1PLayer1;
    private static int lifePokemon2PLayer1;
    private static int lifePokemon3PLayer1;
    private static JProgressBar lifePokemonBar;


    /**
     * constructor de la clase
     */
    public LifePokemonInBattlePlayer1(){

        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        /**
         * iniciamos el panel de vida y lo añadimos
         */
        panelLifePokemon = new JPanel();


        /**
         * le damos valores a la vida de los pokemons del jugador 1
         */
        lifePokemon1PLayer1 = MethodsLifeBattlePokemonPlayer1.getLifePokemon1Player1();
        lifePokemon2PLayer1 = MethodsLifeBattlePokemonPlayer1.getLifePokemon2Player1();
        lifePokemon3PLayer1 = MethodsLifeBattlePokemonPlayer1.getLifePokemon3Player1();

        /**
         * le damos un valor a la barra de vida del pokemon en batalla
         */
        lifePokemonBar = new JProgressBar(0, lifePokemon1PLayer1);
        lifePokemonBar.setValue(lifePokemon1PLayer1);
        lifePokemonBar.setStringPainted(true);
        /**
         * hacemos que el color de fondo sea igual a un metodo que cambia el color segun la vida que le queda al pokemon
         */
        lifePokemonBar.setBackground(getBackgroundColorLifeBarPokemon());
        lifePokemonBar.setForeground(Color.WHITE);

        /**
         * lo añadimos al panel
         */
        panelLifePokemon.add(lifePokemonBar);


        this.add(panelLifePokemon);




    }

    /**
     * metodo
     * @return
     */
    private Color getBackgroundColorLifeBarPokemon() {
        Color colorBackgroundLifePokemon;

        if(lifePokemonBar.getValue() <= lifePokemonBar.getMaximum()*0.2){
            colorBackgroundLifePokemon = Color.RED;
        }
        else if(lifePokemonBar.getValue() <= lifePokemonBar.getMaximum()*0.5){
            colorBackgroundLifePokemon = Color.YELLOW;
        }
        else{
            colorBackgroundLifePokemon = Color.GREEN;
        }
        return colorBackgroundLifePokemon;
    }

    public JPanel getPanelLifePokemon() {
        return panelLifePokemon;
    }

    public void setPanelLifePokemon(JPanel panelLifePokemon) {
        this.panelLifePokemon = panelLifePokemon;
    }

    public static int getLifePokemon1PLayer1() {
        return lifePokemon1PLayer1;
    }

    public static void setLifePokemon1PLayer1(int lifePokemon1PLayer1) {
        LifePokemonInBattlePlayer1.lifePokemon1PLayer1 = lifePokemon1PLayer1;
    }

    public static int getLifePokemon2PLayer1() {
        return lifePokemon2PLayer1;
    }

    public static void setLifePokemon2PLayer1(int lifePokemon2PLayer1) {
        LifePokemonInBattlePlayer1.lifePokemon2PLayer1 = lifePokemon2PLayer1;
    }

    public static int getLifePokemon3PLayer1() {
        return lifePokemon3PLayer1;
    }

    public static void setLifePokemon3PLayer1(int lifePokemon3PLayer1) {
        LifePokemonInBattlePlayer1.lifePokemon3PLayer1 = lifePokemon3PLayer1;
    }

    public static JProgressBar getLifePokemonBar() {
        return lifePokemonBar;
    }

    public static void setLifePokemon(JProgressBar lifePokemon) {
        LifePokemonInBattlePlayer1.lifePokemonBar = lifePokemon;
    }
}

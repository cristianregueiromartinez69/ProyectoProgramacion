package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import javax.swing.*;
import com.dam.proyectoprogramacion.methods.battle.*;

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
    private static int lifePokemon1PLayer2;
    private static int lifePokemon1PLayer3;
    private static JProgressBar lifePokemon;


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
        this.add(panelLifePokemon);

        lifePokemon1PLayer1 = MethodsLifeBattlePokemonPlayer1.getLifePokemon1Player1();





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

    public static int getLifePokemon1PLayer2() {
        return lifePokemon1PLayer2;
    }

    public static void setLifePokemon1PLayer2(int lifePokemon1PLayer2) {
        LifePokemonInBattlePlayer1.lifePokemon1PLayer2 = lifePokemon1PLayer2;
    }

    public static int getLifePokemon1PLayer3() {
        return lifePokemon1PLayer3;
    }

    public static void setLifePokemon1PLayer3(int lifePokemon1PLayer3) {
        LifePokemonInBattlePlayer1.lifePokemon1PLayer3 = lifePokemon1PLayer3;
    }

    public static JProgressBar getLifePokemon() {
        return lifePokemon;
    }

    public static void setLifePokemon(JProgressBar lifePokemon) {
        LifePokemonInBattlePlayer1.lifePokemon = lifePokemon;
    }
}

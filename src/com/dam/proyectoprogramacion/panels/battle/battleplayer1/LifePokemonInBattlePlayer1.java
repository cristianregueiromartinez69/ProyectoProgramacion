package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import javax.swing.*;
import com.dam.proyectoprogramacion.methods.battle.*;

import java.awt.*;

/**
 * clase con el panel de la vida del pokemon en batalla del jugador 1
 * @author cristian
 * @version v3.0
 */
public class LifePokemonInBattlePlayer1 extends JPanel {

    /**
     * atributos privados de la clase
     */
    private JPanel panelLifePokemonPLayer1;
    private static int lifePokemon1PLayer1;
    private static int lifePokemon2PLayer1;
    private static int lifePokemon3PLayer1;
    private static int actualLifePokemonInBattlePlayer1;
    private static JProgressBar lifePokemonBarPlayer1;


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
        panelLifePokemonPLayer1 = new JPanel();


        /**
         * le damos valores a la vida de los pokemons del jugador 1
         */
        lifePokemon1PLayer1 = MethodsLifeBattlePokemonPlayer1.getLifePokemon1Player1();
        lifePokemon2PLayer1 = MethodsLifeBattlePokemonPlayer1.getLifePokemon2Player1();
        lifePokemon3PLayer1 = MethodsLifeBattlePokemonPlayer1.getLifePokemon3Player1();

        /**
         * le damos un valor a la barra de vida del pokemon en batalla
         */
        lifePokemonBarPlayer1 = new JProgressBar(0, actualLifePokemonInBattlePlayer1);
        lifePokemonBarPlayer1.setValue(actualLifePokemonInBattlePlayer1);


        /**
         * le damos unas dimensiones a la barra de vida
         */
        lifePokemonBarPlayer1.setPreferredSize(new Dimension(400,40));
        lifePokemonBarPlayer1.setMaximumSize(new Dimension(400,40));
        lifePokemonBarPlayer1.setMinimumSize(new Dimension(400,40));
        /**
         * hacemos que sea visible el valor que tiene
         */
        lifePokemonBarPlayer1.setStringPainted(true);
        /**
         * hacemos que el color de fondo sea igual a un metodo el cual varía el color según su vida actual
         */
        lifePokemonBarPlayer1.setForeground(getBackgroundColorLifeBarPokemonPlayer1());

        /**
         * lo añadimos al panel
         */
        panelLifePokemonPLayer1.add(lifePokemonBarPlayer1);


        this.add(panelLifePokemonPLayer1);





    }

    /**
     * metodo para establecer el color de fondo de la vida del pokemon
     * @return el color de fondo
     */
    private Color getBackgroundColorLifeBarPokemonPlayer1() {
        Color colorBackgroundLifePokemon;
        lifePokemonBarPlayer1.setString("" + lifePokemonBarPlayer1.getValue());

        /**
         * si la vida es menos de un 20%, se pone de color rojo
         */
        if(lifePokemonBarPlayer1.getValue() <= lifePokemonBarPlayer1.getMaximum()*0.2){
            colorBackgroundLifePokemon = Color.RED;
        }
        /**
         * si la vida es de un 50% o menos, se pone amarillo
         */
        else if(lifePokemonBarPlayer1.getValue() <= lifePokemonBarPlayer1.getMaximum()*0.5){
            colorBackgroundLifePokemon = Color.YELLOW;
        }
        /**
         * si no es anda de lo anterior, está verde
         */
        else if(lifePokemonBarPlayer1.getValue() == 0){
            colorBackgroundLifePokemon = null;
        }
        else{
            colorBackgroundLifePokemon = Color.GREEN;
        }
        /**
         * retornamos el color de fondo
         */
        return colorBackgroundLifePokemon;
    }

    /**
     * getter y setter de los atributos de la clase
     * @return los atributos de la clase
     */
    public JPanel getPanelLifePokemon() {
        return panelLifePokemonPLayer1;
    }

    public void setPanelLifePokemon(JPanel panelLifePokemon) {
        this.panelLifePokemonPLayer1 = panelLifePokemon;
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

    public static JProgressBar getLifePokemonBarPlayer1() {
        return lifePokemonBarPlayer1;
    }

    public static void setLifePokemon(JProgressBar lifePokemon) {
        LifePokemonInBattlePlayer1.lifePokemonBarPlayer1 = lifePokemon;
    }

    public static int getActualLifePokemonInBattlePlayer1() {
        return actualLifePokemonInBattlePlayer1;
    }

    public static void setActualLifePokemonInBattlePlayer1(int actualLifePokemonInBattle) {
        LifePokemonInBattlePlayer1.actualLifePokemonInBattlePlayer1 = actualLifePokemonInBattle;
    }
}

package com.dam.proyectoprogramacion.panels.battle.battleplayer2;
import javax.swing.*;
import com.dam.proyectoprogramacion.methods.battle.*;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.LifePokemonInBattlePlayer1;

import java.awt.*;

/**
 * clase con el panel de la vida del pokemon en batalla del jugador 2
 * @author cristian
 * @version v3.0
 */
public class LifePokemonInBattlePlayer2 extends JPanel{

    /**
     * atributos privados de la clase
     */
    private JPanel panelLifePokemonPlayer2;
    private static int lifePokemon1PLayer2;
    private static int lifePokemon2PLayer2;
    private static int lifePokemon3PLayer2;
    private static int actualLifePokemonInBattlePlayer2;
    private static JProgressBar lifePokemonBarPlayer2;


    /**
     * constructor de la clase
     */
    public LifePokemonInBattlePlayer2(){

        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        /**
         * iniciamos el panel de vida y lo añadimos
         */
        panelLifePokemonPlayer2 = new JPanel();


        /**
         * le damos valores a la vida de los pokemons del jugador 2
         */
        lifePokemon1PLayer2 = MethodsLifeBattlePokemonPlayer1.getLifePokemon1Player1();
        lifePokemon2PLayer2 = MethodsLifeBattlePokemonPlayer1.getLifePokemon2Player1();
        lifePokemon3PLayer2 = MethodsLifeBattlePokemonPlayer1.getLifePokemon3Player1();

        /**
         * le damos un valor a la barra de vida del pokemon en batalla
         */
        lifePokemonBarPlayer2 = new JProgressBar(0, actualLifePokemonInBattlePlayer2);
        lifePokemonBarPlayer2.setValue(actualLifePokemonInBattlePlayer2);


        /**
         * le damos unas dimensiones a la barra de vida
         */
        lifePokemonBarPlayer2.setPreferredSize(new Dimension(400,40));
        lifePokemonBarPlayer2.setMaximumSize(new Dimension(400,40));
        lifePokemonBarPlayer2.setMinimumSize(new Dimension(400,40));
        /**
         * hacemos que sea visible el valor que tiene
         */
        lifePokemonBarPlayer2.setStringPainted(true);
        /**
         * hacemos que el color de fondo sea igual a un metodo el cual varía el color según su vida actual
         */
        lifePokemonBarPlayer2.setForeground(getBackgroundColorLifeBarPokemonPlayer2());

        /**
         * lo añadimos al panel
         */
        panelLifePokemonPlayer2.add(lifePokemonBarPlayer2);


        this.add(panelLifePokemonPlayer2);





    }
    /**
     * metodo para establecer el color de fondo de la vida del pokemon
     * @return el color de fondo
     */
    private Color getBackgroundColorLifeBarPokemonPlayer2() {
        Color colorBackgroundLifePokemon;
        lifePokemonBarPlayer2.setString("" + lifePokemonBarPlayer2.getValue());

        /**
         * si la vida es menos de un 20%, se pone de color rojo
         */
        if(lifePokemonBarPlayer2.getValue() <= lifePokemonBarPlayer2.getMaximum()*0.2){
            colorBackgroundLifePokemon = Color.RED;
        }
        /**
         * si la vida es de un 50% o menos, se pone amarillo
         */
        else if(lifePokemonBarPlayer2.getValue() <= lifePokemonBarPlayer2.getMaximum()*0.5){
            colorBackgroundLifePokemon = Color.YELLOW;
        }
        /**
         * si no es anda de lo anterior, está verde
         */
        else if(lifePokemonBarPlayer2.getValue() == 0){
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
     * metodo para establecer el color de fondo de la vida del pokemon
     * @return el color de fondo
     */
    public JPanel getPanelLifePokemonPlayer2() {
        return panelLifePokemonPlayer2;
    }

    public void setPanelLifePokemonPlayer2(JPanel panelLifePokemonPlayer2) {
        this.panelLifePokemonPlayer2 = panelLifePokemonPlayer2;
    }

    public static int getLifePokemon1PLayer2() {
        return lifePokemon1PLayer2;
    }

    public static void setLifePokemon1PLayer2(int lifePokemon1PLayer2) {
        LifePokemonInBattlePlayer2.lifePokemon1PLayer2 = lifePokemon1PLayer2;
    }

    public static int getLifePokemon2PLayer2() {
        return lifePokemon2PLayer2;
    }

    public static void setLifePokemon2PLayer2(int lifePokemon2PLayer2) {
        LifePokemonInBattlePlayer2.lifePokemon2PLayer2 = lifePokemon2PLayer2;
    }

    public static int getLifePokemon3PLayer2() {
        return lifePokemon3PLayer2;
    }

    public static void setLifePokemon3PLayer2(int lifePokemon3PLayer2) {
        LifePokemonInBattlePlayer2.lifePokemon3PLayer2 = lifePokemon3PLayer2;
    }

    public static int getActualLifePokemonInBattlePlayer2() {
        return actualLifePokemonInBattlePlayer2;
    }

    public static void setActualLifePokemonInBattlePlayer2(int actualLifePokemonInBattlePlayer2) {
        LifePokemonInBattlePlayer2.actualLifePokemonInBattlePlayer2 = actualLifePokemonInBattlePlayer2;
    }

    public static JProgressBar getLifePokemonBarPlayer2() {
        return lifePokemonBarPlayer2;
    }

    public static void setLifePokemonBarPlayer2(JProgressBar lifePokemonBarPlayer2) {
        LifePokemonInBattlePlayer2.lifePokemonBarPlayer2 = lifePokemonBarPlayer2;
    }
}

package com.dam.proyectoprogramacion.panels.battle.battleplayer2;

import com.dam.proyectoprogramacion.methods.battle.MethodsSongBattle;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * clase con el panel de la vida del pokemon en batalla del jugador 1
 * @author cristian
 * @version v3.0
 */
public class LifePokemonInBattlePlayer2 extends JPanel {

    /**
     * atributos privados de la clase
     */
    private JPanel panelLifePokemonPLayer2;
    private static int lifePokemon1PLayer2;
    private static int lifePokemon2PLayer2;
    private static int lifePokemon3PLayer2;
    private static int actualLifePokemonInBattlePlayer2;
    private static int auxLifePlayer2;
    private static JProgressBar lifePokemonBarPlayer2;


    /**
     * constructor de la clase
     */
    public LifePokemonInBattlePlayer2(int actualLifePokemonInBattlePlayer2, int auxLifePlayer2){

        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        panelLifePokemonPLayer2 = new JPanel();


        /**
         * iniciamos la barra de vida
         * el valor minimo es 0 y el maximo es la vida del pokemon en batalla
         */
        lifePokemonBarPlayer2 = new JProgressBar(0, actualLifePokemonInBattlePlayer2);
        lifePokemonBarPlayer2.setValue(auxLifePlayer2);

        /**
         * le damos unas dimensiones a la barra de vida
         */
        lifePokemonBarPlayer2.setPreferredSize(new Dimension(400, 40));
        lifePokemonBarPlayer2.setMaximumSize(new Dimension(400, 40));
        lifePokemonBarPlayer2.setMinimumSize(new Dimension(400, 40));
        /**
         * hacemos que aparezca el numero de la vida del pokemon
         */
        lifePokemonBarPlayer2.setStringPainted(true);

        /**
         * establecemos el color inicial de la barra de vida
         */
        lifePokemonBarPlayer2.setForeground(getBackgroundColorLifeBarPokemonPlayer2(auxLifePlayer2));

        /**
         * lo añadimos todos
         */
        panelLifePokemonPLayer2.add(lifePokemonBarPlayer2);
        this.add(panelLifePokemonPLayer2);
    }

    public static void updateLifeBar(JProgressBar lifeBar, int newLifeValue) {
        Timer timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int currentValue = lifeBar.getValue();

                if (currentValue > newLifeValue) {
                    lifeBar.setValue(currentValue - 12);
                    lifeBar.setForeground(getBackgroundColorLifeBarPokemonPlayer2(currentValue - 12));
                    lifeBar.repaint();
                } else {
                    ((Timer)e.getSource()).stop();
                }
            }
        });

        timer.start();
    }


    /**
     * metodo para establecer el color de fondo de la vida del pokemon
     * @return el color de fondo
     */
    public static Color getBackgroundColorLifeBarPokemonPlayer2(int value) {
        /**
         * valor que irá en la barra de vida
         */
        lifePokemonBarPlayer2.setString("" + lifePokemonBarPlayer2.getValue());
        if (value <= 0) {
            /**
             * si la vida es 0, el color será negro
             */
            MethodsSongBattle.stopMusic();
            return Color.BLACK;
        }
        if (value <= lifePokemonBarPlayer2.getMaximum() * 0.2) {
            /**
             * si tiene menos de un 20%, será roja
             */
            MethodsSongBattle.musicLifeRed();
            return Color.RED;
        }
        if (value <= lifePokemonBarPlayer2.getMaximum() * 0.5) {
            /**
             * si tiene la menos de la mitad, será amarilla
             */
            MethodsSongBattle.stopMusic();
            return Color.YELLOW;
        }
        MethodsSongBattle.stopMusic();
        return Color.GREEN;
    }

    /**
     * getter y setter de los atributos de la clase
     * @return los atributos de la clase
     */
    public JPanel getPanelLifePokemonPLayer2() {
        return panelLifePokemonPLayer2;
    }

    public void setPanelLifePokemonPLayer2(JPanel panelLifePokemonPLayer2) {
        this.panelLifePokemonPLayer2 = panelLifePokemonPLayer2;
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

    public static int getAuxLifePlayer2() {
        return auxLifePlayer2;
    }

    public static void setAuxLifePlayer2(int auxLifePlayer2) {
        LifePokemonInBattlePlayer2.auxLifePlayer2 = auxLifePlayer2;
    }

    public static JProgressBar getLifePokemonBarPlayer2() {
        return lifePokemonBarPlayer2;
    }

    public static void setLifePokemonBarPlayer2(JProgressBar lifePokemonBarPlayer2) {
        LifePokemonInBattlePlayer2.lifePokemonBarPlayer2 = lifePokemonBarPlayer2;
    }
}

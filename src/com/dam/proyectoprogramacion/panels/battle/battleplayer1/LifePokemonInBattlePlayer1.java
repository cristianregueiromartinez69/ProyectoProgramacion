package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import com.dam.proyectoprogramacion.Songs.LifeRedPokemonInBattleSong;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private static int auxLife;
    private static JProgressBar lifePokemonBarPlayer1;


    /**
     * constructor de la clase
     */
    public LifePokemonInBattlePlayer1(int actualLifePokemonInBattlePlayer1, int auxLife){

        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        panelLifePokemonPLayer1 = new JPanel();


        /**
         * iniciamos la barra de vida
         * el valor minimo es 0 y el maximo es la vida del pokemon en batalla
         */
        lifePokemonBarPlayer1 = new JProgressBar(0, actualLifePokemonInBattlePlayer1);
        lifePokemonBarPlayer1.setValue(auxLife);

        /**
         * le damos unas dimensiones a la barra de vida
         */
        lifePokemonBarPlayer1.setPreferredSize(new Dimension(400, 40));
        lifePokemonBarPlayer1.setMaximumSize(new Dimension(400, 40));
        lifePokemonBarPlayer1.setMinimumSize(new Dimension(400, 40));
        /**
         * hacemos que aparezca el numero de la vida del pokemon
         */
        lifePokemonBarPlayer1.setStringPainted(true);

        /**
         * establecemos el color inicial de la barra de vida
         */
        lifePokemonBarPlayer1.setForeground(getBackgroundColorLifeBarPokemonPlayer1(auxLife));

        /**
         * lo añadimos todos
         */
        panelLifePokemonPLayer1.add(lifePokemonBarPlayer1);
        this.add(panelLifePokemonPLayer1);
    }

    /**
     * metodo para establecer el color de fondo de la vida del pokemon
     * @return el color de fondo
     */
    public static Color getBackgroundColorLifeBarPokemonPlayer1(int value) {
        /**
         * valor que irá en la barra de vida
         */
        lifePokemonBarPlayer1.setString("" + lifePokemonBarPlayer1.getValue());
        if (value <= 0) {
            /**
             * si la vida es 0, el color será negro
             */
            LifeRedPokemonInBattleSong.stopMusic();
            return Color.BLACK;
        }
        if (value <= lifePokemonBarPlayer1.getMaximum() * 0.2) {
            /**
             * si tiene menos de un 20%, será roja
             */
            LifeRedPokemonInBattleSong.musicLifeRed();
            return Color.RED;
        }
        if (value <= lifePokemonBarPlayer1.getMaximum() * 0.5) {
            /**
             * si tiene la menos de la mitad, será amarilla
             */
            LifeRedPokemonInBattleSong.stopMusic();
            return Color.YELLOW;
        }
        LifeRedPokemonInBattleSong.stopMusic();
        return Color.GREEN;
    }


    public static void updateLifeBar(JProgressBar lifeBar, int newLifeValue) {
        // Crea un nuevo Timer que se activa cada 100 milisegundos
        Timer timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtiene el valor actual de la barra de progreso
                int currentValue = lifeBar.getValue();

                // Si el valor actual es mayor que el nuevo valor de vida, disminuye el valor actual en 1
                if (currentValue > newLifeValue) {
                    lifeBar.setValue(currentValue - 15);
                    lifeBar.setForeground(getBackgroundColorLifeBarPokemonPlayer1(currentValue - 15));
                    lifeBar.repaint();
                } else {
                    // Si el valor actual es igual o menor que el nuevo valor de vida, detiene el Timer
                    ((Timer)e.getSource()).stop();
                }
            }
        });

        // Inicia el Timer
        timer.start();
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

    public JPanel getPanelLifePokemonPLayer1() {
        return panelLifePokemonPLayer1;
    }

    public void setPanelLifePokemonPLayer1(JPanel panelLifePokemonPLayer1) {
        this.panelLifePokemonPLayer1 = panelLifePokemonPLayer1;
    }



    public static void setLifePokemonBarPlayer1(JProgressBar lifePokemonBarPlayer1) {
        LifePokemonInBattlePlayer1.lifePokemonBarPlayer1 = lifePokemonBarPlayer1;
    }

    public static int getAuxLife() {
        return auxLife;
    }

    public static void setAuxLife(int auxLife) {
        LifePokemonInBattlePlayer1.auxLife = auxLife;
    }
}

package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * clase con los botones de la interfaz de selección de pokemons
 *
 * @author cristian
 * @version v1.0
 */
public class ButtonInterfacePokemonSelect extends JPanel {

    /**
     * Atributos privados de tipo boton de la interfaz
     */
    private static JButton startButton;
    private static JButton readyPlayer1Button;
    private static JButton readyPlayer2Button;

    /**
     * metodo para crear el boton de start
     *
     * @return el boton de start
     */
    public JButton makeStartButton() {
        ImageIcon iconStart = new ImageIcon("imagenes/empezar.png");
        startButton = new CreateButtons("A batallar", iconStart);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return startButton;

    }
    /**
     * metodo para crear el boton de listo para el jugador 1
     *
     * @return el boton del jugador 1
     */
    public JButton makeReadyPlayer1Button(){
        readyPlayer1Button = new JButton("Listo");
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.RED, 3);
        setBorder(borderboton);
        return readyPlayer1Button;
    }
    /**
     * metodo para crear el boton de listo para el jugador 2
     *
     * @return el boton del jugador 2
     */
    public JButton makeReadyPlayer2Button(){
        readyPlayer2Button = new JButton("Listo");
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.RED, 3);
        setBorder(borderboton);
        return readyPlayer2Button;
    }


    public static JButton getStartButton() {
        return startButton;
    }
}

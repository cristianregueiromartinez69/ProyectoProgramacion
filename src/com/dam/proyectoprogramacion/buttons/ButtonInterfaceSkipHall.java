package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * clase con los botones de la interfaz del salon de la fama
 * @author cristian
 * @version v1.0
 */
public class ButtonInterfaceSkipHall extends JPanel {

    /**
     * atributos privados de tipo JButton con los botones de la interfaz del salon de la fama
     */
    private JButton playAgainButton;
    private JButton backToMenuButton;


    /**
     * metodo para crear el boton de otra batalla
     * @return el boton creado
     */
    public JButton makePlayAgainButton(){
        ImageIcon iconBack = new ImageIcon("imagenes/iconoBatalla.png");
        playAgainButton = new CreateButtons("otra batalla", iconBack);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return playAgainButton;
    }

    /**
     * metodo para crear el boton de volver al menu
     * @return el boton creado
     */
    public JButton makeBackButton(){
        ImageIcon iconBack = new ImageIcon("imagenes/backMenu.png");
        backToMenuButton = new CreateButtons("ir la menu", iconBack);
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return backToMenuButton;
    }
}

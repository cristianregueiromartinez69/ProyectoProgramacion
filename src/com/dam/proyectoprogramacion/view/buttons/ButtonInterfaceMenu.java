package com.dam.proyectoprogramacion.view.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Clase de los botones de la interfaz del menu principal del proyecto
 * @author cristian
 * @version 1.0
 */
public class ButtonInterfaceMenu extends JPanel{

    /**
     * atributos privados que serán los botones de la interfaz grafica del menú
     */
    private JButton createAccountButton;
    private JButton combatButton;

    /**
     * metodo que creará el boton de crear cuenta y establecemos métodos para el botón
     * @return el botón de crear cuenta
     */
    public  JButton makeAccountButton(){

        ImageIcon iconAccount = new ImageIcon("imagenes/crearCuenta.png");
        createAccountButton = new CreateButtons("Crear Cuenta", iconAccount);
        setBackground(Color.ORANGE);
        setForeground(Color.BLACK);
        setPreferredSize(new Dimension(150,50));
        Border borderboton = BorderFactory.createLineBorder(Color.YELLOW, 2);
        setBorder(borderboton);
        return createAccountButton;
    }
    /**
     * metodo que creará el boton de batalla y establecemos métodos para el botón
     * @return el botón de batalla
     */
    public  JButton makeBattleButton(){

        ImageIcon iconBattle = new ImageIcon("imagenes/iconoBatalla.png");
        combatButton = new CreateButtons("Batalla", iconBattle);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setPreferredSize(new Dimension(150,50));
        Border borderboton = BorderFactory.createLineBorder(Color.YELLOW, 2);
        setBorder(borderboton);
        return combatButton;
    }


}

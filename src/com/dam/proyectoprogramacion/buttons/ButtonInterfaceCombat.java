package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Clase con los botones de la interfaz de combate pokemon
 * Esto será un panek con los botones de atacar y cambiar de pokemon
 * @author cristian
 * @version v1.0
 */
public class ButtonInterfaceCombat extends JPanel {

    /**
     * atributos privados de tipo JButton
     * atacar y escoger el ataque del pokemon
     * cambiar y poder elegir que pokemon quieres usar
     */
    private static JButton attackButton;
    private static JButton changePokemonButton;

    /**
     * metodo para crear el boton de atacar en el combate pokemon
     * @return el boton creado
     */
    public JButton makeAttackButton(){
        attackButton = new JButton("Atacar");
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
        setBorder(borderboton);
        return attackButton;
    }

    /**
     * metodo para crear el boton de cambiar de pokemon
     * @return el boton creado
     */
    public JButton makeChangePokemonButton(){
        changePokemonButton = new JButton("Cambiar");
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
        setBorder(borderboton);
        return changePokemonButton;
    }

    public static void setAttackButton(JButton attackButton) {
        ButtonInterfaceCombat.attackButton = attackButton;
    }

    public static void setChangePokemonButton(JButton changePokemonButton) {
        ButtonInterfaceCombat.changePokemonButton = changePokemonButton;
    }

    public static JButton getAttackButton() {
        return attackButton;
    }

    public static JButton getChangePokemonButton() {
        return changePokemonButton;
    }

    //TODO: faltaría poner una imagen del pokemon en batalla en el boton de ataque, pero eso es para más adelante

}

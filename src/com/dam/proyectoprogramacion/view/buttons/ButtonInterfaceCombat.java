package com.dam.proyectoprogramacion.view.buttons;

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
    private static JButton attackButtonPlayer1;
    private static JButton changePokemonButtonPlayer1;
    private static String pathPokemonBattlePlayer1;

    private static JButton attackButtonPlayer2;
    private static JButton changePokemonButtonPlayer2;
    private static String pathPokemonBattlePlayer2;

    /**
     * metodo para crear el boton de atacar en el combate pokemon
     * @return el boton creado
     */
    public JButton makeAttackButtonPlayer1(){
        ImageIcon pokemonImage = new ImageIcon(pathPokemonBattlePlayer1);
        attackButtonPlayer1 = new CreateButtons("Atacar", pokemonImage);
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
        setBorder(borderboton);
        return attackButtonPlayer1;
    }

    /**
     * metodo para crear el boton de cambiar de pokemon
     * @return el boton creado
     */
    public JButton makeChangePokemonButtonPLayer1(){
        changePokemonButtonPlayer1 = new JButton("Cambiar");
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
        setBorder(borderboton);
        return changePokemonButtonPlayer1;
    }

    /**
     * metodo para crear el boton de atacar en el combate pokemon
     * @return el boton creado
     */
    public JButton makeAttackButtonPlayer2(){
        ImageIcon pokemonImage = new ImageIcon(pathPokemonBattlePlayer2);
        attackButtonPlayer2 = new CreateButtons("Atacar", pokemonImage);
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
        setBorder(borderboton);
        return attackButtonPlayer2;
    }

    /**
     * metodo para crear el boton de cambiar de pokemon
     * @return el boton creado
     */
    public JButton makeChangePokemonButtonPLayer2(){
        changePokemonButtonPlayer2 = new JButton("Cambiar");
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
        setBorder(borderboton);
        return changePokemonButtonPlayer2;
    }



    public static JButton getAttackButtonPlayer1() {
        return attackButtonPlayer1;
    }

    public static void setAttackButtonPlayer1(JButton attackButtonPlayer1) {
        ButtonInterfaceCombat.attackButtonPlayer1 = attackButtonPlayer1;
    }

    public static JButton getChangePokemonButtonPlayer1() {
        return changePokemonButtonPlayer1;
    }

    public static void setChangePokemonButtonPlayer1(JButton changePokemonButtonPlayer1) {
        ButtonInterfaceCombat.changePokemonButtonPlayer1 = changePokemonButtonPlayer1;
    }

    public static String getPathPokemonBattlePlayer1() {
        return pathPokemonBattlePlayer1;
    }

    public static void setPathPokemonBattlePlayer1(String pathPokemonBattlePlayer1) {
        ButtonInterfaceCombat.pathPokemonBattlePlayer1 = pathPokemonBattlePlayer1;
    }

    public static JButton getAttackButtonPlayer2() {
        return attackButtonPlayer2;
    }

    public static void setAttackButtonPlayer2(JButton attackButtonPlayer2) {
        ButtonInterfaceCombat.attackButtonPlayer2 = attackButtonPlayer2;
    }

    public static JButton getChangePokemonButtonPlayer2() {
        return changePokemonButtonPlayer2;
    }

    public static void setChangePokemonButtonPlayer2(JButton changePokemonButtonPlayer2) {
        ButtonInterfaceCombat.changePokemonButtonPlayer2 = changePokemonButtonPlayer2;
    }

    public static String getPathPokemonBattlePlayer2() {
        return pathPokemonBattlePlayer2;
    }

    public static void setPathPokemonBattlePlayer2(String pathPokemonBattlePlayer2) {
        ButtonInterfaceCombat.pathPokemonBattlePlayer2 = pathPokemonBattlePlayer2;
    }

    //TODO: faltaría poner una imagen del pokemon en batalla en el boton de ataque, pero eso es para más adelante

}

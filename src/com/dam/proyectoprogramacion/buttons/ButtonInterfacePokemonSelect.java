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
    private JButton drampaButton;
    private JButton empoleonButton;
    private JButton garchompButton;
    private JButton gengarButton;
    private JButton infernapeButton;
    private JButton lucarioButton;
    private JButton luxrayButton;
    private JButton marshadowButton;
    private JButton miloticButton;
    private JButton snorlaxButton;
    private JButton tinkatonButton;
    private JButton tyranitarButton;
    private JButton startButton;
    private JButton readyPlayer1Button;
    private JButton readyPlayer2Button;
    private JButton backToMenuButton;

    /**
     * metodo para crear el boton de drampa
     *
     * @return el boton de drampa
     */
    public JButton makeDrampaButton() {

        ImageIcon iconDragon = new ImageIcon("imagenes/dragon.png");
        drampaButton = new CreateButtons("Drampa", iconDragon);
        setBackground(Color.GREEN.brighter());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.RED, 2);
        setBorder(borderboton);
        return drampaButton;
    }

    /**
     * metodo para crear el boton de empoleon
     *
     * @return el boton de empoleon
     */
    public JButton makeEmpoleonButton() {

        ImageIcon iconSteel = new ImageIcon("imagenes/acero.png");
        empoleonButton = new CreateButtons("Empoleon", iconSteel);
        setBackground(Color.GRAY.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return empoleonButton;
    }

    /**
     * metodo para crear el boton de garchomp
     *
     * @return el boton de garchomp
     */
    public JButton makeGarchompButton() {

        ImageIcon iconGround = new ImageIcon("imagenes/tierra.png");
        garchompButton = new CreateButtons("Garchomp", iconGround);
        setBackground(Color.BLUE.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return garchompButton;
    }

    /**
     * metodo para crear el boton de gengar
     *
     * @return el boton de gengar
     */
    public JButton makeGengarButton() {

        ImageIcon iconGhost = new ImageIcon("imagenes/fantasma.png");
        gengarButton = new CreateButtons("Gengar", iconGhost);
        setBackground(Color.MAGENTA.darker().darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return gengarButton;
    }

    /**
     * metodo para crear el boton de infernape
     *
     * @return el boton de infernape
     */
    public JButton makeInfernapeButton() {

        ImageIcon iconFire = new ImageIcon("imagenes/fuego.png");
        infernapeButton = new CreateButtons("Infernape", iconFire);
        setBackground(Color.RED.brighter());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return infernapeButton;
    }

    /**
     * metodo para crear el boton de lucario
     *
     * @return el boton de lucario
     */
    public JButton makeLucarioButton() {

        ImageIcon iconFight = new ImageIcon("imagenes/lucha.png");
        lucarioButton = new CreateButtons("Lucario", iconFight);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return lucarioButton;
    }
    /**
     * metodo para crear el boton de luxray
     *
     * @return el boton de luxray
     */
    public JButton makeLuxrayButton() {
        ImageIcon iconElectric = new ImageIcon("imagenes/electrico.png");
        luxrayButton = new CreateButtons("Luxray", iconElectric);
        setBackground(Color.YELLOW);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return luxrayButton;

    }
    /**
     * metodo para crear el boton de marshadow
     *
     * @return el boton de marshadow
     */
    public JButton makeMarshadowButton() {
        ImageIcon iconGhost = new ImageIcon("imagenes/fantasma.png");
        marshadowButton = new CreateButtons("Marshadow", iconGhost);
        setBackground(Color.MAGENTA.darker().darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return marshadowButton;

    }
    public JButton makeMiloticButton() {
        ImageIcon iconWater = new ImageIcon("imagenes/agua.png");
        miloticButton = new CreateButtons("Milotic", iconWater);
        setBackground(Color.BLUE.brighter().brighter());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return miloticButton;

    }
    public JButton makeSnorlaxButton() {
        ImageIcon iconNormal = new ImageIcon("imagenes/normal.png");
        snorlaxButton = new CreateButtons("Snorlax", iconNormal);
        setBackground(Color.GRAY.brighter());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return snorlaxButton;

    }






}

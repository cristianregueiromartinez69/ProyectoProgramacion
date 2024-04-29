package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonInterfacePokemonSelect extends JPanel {

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

    public  JButton makeDrampaButton(){

        ImageIcon iconDragon = new ImageIcon("imagenes/dragon.png");
        drampaButton = new CreateButtons("Drampa", iconDragon);
        setBackground(Color.GREEN.brighter());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.RED, 2);
        setBorder(borderboton);
        return drampaButton;
    }
    public  JButton makeEmpoleonButton(){

        ImageIcon iconSteel = new ImageIcon("imagenes/acero.png");
        empoleonButton = new CreateButtons("Empoleon", iconSteel);
        setBackground(Color.GRAY.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return empoleonButton;
    }







}

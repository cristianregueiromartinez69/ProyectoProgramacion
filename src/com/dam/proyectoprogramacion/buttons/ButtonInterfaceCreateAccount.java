package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonInterfaceCreateAccount extends JPanel {

    private JButton icon1Player1Button;
    private JButton icon2Player1Button;
    private JButton icon3Player1Button;
    private JButton icon4Player1Button;
    private JButton icon5Player1Button;
    private JButton icon6Player1Button;
    private JButton icon7Player1Button;
    private JButton icon8Player1Button;
    private JButton icon9Player1Button;
    private JButton icon10Player1Button;

    private JButton icon1Player2Button;
    private JButton icon2Player2Button;
    private JButton icon3Player2Button;
    private JButton icon4Player2Button;
    private JButton icon5Player2Button;
    private JButton icon6Player2Button;
    private JButton icon7Player2Button;
    private JButton icon8Player2Button;
    private JButton icon9Player2Button;
    private JButton icon10Player2Button;

    private JButton readyPlayer1Button;
    private JButton readyPlayer2Button;
    private JButton backToMenuButton;

    public JButton makeIcon1Button(){
        ImageIcon icon1 = new ImageIcon("imagenes/iconosJugador1.png");
        icon1Player1Button = new CreateButtons("Icono 1", icon1);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon1Player1Button;
    }



}

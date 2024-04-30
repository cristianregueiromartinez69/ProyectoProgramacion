package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonInterfaceAttacks extends JPanel {

    private JButton attack1;
    private JButton attack2;
    private JButton attack3;
    private JButton attack4;
    private JButton back;


    public JButton makeAttack1Button(){
        ImageIcon iconFace = new ImageIcon("imagenes/siniestro.png");
        attack1 = new CreateButtons("ataque 1", iconFace);
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack1;
    }
    public JButton makeAttack2Button(){
        ImageIcon iconFace = new ImageIcon("imagenes/bicho.png");
        attack2 = new CreateButtons("ataque 2", iconFace);
        setBackground(Color.YELLOW);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack2;
    }
    public JButton makeAttack3Button(){
        ImageIcon iconFace = new ImageIcon("imagenes/volador.png");
        attack3 = new CreateButtons("ataque 3", iconFace);
        setBackground(Color.ORANGE);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack3;
    }
    public JButton makeAttack4Button(){
        ImageIcon iconFace = new ImageIcon("imagenes/planta.png");
        attack4 = new CreateButtons("ataque 4", iconFace);
        setBackground(Color.PINK);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack4;
    }



}

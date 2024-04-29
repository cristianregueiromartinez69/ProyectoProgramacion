package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonInterfaceLuck extends JPanel {

    private JButton faceButton;
    private JButton tailButton;

    public  JButton makeFaceButton(){

        ImageIcon iconFace = new ImageIcon("imagenes/cara.png");
        faceButton = new CreateButtons("Cara", iconFace);
        setBackground(Color.GREEN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return faceButton;
    }

    public  JButton makeTailButton(){

        ImageIcon iconTail = new ImageIcon("imagenes/cruz.png");
        tailButton = new CreateButtons("Cruz", iconTail);
        setBackground(Color.CYAN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.CYAN.darker().darker(), 2);
        setBorder(borderboton);
        return tailButton;
    }


}

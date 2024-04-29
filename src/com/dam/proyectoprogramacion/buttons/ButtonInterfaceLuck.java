package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Clase de los botones de la interfaz de la suerte
 * @author Cristian
 * @version v1.0
 */
public class ButtonInterfaceLuck extends JPanel {

    /**
     * atributos privados de tipo JButton que serán los de la clase de la suerte
     */
    private JButton faceButton;
    private JButton tailButton;
    private JButton confirmButton;

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

    public JButton makeConfirmButton(){

        confirmButton = new JButton("Listo");
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.RED, 3);
        setBorder(borderboton);
        return confirmButton;

    }


}

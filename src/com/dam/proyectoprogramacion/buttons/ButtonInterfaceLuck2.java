package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Clase de los botones de la interfaz de la suerte
 * Esta es una clase auxiliar para la interfaz luck
 * @author Cristian
 * @version v2.0
 */
public class ButtonInterfaceLuck2 extends JPanel {

    /**
     * atributos privados de tipo JButton que serán los de la clase de la suerte
     */
    private static JButton faceButton;
    private static JButton tailButton;
    private static JButton confirmbuttonPlayer2;


    /**
     * metodo para crear el botón de la cara de la moneda en la interfaz suerte
     * @return el boton creado
     */
    public  JButton makeFaceButton(){

        ImageIcon iconFace = new ImageIcon("imagenes/cara.png");
        faceButton = new CreateButtons("Cara", iconFace);
        setBackground(Color.ORANGE.brighter());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return faceButton;
    }

    /**
     * metodo para crear la cruz de la moneda en la interfaz suerte
     * @return el boton creado
     */
    public  JButton makeTailButton(){

        ImageIcon iconTail = new ImageIcon("imagenes/cruz.png");
        tailButton = new CreateButtons("Cruz", iconTail);
        setBackground(Color.CYAN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.CYAN.darker().darker(), 2);
        setBorder(borderboton);
        return tailButton;
    }

    /**
     * metodo para crear el boton de confirmar, una vez ambos jugadores ya saben quien escoge primero
     * @return el boton creado
     */
    public JButton makeConfirmButtonPlayer2(){

        confirmbuttonPlayer2 = new JButton("Listo");
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.RED, 3);
        setBorder(borderboton);
        return confirmbuttonPlayer2;

    }

    /**
     * getter y setter de la clase auxiliar de la suerte
     * @return
     */
    public static JButton getFaceButton() {
        return faceButton;
    }

    public static void setFaceButton(JButton faceButton) {
        ButtonInterfaceLuck2.faceButton = faceButton;
    }

    public static JButton getTailButton() {
        return tailButton;
    }

    public static void setTailButton(JButton tailButton) {
        ButtonInterfaceLuck2.tailButton = tailButton;
    }

    public static JButton getConfirmbuttonPlayer2() {
        return confirmbuttonPlayer2;
    }

    public static void setConfirmbuttonPlayer2(JButton confirmbuttonPlayer2) {
        ButtonInterfaceLuck2.confirmbuttonPlayer2 = confirmbuttonPlayer2;
    }
}

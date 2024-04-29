package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Clase con los botones de la interfaz de crear cuenta
 * @author cristian
 * @version v1.0
 */
public class ButtonInterfaceCreateAccount extends JPanel {

    /**
     * atributos privados de tipo JButton que es lo que presionará el jugador 1 para seleccionar un icono
     */
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

    /**
     * atributos privados de tipo JButton que es lo que presionará el jugador 2 para seleccionar un icono
     */
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

    /**
     * atributos privados de tipo JButton que son los botones de confirmacion del jugador 1 y 2
     */
    private JButton readyPlayer1Button;
    private JButton readyPlayer2Button;

    /**
     * atributo privado de tipo JButton que sirve para volver al menu
     */
    private JButton backToMenuButton;

    /**
     * metodo que crea el boton que ha de presionar el jugador 1 para seleccionar el icono 1
     * @return el boton creado
     */
    public JButton makeIcon1Player1Button(){
        ImageIcon icon1 = new ImageIcon("imagenes/iconosJugador1.png");
        icon1Player1Button = new CreateButtons("Icono 1", icon1);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon1Player1Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 1 para seleccionar el icono 2
     * @return el boton creado
     */
    public JButton makeIcon2Player1Button(){
        ImageIcon icon2 = new ImageIcon("imagenes/iconosJugador1.png");
        icon2Player1Button = new CreateButtons("Icono 2", icon2);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon2Player1Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 1 para seleccionar el icono 3
     * @return el boton creado
     */
    public JButton makeIcon3Player1Button(){
        ImageIcon icon3 = new ImageIcon("imagenes/iconosJugador1.png");
        icon3Player1Button = new CreateButtons("Icono 3", icon3);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon3Player1Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 1 para seleccionar el icono 4
     * @return el boton creado
     */
    public JButton makeIcon4Player1Button(){
        ImageIcon icon4 = new ImageIcon("imagenes/iconosJugador1.png");
        icon4Player1Button = new CreateButtons("Icono 4", icon4);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon4Player1Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 1 para seleccionar el icono 5
     * @return el boton creado
     */
    public JButton makeIcon5Player1Button(){
        ImageIcon icon5 = new ImageIcon("imagenes/iconosJugador1.png");
        icon5Player1Button = new CreateButtons("Icono 5", icon5);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon5Player1Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 1 para seleccionar el icono 6
     * @return el boton creado
     */
    public JButton makeIcon6Player1Button(){
        ImageIcon icon6 = new ImageIcon("imagenes/iconosJugador1.png");
        icon6Player1Button = new CreateButtons("Icono 6", icon6);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon6Player1Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 1 para seleccionar el icono 7
     * @return el boton creado
     */
    public JButton makeIcon7Player1Button(){
        ImageIcon icon7 = new ImageIcon("imagenes/iconosJugador1.png");
        icon7Player1Button = new CreateButtons("Icono 7", icon7);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon7Player1Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 1 para seleccionar el icono 8
     * @return el boton creado
     */
    public JButton makeIcon8Player1Button(){
        ImageIcon icon8 = new ImageIcon("imagenes/iconosJugador1.png");
        icon8Player1Button = new CreateButtons("Icono 8", icon8);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon8Player1Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 1 para seleccionar el icono 9
     * @return el boton creado
     */
    public JButton makeIcon9Player1Button(){
        ImageIcon icon9 = new ImageIcon("imagenes/iconosJugador1.png");
        icon9Player1Button = new CreateButtons("Icono 9", icon9);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon9Player1Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 1 para seleccionar el icono 10
     * @return el boton creado
     */
    public JButton makeIcon10Player1Button(){
        ImageIcon icon10 = new ImageIcon("imagenes/iconosJugador1.png");
        icon10Player1Button = new CreateButtons("Icono 10", icon10);
        setBackground(Color.YELLOW.darker());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon10Player1Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 2 para seleccionar el icono 1
     * @return el boton creado
     */
    public JButton makeIcon1Player2Button(){
        ImageIcon icon1 = new ImageIcon("imagenes/iconosJugador2.png");
        icon1Player2Button = new CreateButtons("Icono 1", icon1);
        setBackground(Color.ORANGE.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon1Player2Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 2 para seleccionar el icono 2
     * @return el boton creado
     */
    public JButton makeIcon2Player2Button(){
        ImageIcon icon2 = new ImageIcon("imagenes/iconosJugador2.png");
        icon2Player2Button = new CreateButtons("Icono 2", icon2);
        setBackground(Color.ORANGE.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon2Player2Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 2 para seleccionar el icono 3
     * @return el boton creado
     */
    public JButton makeIcon3Player2Button(){
        ImageIcon icon3 = new ImageIcon("imagenes/iconosJugador2.png");
        icon3Player2Button = new CreateButtons("Icono 3", icon3);
        setBackground(Color.ORANGE.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon3Player2Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 2 para seleccionar el icono 4
     * @return el boton creado
     */
    public JButton makeIcon4Player2Button(){
        ImageIcon icon4 = new ImageIcon("imagenes/iconosJugador2.png");
        icon4Player2Button = new CreateButtons("Icono 4", icon4);
        setBackground(Color.ORANGE.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon4Player2Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 2 para seleccionar el icono 5
     * @return el boton creado
     */
    public JButton makeIcon5Player2Button(){
        ImageIcon icon5 = new ImageIcon("imagenes/iconosJugador2.png");
        icon5Player2Button = new CreateButtons("Icono 5", icon5);
        setBackground(Color.ORANGE.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon5Player2Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 2 para seleccionar el icono 6
     * @return el boton creado
     */
    public JButton makeIcon6Player2Button(){
        ImageIcon icon6 = new ImageIcon("imagenes/iconosJugador2.png");
        icon6Player2Button = new CreateButtons("Icono 6", icon6);
        setBackground(Color.ORANGE.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon6Player2Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 2 para seleccionar el icono 7
     * @return el boton creado
     */
    public JButton makeIcon7Player2Button(){
        ImageIcon icon7 = new ImageIcon("imagenes/iconosJugador2.png");
        icon7Player2Button = new CreateButtons("Icono 7", icon7);
        setBackground(Color.ORANGE.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon7Player2Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 2 para seleccionar el icono 8
     * @return el boton creado
     */
    public JButton makeIcon8Player2Button(){
        ImageIcon icon8 = new ImageIcon("imagenes/iconosJugador2.png");
        icon8Player2Button = new CreateButtons("Icono 8", icon8);
        setBackground(Color.ORANGE.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon8Player2Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 2 para seleccionar el icono 9
     * @return el boton creado
     */
    public JButton makeIcon9Player2Button(){
        ImageIcon icon9 = new ImageIcon("imagenes/iconosJugador2.png");
        icon9Player2Button = new CreateButtons("Icono 9", icon9);
        setBackground(Color.ORANGE.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon9Player2Button;
    }

    /**
     * metodo que crea el boton que ha de presionar el jugador 2 para seleccionar el icono 10
     * @return el boton creado
     */
    public JButton makeIcon10Player2Button(){
        ImageIcon icon10 = new ImageIcon("imagenes/iconosJugador2.png");
        icon10Player2Button = new CreateButtons("Icono 10", icon10);
        setBackground(Color.ORANGE.darker());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.GREEN.darker().darker(), 2);
        setBorder(borderboton);
        return icon10Player2Button;
    }






}

package com.dam.proyectoprogramacion.methods.accountcreate;

import javax.swing.*;

/**
 * clase con más metodos de la interfaz de crear cuenta
 * @author cristian
 * @version v1.0
 */
public class MethodsLogicalAccountCreate {

    /**
     * atributos privados en los que vamos a almacenar a posteriori información para añadir al hashmap de los jugadores
     */
    private static String aliasPlayer1;
    private static ImageIcon imagePlayer1;
    private static String aliasPlayer2;
    private static ImageIcon imagePlayer2;

    /**
     * metodo que me va a devolver un jlabel con el alias introducido por el jugador 1
     * @param alias el alias del jugador 1
     * @return el jlabel con el alias introducido
     */
    public static JLabel makeSelectAliasPlayer1(String alias){
        JLabel aliasText = new JLabel(alias);
        return aliasText;
    }

    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 1 del jugador 1
     * @return el jlabel con la imagen del icono1
     */
    public static JLabel makeSelectImage1Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono1.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 2 del jugador 1
     * @return el jlabel con la imagen del icono 2
     */
    public static JLabel makeSelectImage2Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono2.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 3 del jugador 1
     * @return el jlabel con la imagen del icono 3
     */
    public static JLabel makeSelectImage3Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono3.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 4 del jugador 1
     * @return el jlabel con la imagen del icono 4
     */
    public static JLabel makeSelectImage4Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono4.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 5 del jugador 1
     * @return el jlabel con la imagen del icono 5
     */
    public static JLabel makeSelectImage5Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono5.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 6 del jugador 1
     * @return el jlabel con la imagen del icono 6
     */
    public static JLabel makeSelectImage6Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono6.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 7 del jugador 1
     * @return el jlabel con la imagen del icono 7
     */
    public static JLabel makeSelectImage7Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono7.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 8 del jugador 1
     * @return el jlabel con la imagen del icono 8
     */
    public static JLabel makeSelectImage8Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono8.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 9 del jugador 1
     * @return el jlabel con la imagen del icono 9
     */
    public static JLabel makeSelectImage9Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono9.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 10 del jugador 1
     * @return el jlabel con la imagen del icono 10
     */
    public static JLabel makeSelectImage10Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono10.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }

    /**
     * metodo para hacer un panel con la imagen de confirmacion de informacion seleccionada del juagdor 1
     * @return el panel creado
     */
    public static JPanel makeTickReadyButtonPlayer1(){
        JPanel imagePanel = new JPanel();
        ImageIcon imageIcon = new ImageIcon("imagenes/tick.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        imagePanel.add(imageLabel);
        return imagePanel;
    }
    /**
     * metodo que me va a devolver un jlabel con el alias introducido por el jugador 2
     * @param alias el alias del jugador 2
     * @return el jlabel con el alias introducido
     */
    public static JLabel makeSelectAliasPlayer2(String alias){
        JLabel aliasText = new JLabel(alias);
        return aliasText;
    }

    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 1 del jugador 2
     * @return el jlabel con la imagen del icono 1
     */
    public static JLabel makeSelectImage1Player2(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono1.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 2 del jugador 2
     * @return el jlabel con la imagen del icono 2
     */
    public static JLabel makeSelectImage2Player2(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono2.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 3 del jugador 2
     * @return el jlabel con la imagen del icono 3
     */
    public static JLabel makeSelectImage3Player2(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono3.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 4 del jugador 2
     * @return el jlabel con la imagen del icono 4
     */
    public static JLabel makeSelectImage4Player2(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono4.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 5 del jugador 2
     * @return el jlabel con la imagen del icono 5
     */
    public static JLabel makeSelectImage5Player2(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono5.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 6 del jugador 2
     * @return el jlabel con la imagen del icono 6
     */
    public static JLabel makeSelectImage6Player2(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono6.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 7 del jugador 2
     * @return el jlabel con la imagen del icono 7
     */
    public static JLabel makeSelectImage7Player2(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono7.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 8 del jugador 2
     * @return el jlabel con la imagen del icono 8
     */
    public static JLabel makeSelectImage8Player2(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono8.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 9 del jugador 2
     * @return el jlabel con la imagen del icono 9
     */
    public static JLabel makeSelectImage9Player2(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono9.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un jlabel en el que se va a poner la imagen del icono 10 del jugador 2
     * @return el jlabel con la imagen del icono 10
     */
    public static JLabel makeSelectImage10Player2(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono10.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    /**
     * metodo para hacer un panel con la imagen de confirmacion de informacion seleccionada del juagdor 2
     * @return el panel creado
     */
    public static JPanel makeTickReadyButtonPlayer2(){
        JPanel imagePanel = new JPanel();
        ImageIcon imageIcon = new ImageIcon("imagenes/tick.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        imagePanel.add(imageLabel);
        return imagePanel;
    }


    /**
     * getters y setters de los atributos que nos servirán para poner información en el hashmap de players
     * @return el valor correspondiente
     */
    public static String getAliasPlayer1() {
        return aliasPlayer1;
    }

    public static void setAliasPlayer1(String aliasPlayer1) {
        MethodsLogicalAccountCreate.aliasPlayer1 = aliasPlayer1;
    }

    public static ImageIcon getImagePlayer1() {
        return imagePlayer1;
    }

    public static void setImagePlayer1(ImageIcon imagePlayer1) {
        MethodsLogicalAccountCreate.imagePlayer1 = imagePlayer1;
    }

    public static String getAliasPlayer2() {
        return aliasPlayer2;
    }

    public static void setAliasPlayer2(String aliasPlayer2) {
        MethodsLogicalAccountCreate.aliasPlayer2 = aliasPlayer2;
    }

    public static ImageIcon getImagePlayer2() {
        return imagePlayer2;
    }

    public static void setImagePlayer2(ImageIcon imagePlayer2) {
        MethodsLogicalAccountCreate.imagePlayer2 = imagePlayer2;
    }
}

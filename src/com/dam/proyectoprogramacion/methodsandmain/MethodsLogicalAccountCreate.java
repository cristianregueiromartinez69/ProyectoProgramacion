package com.dam.proyectoprogramacion.methodsandmain;

import javax.swing.*;

public class MethodsLogicalAccountCreate {

    private static String aliasPlayer1;
    private static ImageIcon imagePlayer1;
    public static JLabel makeSelectAliasPlayer1(String alias){
        JLabel aliasText = new JLabel(alias);
        return aliasText;
    }

    public static JLabel makeSelectImage1Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono1.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }

    public static JLabel makeSelectImage2Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono2.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    public static JLabel makeSelectImage3Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono3.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    public static JLabel makeSelectImage4Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono4.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    public static JLabel makeSelectImage5Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono5.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    public static JLabel makeSelectImage6Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono6.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    public static JLabel makeSelectImage7Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono7.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    public static JLabel makeSelectImage8Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono8.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    public static JLabel makeSelectImage9Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono9.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    public static JLabel makeSelectImage10Player1(){
        ImageIcon imageIcon = new ImageIcon("imagenes/icono10.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        return imageLabel;
    }
    public static JPanel makeTickReadyButtonPlayer1(){
        JPanel imagePanel = new JPanel();
        ImageIcon imageIcon = new ImageIcon("imagenes/tick.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        imagePanel.add(imageLabel);
        return imagePanel;
    }

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
}

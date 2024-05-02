package com.dam.proyectoprogramacion.methodsandmain;

import javax.swing.*;
import  com.dam.proyectoprogramacion.buttons.*;

import java.awt.*;




/**
 * clase con los metodos de la interfaz de crear cuenta
 * @author cristian
 * @version v1.0
 */
public class MethodsInterfaceAccountCreate {


    /**
     * metodo que será el patrón de diseño a seguir en el resto de paneles de iconos a seleccionar
     * @return el panel creado
     */

    public static JPanel makePanelImage1Row1Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono1.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon1Button = new ButtonInterfaceCreateAccount().makeIcon1Player1Button();
        icon1Button.setBackground(Color.YELLOW.darker());
        icon1Button.setPreferredSize(new Dimension(140,50));
        icon1Button.setForeground(Color.WHITE);
        contentPanel.add(icon1Button);

    return contentPanel;
    }
    public static JPanel makePanelImage2Row1Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono2.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon2Button = new ButtonInterfaceCreateAccount().makeIcon2Player1Button();
        icon2Button.setBackground(Color.YELLOW.darker());
        icon2Button.setPreferredSize(new Dimension(140,50));
        icon2Button.setForeground(Color.WHITE);
        contentPanel.add(icon2Button);

        return contentPanel;
    }


}

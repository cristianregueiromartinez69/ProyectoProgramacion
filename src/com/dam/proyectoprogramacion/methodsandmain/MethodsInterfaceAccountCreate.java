package com.dam.proyectoprogramacion.methodsandmain;

import javax.swing.*;
import  com.dam.proyectoprogramacion.buttons.*;

import java.awt.*;

<<<<<<< HEAD
=======



>>>>>>> interfaces
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
<<<<<<< HEAD
=======

>>>>>>> interfaces
    public static JPanel makePanelImage1Row1Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
<<<<<<< HEAD
=======

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
>>>>>>> interfaces
        ImageIcon imageIcon = new ImageIcon("imagenes/icono1.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);
<<<<<<< HEAD
        JButton icon1Button = new ButtonInterfaceCreateAccount().makeIcon1Player1Button();
        icon1Button.setPreferredSize(new Dimension(100,50));
=======

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon1Button = new ButtonInterfaceCreateAccount().makeIcon1Player1Button();
        icon1Button.setBackground(Color.YELLOW.darker());
        icon1Button.setPreferredSize(new Dimension(140,50));
>>>>>>> interfaces
        icon1Button.setForeground(Color.WHITE);
        contentPanel.add(icon1Button);

    return contentPanel;
    }
<<<<<<< HEAD
=======
    /**
     * metodo para crear el panel con la imagen y el boton del icono2 del jugador 1
     * @return el panel creado
     */
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
    /**
     * metodo para crear el panel con la imagen y el boton del icono3 del jugador 1
     * @return el panel creado
     */
    public static JPanel makePanelImage3Row1Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono3.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon3Button = new ButtonInterfaceCreateAccount().makeIcon3Player1Button();
        icon3Button.setBackground(Color.YELLOW.darker());
        icon3Button.setPreferredSize(new Dimension(140,50));
        icon3Button.setForeground(Color.WHITE);
        contentPanel.add(icon3Button);

        return contentPanel;
    }


    /**
     *  metodo para crear el panel con la imagen y el boton del icono4 del jugador 1
     * @return el panel creado
     */

    public static JPanel makePanelImage4Row1Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono4.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon4Button = new ButtonInterfaceCreateAccount().makeIcon4Player1Button();
        icon4Button.setBackground(Color.YELLOW.darker());
        icon4Button.setPreferredSize(new Dimension(140,50));
        icon4Button.setForeground(Color.WHITE);
        contentPanel.add(icon4Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono5 del jugador 1
     * @return el panel creado
     */

    public static JPanel makePanelImage5Row1Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono5.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon5Button = new ButtonInterfaceCreateAccount().makeIcon5Player1Button();
        icon5Button.setBackground(Color.YELLOW.darker());
        icon5Button.setPreferredSize(new Dimension(140,50));
        icon5Button.setForeground(Color.WHITE);
        contentPanel.add(icon5Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono6 del jugador 1
     * @return el panel creado
     */
    public static JPanel makePanelImage1Row2Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono6.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon6Button = new ButtonInterfaceCreateAccount().makeIcon6Player1Button();
        icon6Button.setBackground(Color.YELLOW.darker());
        icon6Button.setPreferredSize(new Dimension(140,50));
        icon6Button.setForeground(Color.WHITE);
        contentPanel.add(icon6Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono7 del jugador 1
     * @return el panel creado
     */
    public static JPanel makePanelImage2Row2Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono7.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon7Button = new ButtonInterfaceCreateAccount().makeIcon7Player1Button();
        icon7Button.setBackground(Color.YELLOW.darker());
        icon7Button.setPreferredSize(new Dimension(140,50));
        icon7Button.setForeground(Color.WHITE);
        contentPanel.add(icon7Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono8 del jugador 1
     * @return el panel creado
     */
    public static JPanel makePanelImage3Row2Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono8.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon8Button = new ButtonInterfaceCreateAccount().makeIcon8Player1Button();
        icon8Button.setBackground(Color.YELLOW.darker());
        icon8Button.setPreferredSize(new Dimension(140,50));
        icon8Button.setForeground(Color.WHITE);
        contentPanel.add(icon8Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono9 del jugador 1
     * @return el panel creado
     */
    public static JPanel makePanelImage4Row2Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono9.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon9Button = new ButtonInterfaceCreateAccount().makeIcon9Player1Button();
        icon9Button.setBackground(Color.YELLOW.darker());
        icon9Button.setPreferredSize(new Dimension(140,50));
        icon9Button.setForeground(Color.WHITE);
        contentPanel.add(icon9Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono10 del jugador 1
     * @return el panel creado
     */
    public static JPanel makePanelImage5Row2Player1(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono10.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon10Button = new ButtonInterfaceCreateAccount().makeIcon10Player1Button();
        icon10Button.setBackground(Color.YELLOW.darker());
        icon10Button.setPreferredSize(new Dimension(140,50));
        icon10Button.setForeground(Color.WHITE);
        contentPanel.add(icon10Button);

        return contentPanel;
    }

    /**
     * metodo que será el patrón de diseño a seguir en el resto de paneles de iconos a seleccionar
     * @return el panel creado
     */

    public static JPanel makePanelImage1Row1Player2(){

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
        icon1Button.setBackground(Color.ORANGE.darker());
        icon1Button.setPreferredSize(new Dimension(140,50));
        icon1Button.setForeground(Color.WHITE);
        contentPanel.add(icon1Button);

        return contentPanel;
    }
    /**
     * metodo para crear el panel con la imagen y el boton del icono2 del jugador 2
     * @return el panel creado
     */
    public static JPanel makePanelImage2Row1Player2(){

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
        icon2Button.setBackground(Color.ORANGE.darker());
        icon2Button.setPreferredSize(new Dimension(140,50));
        icon2Button.setForeground(Color.WHITE);
        contentPanel.add(icon2Button);

        return contentPanel;
    }
    /**
     * metodo para crear el panel con la imagen y el boton del icono3 del jugador 2
     * @return el panel creado
     */
    public static JPanel makePanelImage3Row1Player2(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono3.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon3Button = new ButtonInterfaceCreateAccount().makeIcon3Player1Button();
        icon3Button.setBackground(Color.ORANGE.darker());
        icon3Button.setPreferredSize(new Dimension(140,50));
        icon3Button.setForeground(Color.WHITE);
        contentPanel.add(icon3Button);

        return contentPanel;
    }


    /**
     *  metodo para crear el panel con la imagen y el boton del icono4 del jugador 2
     * @return el panel creado
     */

    public static JPanel makePanelImage4Row1Player2(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono4.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon4Button = new ButtonInterfaceCreateAccount().makeIcon4Player1Button();
        icon4Button.setBackground(Color.ORANGE.darker());
        icon4Button.setPreferredSize(new Dimension(140,50));
        icon4Button.setForeground(Color.WHITE);
        contentPanel.add(icon4Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono5 del jugador 2
     * @return el panel creado
     */

    public static JPanel makePanelImage5Row1Player2(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono5.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon5Button = new ButtonInterfaceCreateAccount().makeIcon5Player1Button();
        icon5Button.setBackground(Color.ORANGE.darker());
        icon5Button.setPreferredSize(new Dimension(140,50));
        icon5Button.setForeground(Color.WHITE);
        contentPanel.add(icon5Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono6 del jugador 2
     * @return el panel creado
     */
    public static JPanel makePanelImage1Row2Player2(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono6.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon6Button = new ButtonInterfaceCreateAccount().makeIcon6Player1Button();
        icon6Button.setBackground(Color.ORANGE.darker());
        icon6Button.setPreferredSize(new Dimension(140,50));
        icon6Button.setForeground(Color.WHITE);
        contentPanel.add(icon6Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono7 del jugador 2
     * @return el panel creado
     */
    public static JPanel makePanelImage2Row2Player2(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono7.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon7Button = new ButtonInterfaceCreateAccount().makeIcon7Player1Button();
        icon7Button.setBackground(Color.ORANGE.darker());
        icon7Button.setPreferredSize(new Dimension(140,50));
        icon7Button.setForeground(Color.WHITE);
        contentPanel.add(icon7Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono8 del jugador 2
     * @return el panel creado
     */
    public static JPanel makePanelImage3Row2Player2(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono8.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon8Button = new ButtonInterfaceCreateAccount().makeIcon8Player1Button();
        icon8Button.setBackground(Color.ORANGE.darker());
        icon8Button.setPreferredSize(new Dimension(140,50));
        icon8Button.setForeground(Color.WHITE);
        contentPanel.add(icon8Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono9 del jugador 2
     * @return el panel creado
     */
    public static JPanel makePanelImage4Row2Player2(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono9.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon9Button = new ButtonInterfaceCreateAccount().makeIcon9Player1Button();
        icon9Button.setBackground(Color.ORANGE.darker());
        icon9Button.setPreferredSize(new Dimension(140,50));
        icon9Button.setForeground(Color.WHITE);
        contentPanel.add(icon9Button);

        return contentPanel;
    }

    /**
     *  metodo para crear el panel con la imagen y el boton del icono10 del jugador 2
     * @return el panel creado
     */
    public static JPanel makePanelImage5Row2Player2(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        /**
         * definimos un atributo de tipo imagen y le metemos el path con la imagen
         */
        ImageIcon imageIcon = new ImageIcon("imagenes/icono10.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        contentPanel.add(imageLabel);

        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton icon10Button = new ButtonInterfaceCreateAccount().makeIcon10Player1Button();
        icon10Button.setBackground(Color.ORANGE.darker());
        icon10Button.setPreferredSize(new Dimension(140,50));
        icon10Button.setForeground(Color.WHITE);
        contentPanel.add(icon10Button);

        return contentPanel;
    }

    /**
     * metodo para crear el panel del ready del jugador 1
     * @return el panel creado
     */
    public static JPanel makeReadyPlayer1Panel(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));


        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton readyButton = new ButtonInterfaceCreateAccount().makeReadyPlayer1Button();
        readyButton.setBackground(Color.GREEN);
        readyButton.setPreferredSize(new Dimension(140,50));
        readyButton.setForeground(Color.WHITE);
        contentPanel.add(readyButton);

        return contentPanel;
    }

    /**
     * metodo para crear el panel del ready del jugador 2
     * @return el panel creado
     */
    public static JPanel makeReadyPlayer2Panel(){

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));


        /**
         * hacemos el boton con el metodo de los paquetes de los botones y le añadimos funcionalidades
         */
        JButton readyButton = new ButtonInterfaceCreateAccount().makeReadyPlayer2Button();
        readyButton.setBackground(Color.GREEN);
        readyButton.setPreferredSize(new Dimension(140,50));
        readyButton.setForeground(Color.WHITE);
        contentPanel.add(readyButton);

        return contentPanel;
    }

>>>>>>> interfaces
}

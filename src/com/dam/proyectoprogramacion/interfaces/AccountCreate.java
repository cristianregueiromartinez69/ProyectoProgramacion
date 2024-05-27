package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCreateAccount;
import com.dam.proyectoprogramacion.methods.accountcreate.MethodsInterfaceAccountCreate;
import com.dam.proyectoprogramacion.methods.accountcreate.MethodsLogicalAccountCreate;
import com.dam.proyectoprogramacion.panels.accountcreate.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * clase con la interfaz de crear cuenta en la que nos loguearemos para poder jugar
 *
 * @author cristian
 * @version v1.0
 */
public class AccountCreate extends JFrame {

    /**
     * atributos privados de tipo JPanel para dividir la informacion del jugador 1 y el jugador 2
     */
    private JPanel globalPlayerPanel1;
    private JPanel globalPlayerPanel2;

    /**
     * atributos privados de tipo JPanel para poner la información del jugador 1 y del jugador 2
     */
    private JPanel informationPlayerPanel1;
    private JPanel informationPLayerPanel2;

    /**
     * atributos privados de tipo JPanel para poner los botones de listo del jugador 1 y del jugador 2
     */
    private JPanel confirmAreaPlayer1;
    private JPanel ConfirmAreaPlayer2;

    /**
     * atributo privado de tipo JPanel para poner el boton de start de ambos jugadores cuando terminaron de crear la cuenta
     */
    private JPanel startAreaPanel;
    private JButton startButton;

    /**
     * atributo privado de tipo jpanel que serán en donde pongamos el boton para voler al menu
     */
    private JPanel backAreaPanel;

    /**
     * atributo privado de tipo jpanel que nos servirá para que, una vez el usuario a introducido el alias
     * y un logo, le aparezca en un panel inferior lo introducido
     */
    private JPanel ALiasAndLogoPlayer1Panel;
    private JPanel AliasAndLogoPlayer2Panel;

    /**
     * atributos privados de tipo boolean que nos servirán para confirmar si el jugador 1 y el jugador 2 han pulsado cualquier boton del logo
     */
    private static boolean confirmLogoPlayer1 = false;
    private static boolean confirmLogoPlayer2 = false;


    public AccountCreate() {
        /**
         * le damos visibilidad y ponemos un titulo al frame
         */
        setTitle("Crear una cuenta");
        setSize(600, 400);
        setVisible(true);

        /**
         * varibale de tipo imagen que tiene el path de la imagen de fondo
         */
        Image backgroundImage = new ImageIcon("imagenes/backSeleccionPokemon.png").getImage();

        BackgroundMainMenuPanel backgroundPanel = new BackgroundMainMenuPanel(backgroundImage);
        backgroundPanel.setLayout(new BorderLayout());

        /**
         * creamos un jpanel que es igual a un metodo que nos vuelve un jpanel
         */
        JPanel contentPanel = makeContentPanel();
        GridBagConstraints gbc = new GridBagConstraints();

        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


        add(backgroundPanel);

        /**
         * iniciamos el panel global de jugador 1
         */
        globalPlayerPanel1 = new JPanel();
        globalPlayerPanel1.setLayout(new GridBagLayout());

        /**
         * iniciamos el panel global de jugador 2
         */
        globalPlayerPanel2 = new JPanel();
        globalPlayerPanel2.setLayout(new GridBagLayout());

        /**
         * establecemos una posicion para el panel del jugador 1
         */
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(50, 50, 50, 50);

        /**
         * añadimos el panel del jugador 1
         *
         */
        contentPanel.add(globalPlayerPanel1, gbc);

        /**
         * añadimos el panel del jugador 2 y cambiamos la posicion
         *
         */
        gbc.gridx = 1;
        gbc.gridy = 0;
        contentPanel.add(globalPlayerPanel2, gbc);

        /**
         * creamos un panel para el jugador 1 que será igual al creado en otra clase
         */
        JPanel informationPanelPlayer1 = new InformationPlayerPanel1AccountCreate();
        globalPlayerPanel1.add(informationPanelPlayer1);


        /**
         * creamos un panel para el jugador 2 que será igual al creado en otra clase
         */
        JPanel informationPanelPlayer2 = new InformationPlayerPanel2AccountCreate();
        /**
         * este inset va a posicionar correctarmente el alias y el JTextField del jugador 2
         */
        gbc.insets = new Insets(0, 20, 0, 20);
        globalPlayerPanel2.add(informationPanelPlayer2, gbc);


        /**
         * establecemos la posicion para toda la informacion del panel del jugador 1
         */
        gbc.gridx = 0;
        gbc.gridy = 1;

        /**
         * instanciamos una variable de tipo jpanel que es igual a un panel creado en otra clase
         * lo añadimos
         */
        JPanel auxGlobalPlayerPanel1 = new GlobalPanelPlayer1AccountCreate();
        globalPlayerPanel1.add(auxGlobalPlayerPanel1, gbc);

        /**
         * establecemos nuevas posiciones
         */
        gbc.gridx = 1;
        gbc.gridy = 1;


        /**
         * instanciamos una variable de tipo jpanel que es igual a un panel creado en otra clase
         * lo añadimos
         */
        JPanel auxGlobalPlayerPanel2 = new GlobalPanelPlayer2AccountCreate();
        globalPlayerPanel2.add(auxGlobalPlayerPanel2, gbc);

        /**
         * establecemos una nueva posicion para el panel de start
         */
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = new Insets(20, 100, 100, 700);

        /**
         * iniciamos el panel de start que es igual a un metodo que devuelve un panel
         */
        startAreaPanel = makeStartPanel();
        contentPanel.add(startAreaPanel, gbc);

        /**
         * iniciamos un boton que es igual a un metodo que devuelve un boton
         */
        startButton = makeStartButton("Finish");
        startButton.setForeground(Color.WHITE);
        startButton.setPreferredSize(new Dimension(200, 50));
        /**
         * lo añadimos al panel que tiene el start
         */
        startAreaPanel.add(startButton);

        /**
         * iniciamos el panel con el boton de volver al menu que será igual a un metodo que crea este panel
         */
        backAreaPanel = MethodsInterfaceAccountCreate.makeBackToMenuPanel();
        /**
         * establecemos las medidas del panel
         */
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(0, 200, 78, 0);
        contentPanel.add(backAreaPanel, gbc);

        /**
         * establecemos las medidas del panel donde saldrá la informacion seleccionada por parte del jugador 1
         */
        gbc.gridx = 0;
        gbc.gridy = 3;
        /**
         * iniciamos el panel del jugador 1 en el que aparecerá la información seleccionada
         */
        ALiasAndLogoPlayer1Panel = new JPanel();
        ALiasAndLogoPlayer1Panel.setLayout(new BoxLayout(ALiasAndLogoPlayer1Panel, BoxLayout.Y_AXIS));
        contentPanel.add(ALiasAndLogoPlayer1Panel, gbc);

        /**
         * establecemos nuevas medidas para la información seleccionada por parte del jugador 2
         */
        gbc.gridx = 1;
        gbc.gridy = 3;
        /**
         * iniciamos el panel del jugador 2
         * le damos un layout y lo añadimos al panel principal
         */
        AliasAndLogoPlayer2Panel = new JPanel();
        AliasAndLogoPlayer2Panel.setLayout(new BoxLayout(AliasAndLogoPlayer2Panel, BoxLayout.Y_AXIS));
        contentPanel.add(AliasAndLogoPlayer2Panel, gbc);

        /**
         * llamamos a los botones de la clase donde tenemos los botones creados y les ponemos un actionlistener
         * estos botones son los del jugador 1 en el que tiene que escoger el logo que le va a acompañar en la batalla
         */
        ButtonInterfaceCreateAccount.getIcon1Player1Button().addActionListener(this::selectNameAndIconPlayer1);
        ButtonInterfaceCreateAccount.getIcon2Player1Button().addActionListener(this::selectNameAndIconPlayer1);
        ButtonInterfaceCreateAccount.getIcon3Player1Button().addActionListener(this::selectNameAndIconPlayer1);
        ButtonInterfaceCreateAccount.getIcon4Player1Button().addActionListener(this::selectNameAndIconPlayer1);
        ButtonInterfaceCreateAccount.getIcon5Player1Button().addActionListener(this::selectNameAndIconPlayer1);
        ButtonInterfaceCreateAccount.getIcon6Player1Button().addActionListener(this::selectNameAndIconPlayer1);
        ButtonInterfaceCreateAccount.getIcon7Player1Button().addActionListener(this::selectNameAndIconPlayer1);
        ButtonInterfaceCreateAccount.getIcon8Player1Button().addActionListener(this::selectNameAndIconPlayer1);
        ButtonInterfaceCreateAccount.getIcon9Player1Button().addActionListener(this::selectNameAndIconPlayer1);
        ButtonInterfaceCreateAccount.getIcon10Player1Button().addActionListener(this::selectNameAndIconPlayer1);

        /**
         * llamamos a los botones de la clase donde tenemos los botones creados y les ponemos un actionlistener
         * estos botones son los del jugador 2 en el que tiene que escoger el logo que le va a acompañar en la batalla
         */
        ButtonInterfaceCreateAccount.getIcon1Player2Button().addActionListener(this::selectNameAndIconPlayer2);
        ButtonInterfaceCreateAccount.getIcon2Player2Button().addActionListener(this::selectNameAndIconPlayer2);
        ButtonInterfaceCreateAccount.getIcon3Player2Button().addActionListener(this::selectNameAndIconPlayer2);
        ButtonInterfaceCreateAccount.getIcon4Player2Button().addActionListener(this::selectNameAndIconPlayer2);
        ButtonInterfaceCreateAccount.getIcon5Player2Button().addActionListener(this::selectNameAndIconPlayer2);
        ButtonInterfaceCreateAccount.getIcon6Player2Button().addActionListener(this::selectNameAndIconPlayer2);
        ButtonInterfaceCreateAccount.getIcon7Player2Button().addActionListener(this::selectNameAndIconPlayer2);
        ButtonInterfaceCreateAccount.getIcon8Player2Button().addActionListener(this::selectNameAndIconPlayer2);
        ButtonInterfaceCreateAccount.getIcon9Player2Button().addActionListener(this::selectNameAndIconPlayer2);
        ButtonInterfaceCreateAccount.getIcon10Player2Button().addActionListener(this::selectNameAndIconPlayer2);

        /**
         * boton de de confirmacion del jugador 1 y 2
         * le añadimos un actionListener
         */
        ButtonInterfaceCreateAccount.getReadyPlayer1Button().addActionListener(this::confirmReadyPlayer1);
        ButtonInterfaceCreateAccount.getReadyPlayer2Button().addActionListener(this::confirmReadyPlayer2);

        /**
         * añadiendo un actionListener al boton de volver al menu
         */
        ButtonInterfaceCreateAccount.getBackToMenuButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * este metodo cierra la ventana y nos llevará al menú
                 */
                dispose();
            }
        });
        startButton.addActionListener(this::completeInformationBothPlayers);

    }

    /**
     * metodo para confirmar la cuenta del jugador 1
     *
     * @param e este es el objeto de tipo actionlistener que será añadido a los botones
     */
    public void selectNameAndIconPlayer1(ActionEvent e) {

        /**
         * iniciamos una variable local que es igual al texto introducido en el alias del jugador 1
         */
        String aliasTextPlayer1 = InformationPlayerPanel1AccountCreate.getAliasTextPlayer1().getText();
        String aliasTextPlayer2 = InformationPlayerPanel2AccountCreate.getAliasTextPlayer2().getText();
        /**
         * si el alias se ha introducido, podemos proseguir
         */
        if (MethodsInterfaceAccountCreate.checkEmptyContentPlayer1() && !MethodsLogicalAccountCreate.check2AliasAreTheSame(aliasTextPlayer1, aliasTextPlayer2)) {
            /**
             * si el usuario pulsa el boton del icono, aparecerá su alias junto con el logo escogido
             * se borra lo anterior del panel para introducir lo nuevo
             */
            if (e.getSource() == ButtonInterfaceCreateAccount.getIcon1Player1Button()) {
                confirmLogoPlayer1 = true;
                ALiasAndLogoPlayer1Panel.removeAll();
                ALiasAndLogoPlayer1Panel.revalidate();
                ALiasAndLogoPlayer1Panel.repaint();
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage1Player1());
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));
                /**
                 * estos metodos van a recoger 2 variables:
                 * 1. será el alias del jugador
                 * 2. el path de la imagen del logo que ha escogido el jugador
                 */
                MethodsLogicalAccountCreate.setAliasPlayer1(aliasTextPlayer1);
                MethodsLogicalAccountCreate.setImagePlayer1(new ImageIcon("imagenes/icono1.png"));

                /**
                 * Se repite la misma instruccion por cada boton de icono que hay
                 */
            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon2Player1Button()) {
                confirmLogoPlayer1 = true;
                ALiasAndLogoPlayer1Panel.removeAll();
                ALiasAndLogoPlayer1Panel.revalidate();
                ALiasAndLogoPlayer1Panel.repaint();
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage2Player1());
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));
                MethodsLogicalAccountCreate.setAliasPlayer1(aliasTextPlayer1);
                MethodsLogicalAccountCreate.setImagePlayer1(new ImageIcon("imagenes/icono2.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon3Player1Button()) {
                confirmLogoPlayer1 = true;
                ALiasAndLogoPlayer1Panel.removeAll();
                ALiasAndLogoPlayer1Panel.revalidate();
                ALiasAndLogoPlayer1Panel.repaint();
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage3Player1());
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));
                MethodsLogicalAccountCreate.setAliasPlayer1(aliasTextPlayer1);
                MethodsLogicalAccountCreate.setImagePlayer1(new ImageIcon("imagenes/icono3.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon4Player1Button()) {
                confirmLogoPlayer1 = true;
                ALiasAndLogoPlayer1Panel.removeAll();
                ALiasAndLogoPlayer1Panel.revalidate();
                ALiasAndLogoPlayer1Panel.repaint();
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage4Player1());
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));
                MethodsLogicalAccountCreate.setAliasPlayer1(aliasTextPlayer1);
                MethodsLogicalAccountCreate.setImagePlayer1(new ImageIcon("imagenes/icono4.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon5Player1Button()) {
                confirmLogoPlayer1 = true;
                ALiasAndLogoPlayer1Panel.removeAll();
                ALiasAndLogoPlayer1Panel.revalidate();
                ALiasAndLogoPlayer1Panel.repaint();
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage5Player1());
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));
                MethodsLogicalAccountCreate.setAliasPlayer1(aliasTextPlayer1);
                MethodsLogicalAccountCreate.setImagePlayer1(new ImageIcon("imagenes/icono5.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon6Player1Button()) {
                confirmLogoPlayer1 = true;
                ALiasAndLogoPlayer1Panel.removeAll();
                ALiasAndLogoPlayer1Panel.revalidate();
                ALiasAndLogoPlayer1Panel.repaint();
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage6Player1());
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));
                MethodsLogicalAccountCreate.setAliasPlayer1(aliasTextPlayer1);
                MethodsLogicalAccountCreate.setImagePlayer1(new ImageIcon("imagenes/icono6.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon7Player1Button()) {
                confirmLogoPlayer1 = true;
                ALiasAndLogoPlayer1Panel.removeAll();
                ALiasAndLogoPlayer1Panel.revalidate();
                ALiasAndLogoPlayer1Panel.repaint();
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage7Player1());
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));
                MethodsLogicalAccountCreate.setAliasPlayer1(aliasTextPlayer1);
                MethodsLogicalAccountCreate.setImagePlayer1(new ImageIcon("imagenes/icono7.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon8Player1Button()) {
                confirmLogoPlayer1 = true;
                ALiasAndLogoPlayer1Panel.removeAll();
                ALiasAndLogoPlayer1Panel.revalidate();
                ALiasAndLogoPlayer1Panel.repaint();
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage8Player1());
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));
                MethodsLogicalAccountCreate.setAliasPlayer1(aliasTextPlayer1);
                MethodsLogicalAccountCreate.setImagePlayer1(new ImageIcon("imagenes/icono8.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon9Player1Button()) {
                confirmLogoPlayer1 = true;
                ALiasAndLogoPlayer1Panel.removeAll();
                ALiasAndLogoPlayer1Panel.revalidate();
                ALiasAndLogoPlayer1Panel.repaint();
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage9Player1());
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));
                MethodsLogicalAccountCreate.setAliasPlayer1(aliasTextPlayer1);
                MethodsLogicalAccountCreate.setImagePlayer1(new ImageIcon("imagenes/icono9.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon10Player1Button()) {
                confirmLogoPlayer1 = true;
                ALiasAndLogoPlayer1Panel.removeAll();
                ALiasAndLogoPlayer1Panel.revalidate();
                ALiasAndLogoPlayer1Panel.repaint();
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage10Player1());
                ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));
                MethodsLogicalAccountCreate.setAliasPlayer1(aliasTextPlayer1);
                MethodsLogicalAccountCreate.setImagePlayer1(new ImageIcon("imagenes/icono10.png"));

            }

        }
    }

    public void selectNameAndIconPlayer2(ActionEvent e) {

        /**
         * iniciamos una variable local que es igual al texto introducido en el alias del jugador 2
         */
        String aliasTextPlayer1 = InformationPlayerPanel1AccountCreate.getAliasTextPlayer1().getText();
        String aliasTextPlayer2 = InformationPlayerPanel2AccountCreate.getAliasTextPlayer2().getText();
        /**
         * si el alias se ha introducido, podemos proseguir
         */
        if (MethodsInterfaceAccountCreate.checkEmptyContentPlayer2() && !MethodsLogicalAccountCreate.check2AliasAreTheSame(aliasTextPlayer1, aliasTextPlayer2)) {
            /**
             * si el usuario pulsa el boton del icono, aparecerá su alias junto con el logo escogido
             * se borra lo anterior del panel para introducir lo nuevo
             */
            if (e.getSource() == ButtonInterfaceCreateAccount.getIcon1Player2Button()) {
                confirmLogoPlayer2 = true;
                AliasAndLogoPlayer2Panel.removeAll();
                AliasAndLogoPlayer2Panel.revalidate();
                AliasAndLogoPlayer2Panel.repaint();
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectImage1Player2());
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer2(aliasTextPlayer2));
                /**
                 * estos metodos van a recoger 2 variables:
                 * 1. será el alias del jugador
                 * 2. el path de la imagen del logo que ha escogido el jugador
                 */
                MethodsLogicalAccountCreate.setAliasPlayer2(aliasTextPlayer2);
                MethodsLogicalAccountCreate.setImagePlayer2(new ImageIcon("imagenes/icono1.png"));

                /**
                 * Se repite la misma instruccion por cada boton de icono que hay
                 */
            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon2Player2Button()) {
                confirmLogoPlayer2 = true;
                AliasAndLogoPlayer2Panel.removeAll();
                AliasAndLogoPlayer2Panel.revalidate();
                AliasAndLogoPlayer2Panel.repaint();
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectImage2Player2());
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer2(aliasTextPlayer2));
                MethodsLogicalAccountCreate.setAliasPlayer2(aliasTextPlayer2);
                MethodsLogicalAccountCreate.setImagePlayer2(new ImageIcon("imagenes/icono2.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon3Player2Button()) {
                confirmLogoPlayer2 = true;
                AliasAndLogoPlayer2Panel.removeAll();
                AliasAndLogoPlayer2Panel.revalidate();
                AliasAndLogoPlayer2Panel.repaint();
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectImage3Player2());
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer2(aliasTextPlayer2));
                MethodsLogicalAccountCreate.setAliasPlayer2(aliasTextPlayer2);
                MethodsLogicalAccountCreate.setImagePlayer2(new ImageIcon("imagenes/icono3.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon4Player2Button()) {
                confirmLogoPlayer2 = true;
                AliasAndLogoPlayer2Panel.removeAll();
                AliasAndLogoPlayer2Panel.revalidate();
                AliasAndLogoPlayer2Panel.repaint();
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectImage4Player2());
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer2));
                MethodsLogicalAccountCreate.setAliasPlayer2(aliasTextPlayer2);
                MethodsLogicalAccountCreate.setImagePlayer2(new ImageIcon("imagenes/icono4.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon5Player2Button()) {
                confirmLogoPlayer2 = true;
                AliasAndLogoPlayer2Panel.removeAll();
                AliasAndLogoPlayer2Panel.revalidate();
                AliasAndLogoPlayer2Panel.repaint();
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectImage5Player2());
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer2(aliasTextPlayer2));
                MethodsLogicalAccountCreate.setAliasPlayer2(aliasTextPlayer2);
                MethodsLogicalAccountCreate.setImagePlayer2(new ImageIcon("imagenes/icono5.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon6Player2Button()) {
                confirmLogoPlayer2 = true;
                AliasAndLogoPlayer2Panel.removeAll();
                AliasAndLogoPlayer2Panel.revalidate();
                AliasAndLogoPlayer2Panel.repaint();
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectImage6Player2());
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer2(aliasTextPlayer2));
                MethodsLogicalAccountCreate.setAliasPlayer2(aliasTextPlayer2);
                MethodsLogicalAccountCreate.setImagePlayer2(new ImageIcon("imagenes/icono6.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon7Player2Button()) {
                confirmLogoPlayer2 = true;
                AliasAndLogoPlayer2Panel.removeAll();
                AliasAndLogoPlayer2Panel.revalidate();
                AliasAndLogoPlayer2Panel.repaint();
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectImage7Player2());
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer2(aliasTextPlayer2));
                MethodsLogicalAccountCreate.setAliasPlayer2(aliasTextPlayer2);
                MethodsLogicalAccountCreate.setImagePlayer2(new ImageIcon("imagenes/icono7.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon8Player2Button()) {
                confirmLogoPlayer2 = true;
                AliasAndLogoPlayer2Panel.removeAll();
                AliasAndLogoPlayer2Panel.revalidate();
                AliasAndLogoPlayer2Panel.repaint();
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectImage8Player2());
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer2(aliasTextPlayer2));
                MethodsLogicalAccountCreate.setAliasPlayer2(aliasTextPlayer2);
                MethodsLogicalAccountCreate.setImagePlayer2(new ImageIcon("imagenes/icono8.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon9Player2Button()) {
                confirmLogoPlayer2 = true;
                AliasAndLogoPlayer2Panel.removeAll();
                AliasAndLogoPlayer2Panel.revalidate();
                AliasAndLogoPlayer2Panel.repaint();
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectImage9Player2());
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer2(aliasTextPlayer2));
                MethodsLogicalAccountCreate.setAliasPlayer2(aliasTextPlayer2);
                MethodsLogicalAccountCreate.setImagePlayer2(new ImageIcon("imagenes/icono9.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon10Player2Button()) {
                confirmLogoPlayer2 = true;
                AliasAndLogoPlayer2Panel.removeAll();
                AliasAndLogoPlayer2Panel.revalidate();
                AliasAndLogoPlayer2Panel.repaint();
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectImage10Player2());
                AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer2(aliasTextPlayer2));
                MethodsLogicalAccountCreate.setAliasPlayer2(aliasTextPlayer2);
                MethodsLogicalAccountCreate.setImagePlayer2(new ImageIcon("imagenes/icono10.png"));

            }

        }
    }

    /**
     * metodo para modificar el panel en el que aparece la informacion seleccionada del jugador 1
     * @param e el objeto de tipo actionevent
     */
    public void confirmReadyPlayer1(ActionEvent e) {

        if (confirmLogoPlayer1) {
            /**
             * se elimina lo que había
             */
            ALiasAndLogoPlayer1Panel.removeAll();
            ALiasAndLogoPlayer1Panel.revalidate();
            ALiasAndLogoPlayer1Panel.repaint();
            /**
             * añadimos un panel que será un tick verde en señal de que salió bien
             */
            ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeTickReadyButtonPlayer1());
            /**
             * llamamos a un metodo que deshabilita los botones de los iconos y no deja modificar el alias del jugador
             */
            MethodsInterfaceAccountCreate.disableButtonsAndAliasesPlayer1();
            /**
             * por último, añadimos la información seleccionada a el hashmap de los jugadores
             */
            MethodsInterfaceAccountCreate.putPlayersInformation(MethodsLogicalAccountCreate.getAliasPlayer1(), MethodsLogicalAccountCreate.getImagePlayer1());
            /**
             * se elimina lo que había
             */
            ALiasAndLogoPlayer1Panel.removeAll();
            ALiasAndLogoPlayer1Panel.revalidate();
            ALiasAndLogoPlayer1Panel.repaint();
            /**
             * añadimos un panel que será un tick verde en señal de que salió bien
             */
            ALiasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeTickReadyButtonPlayer1());
            /**
             * llamamos a un metodo que deshabilita los botones de los iconos y no deja modificar el alias del jugador
             */
            MethodsInterfaceAccountCreate.disableButtonsAndAliasesPlayer1();
            /**
             * por último, añadimos la información seleccionada a el hashmap de los jugadores
             */
            MethodsInterfaceAccountCreate.putPlayersInformation(MethodsLogicalAccountCreate.getAliasPlayer1(), MethodsLogicalAccountCreate.getImagePlayer1());


        }
    }
    /**
     * metodo para modificar el panel en el que aparece la informacion seleccionada del jugador 2
     * @param e el objeto de tipo actionevent
     */
    public void confirmReadyPlayer2(ActionEvent e) {

        if(confirmLogoPlayer2){
            /**
             * se elimina lo que había
             */
            AliasAndLogoPlayer2Panel.removeAll();
            AliasAndLogoPlayer2Panel.revalidate();
            AliasAndLogoPlayer2Panel.repaint();
            /**
             * añadimos un panel que será un tick verde en señal de que salió bien
             */
            AliasAndLogoPlayer2Panel.add(MethodsLogicalAccountCreate.makeTickReadyButtonPlayer2());
            /**
             * llamamos a un metodo que deshabilita los botones de los iconos y no deja modificar el alias del jugador
             */
            MethodsInterfaceAccountCreate.disableButtonsAndAliasesPlayer2();
            /**
             * por último, añadimos la información seleccionada a el hashmap de los jugadores
             */
            MethodsInterfaceAccountCreate.putPlayersInformation(MethodsLogicalAccountCreate.getAliasPlayer2(), MethodsLogicalAccountCreate.getImagePlayer2());
        }
    }


    public void completeInformationBothPlayers(ActionEvent e){
        if(MethodsInterfaceAccountCreate.checkEnabledButtonsPlayer1ToFinish() &&
        MethodsInterfaceAccountCreate.checkEnabledButtonsPlayer2ToFinish()){
            dispose();
        }
    }


    /**
     * metodo para construir un panel
     *
     * @return el panel construido
     */

    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

    /**
     * metodo que crea el panel de start de la interfaz de crear cuenta
     *
     * @return el panel creado
     */
    private JPanel makeStartPanel() {
        JPanel auxStartPanel = new JPanel();
        auxStartPanel.setLayout(new GridBagLayout());
        return auxStartPanel;
    }

    /**
     * metodo que crea el boton de start en la interfaz crear cuenta
     *
     * @param message el mensage que va a tener el boton
     * @return el boton creado
     */
    private JButton makeStartButton(String message) {
        JButton startButton = new JButton(message);
        startButton.setBackground(Color.RED);
        return startButton;
    }


}

package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCreateAccount;
import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceAccountCreate;
import com.dam.proyectoprogramacion.methodsandmain.MethodsLogicalAccountCreate;
import com.dam.proyectoprogramacion.panels.accountcreate.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

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
     * atributo privado de tipo jpanel que nos servirá para que, una vel el usuario a introducido el alias
     * y un logo, le aparezca en un panel inferior lo introducido
     */
    private JPanel aliasAndLogoPlayer1Panel;
    private JPanel AliasAndLogoPlayer2Panel;


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
        Image backgroundImage = new ImageIcon("imagenes/fondosPreparacion.png").getImage();

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
        gbc.gridy = 3;
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
        ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(false);
        startButton.setEnabled(false);
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
        gbc.gridy = 3;
        gbc.insets = new Insets(0, 200, 78, 0);
        contentPanel.add(backAreaPanel, gbc);

        /**
         * establecemos las medidas del panel donde saldrá la informacion seleccionada por parte del jugador 1
         */
        gbc.gridx = 0;
        gbc.gridy = 2;
        /**
         * iniciamos el panel del jugador 1 en el que aparecerá la información seleccionada
         */
        aliasAndLogoPlayer1Panel = new JPanel();
        aliasAndLogoPlayer1Panel.setLayout(new BoxLayout(aliasAndLogoPlayer1Panel, BoxLayout.Y_AXIS));
        contentPanel.add(aliasAndLogoPlayer1Panel, gbc);

        /**
         * llamamos a los botones de la clase donde tenemos los botones creados y les ponemos un actionlistener
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
        ButtonInterfaceCreateAccount.getReadyPlayer1Button().addActionListener(this::confirmReadyPlayer1);

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
        /**
         * si el alias se ha introducido, podemos proseguir
         */
        if (MethodsInterfaceAccountCreate.checkEmptyContentPlayer1()) {
            /**
             * si el usuario pulsa el boton del icono1, aparecerá su alias junto con el logo escogido
             * se borra lo anterior del panel para introducir lo nuevo
             */
            if (e.getSource() == ButtonInterfaceCreateAccount.getIcon1Player1Button()) {
                ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(true);
                aliasAndLogoPlayer1Panel.removeAll();
                aliasAndLogoPlayer1Panel.revalidate();
                aliasAndLogoPlayer1Panel.repaint();
                aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage1Player1());
                aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));
                MethodsInterfaceAccountCreate.putPlayersInformation(aliasTextPlayer1, new ImageIcon("imagenes/icono1.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon2Player1Button()) {
                ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(true);
                aliasAndLogoPlayer1Panel.removeAll();
                aliasAndLogoPlayer1Panel.revalidate();
                aliasAndLogoPlayer1Panel.repaint();
                startButton.setEnabled(true);
                aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage2Player1());
                aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));

                MethodsInterfaceAccountCreate.putPlayersInformation(aliasTextPlayer1, new ImageIcon("imagenes/icono2.png"));

            } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon3Player1Button()) {
                ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(true);
                aliasAndLogoPlayer1Panel.removeAll();
                aliasAndLogoPlayer1Panel.revalidate();
                aliasAndLogoPlayer1Panel.repaint();
                startButton.setEnabled(true);
                aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage3Player1());
                aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));

            }
        } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon4Player1Button()) {
            ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(true);
            aliasAndLogoPlayer1Panel.removeAll();
            aliasAndLogoPlayer1Panel.revalidate();
            aliasAndLogoPlayer1Panel.repaint();
            startButton.setEnabled(true);
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage4Player1());
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));

            MethodsInterfaceAccountCreate.putPlayersInformation(aliasTextPlayer1, new ImageIcon("imagenes/icono4.png"));

        } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon5Player1Button()) {
            ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(true);
            aliasAndLogoPlayer1Panel.removeAll();
            aliasAndLogoPlayer1Panel.revalidate();
            aliasAndLogoPlayer1Panel.repaint();
            startButton.setEnabled(true);
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage5Player1());
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));

            MethodsInterfaceAccountCreate.putPlayersInformation(aliasTextPlayer1, new ImageIcon("imagenes/icono5.png"));

        } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon6Player1Button()) {
            ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(true);
            aliasAndLogoPlayer1Panel.removeAll();
            aliasAndLogoPlayer1Panel.revalidate();
            aliasAndLogoPlayer1Panel.repaint();
            startButton.setEnabled(true);
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage6Player1());
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));

            MethodsInterfaceAccountCreate.putPlayersInformation(aliasTextPlayer1, new ImageIcon("imagenes/icono6.png"));

        } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon7Player1Button()) {
            ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(true);
            aliasAndLogoPlayer1Panel.removeAll();
            aliasAndLogoPlayer1Panel.revalidate();
            aliasAndLogoPlayer1Panel.repaint();
            startButton.setEnabled(true);
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage7Player1());
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));

            MethodsInterfaceAccountCreate.putPlayersInformation(aliasTextPlayer1, new ImageIcon("imagenes/icono7.png"));

        } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon8Player1Button()) {
            ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(true);
            aliasAndLogoPlayer1Panel.removeAll();
            aliasAndLogoPlayer1Panel.revalidate();
            aliasAndLogoPlayer1Panel.repaint();
            startButton.setEnabled(true);
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage8Player1());
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));

            MethodsInterfaceAccountCreate.putPlayersInformation(aliasTextPlayer1, new ImageIcon("imagenes/icono8.png"));

        } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon9Player1Button()) {
            ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(true);
            aliasAndLogoPlayer1Panel.removeAll();
            aliasAndLogoPlayer1Panel.revalidate();
            aliasAndLogoPlayer1Panel.repaint();
            startButton.setEnabled(true);
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage9Player1());
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));

            MethodsInterfaceAccountCreate.putPlayersInformation(aliasTextPlayer1, new ImageIcon("imagenes/icono9.png"));

        } else if (e.getSource() == ButtonInterfaceCreateAccount.getIcon10Player1Button()) {
            ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(true);
            aliasAndLogoPlayer1Panel.removeAll();
            aliasAndLogoPlayer1Panel.revalidate();
            aliasAndLogoPlayer1Panel.repaint();
            startButton.setEnabled(true);
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectImage10Player1());
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeSelectAliasPlayer1(aliasTextPlayer1));

            MethodsInterfaceAccountCreate.putPlayersInformation(aliasTextPlayer1, new ImageIcon("imagenes/icono10.png"));

        }

    }

    public void confirmReadyPlayer1(ActionEvent e){
        if(!MethodsInterfaceAccountCreate.getPlayers().isEmpty()){
            ButtonInterfaceCreateAccount.getReadyPlayer1Button().setEnabled(true);
            MethodsInterfaceAccountCreate.disableButtonsAndAliases();
            aliasAndLogoPlayer1Panel.add(MethodsLogicalAccountCreate.makeTickReadyButtonPlayer1());
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

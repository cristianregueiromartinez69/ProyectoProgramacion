package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceLuck;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceLuck2;
import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceLuck;
import com.dam.proyectoprogramacion.panels.luck.EnterPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.EnterPanelPlayer2Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer2Luck;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * interfaz de la suerte en la que se decide quien tira primero
 * @author cristian
 * @version v1.0
 */
public class Luck extends JFrame {

    /**
     *atributos privados de tipo JPanel en los que vamos a poner la información del jugador 1
     */
    private JPanel aliasPanelPLayer1;
    private JPanel aliasPanelPLayer2;
    private  JPanel aliasSelectedPlayer1;
    private JPanel faceOrTailPlayer1;
    private JPanel confirmFaceOrTailPlayer1;
    private JPanel contentPanelPlayer1;
    private static JPanel auxWinnerPanelPLayer1;
    /**
     * atributo privado de tipo jpanel que sirve para guardar la informacion del panel ganador del jugador 2
     */
    private static JPanel auxWinnerPanelPLayer2;
    private int valuePlayer1;
    private int valuePlayer2;



    /**
     *atributos privados de tipo JPanel en los que vamos a poner la información del jugador 2
     */
    private JPanel aliasSelectedPlayer2;
    private JPanel faceOrTailPlayer2;
    private JPanel confirmFaceOrTailPlayer2;

    /**
     * atributo privado de tipo JPanel en el que saldrá el ganador del sorteo
     */
    private JPanel finishPanel;
    /**
     * atributo privado de tipo JPanel para poner el alias ganador del sorteo
     */

    private JPanel winnerPanel;
    /**
     * atributo privado de tipo JPanel para poner el boton de ir a seleccion de pokemon
     */

    private JPanel goToSelectionPanel;
    /**
     * atributo privado de tipo JButton para poder iniciar la variable del boton de confirnar
     * y el boton de seleccion de pokemon
     */
    private JButton confirmButtonPlayer1;
    private JButton confirmButtonPlayer2;
    private  JButton goToSelectionPokemonButton;
    /**
     * tenemos que hacer un atributo con las posiciones de los paneles fuera del constructor
     */
    GridBagConstraints gbc;

    public Luck() {
        /**
         * establecemos un titulo y dimensiones
         * lo hacemos visible
         */
        setTitle("¿Quien escoge el primer pokemon?");
        setSize(600, 400);
        setVisible(true);


        /**
         * instanciamos un objeto de tipo ImageIcon y le damos el path del fondo de imagen
         */
        Image backgroundImage = new ImageIcon("imagenes/fondoluck.png").getImage();

        /**
         * creamos un panel y lo hacemos igual a otro creado en otra clase
         */
        BackgroundMainMenuPanel backgroundPanel = new BackgroundMainMenuPanel(backgroundImage);
        backgroundPanel.setLayout(new BorderLayout());

        /**
         * creamos un panel que contendrá la imagen de fondo y lo hacemos igual a un metodo que crea el panel
         */
         contentPanelPlayer1 = makeContentPanel();
         gbc = new GridBagConstraints();

        /**
         * añadimos el panel
         */
        backgroundPanel.add(contentPanelPlayer1, BorderLayout.CENTER);


        add(backgroundPanel);

        /**
         * iniciamos el panel de informacion del jugador 1
         * le ponemos un layout
         */
        aliasPanelPLayer1 = new JPanel();
        aliasPanelPLayer1.setLayout(new GridBagLayout());


        /**
         * iniciamos el panel del jugador 2
         * le ponemos un layout
         */
        aliasPanelPLayer2 = new JPanel();
        aliasPanelPLayer2.setLayout(new GridBagLayout());


        /**
         * establecemos donde se va a situar el panel de informacion del juhador 1
         */
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(50, 200, 50, 200);


        /**
         * lo añadimos al panel central
         */
        contentPanelPlayer1.add(aliasPanelPLayer1, gbc);


        /**
         * establecemos donde se va a situar el panel de informacion del juhador 2
         */
        gbc.gridx = 1;
        gbc.gridy = 0;
        /**
         * lo añadimos al panel central
         */
        contentPanelPlayer1.add(aliasPanelPLayer2, gbc);

        /**
         * instanciamos un panel y decimos que es igual a un panel creado en otra clase
         * este es el panel de informacion del jugador1
         */
        JPanel aliasInformationPanelPLayer1 = new InformationPanelPlayer1Luck();
        aliasPanelPLayer1.add(aliasInformationPanelPLayer1);

        /**
         * instanciamos un panel y decimos que es igual a un panel creado en otra clase
         * este es el panel de informacion del jugador2
         */
        JPanel aliasInformationPlayer2 = new InformationPanelPlayer2Luck();
        aliasPanelPLayer2.add(aliasInformationPlayer2);

        /**
         * instanciamos un panel y decimos que es igual a un panel creado en otra clase
         * este es el panel de enter del jugador 1
         */
        JPanel enterPanelPlayer1 = new EnterPanelPlayer1Luck();
        aliasPanelPLayer1.add(enterPanelPlayer1);

        /**
         * instanciamos un panel y decimos que es igual a un panel creado en otra clase
         * este es el panel de enter del jugador 2
         */
        JPanel enterPanelPlayer2 = new EnterPanelPlayer2Luck();
        aliasPanelPLayer2.add(enterPanelPlayer2);

        /**
         * establecemos nuevas medidas
         */
        gbc.gridx = 0;
        gbc.gridy = 1;
        /**
         * iniciamos el panel del alias del jugador 1
         */
        aliasSelectedPlayer1 = new JPanel();
        contentPanelPlayer1.add(aliasSelectedPlayer1, gbc);

        /**
         * establecemos nuevas medidas
         */
        gbc.gridx = 1;
        gbc.gridy = 1;
        /**
         * iniciamos el aliasslectedpanel de jugador 2
         * lo añadimos al panel central
         */
        aliasSelectedPlayer2 = new JPanel();
        contentPanelPlayer1.add(aliasSelectedPlayer2, gbc);

        /**
         * iniciamos el panel de cara o cruz del jugador1
         */
        faceOrTailPlayer1 = new JPanel();
        faceOrTailPlayer1 = MethodsInterfaceLuck.faceOrTailPanelPlayer1();

        /**
         * iniciamos el panel de cara o cruz del jugador2
         */
        faceOrTailPlayer2 = new JPanel();
        faceOrTailPlayer2 = MethodsInterfaceLuck.faceOrTailPanelPlayer2();



        /**
         * iniciamos el panel de confirmacion de cara o cruz del jugador 1
         */
        confirmFaceOrTailPlayer1 = new JPanel();
        confirmFaceOrTailPlayer2 = new JPanel();
        /**
         * inicimos un el boton de confirmacion para que sea igual al creado en otra clase
         */
        confirmButtonPlayer1 = new ButtonInterfaceLuck().makeConfirmButtonPlayer1();
        confirmButtonPlayer2 = new ButtonInterfaceLuck2().makeConfirmButtonPlayer2();
        /**
         * hacemos que el panel de confirmacion de cara o cruz sea igual a un metodo que nos devuelve un panel
         */
        confirmFaceOrTailPlayer1 = makeConfirmFaceOrTailPlayer1();
        confirmFaceOrTailPlayer2 = makeConfirmFaceOrTailPlayer2();

        /**
         * le damos medidas al panel de confirmar cara o cruz
         */
        confirmFaceOrTailPlayer1.setLayout(new BoxLayout(confirmFaceOrTailPlayer1, BoxLayout.X_AXIS));
        /**
         * iniciamos los paneles que almacenan la informacion de ganador del panel del jugador 1 y 2
         */
        auxWinnerPanelPLayer1 = new JPanel();
        auxWinnerPanelPLayer2 = new JPanel();
        /**
         * iniciamos los paneles que almacenan el boton de fin y el panel con el ganador del sorteo
         */
        finishPanel = new JPanel();
        winnerPanel = new JPanel();
        /**
         * hacemos que el panel del ganador del sorteo sea igual a un metodo que devuelve un panel
         */
        winnerPanel = MethodsInterfaceLuck.luckyInterfaceWinner(1,2);
        /**
         * establecemos nuevas medidas
         */
        gbc.gridx = 0;
        gbc.gridy = 3;
        /**
         * establecemos nuevos margenes
         */
        gbc.insets = new Insets(50,100,0,0);
        /**
         * hacemos que el panel que contiene el boton de finish sea igual a un metodo que nos devuelve un panel
         */
        finishPanel = MethodsInterfaceLuck.makeButtonFinishPanel();
        /**
         * lo añadimos al panel central
         */
        contentPanelPlayer1.add(finishPanel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        contentPanelPlayer1.add(winnerPanel);


        /**
         * iniciamos el boton de seleccion de pokemon que e sigual a un metodo que crea un boton
         */
        goToSelectionPokemonButton = new ButtonInterfaceLuck().makeSelecTionButton();
        /**
         * establecemos nuevas medidas
         */
        gbc.gridx = 1;
        gbc.gridy = 4;
        /**
         * iniciamos el panel que que contiene el boton de ir a seleccion de pokemon
         * hacemos que sea igual a un metodo que devuelve un panel
         */
        goToSelectionPanel = new JPanel();
        goToSelectionPanel = makeGoToSelectionPanel();
        /**
         * lo añadimos al panel central
         */
        contentPanelPlayer1.add(goToSelectionPanel, gbc);







        /**
         * añadimos los actionListener a los botones
         */
        EnterPanelPlayer1Luck.getEnterButtonPlayer1().addActionListener(this::putAliasImageAliasPLayer1);
        EnterPanelPlayer2Luck.getEnterButtonPlayer2().addActionListener(this::putAliasImageAliasPLayer2);
        ButtonInterfaceLuck.getFaceButton().addActionListener(this::selectTailOrFace);
        ButtonInterfaceLuck.getTailButton().addActionListener(this::selectTailOrFace);
        ButtonInterfaceLuck.getFaceButton().addActionListener(this::selectTailOrFace2);
        ButtonInterfaceLuck.getTailButton().addActionListener(this::selectTailOrFace2);
        ButtonInterfaceLuck.getConfirmbuttonPlayer1().addActionListener(this::LuckChoiceMadePlayer1);
        ButtonInterfaceLuck2.getConfirmbuttonPlayer2().addActionListener(this::LuckChoiceMadePlayer2);
        ButtonInterfaceLuck.getFinishButton().addActionListener(this::winnerFaceOrTail);
        ButtonInterfaceLuck.getSelectionButton().addActionListener(this::goToSelectionInterface);



    }

    /**
     * metodo que crea un panel
     * @return el panel creado
     */
    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

    /**
     * metodo que crea el panel que contiene el boton de ir a seleccion de pokemon
     * @return el panel creado
     */
    private JPanel makeGoToSelectionPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

    /**
     * metodo que limpia un panel para poner la imagen y el alias del jugador introducido
     * @param e el objeto de tipo ActionEvent
     */
    public void putAliasImageAliasPLayer1(ActionEvent e){
        if(MethodsInterfaceLuck.checkAliasPlayer1()){
            /**
             * limpiamos el panel entero
             */
            aliasSelectedPlayer1.removeAll();
            aliasSelectedPlayer1.revalidate();
            aliasSelectedPlayer1.repaint();
            /**
             * creamos un nuevo panel que es igual a un metodo que crea un panel
             */
            JPanel newContentPanel = MethodsInterfaceLuck.selectAliasImagePlayer1();
            /**
             * lo añadimos
             */
            aliasSelectedPlayer1.add(newContentPanel);
            /**
             * hacemos que el panel auxwinner sea igual al panel que tiene la imagen y alias
             */
            auxWinnerPanelPLayer1 = aliasSelectedPlayer1;
            /**
             * añadimos a este panel, un panel que tiene cara o cruz
             */
            aliasSelectedPlayer1.add(faceOrTailPlayer1);
        }
    }
    /**
     * metodo que limpia un panel para poner la imagen y el alias del jugador introducido
     * @param e el objeto de tipo ActionEvent
     */
    public void putAliasImageAliasPLayer2(ActionEvent e){
        if(MethodsInterfaceLuck.checkAliasPlayer2()){
            /**
             * limpiamos el panel entero
             */
            aliasSelectedPlayer2.removeAll();
            aliasSelectedPlayer2.revalidate();
            aliasSelectedPlayer2.repaint();
            /**
             * creamos un nuevo panel que es igual a un metodo que crea un panel
             */
            JPanel newContentPanel = MethodsInterfaceLuck.selectAliasImagePlayer2();
            /**
             * lo añadimos
             */
            aliasSelectedPlayer2.add(newContentPanel);
            /**
             * hacemos que el panel auxwinner sea igual al panel que tiene la imagen y alias
             */
            auxWinnerPanelPLayer2 = aliasSelectedPlayer2;
            /**
             * añadimos a este panel, un panel que tiene cara o cruz
             */
            aliasSelectedPlayer2.add(faceOrTailPlayer1);
        }
    }
    /**
     * metodo que limpia un panel para poner si has elegido cara o cruz y el boton de confirmar
     * @param e el objeto de tipo ActionEvent
     */
    public void selectTailOrFace(ActionEvent e){


        /**
         * si has elegido cara, saldrá una imagen que será la cara de la moneda
         * al lado saldrá un boton que confirmacion
         */
        if(e.getSource() == ButtonInterfaceLuck.getFaceButton()){
            confirmFaceOrTailPlayer1.removeAll();
            confirmFaceOrTailPlayer1.revalidate();
            confirmFaceOrTailPlayer1.repaint();
            /**
             * recogemos en variables el alias y la eleccion de cara o cruz
             * esto será usado para introducirlo en un hashmap
             */
            MethodsInterfaceLuck.setAuxMapAliasPlayer1Luck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());
            MethodsInterfaceLuck.setChosenItem(MethodsInterfaceLuck.CARA);
            /**
             * añadimos imagen y boton al panel
             */
            ImageIcon imageIcon = new ImageIcon("imagenes/cara.png");
            JLabel imageLabel = new JLabel();
            imageLabel.setIcon(imageIcon);
            confirmFaceOrTailPlayer1.add(imageLabel);
            confirmButtonPlayer1.setBackground(Color.GREEN);
            confirmButtonPlayer1.setForeground(Color.WHITE);
            confirmButtonPlayer1.setPreferredSize(new Dimension(140, 50));
            confirmFaceOrTailPlayer1.add(confirmButtonPlayer1);
            /**
             * actualizamos el panel central
             */
            gbc.gridx = 0;
            gbc.gridy = 2;
            contentPanelPlayer1.add(confirmFaceOrTailPlayer1, gbc);

        }
        /**
         * si has elegido cruz, saldrá una imagen que será la cruz de la moneda
         * al lado saldrá un boton que confirmacion
         */
        else if(e.getSource() == ButtonInterfaceLuck.getTailButton()){
            confirmFaceOrTailPlayer1.removeAll();
            confirmFaceOrTailPlayer1.revalidate();
            confirmFaceOrTailPlayer1.repaint();
            /**
             * recogemos en variables el alias y la eleccion de cara o cruz
             * esto será usado para introducirlo en un hashmap
             */
            MethodsInterfaceLuck.setAuxMapAliasPlayer1Luck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());
            MethodsInterfaceLuck.setChosenItem(MethodsInterfaceLuck.CRUZ);
            /**
             * añadimos imagen y boton al panel
             */
            ImageIcon imageIcon = new ImageIcon("imagenes/cruz.png");
            JLabel imageLabel = new JLabel();
            imageLabel.setIcon(imageIcon);
            confirmFaceOrTailPlayer1.add(imageLabel);
            confirmButtonPlayer1.setBackground(Color.GREEN);
            confirmButtonPlayer1.setForeground(Color.WHITE);
            confirmButtonPlayer1.setPreferredSize(new Dimension(140, 50));
            confirmFaceOrTailPlayer1.add(confirmButtonPlayer1);
            /**
             * actualizamos el panel central
             */
            gbc.gridx = 0;
            gbc.gridy = 2;
            contentPanelPlayer1.add(confirmFaceOrTailPlayer1, gbc);
        }


    }
    public void selectTailOrFace2(ActionEvent e){


        /**
         * si has elegido cara, saldrá una imagen que será la cara de la moneda
         * al lado saldrá un boton que confirmacion
         */
        if(e.getSource() == ButtonInterfaceLuck.getFaceButton()){
            confirmFaceOrTailPlayer2.removeAll();
            confirmFaceOrTailPlayer2.revalidate();
            confirmFaceOrTailPlayer2.repaint();
            /**
             * recogemos en variables el alias y la eleccion de cara o cruz
             * esto será usado para introducirlo en un hashmap
             */
            MethodsInterfaceLuck.setAuxMapAliasPlayer2Luck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());
            MethodsInterfaceLuck.setChosenItem2(MethodsInterfaceLuck.CARA);
            /**
             * añadimos imagen y boton al panel
             */
            ImageIcon imageIcon = new ImageIcon("imagenes/cara.png");
            JLabel imageLabel = new JLabel();
            imageLabel.setIcon(imageIcon);
            confirmFaceOrTailPlayer2.add(imageLabel);
            confirmButtonPlayer2.setBackground(Color.GREEN);
            confirmButtonPlayer2.setForeground(Color.WHITE);
            confirmButtonPlayer2.setPreferredSize(new Dimension(140, 50));
            confirmFaceOrTailPlayer2.add(confirmButtonPlayer2);
            /**
             * actualizamos el panel central
             */
            gbc.gridx = 1;
            gbc.gridy = 2;
            contentPanelPlayer1.add(confirmFaceOrTailPlayer2, gbc);

        }
        /**
         * si has elegido cruz, saldrá una imagen que será la cruz de la moneda
         * al lado saldrá un boton que confirmacion
         */
        else if(e.getSource() == ButtonInterfaceLuck.getTailButton()){
            confirmFaceOrTailPlayer2.removeAll();
            confirmFaceOrTailPlayer2.revalidate();
            confirmFaceOrTailPlayer2.repaint();
            /**
             * recogemos en variables el alias y la eleccion de cara o cruz
             * esto será usado para introducirlo en un hashmap
             */
            MethodsInterfaceLuck.setAuxMapAliasPlayer2Luck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());
            MethodsInterfaceLuck.setChosenItem2(MethodsInterfaceLuck.CRUZ);
            /**
             * añadimos imagen y boton al panel
             */
            ImageIcon imageIcon = new ImageIcon("imagenes/cruz.png");
            JLabel imageLabel = new JLabel();
            imageLabel.setIcon(imageIcon);
            confirmFaceOrTailPlayer2.add(imageLabel);
            confirmButtonPlayer2.setBackground(Color.GREEN);
            confirmButtonPlayer2.setForeground(Color.WHITE);
            confirmButtonPlayer2.setPreferredSize(new Dimension(140, 50));
            confirmFaceOrTailPlayer2.add(confirmButtonPlayer2);
            /**
             * actualizamos el panel central
             */
            gbc.gridx = 1;
            gbc.gridy = 2;
            contentPanelPlayer1.add(confirmFaceOrTailPlayer2, gbc);
        }


    }

    /**
     * si pulsas enter, una vez has elegido cara o cruz, deshabilita el alias y el boton de enter
     * además, se introduce el valor en el hashmap
     * @param e el objeto de tipo ActionEvent
     */
    public void LuckChoiceMadePlayer1(ActionEvent e){
            MethodsInterfaceLuck.disableButtonsAndAliasesPlayer1Luck();
            MethodsInterfaceLuck.setLuckPlayers(MethodsInterfaceLuck.getAuxMapAliasPlayer1Luck(),
                    MethodsInterfaceLuck.getChosenItem());
            valuePlayer1 = MethodsInterfaceLuck.takeValuesPlayer1(MethodsInterfaceLuck.getLuckPlayers());



    }
    /**
     * si pulsas enter, una vez has elegido cara o cruz, deshabilita el alias y el boton de enter
     * además, se introduce el valor en el hashmap
     * @param e el objeto de tipo ActionEvent
     */
    public void LuckChoiceMadePlayer2(ActionEvent e){
        MethodsInterfaceLuck.disableButtonsAndAliasesPlayer2Luck();
        MethodsInterfaceLuck.setLuckPlayers(MethodsInterfaceLuck.getAuxMapAliasPlayer2Luck(),
                MethodsInterfaceLuck.getChosenItem2());
        valuePlayer2 = MethodsInterfaceLuck.takeValuesPlayer2(MethodsInterfaceLuck.getLuckPlayers());

    }

    /**
     * metodo que limpia el panel del ganador del sorteo para meter la imagen del ganador
     * @param e el objeto de tipo actionevent
     */
    public void winnerFaceOrTail(ActionEvent e){
        /**
         * si se cumple la condicion de este metodo, se pued epulsar el boton
         * el metodo consiste en saber si está editable el alias del jugador 1 y 2
         */
        if(MethodsInterfaceLuck.showWinnerLuck()){
            /**
             * limpiamos el panel del ganador del sorteo
             */
            winnerPanel.removeAll();
            winnerPanel.revalidate();
            winnerPanel.repaint();
            /**
             * añadimos al hashmap de ganador, los valores que introdujeron el jugador 1 y 2
             */
            winnerPanel.add(MethodsInterfaceLuck.luckyInterfaceWinner(MethodsInterfaceLuck.takeValuesPlayer1(MethodsInterfaceLuck.getLuckPlayers()),
                    MethodsInterfaceLuck.takeValuesPlayer2(MethodsInterfaceLuck.getLuckPlayers())));
            /**
             * limpiamos el panel de ir a seleccion de pokemon
             */
            goToSelectionPanel.removeAll();
            goToSelectionPanel.revalidate();
            goToSelectionPanel.repaint();
            /**
             * personalizamos el boton de ir a seleccion de pokemon
             */
            goToSelectionPokemonButton.setPreferredSize(new Dimension(200,40));
            goToSelectionPokemonButton.setBackground(Color.CYAN);
            goToSelectionPokemonButton.setForeground(Color.BLACK);
            /**
             * lo añadimos al panel
             */
            goToSelectionPanel.add(goToSelectionPokemonButton);
            /**
             * deshabilitamos el resto de botones una vez se conoce al ganador
             */
             MethodsInterfaceLuck.disableAllButtonsLuck();


        }
    }

    /**
     * metodo para ir a la interfaz de seleccion de pokemon
     * @param e el objeto de tipo actionEvent
     */
    public void goToSelectionInterface(ActionEvent e){
        new SelectionPokemon();
        dispose();
    }


    /**
     * metodo para crear el panel de confirmacion del jugador 1
     * @return el panel creado
     */
    private JPanel makeConfirmFaceOrTailPlayer1(){
        JPanel confirmPanel = new JPanel();
        ImageIcon imageIcon = new ImageIcon();
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        confirmPanel.add(imageLabel);
        confirmButtonPlayer1.setBackground(Color.GREEN);
        confirmButtonPlayer1.setForeground(Color.WHITE);
        confirmButtonPlayer1.setPreferredSize(new Dimension(140, 50));
        confirmPanel.add(confirmButtonPlayer1);
        return confirmPanel;
    }
    /**
     * metodo para crear el panel de confirmacion del jugador 2
     * @return el panel creado
     */
    private JPanel makeConfirmFaceOrTailPlayer2(){
        JPanel confirmPanel = new JPanel();
        ImageIcon imageIcon = new ImageIcon();
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);
        confirmPanel.add(imageLabel);
        confirmButtonPlayer2.setBackground(Color.GREEN);
        confirmButtonPlayer2.setForeground(Color.WHITE);
        confirmButtonPlayer2.setPreferredSize(new Dimension(140, 50));
        confirmPanel.add(confirmButtonPlayer2);
        return confirmPanel;
    }

    /**
     * getter y setter de los atributos de la clase
     * @return los atributos correspondientes
     */
    public static JPanel getAuxWinnerPanelPLayer1() {
        return auxWinnerPanelPLayer1;
    }

    public static void setAuxWinnerPanelPLayer1(JPanel auxWinnerPanelPLayer1) {
        Luck.auxWinnerPanelPLayer1 = auxWinnerPanelPLayer1;
    }

    public static JPanel getAuxWinnerPanelPLayer2() {
        return auxWinnerPanelPLayer2;
    }

    public static void setAuxWinnerPanelPLayer2(JPanel auxWinnerPanelPLayer2) {
        Luck.auxWinnerPanelPLayer2 = auxWinnerPanelPLayer2;
    }
}

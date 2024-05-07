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
    private static JPanel auxWinnerPanelPLayer2;



    /**
     *atributos privados de tipo JPanel en los que vamos a poner la información del jugador 2
     */
    private JPanel aliasSelectedPlayer2;
    private JPanel faceOrTailPlayer2;
    private JPanel confirmFaceOrTailPlayer2;

    /**
     * atributo privado de tipo JPanel en el que saldrá el ganador del sorteo
     */
    private JPanel resultPanel;
    /**
     * atributo privado de tipo JButton para poder iniciar la variable del boton de confirnar
     */
    private JButton confirmButtonPlayer1;
    private JButton confirmButtonPlayer2;
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

        gbc.gridx = 1;
        gbc.gridy = 1;
        aliasSelectedPlayer2 = new JPanel();
        contentPanelPlayer1.add(aliasSelectedPlayer2, gbc);

        /**
         * iniciamos el panel de cara o cruz del jugador1
         */
        faceOrTailPlayer1 = new JPanel();
        faceOrTailPlayer1 = MethodsInterfaceLuck.faceOrTailPanelPlayer1();
        faceOrTailPlayer2 = new JPanel();
        faceOrTailPlayer2 = MethodsInterfaceLuck.faceOrTailPanelPlayer2();


        /**
         * establecemos nuevas medidas
         */

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
         * hacemos que el panel de confirmacion sea igual a un metodo que nos devuelve un panel
         */
        confirmFaceOrTailPlayer1 = makeConfirmFaceOrTailPlayer1();
        confirmFaceOrTailPlayer2 = makeConfirmFaceOrTailPlayer2();

        /**
         * establecemos un layout para el panel de confirmacion de cara o cruz
         */
        confirmFaceOrTailPlayer1.setLayout(new BoxLayout(confirmFaceOrTailPlayer1, BoxLayout.X_AXIS));
        auxWinnerPanelPLayer1 = new JPanel();
        auxWinnerPanelPLayer2 = new JPanel();
        resultPanel = new JPanel();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(50,100,0,0);
        resultPanel = MethodsInterfaceLuck.luckyInterfaceWinner();
        contentPanelPlayer1.add(resultPanel, gbc);





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
     * metodo que limpia un panel para poner la imagen y el alias del jugador introducido
     * @param e el objeto de tipo ActionEvent
     */
    public void putAliasImageAliasPLayer1(ActionEvent e){
        if(MethodsInterfaceLuck.checkAliasPlayer1()){
            aliasSelectedPlayer1.removeAll();
            aliasSelectedPlayer1.revalidate();
            aliasSelectedPlayer1.repaint();
            JPanel newContentPanel = MethodsInterfaceLuck.selectAliasImagePlayer1();
            aliasSelectedPlayer1.add(newContentPanel);
            auxWinnerPanelPLayer1 = aliasSelectedPlayer1;
            aliasSelectedPlayer1.add(faceOrTailPlayer1);
        }
    }
    public void putAliasImageAliasPLayer2(ActionEvent e){
        if(MethodsInterfaceLuck.checkAliasPlayer2()){
            aliasSelectedPlayer2.removeAll();
            aliasSelectedPlayer2.revalidate();
            aliasSelectedPlayer2.repaint();
            JPanel newContentPanel = MethodsInterfaceLuck.selectAliasImagePlayer2();
            aliasSelectedPlayer2.add(newContentPanel);
            auxWinnerPanelPLayer2 = aliasSelectedPlayer2;
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
     * si pulsas enter, una vez has elegido cara o cruz, deshabilitas todos los botones
     * además, se introduce el valor en el hashmap
     * @param e el objeto de tipo ActionEvent
     */
    public void LuckChoiceMadePlayer1(ActionEvent e){
            MethodsInterfaceLuck.disableButtonsAndAliasesPlayer1Luck();


            MethodsInterfaceLuck.setLuckPlayers(MethodsInterfaceLuck.getAuxMapAliasPlayer1Luck(),
                    MethodsInterfaceLuck.getChosenItem());


    }
    public void LuckChoiceMadePlayer2(ActionEvent e){
        MethodsInterfaceLuck.disableButtonsAndAliasesPlayer2Luck();
        MethodsInterfaceLuck.setLuckPlayers(MethodsInterfaceLuck.getAuxMapAliasPlayer2Luck(),
                MethodsInterfaceLuck.getChosenItem2());

    }
    public void winnerFaceOrTail(ActionEvent e){
        if(MethodsInterfaceLuck.showWinnerLuck()){

            dispose();
        }
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

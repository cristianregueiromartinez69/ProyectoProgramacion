package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceLuck;
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
     *atributos privados de tipo JPanel en los que vamos a poner la información de los jugadores
     */
    private JPanel aliasPanelPLayer1;
    private JPanel aliasPanelPLayer2;
    private JPanel aliasSelectedPlayer1;
    private JPanel faceOrTailPlayer1;
    private JPanel confirmFaceOrTailPlayer1;
    private  JButton enterPlayer1;
    private JPanel resultPanel;

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
        JPanel contentPanel = makeContentPanel();
        GridBagConstraints gbc = new GridBagConstraints();

        /**
         * añadimos el panel
         */
        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


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
        contentPanel.add(aliasPanelPLayer1, gbc);


        /**
         * establecemos donde se va a situar el panel de informacion del juhador 2
         */
        gbc.gridx = 1;
        gbc.gridy = 0;
        /**
         * lo añadimos al panel central
         */
        contentPanel.add(aliasPanelPLayer2, gbc);

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

        gbc.gridx = 0;
        gbc.gridy = 1;
        aliasSelectedPlayer1 = new JPanel();
        contentPanel.add(aliasSelectedPlayer1, gbc);

        faceOrTailPlayer1 = new JPanel();
        faceOrTailPlayer1 = MethodsInterfaceLuck.faceOrTailPanelPlayer1();


        gbc.gridx = 0;
        gbc.gridy = 2;
        confirmFaceOrTailPlayer1 = new JPanel();
        confirmFaceOrTailPlayer1.setLayout(new BoxLayout(confirmFaceOrTailPlayer1, BoxLayout.X_AXIS));
        contentPanel.add(confirmFaceOrTailPlayer1, gbc);

        EnterPanelPlayer1Luck.getEnterButtonPlayer1().addActionListener(this::putAliasImageAliasPLayer1);
        ButtonInterfaceLuck.getFaceButton().addActionListener(this::selectTailOrFace);
        ButtonInterfaceLuck.getTailButton().addActionListener(this::selectTailOrFace);


    }

    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }
    public void putAliasImageAliasPLayer1(ActionEvent e){
        if(MethodsInterfaceLuck.checkAliasPlayer1()){
            aliasSelectedPlayer1.removeAll();
            aliasSelectedPlayer1.revalidate();
            aliasSelectedPlayer1.repaint();
            JPanel newContentPanel = MethodsInterfaceLuck.selectAliasImagePlayer1();
            aliasSelectedPlayer1.add(newContentPanel);
            aliasSelectedPlayer1.add(faceOrTailPlayer1);
        }
    }

    public void selectTailOrFace(ActionEvent e){


        if(e.getSource() == ButtonInterfaceLuck.getFaceButton()){
            confirmFaceOrTailPlayer1.removeAll();
            confirmFaceOrTailPlayer1.revalidate();
            confirmFaceOrTailPlayer1.repaint();
            String auxMapAliasPlayer1Luck = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
            int chosenItem = MethodsInterfaceLuck.CARA;
            ImageIcon imageIcon = new ImageIcon("imagenes/cara.png");
            JLabel imageLabel = new JLabel();
            imageLabel.setIcon(imageIcon);
            confirmFaceOrTailPlayer1.add(imageLabel);
            JButton confirmButton = new ButtonInterfaceLuck().makeConfirmButtonPlayer1();
            confirmButton.setBackground(Color.GREEN);
            confirmButton.setForeground(Color.WHITE);
            confirmButton.setPreferredSize(new Dimension(140, 50));
            confirmFaceOrTailPlayer1.add(confirmButton);

        }
        else if(e.getSource() == ButtonInterfaceLuck.getTailButton()){
            confirmFaceOrTailPlayer1.removeAll();
            confirmFaceOrTailPlayer1.revalidate();
            confirmFaceOrTailPlayer1.repaint();
            String auxMapAliasPlayer1Luck = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
            int chosenItem = MethodsInterfaceLuck.CRUZ;
            ImageIcon imageIcon = new ImageIcon("imagenes/cruz.png");
            JLabel imageLabel = new JLabel();
            imageLabel.setIcon(imageIcon);
            confirmFaceOrTailPlayer1.add(imageLabel);
            JButton confirmButton = new ButtonInterfaceLuck().makeConfirmButtonPlayer1();
            confirmButton.setBackground(Color.GREEN);
            confirmButton.setForeground(Color.WHITE);
            confirmButton.setPreferredSize(new Dimension(140, 50));
            confirmFaceOrTailPlayer1.add(confirmButton);
        }


    }



}

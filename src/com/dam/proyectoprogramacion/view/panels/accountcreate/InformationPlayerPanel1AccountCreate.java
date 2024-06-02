package com.dam.proyectoprogramacion.view.panels.accountcreate;

import javax.swing.*;
import java.awt.*;

/**
 * clase que extiende de JPanel que servirá para la información del jugador 1
 * @author cristian
 * @version v1.0
 */
public class InformationPlayerPanel1AccountCreate extends JPanel {

    /**
     * atributos privados de tipo JLabel y JTextfield para introducir un alias
     */
    private JLabel player1Label;
    private JLabel indicatorPutALiasLabel;
    private static JTextField aliasTextPlayer1;


    /**
     * constructor en el que se inician las variables y se establece un layout
     * el layout será de tipo BoxLayout con una disposición en vertical
     */
    public InformationPlayerPanel1AccountCreate() {

        setVisible(true);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        player1Label = new JLabel("Jugador 1");
        player1Label.setForeground(Color.blue);
        this.add(player1Label);
        indicatorPutALiasLabel = new JLabel("Introduce un alias");
        this.add(indicatorPutALiasLabel);
        aliasTextPlayer1 = new JTextField(5);
        this.add(aliasTextPlayer1);

    }

    public static JTextField getAliasTextPlayer1() {
        return aliasTextPlayer1;
    }

    public static void setAliasTextPlayer1(JTextField aliasTextPlayer1) {
        InformationPlayerPanel1AccountCreate.aliasTextPlayer1 = aliasTextPlayer1;
    }

    /**
     * metodo para establecer que el alias no es editable una vez le dimos a listo
     */
    public static void notEditableAliasText() {
        aliasTextPlayer1.setEditable(false);
    }
}

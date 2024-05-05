package com.dam.proyectoprogramacion.panels.accountcreate;

import javax.swing.*;
import java.awt.*;

/**
 * clase que extiende de JPanel que servirá para la información del jugador 2
 * @author cristian
 * @version v1.0
 */
public class InformationPlayerPanel2AccountCreate extends JPanel{

    /**
     * atributos privados de tipo JLabel y JTextfield para introducir un alias
     */
    private JLabel player2Label;
    private JLabel indicatorPutALiasLabel;
    private static JTextField aliasTextPlayer2;


    /**
     * constructor en el que se inician las variables y se establece un layout
     * el layout será de tipo BoxLayout con una disposición en vertical
     */
    public InformationPlayerPanel2AccountCreate() {

        setVisible(true);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        player2Label = new JLabel("Jugador 2");
        player2Label.setForeground(Color.RED);
        this.add(player2Label);
        indicatorPutALiasLabel = new JLabel("Introduce un alias");
        this.add(indicatorPutALiasLabel);
        aliasTextPlayer2 = new JTextField(5);
        this.add(aliasTextPlayer2);

    }

    public static JTextField getAliasTextPlayer2() {
        return aliasTextPlayer2;
    }

    public static void setAliasTextPlayer2(JTextField aliasTextPlayer2) {
        InformationPlayerPanel2AccountCreate.aliasTextPlayer2 = aliasTextPlayer2;
    }
    public static void notEditableAliasText() {
        aliasTextPlayer2.setEditable(false);
    }
}

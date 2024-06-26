package com.dam.proyectoprogramacion.view.panels.luck;

import javax.swing.*;
import java.awt.*;

/**
 * clase que tiene el panel de enter del jugador 1
 * @author cristian
 * @version v1.0
 */
public class InformationPanelPlayer1Luck extends JPanel {
    /**
     * atributos privados de tipo JLabel, JTextField y JButton de la clase
     */
    private JLabel player1Label;
    private JLabel indicatorPutALiasLabel;
    private static JTextField aliasTextPlayer1;


    public InformationPanelPlayer1Luck(){
        /**
         * hacemos el panel visible y le damos una dimension
         */
        setVisible(true);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        /**
         * iniciamos las variables
         */
        player1Label = new JLabel("Jugador 1");
        player1Label.setForeground(Color.blue);
        this.add(player1Label);
        indicatorPutALiasLabel = new JLabel("Introduce un alias");
        this.add(indicatorPutALiasLabel);
        aliasTextPlayer1 = new JTextField(5);
        this.add(aliasTextPlayer1);

    }

    /**
     * getter y setter del text alias del jugador 1
     * @return el alias del jugador 1
     */
    public static JTextField getAliasTextPlayer1() {
        return aliasTextPlayer1;
    }

    public static void setAliasTextPlayer1(JTextField aliasTextPlayer1) {
        InformationPanelPlayer1Luck.aliasTextPlayer1 = aliasTextPlayer1;
    }
}

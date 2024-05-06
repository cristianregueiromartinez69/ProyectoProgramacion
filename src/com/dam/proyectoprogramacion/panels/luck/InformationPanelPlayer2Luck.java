package com.dam.proyectoprogramacion.panels.luck;

import javax.swing.*;
import java.awt.*;

public class InformationPanelPlayer2Luck extends JPanel {
    private JLabel player2Label;
    private JLabel indicatorPutALiasLabel;
    private static JTextField aliasTextPlayer2;
    private JPanel enterButtonPanel;
    private JButton enterButtonPlayer2;

    public InformationPanelPlayer2Luck(){
        /**
         * atributos privados de tipo JLabel, JTextField y JButton de la clase
         */
        setVisible(true);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        /**
         * iniciamos las variables
         */
        player2Label = new JLabel("Jugador 2");
        player2Label.setForeground(Color.RED);
        this.add(player2Label);
        indicatorPutALiasLabel = new JLabel("Introduce un alias");
        this.add(indicatorPutALiasLabel);
        aliasTextPlayer2 = new JTextField(5);
        this.add(aliasTextPlayer2);


    }

    /**
     * getter y setter del text alias del jugador 2
     * @return el alias del jugador 2
     */
    public static JTextField getAliasTextPlayer2() {
        return aliasTextPlayer2;
    }

    public static void setAliasTextPlayer2(JTextField aliasTextPlayer2) {
        InformationPanelPlayer2Luck.aliasTextPlayer2 = aliasTextPlayer2;
    }
}

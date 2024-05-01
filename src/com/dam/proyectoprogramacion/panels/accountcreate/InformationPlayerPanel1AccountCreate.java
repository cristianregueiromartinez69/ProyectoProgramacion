package com.dam.proyectoprogramacion.panels.accountcreate;

import javax.swing.*;
import java.awt.*;

public class InformationPlayerPanel1AccountCreate extends JPanel {

    private JLabel player1Label;
    private JLabel indicatorPutALiasLabel;
    private JTextField aliasTextPlayer1;


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
}

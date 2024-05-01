package com.dam.proyectoprogramacion.panels.accountcreate;

import javax.swing.*;
import java.awt.*;

public class InformationPlayerPanel2AccountCreate extends JPanel{


    private JLabel player2Label;
    private JLabel indicatorPutALiasLabel;
    private JTextField aliasTextPlayer2;



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
}

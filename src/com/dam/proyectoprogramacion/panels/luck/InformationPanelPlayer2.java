package com.dam.proyectoprogramacion.panels.luck;

import javax.swing.*;
import java.awt.*;

public class InformationPanelPlayer2 extends JPanel {
    private JLabel player2Label;
    private JLabel indicatorPutALiasLabel;
    private static JTextField aliasTextPlayer2;
    private JButton enterButtonPlayer2;

    public InformationPanelPlayer2(){
        setVisible(true);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        player2Label = new JLabel("Jugador 2");
        player2Label.setForeground(Color.blue);
        this.add(player2Label);
        indicatorPutALiasLabel = new JLabel("Introduce un alias");
        this.add(indicatorPutALiasLabel);
        aliasTextPlayer2 = new JTextField(5);
        this.add(aliasTextPlayer2);
        enterButtonPlayer2 = new JButton("enter");
        enterButtonPlayer2.setBackground(Color.GREEN);
        enterButtonPlayer2.setForeground(Color.WHITE);
        enterButtonPlayer2.setPreferredSize(new Dimension(100,100));
        this.add(enterButtonPlayer2);
    }
}

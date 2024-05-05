package com.dam.proyectoprogramacion.panels.luck;

import javax.swing.*;
import java.awt.*;

public class InformationPanelPlayer1 extends JPanel {
    private JLabel player1Label;
    private JLabel indicatorPutALiasLabel;
    private static JTextField aliasTextPlayer1;
    private JButton enterButtonPlayer1;

    public InformationPanelPlayer1(){
        setVisible(true);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        player1Label = new JLabel("Jugador 1");
        player1Label.setForeground(Color.blue);
        this.add(player1Label);
        indicatorPutALiasLabel = new JLabel("Introduce un alias");
        this.add(indicatorPutALiasLabel);
        aliasTextPlayer1 = new JTextField(5);
        this.add(aliasTextPlayer1);
        enterButtonPlayer1 = new JButton("enter");
        enterButtonPlayer1.setBackground(Color.GREEN);
        enterButtonPlayer1.setForeground(Color.WHITE);
        enterButtonPlayer1.setPreferredSize(new Dimension(100,100));
        this.add(enterButtonPlayer1);
    }
}

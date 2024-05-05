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
        setVisible(true);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        player2Label = new JLabel("Jugador 2");
        player2Label.setForeground(Color.RED);
        this.add(player2Label);
        indicatorPutALiasLabel = new JLabel("Introduce un alias");
        this.add(indicatorPutALiasLabel);
        aliasTextPlayer2 = new JTextField(5);
        this.add(aliasTextPlayer2);
        enterButtonPanel = new JPanel();
        enterButtonPanel.setLayout(new BoxLayout(enterButtonPanel, BoxLayout.X_AXIS));
        this.add(enterButtonPanel);

    }
}

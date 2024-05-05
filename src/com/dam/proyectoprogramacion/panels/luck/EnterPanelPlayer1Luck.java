package com.dam.proyectoprogramacion.panels.luck;

import javax.swing.*;
import java.awt.*;

public class EnterPanelPlayer1Luck extends JPanel {
    private JButton enterButtonPlayer1;
    public EnterPanelPlayer1Luck(){
        enterButtonPlayer1 = new JButton("enter");
        enterButtonPlayer1.setBackground(Color.GREEN);
        enterButtonPlayer1.setForeground(Color.WHITE);
        enterButtonPlayer1.setPreferredSize(new Dimension(100,50));
        this.add(enterButtonPlayer1);
    }
}

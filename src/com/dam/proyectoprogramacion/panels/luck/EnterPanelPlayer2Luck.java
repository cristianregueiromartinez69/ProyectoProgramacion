package com.dam.proyectoprogramacion.panels.luck;

import javax.swing.*;
import java.awt.*;

public class EnterPanelPlayer2Luck extends JPanel {
    private JButton enterButtonPlayer2;
    public EnterPanelPlayer2Luck(){
        enterButtonPlayer2 = new JButton("enter");
        enterButtonPlayer2.setBackground(Color.GREEN);
        enterButtonPlayer2.setForeground(Color.WHITE);
        enterButtonPlayer2.setPreferredSize(new Dimension(100,50));
        this.add(enterButtonPlayer2);
    }
}

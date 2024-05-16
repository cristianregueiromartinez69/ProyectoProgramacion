package com.dam.proyectoprogramacion.panels.battle.logicalbattle;

import javax.swing.*;
import java.awt.*;

public class TextAreaPanelBattle extends JPanel {

    private JPanel textPanel;
    private static JTextArea informationBattle;

    public TextAreaPanelBattle(){

        setVisible(true);
        setLayout(new FlowLayout());

        textPanel = new JPanel();
        informationBattle = new JTextArea();
    }
}

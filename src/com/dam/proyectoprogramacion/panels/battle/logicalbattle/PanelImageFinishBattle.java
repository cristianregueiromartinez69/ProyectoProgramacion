package com.dam.proyectoprogramacion.panels.battle.logicalbattle;

import javax.swing.*;

public class PanelImageFinishBattle extends JPanel {


    private JPanel imageTextWinnerPanel;
    private JPanel aliasWinnerPanel;
    private JPanel goToHallOfFamePanel;

    public PanelImageFinishBattle(){
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        imageTextWinnerPanel = new JPanel();
        aliasWinnerPanel = new JPanel();
        goToHallOfFamePanel = new JPanel();



        add(imageTextWinnerPanel);
        add(aliasWinnerPanel);
        add(goToHallOfFamePanel);
    }
}

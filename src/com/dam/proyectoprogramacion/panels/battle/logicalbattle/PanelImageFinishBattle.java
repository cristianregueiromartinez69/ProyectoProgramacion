package com.dam.proyectoprogramacion.panels.battle.logicalbattle;

import com.dam.proyectoprogramacion.methods.luck.MethodsInterfaceLuck;

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

        imageTextWinnerPanel = MethodsInterfaceLuck.makeImageWinnerPanel();



        add(imageTextWinnerPanel);
        add(aliasWinnerPanel);
        add(goToHallOfFamePanel);
    }
}

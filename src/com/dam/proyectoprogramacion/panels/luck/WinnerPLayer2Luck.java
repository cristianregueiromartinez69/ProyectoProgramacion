package com.dam.proyectoprogramacion.panels.luck;

import com.dam.proyectoprogramacion.interfaces.Luck;
import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceLuck;

import javax.swing.*;

public class WinnerPLayer2Luck extends JPanel {

    private JPanel winnerImagePanel;
    private JPanel aliasWinnerPanel;
    private JPanel buttonFinishPanel;

    public WinnerPLayer2Luck(){
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        winnerImagePanel = MethodsInterfaceLuck.makeImageWinnerPanel();
        this.add(winnerImagePanel);
        aliasWinnerPanel = Luck.getAuxWinnerPanelPLayer2();
        this.add(aliasWinnerPanel);
        buttonFinishPanel = MethodsInterfaceLuck.makeButtonFinishPanel();
        this.add(buttonFinishPanel);

    }
}

package com.dam.proyectoprogramacion.panels.luck;

import com.dam.proyectoprogramacion.interfaces.Luck;
import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceLuck;

import javax.swing.*;


public class WinnerPlayer1Luck extends JPanel {

    private JPanel winnerImagePanel;
    private JPanel aliasWinnerPanel;



    public WinnerPlayer1Luck(){

        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        winnerImagePanel = MethodsInterfaceLuck.makeImageWinnerPanel();
        this.add(winnerImagePanel);
        aliasWinnerPanel = MethodsInterfaceLuck.selectAliasImagePlayer1();
        this.add(aliasWinnerPanel);



    }
}

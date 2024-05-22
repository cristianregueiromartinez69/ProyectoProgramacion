package com.dam.proyectoprogramacion.panels.battle.logicalbattle;

import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePokemon;
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
        aliasWinnerPanel = getAliasWinnerBattle();




        add(imageTextWinnerPanel);
        add(aliasWinnerPanel);
        add(goToHallOfFamePanel);
    }

    private JPanel getAliasWinnerBattle(){
        JPanel auxPanel = new JPanel();
        if(!MethodsBattlePokemon.isTeamPokemonAlivePlayer1()){
            aliasWinnerPanel = MethodsInterfaceLuck.selectAliasImagePlayer2();
            auxPanel = aliasWinnerPanel;
        }
        else if(!MethodsBattlePokemon.isTeamPokemonAlivePlayer2()){
            aliasWinnerPanel = MethodsInterfaceLuck.selectAliasImagePlayer1();
            auxPanel = aliasWinnerPanel;
        }
        return auxPanel;
    }
}

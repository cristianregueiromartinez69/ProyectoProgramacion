package com.dam.proyectoprogramacion.panels.battle.logicalbattle;

import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePokemon;
import com.dam.proyectoprogramacion.methods.luck.MethodsInterfaceLuck;

import javax.swing.*;
import java.awt.*;

/**
 * clase que almacenará la imagen de winner, alias y boton del ganador de la batalla pokemon
 * @version v4.0
 */
public class PanelImageFinishBattle extends JPanel {


    /**
     * atributos privados de tipo JPanel para almacenar otros paneles
     */
    private JPanel imageTextWinnerPanel;
    private JPanel aliasWinnerPanel;
    private JPanel goToHallOfFamePanel;
    private JButton goToHallOfFameButton;

    /**
     * constructor de la clase
     */
    public PanelImageFinishBattle(){
        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        /**
         *iniciamos los paneles
         */
        imageTextWinnerPanel = new JPanel();
        aliasWinnerPanel = new JPanel();
        goToHallOfFamePanel = new JPanel();

        /**
         * cada atributo lo hacemos igual a metodos que crean paneles
         * los añadimos a el panel this que es la propia clase la cual es un panel
         */
        imageTextWinnerPanel = MethodsInterfaceLuck.makeImageWinnerPanel();
        aliasWinnerPanel = getAliasWinnerBattle();

        /**
         * boton para ir al hall de la fama
         */
        goToHallOfFameButton = new JButton("Ir al Hall de la Fama");
        goToHallOfFameButton.setBackground(Color.BLUE);
        goToHallOfFameButton.setForeground(Color.WHITE);
        goToHallOfFameButton.setPreferredSize(new Dimension(250, 40));
        goToHallOfFameButton.setMaximumSize(new Dimension(250, 40));
        goToHallOfFameButton.setMinimumSize(new Dimension(250, 40));

        goToHallOfFamePanel.add(goToHallOfFameButton);


        add(imageTextWinnerPanel);
        add(aliasWinnerPanel);
        add(goToHallOfFamePanel);
    }

    /**
     * metodo para obtener el panel del alias del ganador de la batalla
     * @return el panel creado
     */
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

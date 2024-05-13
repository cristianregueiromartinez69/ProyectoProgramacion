package com.dam.proyectoprogramacion.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.panels.battle.battlePlayer1.AliasAndLogoPlayer1;
import com.dam.proyectoprogramacion.panels.battle.battlePlayer1.AttacksAndChangesPokemonPlayer1;

public class Battle extends JFrame {

    private JPanel contentPanel;
    private JPanel globalPanelPLayer1;
    private JPanel battlePanel;
    private JPanel globalPanelPLayer2;
    private JPanel lifePanelPokemons;


    public Battle(){

        setVisible(true);
        setLayout(new BorderLayout());
        setBounds(1000,1000,1000,1000);

        contentPanel = new JPanel();
        contentPanel = makeContentPanel();
        add(contentPanel);

        globalPanelPLayer1 = new JPanel();
        globalPanelPLayer1.setLayout(new BoxLayout(globalPanelPLayer1, BoxLayout.Y_AXIS));
        globalPanelPLayer1.add(new AliasAndLogoPlayer1());
        globalPanelPLayer1.add(new AttacksAndChangesPokemonPlayer1());
        contentPanel.add(globalPanelPLayer1, BorderLayout.WEST);



    }



    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new BorderLayout());
        return contentPanel;
    }
}

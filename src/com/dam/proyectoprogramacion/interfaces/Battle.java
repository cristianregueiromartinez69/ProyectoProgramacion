package com.dam.proyectoprogramacion.interfaces;

import javax.swing.*;
import java.awt.*;

import com.dam.proyectoprogramacion.panels.battle.battleplayer1.AliasAndLogoPlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.AttacksAndChangesPokemonPlayer1;

/**
 * interfaz del combate pokemon
 * @author cristian & chema
 * @version v3.0
 */
public class Battle extends JFrame {

    /**
     * qatributos privados de tipo jpanel de la interfaz
     */
    private JPanel contentPanel;
    private JPanel globalPanelPLayer1;
    private JPanel battlePanel;
    private JPanel globalPanelPLayer2;
    private JPanel lifePanelPokemons;


    /**
     * constructor de la clase
     */
    public Battle(){

        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BorderLayout());
        setBounds(1000,1000,1000,1000);

        /**
         * hacemos el panel que contendrá a todos los paneles
         */
        contentPanel = new JPanel();
        contentPanel = makeContentPanel();
        add(contentPanel);

        /**
         * instanciamos el panel del jugador 1
         */
        globalPanelPLayer1 = new JPanel();
        globalPanelPLayer1.setLayout(new BoxLayout(globalPanelPLayer1, BoxLayout.Y_AXIS));
        /**
         * añadimos el alias y los botones al panel
         */
        globalPanelPLayer1.add(new AliasAndLogoPlayer1());
        globalPanelPLayer1.add(new AttacksAndChangesPokemonPlayer1());
        contentPanel.add(globalPanelPLayer1, BorderLayout.WEST);



    }


    /**
     * metodo que hace el panel que contiene a todos los paneles de la interfaz
     * @return el panel creado
     */
    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new BorderLayout());
        return contentPanel;
    }
}

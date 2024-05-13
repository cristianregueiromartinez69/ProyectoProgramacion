package com.dam.proyectoprogramacion.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.methodsandmain.MethodsBattlePlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.AliasAndLogoPlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.AttacksAndChangesPokemonPlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.AttacksPokemonPlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.AliasAndLogoPlayer2;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.AttacksAndChangesPokemonPlayer2;

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
    private  JPanel globalPanelPLayer1;
    private  JPanel attacksPanelPlayer1;
    private  JPanel battlePanel;
    private  JPanel globalPanelPLayer2;
    private  JPanel lifePanelPokemons;


    /**
     * constructor de la clase
     */
    public Battle(){

        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BorderLayout());
        setBounds(600,600,600,600);

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
         * iniciamos un panel que será el alias y el logo del jugador 1 y lo hacemos igual a un panel de otra clase
         */
        JPanel aliasLogoPlayer1 = new AliasAndLogoPlayer1();
        globalPanelPLayer1.add(aliasLogoPlayer1);
        /**
         * iniciamos un panel que serán los botones de cambio y ataque del jugador 1 y lo hacemos igual a un panel de otra clase
         */
        JPanel attacksChangesPlayer1 = new AttacksAndChangesPokemonPlayer1();
        globalPanelPLayer1.add(attacksChangesPlayer1);
        contentPanel.add(globalPanelPLayer1, BorderLayout.WEST);

        /**
         * Jpanel que va a albergar los 4 ataques del pokemon en batalla del jugador 1
         */
        attacksPanelPlayer1 = new JPanel();
        attacksPanelPlayer1.setLayout(new BoxLayout(attacksPanelPlayer1, BoxLayout.Y_AXIS));
        /**
         * lo hacemos igual a un panel con los ataques del pokemon
         */
        attacksPanelPlayer1.add(new AttacksPokemonPlayer1());

        /**
         * iniciamos el panel del jugador 2 y le damos un layout
         */
        globalPanelPLayer2 = new JPanel();
        globalPanelPLayer2.setLayout(new BoxLayout(globalPanelPLayer2, BoxLayout.Y_AXIS));

        globalPanelPLayer2.add(new AliasAndLogoPlayer2());
        globalPanelPLayer2.add(new AttacksAndChangesPokemonPlayer2());
        contentPanel.add(globalPanelPLayer2, BorderLayout.EAST);


        /**
         * actionListener del boton de atacar
         */
       ButtonInterfaceCombat.getAttackButtonPlayer1().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               /**
                * metodo que limpia el panel de ataque y cambio y muestra los ataques
                */
               clearGlobalPanelPlayer1(attacksChangesPlayer1);
           }
       });




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

    /**
     * metodo que limpia el panel de ataque y cambio dle jugador 1
     * @param auxPanelPlayer1 el panel de ataque y cambio del jugador 1
     * @return el nuevo panel
     */
    private  JPanel clearGlobalPanelPlayer1(JPanel auxPanelPlayer1){

        JPanel attacksPanel = new JPanel();
        auxPanelPlayer1.removeAll();
        auxPanelPlayer1.revalidate();
        auxPanelPlayer1.repaint();
        attacksPanel.add(attacksPanelPlayer1);
        auxPanelPlayer1.add(attacksPanel);
        return attacksPanel;
    }

    /**
     * getter y setter de los atributos de la clase
     * @return los atributos
     */
    public JPanel getContentPanel() {
        return contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public JPanel getGlobalPanelPLayer1() {
        return globalPanelPLayer1;
    }

    public void setGlobalPanelPLayer1(JPanel globalPanelPLayer1) {
        this.globalPanelPLayer1 = globalPanelPLayer1;
    }

    public JPanel getAttacksPanelPlayer1() {
        return attacksPanelPlayer1;
    }

    public void setAttacksPanelPlayer1(JPanel attacksPanelPlayer1) {
        this.attacksPanelPlayer1 = attacksPanelPlayer1;
    }

    public JPanel getBattlePanel() {
        return battlePanel;
    }

    public void setBattlePanel(JPanel battlePanel) {
        this.battlePanel = battlePanel;
    }

    public JPanel getGlobalPanelPLayer2() {
        return globalPanelPLayer2;
    }

    public void setGlobalPanelPLayer2(JPanel globalPanelPLayer2) {
        this.globalPanelPLayer2 = globalPanelPLayer2;
    }

    public JPanel getLifePanelPokemons() {
        return lifePanelPokemons;
    }

    public void setLifePanelPokemons(JPanel lifePanelPokemons) {
        this.lifePanelPokemons = lifePanelPokemons;
    }
}

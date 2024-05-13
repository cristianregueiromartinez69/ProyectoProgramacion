package com.dam.proyectoprogramacion.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemon;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.methodsandmain.MethodsBattlePlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.AliasAndLogoPlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.AttacksAndChangesPokemonPlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.AttacksPokemonPlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.PokemonsToChoosePlayer1;
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
    private JPanel aliasLogoPlayer1;
    private JPanel attacksChangesPlayer1;
    private  JPanel attacksPanelPlayer1;
    private JPanel changesPokemonsPLayer1;
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
         aliasLogoPlayer1 = new AliasAndLogoPlayer1();
        globalPanelPLayer1.add(aliasLogoPlayer1);
        /**
         * iniciamos un panel que serán los botones de cambio y ataque del jugador 1 y lo hacemos igual a un panel de otra clase
         */
        attacksChangesPlayer1 = new AttacksAndChangesPokemonPlayer1();
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
        attacksPanelPlayer1.setVisible(false);
        globalPanelPLayer1.add(attacksPanelPlayer1);

        changesPokemonsPLayer1 = new JPanel();
        changesPokemonsPLayer1.setLayout(new BoxLayout(changesPokemonsPLayer1, BoxLayout.Y_AXIS));

        changesPokemonsPLayer1.add(new PokemonsToChoosePlayer1());
        changesPokemonsPLayer1.setVisible(false);
        globalPanelPLayer1.add(changesPokemonsPLayer1);




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
                * hace visible un panel y oculta otro
                */
             clearGlobalPanelPlayer1WhenPressAttack();
           }
       });
       ButtonInterfaceAttacks.getBackPlayer1().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               /**
                * hace visible un panel y oculta otro
                */
          clearGlobalPanelPlayer1WhenPressBack();
           }
       });
       ButtonInterfaceCombat.getChangePokemonButtonPlayer1().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               clearGlobalPanelPlayer1WhenPressChange();
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
     * metodo que hace visible el panel de ataques y oculta el de ataque y cambio
     */
    private  void clearGlobalPanelPlayer1WhenPressAttack(){

        attacksPanelPlayer1.setVisible(true);
        attacksChangesPlayer1.setVisible(false);
    }

    /**
     * metodo que hace visible el panel de ataque y cambio y oculta el de ataques
     */
    private void clearGlobalPanelPlayer1WhenPressBack(){
       attacksPanelPlayer1.setVisible(false);
       attacksChangesPlayer1.setVisible(true);
    }

    private  void clearGlobalPanelPlayer1WhenPressChange(){

        changesPokemonsPLayer1.setVisible(true);
        attacksChangesPlayer1.setVisible(false);
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

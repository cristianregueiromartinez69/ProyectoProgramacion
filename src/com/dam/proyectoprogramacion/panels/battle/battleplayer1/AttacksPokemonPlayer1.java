package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import javax.swing.*;

/**
 * clase con los paneles de los ataques del pokemon en batalla
 * @author cristian
 * @version v3.0
 */
public class AttacksPokemonPlayer1 extends JPanel {

    /**
     * atributos privados de la clase
     */
    private JPanel row1Of2PokemonAttacksInBattle;
    private JPanel row2Of2PokemonAttacksInBattle;
    private JPanel backToBattlePanel;

    public AttacksPokemonPlayer1(){
        /**
         * hacemos el panel visible y le damos un layout
         */
      setVisible(true);
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        /**
         * iniciamos el panel y añadimos el panel de otra clase
         */
      row1Of2PokemonAttacksInBattle = new JPanel();
      row1Of2PokemonAttacksInBattle.setLayout(new BoxLayout(row1Of2PokemonAttacksInBattle, BoxLayout.X_AXIS));
      row1Of2PokemonAttacksInBattle.add(new OneAndTwoAttacksPokemonInBattlePLayer1());

      row2Of2PokemonAttacksInBattle = new JPanel();
      row2Of2PokemonAttacksInBattle.setLayout(new BoxLayout(row2Of2PokemonAttacksInBattle, BoxLayout.X_AXIS));
      row2Of2PokemonAttacksInBattle.add(new ThreeAndFourAttacksPokemonInBattlePLayer1());

      backToBattlePanel = new JPanel();
      backToBattlePanel.setLayout(new BoxLayout(backToBattlePanel, BoxLayout.X_AXIS));
      backToBattlePanel.add(new BackAttacksPokemonPlayer1());

      this.add(row1Of2PokemonAttacksInBattle);
      this.add(row2Of2PokemonAttacksInBattle);
      this.add(backToBattlePanel);



    }



}

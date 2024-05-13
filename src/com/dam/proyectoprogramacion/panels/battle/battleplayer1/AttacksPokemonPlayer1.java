package com.dam.proyectoprogramacion.panels.battle.battleplayer1;

import javax.swing.*;

public class AttacksPokemonPlayer1 extends JPanel {

    private JPanel row1Of2PokemonAttacksInBattle;
    private JPanel row2Of2PokemonAttacksInBattle;

    public AttacksPokemonPlayer1(){
      setVisible(true);
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

      row1Of2PokemonAttacksInBattle = new JPanel();
      row1Of2PokemonAttacksInBattle.setLayout(new BoxLayout(row1Of2PokemonAttacksInBattle, BoxLayout.X_AXIS));
      row1Of2PokemonAttacksInBattle.add(new OneAndTwoAttacksPokemonInBattlePLayer1());

      this.add(row1Of2PokemonAttacksInBattle);



    }



}

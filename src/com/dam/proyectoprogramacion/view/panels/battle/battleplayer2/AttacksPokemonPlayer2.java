package com.dam.proyectoprogramacion.view.panels.battle.battleplayer2;

import com.dam.proyectoprogramacion.view.panels.battle.battleplayer1.BackAttacksPokemonPlayer1;
import com.dam.proyectoprogramacion.view.panels.battle.battleplayer1.OneAndTwoAttacksPokemonInBattlePLayer1;
import com.dam.proyectoprogramacion.view.panels.battle.battleplayer1.ThreeAndFourAttacksPokemonInBattlePLayer1;

import javax.swing.*;

/**
 * clase con los paneles de los ataques del pokemon en batalla del jugador 2
 * @author cristian
 * @version v3.0
 */
public class AttacksPokemonPlayer2 extends JPanel {
    /**
     * atributos privados de la clase
     */
    private JPanel row1Of2PokemonAttacksInBattle;
    private JPanel row2Of2PokemonAttacksInBattle;
    private JPanel backToBattlePanel;

    public AttacksPokemonPlayer2(){
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
        row1Of2PokemonAttacksInBattle.add(new OneAndTwoAttacksPokemonInBattlePLayer2());

        /**
         * iniciamos la segunda fila con los pokemons y hacemos que sea igual a otra clase que crea el panel
         */
        row2Of2PokemonAttacksInBattle = new JPanel();
        row2Of2PokemonAttacksInBattle.setLayout(new BoxLayout(row2Of2PokemonAttacksInBattle, BoxLayout.X_AXIS));
        row2Of2PokemonAttacksInBattle.add(new ThreeAndFourAttacksPokemonInBattlePLayer2());

        /**
         * iniciamos el panel con el boton de volver atras
         */
        backToBattlePanel = new JPanel();
        backToBattlePanel.setLayout(new BoxLayout(backToBattlePanel, BoxLayout.X_AXIS));
        backToBattlePanel.add(new BackAttacksPokemonPlayer2());

        /**
         * lo añadimos
         */
        this.add(row1Of2PokemonAttacksInBattle);
        this.add(row2Of2PokemonAttacksInBattle);
        this.add(backToBattlePanel);


    }
}

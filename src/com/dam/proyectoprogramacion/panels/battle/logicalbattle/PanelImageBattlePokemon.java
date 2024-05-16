package com.dam.proyectoprogramacion.panels.battle.logicalbattle;

import com.dam.proyectoprogramacion.background.BackgroundBattle;

import javax.swing.*;
import java.awt.*;

public class PanelImageBattlePokemon extends JPanel {

    private JPanel backgroundPanel;
    private static Image pokemonPlayer1;
    private static Image pokemonPlayer2;
    private static Image battleScenario;

    public PanelImageBattlePokemon(){

        BackgroundBattle backBattle = new BackgroundBattle(new I)

    }

    public static Image getPokemonPlayer1() {
        return pokemonPlayer1;
    }

    public static void setPokemonPlayer1(Image pokemonPlayer1) {
        PanelImageBattlePokemon.pokemonPlayer1 = pokemonPlayer1;
    }

    public static Image getPokemonPlayer2() {
        return pokemonPlayer2;
    }

    public static void setPokemonPlayer2(Image pokemonPlayer2) {
        PanelImageBattlePokemon.pokemonPlayer2 = pokemonPlayer2;
    }

    public static Image getBattleScenario() {
        return battleScenario;
    }

    public static void setBattleScenario(Image battleScenario) {
        PanelImageBattlePokemon.battleScenario = battleScenario;
    }
}

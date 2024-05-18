package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.panels.battle.battleplayer1.LifePokemonInBattlePlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.LifePokemonInBattlePlayer2;


public class MethodsBattlePokemon {

    public static int setValueOfLifePokemonInBattlePlayer1(String namePokemon){

       if(namePokemon.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.getNamePokemon1ToChangePLayer1())){
           return MethodsLifeBattlePokemonPlayer1.getLifePokemon1Player1();
       }
       else if(namePokemon.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.getNamePokemon2ToChangePLayer1())){
           return MethodsLifeBattlePokemonPlayer1.getLifePokemon2Player1();
       }
       else{
           return MethodsLifeBattlePokemonPlayer1.getLifePokemon3Player1();
       }

    }

    public static void updateLifePokemons1Player1AndPlayer2(){
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().setValue(LifePokemonInBattlePlayer1.getLifePokemon1PLayer1());
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().setValue(LifePokemonInBattlePlayer2.getLifePokemon1PLayer2());
    }


}

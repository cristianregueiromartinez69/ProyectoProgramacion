package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.panels.battle.battleplayer1.LifePokemon1Player1;
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
    public static int setValueOfLifePokemonInBattlePlayer2(String namePokemon){

        if(namePokemon.equalsIgnoreCase(MethodsTextAreaBattlePlayer2.getNamePokemon1ToChangePLayer2())){
            return MethodsLifeBattlePokemonPlayer2.getLifePokemon1Player2();
        }
        else if(namePokemon.equalsIgnoreCase(MethodsTextAreaBattlePlayer2.getNamePokemon2ToChangePLayer2())){
            return MethodsLifeBattlePokemonPlayer2.getLifePokemon2Player2();
        }
        else{
            return MethodsLifeBattlePokemonPlayer2.getLifePokemon3Player2();
        }

    }

    public static void updateLifePokemons1Player1AndPlayer2(){
        LifePokemon1Player1.getLifePokemonBarPlayer1().setValue(LifePokemon1Player1.getLifePokemon1PLayer1());
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().setValue(LifePokemonInBattlePlayer2.getLifePokemon1PLayer2());
    }


}

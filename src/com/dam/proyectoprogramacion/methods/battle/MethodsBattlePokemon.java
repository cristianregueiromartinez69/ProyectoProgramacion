package com.dam.proyectoprogramacion.methods.battle;

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


}

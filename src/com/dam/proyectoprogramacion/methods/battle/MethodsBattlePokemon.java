package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.panels.battle.battleplayer1.LifePokemonInBattlePlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.LifePokemonInBattlePlayer2;

/**
 * metodos para la batalla pokemon de los jugadores 1 y 2
 * @author cristian
 * @version v3.0
 */
public class MethodsBattlePokemon {

    /**
     * metodo para devolver la vida del pokemon en batalla del jugador 1
     * @param namePokemon el nombre del pokemon en batalla
     * @return la vida del pokemon
     */
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
    /**
     * metodo para devolver la vida del pokemon en batalla del jugador 2
     * @param namePokemon el nombre del pokemon en batalla
     * @return la vida del pokemon
     */
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

    public static float attack1PokemonInBattlePlayer1(String typePokemonUser, String typeAttack1PokemonUser,
                                                    int powerAttack1PokemonUser, int powerOfAttackPokemonUser,
                                                    String typeOpposingPokemon, int defenseOpppsingPokemon){
    float damage = 0.01f;

        return 0;
    }

    public static float getBonificationStab(String type){

   return 0;
    }

    /**
     * metodo para desglosar el tipo del pokemon en batalla para verificar el stab
     * @param type el tipo del pokemon en batalla
     * @return el array con los 2 tipos del pokemon en caso de que tenga 2
     */
    public static String[] breakDownPokemonTypeInBattlePlayer1(String type) {
        /**
         * si el pokemon del jugador 1 tiene doble tipo, se desglosa
         */
        if (type.contains("-")) {
            return type.split("-");
        } else {
            /**
             * si no lo tiene, devolverá el único tipo que tiene
             */
            return new String[]{type};
        }
    }





}

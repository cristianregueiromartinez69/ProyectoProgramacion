package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;

public class MethodsTextAreaBattlePlayer2 {

    /**
     * metodo para poner el nombre del pokemon que hará el ataque en el text area de batalla del jugador 2
     * @return el nombre del pokemon
     */
    public static String getNamePokemon1PLayer2(){
        String namePokemon1Player2 = "";
        /**
         * iniciamos variables iguales al path del pokemon en batalla
         */
        String namePokemonInBattle = ButtonInterfaceCombat.getPathPokemonBattlePlayer2();

        /**
         * tenemos que recortar el path para obtener solo el nombre
         */
        int lastIndex = namePokemonInBattle.lastIndexOf('/');
        namePokemon1Player2 = namePokemonInBattle.substring(lastIndex + 1, namePokemonInBattle.lastIndexOf('.'));


        return namePokemon1Player2;
    }

}

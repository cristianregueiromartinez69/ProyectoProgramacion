package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import java.util.ArrayList;

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
    /**
     * metodo para saber el tipo del pokemon que hay en batalla del jugador 2
     * @return el tipo del pokemon
     */
    public static String getTypePokemonInBattlePlayer2() {

        /**
         * iniciamos distintas variables
         * la primera almacenará el tipo
         * la segundo la iniciamos e indicamos quees igual al nombre del pokemon en batalla
         * la tercera es un array de objetos que hacemos igual a el array de pokemons del jugador 1
         */
        String type = "";
        String namePokemon = getNamePokemon1PLayer2();
        ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPokemonsPLayer2();

        /**
         * recorremos con un for el array de pokemons
         */
        for (int i = 0; i < pokemons.size(); i++) {

            PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);

            /**
             * si algun nombre coincide con el pokemon en batalla, entra en la condicion
             */
            if (pokemon.getName().equalsIgnoreCase(namePokemon)) {
                /**
                 * lo indicamos
                 */
                pokemon = (PokemonProperties) pokemons.get(i);

                /**
                 * asignamos la variable tipo al tipo del pokemon
                 */
                type = pokemon.getType();
                break;


            }
        }
        return type;
    }

}

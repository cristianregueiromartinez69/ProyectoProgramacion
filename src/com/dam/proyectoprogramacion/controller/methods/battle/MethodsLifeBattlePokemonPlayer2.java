package com.dam.proyectoprogramacion.controller.methods.battle;

import com.dam.proyectoprogramacion.controller.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.view.panels.luck.InformationPanelPlayer2Luck;
import com.dam.proyectoprogramacion.model.pokemon.PokemonProperties;

import java.util.ArrayList;

/**
 * clase con los metodos para obtener la vida de los pokemons del jugador 2
 * @author cristian
 * @version v3.0
 */
public class MethodsLifeBattlePokemonPlayer2 {

    /**
     * metodo para obtener el valor de la vida del pokemon numero 1 del jugador 1
     * @return el valor de la vida del pokemon
     */
    public static int getLifePokemon1Player2() {

        /**
         * iniciamos una variable de tipo int en la que vamos a almacenar la vida del primer pokemon
         */
        int lifePokemon1 = 0;
        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */

        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer2)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al segundo elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * almacenamos en la variable int el valor de la vida del pokemon
                     */
                    lifePokemon1 = firstPokemon.getLife();



                    break;

                }

            }
        }
        /**
         * retornamos la vida del pokemon
         */
        return lifePokemon1;
    }

    /**
     * metodo para obtener el valor de la vida del pokemon numero 2 del jugador 2
     * @return el valor de la vida del pokemon
     */
    public static int getLifePokemon2Player2() {

        /**
         * iniciamos una variable de tipo int en la que vamos a almacenar la vida del primer pokemon
         */
        int lifePokemon2 = 0;
        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */

        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer2)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al segundo elemento de la lista de pokemons
                     */
                    PokemonProperties secondPokemon = (PokemonProperties) pokemons.get(1);
                    /**
                     * almacenamos en la variable int el valor de la vida del pokemon
                     */
                    lifePokemon2 = secondPokemon.getLife();



                    break;

                }

            }
        }
        /**
         * retornamos la vida del pokemon
         */
        return lifePokemon2;
    }

    /**
     * metodo para obtener el valor de la vida del pokemon numero 3 del jugador 2
     * @return el valor de la vida del pokemon
     */
    public static int getLifePokemon3Player2() {

        /**
         * iniciamos una variable de tipo int en la que vamos a almacenar la vida del primer pokemon
         */
        int lifePokemon3 = 0;
        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */

        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer2)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al segundo elemento de la lista de pokemons
                     */
                    PokemonProperties thirdPokemon = (PokemonProperties) pokemons.get(2);
                    /**
                     * almacenamos en la variable int el valor de la vida del pokemon
                     */
                    lifePokemon3 = thirdPokemon.getLife();



                    break;

                }

            }
        }
        /**
         * retornamos la vida del pokemon
         */
        return lifePokemon3;
    }

    public static int getLifePokemonInBattlePlayer2(String namePokemon){

        /**
         * iniciamos la cantidad de defensa a 0
         */
        int life = 0;

        /**
         * iniciamos un array de objetos igual a la lista de pokemons escogida por el jugador 1
         */
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
                 * almacenamos el valor de la defensa
                 */
                life = pokemon.getLife();

                break;


            }
        }
        /**
         * devolvemos el ataque
         */
        return life;
    }


}

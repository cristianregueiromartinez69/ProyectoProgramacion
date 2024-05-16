package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer1;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.pokemon.AttacksPokemons;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import java.util.ArrayList;

public class MethodsTextAreaBattlePlayer1 {





    /**
     * metodo para poner el nombre del pokemon que hará el ataque en el text area de batalla
     * @return el nombre del pokemon
     */
    public static String getNamePokemon1PLayer1(){
        String namePokemon1Player1 = "";
        /**
         * iniciamos variables iguales al path del pokemon en batalla
         */
        String namePokemonInBattle = ButtonInterfaceCombat.getPathPokemonBattlePlayer1();

        /**
         * tenemos que recortar el path para obtener solo el nombre
         */
        int lastIndex = namePokemonInBattle.lastIndexOf('/');
         namePokemon1Player1 = namePokemonInBattle.substring(lastIndex + 1, namePokemonInBattle.lastIndexOf('.'));


        return namePokemon1Player1;
    }

    /**
     * metodo para poner el nombre del ataque 1 que hará el pokemon en el text area de batalla del jugador 1
     * @return el nombre del primer ataque
     */
    public static String getNameAttack1PokemonPLayer1(){
        /**
         * iniciamos una variable para encontrar el alias del jugador 1 en el hashmap
         */
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        /**
         * iniciamos una variable de tipo string igual a un metodo que nos da el nombre del pokemon en batalla
         */
        String namePokemonToLook = getNamePokemon1PLayer1();
        String attack1 = "";

        /**
         * recorremos el hashmap de jugasdores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si hay coincidencias en la clave, se mete en la condicion
             */
            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos igual al valor del hashmap
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                /**
                 * hacemos un for con el array
                 */
                for (int i = 0; i < pokemons.size(); i++) {
                    /**
                     * iniciamos una variable de tipo pokemon que es igual al tamaño
                     */
                    PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);
                    /**
                     * si encuentra el nombre del pokemon se mete en la condicion
                     */
                    if (pokemon.getName().equalsIgnoreCase(namePokemonToLook)) {
                        /**
                         * lo indicamos
                         */
                        pokemon = (PokemonProperties) pokemons.get(i);
                        /**
                         * iniciamos una variable de ataques pokemon igual a la posicion 0 del array
                         */
                        AttacksPokemons attacks = pokemon.getAttacks()[0];
                        /**
                         * obtenemos el nombre
                         */
                        attack1 = attacks.getName();
                        break;
                    }
                }

            }
        }
        /**
         * devolvemos el nombre del ataque
         */
      return attack1;
    }
    /**
     * metodo para poner el nombre del ataque 2 que hará el pokemon en el text area de batalla del jugador 1
     * @return el nombre del primer ataque
     */
    public static String getNameAttack2PokemonPLayer1(){
        /**
         * iniciamos una variable para encontrar el alias del jugador 1 en el hashmap
         */
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        /**
         * iniciamos una variable de tipo string igual a un metodo que nos da el nombre del pokemon en batalla
         */
        String namePokemonToLook = getNamePokemon1PLayer1();
        String attack2 = "";

        /**
         * recorremos el hashmap de jugasdores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si hay coincidencias en la clave, se mete en la condicion
             */
            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos igual al valor del hashmap
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                /**
                 * hacemos un for con el array
                 */
                for (int i = 0; i < pokemons.size(); i++) {
                    /**
                     * iniciamos una variable de tipo pokemon que es igual al tamaño
                     */
                    PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);
                    /**
                     * si encuentra el nombre del pokemon se mete en la condicion
                     */
                    if (pokemon.getName().equalsIgnoreCase(namePokemonToLook)) {
                        /**
                         * lo indicamos
                         */
                        pokemon = (PokemonProperties) pokemons.get(i);
                        /**
                         * iniciamos una variable de ataques pokemon igual a la posicion 1 del array
                         */
                        AttacksPokemons attacks = pokemon.getAttacks()[1];
                        /**
                         * obtenemos el nombre
                         */
                        attack2 = attacks.getName();
                        break;
                    }
                }

            }
        }
        /**
         * devolvemos el nombre del ataque
         */
        return attack2;
    }
    /**
     * metodo para poner el nombre del ataque 3 que hará el pokemon en el text area de batalla del jugador 1
     * @return el nombre del tercer ataque
     */
    public static String getNameAttack3PokemonPLayer1(){
        /**
         * iniciamos una variable para encontrar el alias del jugador 1 en el hashmap
         */
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        /**
         * iniciamos una variable de tipo string igual a un metodo que nos da el nombre del pokemon en batalla
         */
        String namePokemonToLook = getNamePokemon1PLayer1();
        String attack3 = "";

        /**
         * recorremos el hashmap de jugasdores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si hay coincidencias en la clave, se mete en la condicion
             */
            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos igual al valor del hashmap
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                /**
                 * hacemos un for con el array
                 */
                for (int i = 0; i < pokemons.size(); i++) {
                    /**
                     * iniciamos una variable de tipo pokemon que es igual al tamaño
                     */
                    PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);
                    /**
                     * si encuentra el nombre del pokemon se mete en la condicion
                     */
                    if (pokemon.getName().equalsIgnoreCase(namePokemonToLook)) {
                        /**
                         * lo indicamos
                         */
                        pokemon = (PokemonProperties) pokemons.get(i);
                        /**
                         * iniciamos una variable de ataques pokemon igual a la posicion 2 del array
                         */
                        AttacksPokemons attacks = pokemon.getAttacks()[2];
                        /**
                         * obtenemos el nombre
                         */
                        attack3 = attacks.getName();
                        break;
                    }
                }

            }
        }
        /**
         * devolvemos el nombre del ataque
         */
        return attack3;
    }
    /**
     * metodo para poner el nombre del ataque 4 que hará el pokemon en el text area de batalla del jugador 1
     * @return el nombre del cuarto ataque
     */
    public static String getNameAttack4PokemonPLayer1(){
        /**
         * iniciamos una variable para encontrar el alias del jugador 1 en el hashmap
         */
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        /**
         * iniciamos una variable de tipo string igual a un metodo que nos da el nombre del pokemon en batalla
         */
        String namePokemonToLook = getNamePokemon1PLayer1();
        String attack4 = "";

        /**
         * recorremos el hashmap de jugasdores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si hay coincidencias en la clave, se mete en la condicion
             */
            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos igual al valor del hashmap
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                /**
                 * hacemos un for con el array
                 */
                for (int i = 0; i < pokemons.size(); i++) {
                    /**
                     * iniciamos una variable de tipo pokemon que es igual al tamaño
                     */
                    PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);
                    /**
                     * si encuentra el nombre del pokemon se mete en la condicion
                     */
                    if (pokemon.getName().equalsIgnoreCase(namePokemonToLook)) {
                        /**
                         * lo indicamos
                         */
                        pokemon = (PokemonProperties) pokemons.get(i);
                        /**
                         * iniciamos una variable de ataques pokemon igual a la posicion 3 del array
                         */
                        AttacksPokemons attacks = pokemon.getAttacks()[3];
                        /**
                         * obtenemos el nombre
                         */
                        attack4 = attacks.getName();
                        break;
                    }
                }

            }
        }
        /**
         * devolvemos el nombre del ataque
         */
        return attack4;
    }


    /**
     * metodo para poner el nombre del pokemon 1  para cambiarlo del jugador 1
     * @return el nombre del pokemon
     */
    public static String getNamePokemon1ToChangePLayer1(){
        String namePokemon1Player1 = "";
        /**
         * iniciamos variables iguales al path del pokemon a cambiar
         */
        String namePokemonChange = DataNamesIconsColorsAttacksAndPokemonsPlayer1.getPathIconPokemon1();

        /**
         * tenemos que recortar el path para obtener solo el nombre
         */
        int lastIndex = namePokemonChange.lastIndexOf('/');
        namePokemon1Player1 = namePokemonChange.substring(lastIndex + 1, namePokemonChange.lastIndexOf('.'));


        return namePokemon1Player1;
    }

    /**
     * metodo para poner el nombre del pokemon 2  para cambiarlo del jugador 1
     * @return el nombre del pokemon
     */
    public static String getNamePokemon2ToChangePLayer1(){
        String namePokemon2Player1 = "";
        /**
         * iniciamos variables iguales al path del pokemon en a cambiar
         */
        String namePokemonChange = DataNamesIconsColorsAttacksAndPokemonsPlayer1.getPathIconPokemon2();

        /**
         * tenemos que recortar el path para obtener solo el nombre
         */
        int lastIndex = namePokemonChange.lastIndexOf('/');
        namePokemon2Player1 = namePokemonChange.substring(lastIndex + 1, namePokemonChange.lastIndexOf('.'));


        return namePokemon2Player1;
    }


    /**
     * metodo para poner el nombre del pokemon 3  para cambiarlo del jugador 1
     * @return el nombre del pokemon
     */
    public static String getNamePokemon3ToChangePLayer1(){
        String namePokemon3Player1 = "";
        /**
         * iniciamos variables iguales al path del pokemon a cambiar
         */
        String namePokemonChange = DataNamesIconsColorsAttacksAndPokemonsPlayer1.getPathIconPokemon3();

        /**
         * tenemos que recortar el path para obtener solo el nombre
         */
        int lastIndex = namePokemonChange.lastIndexOf('/');
        namePokemon3Player1 = namePokemonChange.substring(lastIndex + 1, namePokemonChange.lastIndexOf('.'));


        return namePokemon3Player1;
    }

    public static String KnowTheNameOfTheOpposingPokemon(){
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

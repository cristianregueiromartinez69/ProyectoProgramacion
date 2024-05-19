package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer1;
import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.pokemon.AttacksPokemons;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MethodsTextAreaBattle implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /**
     * metodo para poner el nombre del pokemon que hará el ataque en el text area de batalla
     * @return el nombre del pokemon
     */
    public static String getNamePokemon1PLayer1(){
        /**
         * variable local para almacenar el nombre del ataque
         */
        String namePokemon1 = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * asignamos el valor al string
                     */
                    namePokemon1 = firstPokemon.getName();
                    /**
                     * almacenamos el nombre
                     */

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el nombre del pokemon
         */
        return namePokemon1;


    }

    /**
     * metodo para poner el nombre del pokemon que hará el ataque en el text area de batalla
     * @return el nombre del pokemon
     */
    public static String getNameAttack1Pokemon1PLayer1(){
        /**
         * variable local para almacenar el nombre del ataque
         */
        String nameAttack1= "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    /**
                     * iniciamos una variable de tipo ataques pokemons y la hacemos igual a la posicion 0 del array de ataques
                     */
                    AttacksPokemons attack1 = firstPokemon.getAttacks()[0];
                    nameAttack1 = attack1.getName();
                    /**
                     * almacenamos el nombre
                     */

                    break;

                } else {

                    /**
                     * si no hay nada devuelve null
                     */
                    return null;
                }

            }
        }
        /**
         * retorna un metodo que devuelve el nombre del pokemon
         */
        return nameAttack1;


    }
}

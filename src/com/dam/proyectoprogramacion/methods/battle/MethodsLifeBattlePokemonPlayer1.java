package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer1;
import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.pokemon.AttacksPokemons;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * clase con los metodos para obtener la vida de los pokemons del jugador 1
 * @author cristian
 * @version v3.0
 */
public class MethodsLifeBattlePokemonPlayer1 {

    /**
     * metodo para obtener el valor de la vida del pokemon numero 1 del jugador 1
     * @return el valor de la vida del pokemon
     */
    public static int getLifePokemon1Player1() {

        /**
         * iniciamos una variable de tipo int en la que vamos a almacenar la vida del primer pokemon
         */
        int lifePokemon1 = 0;
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
     * metodo para obtener el valor de la vida del pokemon numero 2 del jugador 1
     * @return el valor de la vida del pokemon
     */
    public static int getLifePokemon2Player1() {

        /**
         * iniciamos una variable de tipo int en la que vamos a almacenar la vida del primer pokemon
         */
        int lifePokemon2 = 0;
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
     * metodo para obtener el valor de la vida del pokemon numero 3 del jugador 1
     * @return el valor de la vida del pokemon
     */
    public static int getLifePokemon3Player1() {

        /**
         * iniciamos una variable de tipo int en la que vamos a almacenar la vida del primer pokemon
         */
        int lifePokemon3 = 0;
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

    public static void updateLifeBarPokemonPlayer1(ActionEvent e){

        if(e.getSource() == ButtonInterfaceChangePokemonPlayer1.getPokemon1team()){
            LifePokemonInBattlePlayer1.getLifePokemonBar().setValue(LifePokemonInBattlePlayer1.getLifePokemon1PLayer1());
        }
        else if(e.getSource() == ButtonInterfaceChangePokemonPlayer1.getPokemon2team()){
            LifePokemonInBattlePlayer1.getLifePokemonBar().setValue(LifePokemonInBattlePlayer1.getLifePokemon2PLayer1());
        }
        else if((e.getSource() == ButtonInterfaceChangePokemonPlayer1.getPokemon3team()){
            LifePokemonInBattlePlayer1.getLifePokemonBar().setValue(LifePokemonInBattlePlayer1.getLifePokemon3PLayer1());
        }
    }

}
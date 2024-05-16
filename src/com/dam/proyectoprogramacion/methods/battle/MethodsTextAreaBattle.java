package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer1;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.panels.battle.logicalbattle.TextAreaPanelBattle;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.pokemon.AttacksPokemons;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MethodsTextAreaBattle{





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
     * metodo para poner el nombre del pokemon que hará el ataque en el text area de batalla del jugador 1
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
}

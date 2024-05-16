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
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        String namePokemonToLook = getNamePokemon1PLayer1();
        String attack1 = "";

        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            if (key.equals(aliasPlayer1)) {
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                for (int i = 0; i < pokemons.size(); i++) {
                    PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);
                    if (pokemon.getName().equalsIgnoreCase(namePokemonToLook)) {
                        pokemon = (PokemonProperties) pokemons.get(i);
                        AttacksPokemons attacks = pokemon.getAttacks()[0];
                        attack1 = attacks.getName();
                        break;
                    }
                }

            }
        }
      return attack1;
    }
}

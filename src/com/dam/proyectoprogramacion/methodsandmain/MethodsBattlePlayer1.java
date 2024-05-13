package com.dam.proyectoprogramacion.methodsandmain;

import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodsBattlePlayer1 {

    public static String putImageAttackButtonPlayer1(HashMap<String, ArrayList<Object>> players){

        String pathImagePokemon="";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            if (key.equals(aliasPlayer1)) {
                ArrayList <Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    String name = firstPokemon.getName().toLowerCase();
                    pathImagePokemon = "imagenes/" + name + ".png";
                    break;

                } else {
                    pathImagePokemon = null;
                }

            }
        }
        return pathImagePokemon;
    }





    }


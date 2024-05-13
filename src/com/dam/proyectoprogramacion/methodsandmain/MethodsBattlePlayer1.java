package com.dam.proyectoprogramacion.methodsandmain;

import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.pokemon.AttacksPokemons;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * clase con los metodos para la batalla del jugador 1
 * @author cristian
 * @version v3.0
 */
public class MethodsBattlePlayer1 {

    /**
     * metodo que recorre un hashmap y busca el primer pokemon escogido por el jugador 1
     * @param players el hashmap de los jugadores
     * @return el path con la imagen del pokemon seleccionado
     */
    public static String putImageAttackButtonPlayer1(HashMap<String, ArrayList<Object>> players){

        String pathImagePokemon="";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si encuentra la clave, entra en la condicion
             */
            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList <Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {
                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    String name = firstPokemon.getName().toLowerCase();
                    pathImagePokemon = "imagenes/" + name + ".png";
                    break;

                } else {
                    /**
                     * si no hay nada, devuelve null
                     */
                    pathImagePokemon = null;
                }

            }
        }
        return pathImagePokemon;
    }

    public static String putNameAttack1PokemonInBattlePLayer1(){


     return null;
    }


    private String getTypeAttack1PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players){
        String type="";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer1)) {

                ArrayList <Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    AttacksPokemons attack = firstPokemon.getAttacks()[0];
                    type = attack.getType();
                    break;

                } else {

                    return null;
                }

            }
        }
        return chooseAttack1Pokemon1Player1(type.toLowerCase());

    }

    private String chooseAttack1Pokemon1Player1(String type){

        String pathType = "";
        switch(type){

            case "bicho":
                pathType = "imagenes/bicho.png";
                break;
            case "siniestro":
                pathType = "imagenes/siniestro.png";
                break;
            case "dragon":
                pathType = "imagenes/dragon.png";
                break;
            case "electrico":
                pathType = "imagenes/hada.png";
                break;
            case "lucha":
                pathType = "imagenes/lucha.png";
                break;
            case "hada":
                pathType = "imagenes/bicho.png";
                break;
            case "fuego":
                pathType = "imagenes/fuego.png";
                break;
            case "volador":
                pathType = "imagenes/volador.png";
                break;
            case "fantasma":
                pathType = "imagenes/fantasma.png";
                break;
            case "planta":
                pathType = "imagenes/planta.png";
                break;
            case "tierra":
                pathType = "imagenes/tierra.png";
                break;
            case "hielo":
                pathType = "imagenes/hielo.png";
                break;
            case "normal":
                pathType = "imagenes/normal.png";
                break;
            case "veneno":
                pathType = "imagenes/veneno.png";
                break;
            case "psiquico":
                pathType = "imagenes/psiquico.png";
                break;
            case "roca":
                pathType = "imagenes/roca.png";
                break;
            case "acero":
                pathType = "imagenes/acero.png";
                break;
            case "agua":
                pathType = "imagenes/agua.png";
                break;

        }
        return pathType;
    }


    }


package com.dam.proyectoprogramacion.methodsandmain;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemon;
import com.dam.proyectoprogramacion.interfaces.Battle;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.pokemon.AttacksPokemons;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import javax.swing.*;
import java.awt.*;
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
     *
     * @param players el hashmap de los jugadores
     * @return el path con la imagen del pokemon seleccionado
     */
    public static String putImageAttackButtonPlayer1(HashMap<String, ArrayList<Object>> players) {

        String pathImagePokemon = "";
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
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
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


//---------------------------------xAtaque numero 1 ---------------------------//

    /**
     * metodo para pasar el path con el icono del primer ataque del pokemon del jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack1PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[0];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();
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
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return chooseAttackIconPokemon1Player1(type.toLowerCase());

    }

    /**
     * metodo para escoger el icono del ataque según el tipo
     *
     * @param type el tipo del ataque
     * @return el path del icono
     */
    private static String chooseAttackIconPokemon1Player1(String type) {

        String pathType = "";
        switch (type) {

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
                pathType = "imagenes/electrico.png";
                break;
            case "lucha":
                pathType = "imagenes/lucha.png";
                break;
            case "hada":
                pathType = "imagenes/hada.png";
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

    /**
     * metodo para establecer el nombre del primer ataque del pokemon en batalla
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack1PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[0];
                    /**
                     * almacenamos el nombre
                     */
                    name = attack.getName();
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
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return name;

    }

    /**
     * Metodo para escoger el color del fondo del ataque del pokemon
     *
     * @param players el hashmap de los jugadores
     * @return el color de fondo
     */
    public static Color getColorAttack1PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[0];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();

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
         * retorna un metodo que devuelve el color  según el tipo
         */
        return chooseColorAttacksPokemonPlayer1(type.toLowerCase());

    }

    /**
     * metodo para escoger el color de fondo del ataque 1 del pokemon en batalla
     *
     * @param type el tipo del ataque
     * @return el color correspondiente
     */
    private static Color chooseColorAttacksPokemonPlayer1(String type) {

        Color colorAttack = Color.BLUE;
        switch (type) {

            case "bicho":
                colorAttack = Color.GREEN.brighter();
                break;
            case "siniestro":
                colorAttack = Color.MAGENTA.darker();
                break;
            case "dragon":
                colorAttack = Color.BLUE.brighter();
                break;
            case "electrico":
                colorAttack = Color.YELLOW;
                break;
            case "lucha":
                colorAttack = Color.ORANGE;
                break;
            case "hada":
                colorAttack = Color.PINK;
                break;
            case "fuego":
                colorAttack = Color.RED;
                break;
            case "volador":
                colorAttack = Color.CYAN;
                break;
            case "fantasma":
                colorAttack = Color.MAGENTA.darker().darker();
                break;
            case "planta":
                colorAttack = Color.GREEN;
                break;
            case "tierra":
                colorAttack = Color.ORANGE.darker();
                break;
            case "hielo":
                colorAttack = Color.CYAN.brighter();
                break;
            case "normal":
                colorAttack = Color.GRAY.brighter();
                break;
            case "veneno":
                colorAttack = Color.PINK.darker();
                break;
            case "psiquico":
                colorAttack = Color.MAGENTA;
                break;
            case "roca":
                colorAttack = Color.GRAY.darker();
                break;
            case "acero":
                colorAttack = Color.GRAY;
                break;
            case "agua":
                colorAttack = Color.BLUE;
                break;

        }
        return colorAttack;
    }

//---------------------------------xAtaque numero 2 ---------------------------//

    /**
     * metodo para pasar el path con el icono del segundo ataque del pokemon del jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack2PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[1];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();
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
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return chooseAttackIconPokemon1Player1(type.toLowerCase());

    }

    /**
     * metodo para establecer el nombre del segundo ataque del pokemon en batalla
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack2PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[1];
                    /**
                     * almacenamos el nombre
                     */
                    name = attack.getName();
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
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return name;

    }

    /**
     * Metodo para escoger el color del fondo del segundo del pokemon
     *
     * @param players el hashmap de los jugadores
     * @return el color de fondo
     */
    public static Color getColorAttack2PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[1];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();

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
         * retorna un metodo que devuelve el color  según el tipo
         */
        return chooseColorAttacksPokemonPlayer1(type.toLowerCase());

    }


    //---------------------------------xAtaque numero 3 ---------------------------//

    /**
     * metodo para pasar el path con el icono del tercer ataque del pokemon del jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack3PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[2];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();
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
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return chooseAttackIconPokemon1Player1(type.toLowerCase());

    }

    /**
     * metodo para establecer el nombre del tercer ataque del pokemon en batalla
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack3PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[2];
                    /**
                     * almacenamos el nombre
                     */
                    name = attack.getName();
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
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return name;

    }

    /**
     * Metodo para escoger el color del fondo del tercer del pokemon
     *
     * @param players el hashmap de los jugadores
     * @return el color de fondo
     */
    public static Color getColorAttack3PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[2];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();

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
         * retorna un metodo que devuelve el color  según el tipo
         */
        return chooseColorAttacksPokemonPlayer1(type.toLowerCase());

    }

    //---------------------------------xAtaque numero 3 ---------------------------//

    /**
     * metodo para pasar el path con el icono del cuarto ataque del pokemon del jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack4PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[3];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();
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
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return chooseAttackIconPokemon1Player1(type.toLowerCase());

    }

    /**
     * metodo para establecer el nombre del cuarto ataque del pokemon en batalla
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack4PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[3];
                    /**
                     * almacenamos el nombre
                     */
                    name = attack.getName();
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
         * retorna un metodo que devuelve el path con la imagen del icono según el tipo
         */
        return name;

    }

    /**
     * Metodo para escoger el color del fondo del cuarto del pokemon
     *
     * @param players el hashmap de los jugadores
     * @return el color de fondo
     */
    public static Color getColorAttack4PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
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
                     * iniciamos una variable de tipo ataques pokemon para recoger el array
                     */
                    AttacksPokemons attack = firstPokemon.getAttacks()[3];
                    /**
                     * almacenamos el tipo
                     */
                    type = attack.getType();

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
         * retorna un metodo que devuelve el color  según el tipo
         */
        return chooseColorAttacksPokemonPlayer1(type.toLowerCase());

    }

    //-------------------------Cambios de Pokemon-------------------------//


    /**
     * metodo para obtener el path del icono del  pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getPathPokemon1Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el path del icono del pokemon
         */
        String pathIconPokemon = "";
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
                     * almacenamos el path
                     */
                    pathIconPokemon = "imagenes/" + firstPokemon.getName().toLowerCase() + ".png";

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
         * retorna el path con el icono del pokemon
         */
        return pathIconPokemon;

    }

    /**
     * metodo para obtener el nombre del primer pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getNamePokemon1Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del pokemon
         */
        String namePokemon = "";
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
                     * almacenamos el nombre del pokemon
                     */
                    namePokemon = firstPokemon.getName();

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
         * retorna el nombre del pokemon
         */
        return namePokemon;

    }

    /**
     * metodo para obtener el path del icono del  pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getPathPokemon2Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el path del icono del pokemon
         */
        String pathIconPokemon = "";
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
                     * almacenamos el path
                     */
                    pathIconPokemon = "imagenes/" + secondPokemon.getName().toLowerCase() + ".png";

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
         * retorna el path con el icono del pokemon
         */
        return pathIconPokemon;

    }

    /**
     * metodo para obtener el nombre del segundo pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getNamePokemon2Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del pokemon
         */
        String namePokemon = "";
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
                     * almacenamos el nombre del pokemon
                     */
                    namePokemon = secondPokemon.getName();

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
         * retorna el nombre del pokemon
         */
        return namePokemon;

    }

    /**
     * metodo para obtener el path del icono del  pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getPathPokemon3Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el path del icono del pokemon
         */
        String pathIconPokemon = "";
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
                    PokemonProperties thirdPokemon = (PokemonProperties) pokemons.get(2);
                    /**
                     * almacenamos el path
                     */
                    pathIconPokemon = "imagenes/" + thirdPokemon.getName().toLowerCase() + ".png";

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
         * retorna el path con el icono del pokemon
         */
        return pathIconPokemon;

    }

    /**
     * metodo para obtener el nombre del tercer pokemon escogido por el jugador 1
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del pokemon
     */
    public static String getNamePokemon3Player1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del pokemon
         */
        String namePokemon = "";
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
                     * hacemos un objeto de pokemons y decimos que es igual al tercer elemento de la lista de pokemons
                     */
                    PokemonProperties thirdPokemon = (PokemonProperties) pokemons.get(2);
                    /**
                     * almacenamos el nombre del pokemon
                     */
                    namePokemon = thirdPokemon.getName();

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
         * retorna el nombre del pokemon
         */
        return namePokemon;

    }

    //-------------------------Pulsas un boton y cambias de pokemon-------------------------//

    /**
     * metodo para establecer el nuevo logo del pokemon al cambio
     * @return
     */
    public static String newPathIconPokemon1Player1() {
        String pathIcon = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1())) {

                    /**
                     * nuevo path
                     */
                    pathIcon = "imagenes/" + getNameOfThePokemonPlayer1().toLowerCase() + ".png";
                }

            }


        }


        /**
         * devolvemos el path
         */
     return pathIcon;
    }

    /**
     * metodo para poner el nuevo nombre del primer ataque del pokemon
     * @return el nuevo nombre del primer ataque
     */
    public static String newNameAttack1Pokemon1Player1() {
        String nameAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack1 = attakc1.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack1;
    }

    /**
     * metodo para cambiar el icono del ataque 1 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType1Attack1Player1() {
        String typeAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack1 = attakc1.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack1.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 1 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor1Pokemon1Player1() {
        String typeAttack1 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 0 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc1 = pokemon1.getAttacks()[0];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack1 = attakc1.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack1.toLowerCase());
    }
    /**
     * metodo para poner el nuevo nombre del segundo ataque del pokemon
     * @return el nuevo nombre del primer ataque
     */
    public static String newNameAttack2Pokemon1Player1() {
        String nameAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el nombre
                     */
                    nameAttack2 = attakc2.getName();
                }

            }


        }


        /**
         * devolvemos el nuevo nombre
         */
        return nameAttack2;
    }

    /**
     * metodo para cambiar el icono del ataque 2 del pokemon cambiado
     * @return el nuevo icono
     */
    public static String newType1Attack2Player1() {
        String typeAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack2 = attakc2.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo icono del tipo
         */
        return chooseAttackIconPokemon1Player1(typeAttack2.toLowerCase());
    }

    /**
     * metodo para cambiar el color del ataque 2 del pokemon cambiado
     * @return el nuevo color
     */
    public static Color newColor2Pokemon1Player1() {
        String typeAttack2 = "";
        /**
         * recorremos el array de objetos pokemons
         */
        for (Object obj : MethosInterfaceSelectionPokemon.getPokemonsPLayer1()) {
            /**
             * si es una instancia de los pokemons, se mete en la condicion
             */
            if (obj instanceof PokemonProperties) {
                PokemonProperties pokemon1 = (PokemonProperties) obj;
                /**
                 * si el nombre es igual al nombre del boton del pokemon se mete en la condicion
                 */
                if (pokemon1.getName().equalsIgnoreCase(getNameOfThePokemonPlayer1())) {

                    /**
                     * iniciamos un objeto de tipo ataques pokemon que será igual a la
                     * posicion 1 del array de ataques del pokemon
                     */
                    AttacksPokemons attakc2 = pokemon1.getAttacks()[1];
                    /**
                     * obtenemos el tipo del primer ataque
                     */
                    typeAttack2 = attakc2.getType();
                }

            }


        }


        /**
         * devolvemos el nuevo color del ataque
         */
        return chooseColorAttacksPokemonPlayer1(typeAttack2.toLowerCase());
    }

    /**
     * metodos para obtener el texto del boton de los pokemons
     * @return el texto de los pokemons
     */
    private static String getNameOfThePokemonPlayer1 () {

        return ButtonInterfaceChangePokemon.getPokemon1team().getText();
    }
    private static String getNameOfThePokemonPlayer1Pokemon2 () {

        return ButtonInterfaceChangePokemon.getPokemon2team().getText();
    }
    private static String getNameOfThePokemonPlayer1Pokemon3 () {

        return ButtonInterfaceChangePokemon.getPokemon3team().getText();
    }
}
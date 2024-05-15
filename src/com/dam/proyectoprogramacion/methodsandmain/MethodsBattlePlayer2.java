package com.dam.proyectoprogramacion.methodsandmain;

import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer2Luck;
import com.dam.proyectoprogramacion.pokemon.AttacksPokemons;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * clase con los metodos para la batalla del jugador 2
 * @author cristian
 * @version v3.0
 */
public class MethodsBattlePlayer2 {

    /**
     * metodo que recorre un hashmap y busca el primer pokemon escogido por el jugador 2
     * @param players el hashmap de los jugadores
     * @return el path con la imagen del pokemon seleccionado
     */
    public static String putImageAttackButtonPlayer2(HashMap<String, ArrayList<Object>> players){

        String pathImagePokemon="";
        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();
        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si encuentra la clave, entra en la condicion
             */
            if (key.equals(aliasPlayer2)) {
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

    //---------------------------------xAtaque numero 1 ---------------------------//

    /**
     * metodo para pasar el path con el icono del primer ataque del pokemon del jugador 2
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack1PokemonInBattlePlayer2(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
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
        return chooseAttackIconPokemon1Player2(type.toLowerCase());

    }

    /**
     * metodo para escoger el icono del ataque según el tipo
     *
     * @param type el tipo del ataque
     * @return el path del icono
     */
    private static String chooseAttackIconPokemon1Player2(String type) {

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
     * metodo para establecer el nombre del primer ataque del pokemon en batalla del jugador 2
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack1PokemonInBattlePlayer2(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
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
     * Metodo para escoger el color del fondo del ataque del pokemon del jugador 2
     *
     * @param players el hashmap de los jugadores
     * @return el color de fondo
     */
    public static Color getColorAttack1PokemonInBattlePlayer2(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer2)) {
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
        return chooseColorAttacksPokemonPlayer2(type.toLowerCase());

    }

    /**
     * metodo para escoger el color de fondo del ataque 1 del pokemon en batalla
     *
     * @param type el tipo del ataque
     * @return el color correspondiente
     */
    private static Color chooseColorAttacksPokemonPlayer2(String type) {

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
     * metodo para pasar el path con el icono del segundo ataque del pokemon del jugador 2
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack2PokemonInBattlePlayer2(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
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
        return chooseAttackIconPokemon1Player2(type.toLowerCase());

    }

    /**
     * metodo para establecer el nombre del segundo ataque del pokemon en batalla
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack2PokemonInBattlePlayer2(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
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
    public static Color getColorAttack2PokemonInBattlePlayer2(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {

            if (key.equals(aliasPlayer2)) {
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
        return chooseColorAttacksPokemonPlayer2(type.toLowerCase());

    }
    //---------------------------------xAtaque numero 3 ---------------------------//

    /**
     * metodo para pasar el path con el icono del tercer ataque del pokemon del jugador 2
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack3PokemonInBattlePlayer2(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
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
        return chooseAttackIconPokemon1Player2(type.toLowerCase());

    }

    /**
     * metodo para establecer el nombre del tercer ataque del pokemon en batalla del jugador 2
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack3PokemonInBattlePlayer2(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
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
     * Metodo para escoger el color del fondo del tercer del pokemon del jugador 2
     *
     * @param players el hashmap de los jugadores
     * @return el color de fondo
     */
    public static Color getColorAttack3PokemonInBattlePlayer2(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
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
        return chooseColorAttacksPokemonPlayer2(type.toLowerCase());

    }

    //---------------------------------xAtaque numero 4 ---------------------------//

    /**
     * metodo para pasar el path con el icono del cuarto ataque del pokemon del jugador 2
     *
     * @param players el hashmap de los jugadores
     * @return el path con el icono
     */
    public static String getTypeAttack4PokemonInBattlePlayer2(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el icono del ataque
         */
        String type = "";
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
        return chooseAttackIconPokemon1Player2(type.toLowerCase());

    }

    /**
     * metodo para establecer el nombre del cuarto ataque del pokemon en batalla del jugador 2
     *
     * @param players el hashmap de los jugadores
     * @return el nombre del primer ataque
     */
    public static String getNameAttack4PokemonInBattlePlayer1(HashMap<String, ArrayList<Object>> players) {
        /**
         * variable local para almacenar el nombre del ataque
         */
        String name = "";
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
     * Metodo para escoger el color del fondo del cuarto del pokemon del jugador 2
     *
     * @param players el hashmap de los jugadores
     * @return el color de fondo
     */
    public static Color getColorAttack4PokemonInBattlePlayer2(HashMap<String, ArrayList<Object>> players) {


        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();

        /**
         * for para recorrer el hashmap de los jugadores
         */
        String type = "";
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
        return chooseColorAttacksPokemonPlayer2(type.toLowerCase());

    }

}


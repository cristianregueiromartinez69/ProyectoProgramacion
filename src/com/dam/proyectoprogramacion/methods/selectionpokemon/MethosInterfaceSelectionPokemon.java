package com.dam.proyectoprogramacion.methods.selectionpokemon;

import com.dam.proyectoprogramacion.interfaces.SelectionPokemon;
import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePokemon;
import com.dam.proyectoprogramacion.methods.luck.MethodsInterfaceLuck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer2Luck;
import com.dam.proyectoprogramacion.panels.selectionpokemon.*;
import com.dam.proyectoprogramacion.pokemon.AttacksPokemons;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase con los metodos de la interfaz de seleccion de pokemons
 * @author cristian
 * @version v2.0
 */
public class MethosInterfaceSelectionPokemon {

    /**
     * atributo privado de tipo JPanel que nos ayudará a registrar uno a uno los pokemons escogidos por el jugador 1
     */
    private static JPanel panelPokemonsPlayer1 = makeContentPokemonPanel();
    private static JPanel panelPokemonsPlayer2 = makeContentPokemonPanel();


    /**
     * atributo privado de tipo Hashmap para almacenar el alias del jugador y sus pokemons
     */
    private static HashMap<String, ArrayList<Object>> playersBattle = new HashMap<>();
    /**
     * atributo privado de tipo ArrayList para almacenar los pokemons
     */
    private static ArrayList <Object> pokemonsPLayer1 = new ArrayList<>();
    private static ArrayList <Object> pokemonsPLayer2 = new ArrayList<>();

    /**
     * atributos privados de tipo boolean para saber si el pokemon ha sido escogido
     */
    private static boolean wasDrampaChoosen = false;
    private static boolean wasEmpoleonChoosen = false;
    private static boolean wasGarchompChoosen = false;
    private static boolean wasGengarChoosen = false;
    private static boolean wasInfernapeChoosen = false;
    private static boolean wasLucarioChoosen = false;
    private static boolean wasLuxrayChoosen = false;
    private static boolean wasMarshadowChoosen = false;
    private static boolean wasMiloticChoosen = false;
    private static boolean wasSnorlaxChoosen = false;
    private static boolean wasTinkatonChoosen = false;
    private static boolean wasTyranitarChoosen = false;





    /**
     * metodo para añadir a drampa al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelDrampaBothPlayers(){


        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de drampa
                 * añade el objeto drampa a la lista
                 */
                clearPanelPlayer1();

                panelPokemonsPlayer1.add(PanelsPokemonRow1.getDrampaPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject());

                /**
                 * si el ganador del sorteo coincide con el alias del jugador 1
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de drampa
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto drampa a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getDrampaPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());


            }
            /**
             * retornamos el nuevo panel con la informacion actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
               if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                   /**
                    * llama a un metodo que limpia el panel del jugador 2
                    * añade el panel de drampa
                    * añade el objeto drampa a la lista
                    */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getDrampaPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject());


            } /**
                * si el ganador del sorteo coincide con el alias del jugador 2
                * y el tamaño de la lista de los objetos de pokemons es igual que 2
                *  se mete en el codigo
                */
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                   /**
                    * llama a un metodo que limpia el panel del jugador 2
                    * añade el panel de drampa
                    * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                    * añade el objeto drampa a la lista
                    */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getDrampaPanel());

                   pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject());
                   /**
                    * añadimos la informacion al hashmap del jugador 2
                    */
                   putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer2);
                   /**
                    * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                    */
                   MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

               }
            /**
             * retornamos el nuevo panel con la informacion actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }


    /**
     * metodo para añadir a empoleon al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelEmpoleonBothPlayers(){

        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de empoleon
                 * añade el objeto empoleon a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getEmpoleonPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject());


                /**
                 * si el ganador del sorteo coincide con el alias del jugador 1
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de empoleon
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto empoleon a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getEmpoleonPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            /**
             * retornamos el nuevo panel con la informacion actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de empoleon
                 * añade el objeto empoleon a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getEmpoleonPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject());


            }
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es igual que 2
             *  se mete en el codigo
             */
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de empoleon
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto empoleon a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getEmpoleonPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer2);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            /**
             * retornamos el nuevo panel con la informacion actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a garchomp al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelGarchompBothPlayers(){

        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de garchomp
                 * añade el objeto garchomp a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getGarchompPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGarchompObject());


                /**
                 * si el ganador del sorteo coincide con el alias del jugador 1
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de garchomp
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto garchomp a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getGarchompPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGarchompObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de garchomp
                 * añade el objeto garchomp a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getGarchompPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGarchompObject());
                /**
                 * si el ganador del sorteo coincide con el alias del jugador 2
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de garchomp
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto garchomp a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getGarchompPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGarchompObject());
                /**
                 * añadimos la informacion al hashmap del jugador 2
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer2);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a gengar al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelGengarBothPlayers(){

        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {
            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de gengar
                 * añade el objeto gengar a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getGengarPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGengarObject());


                /**
                 * si el ganador del sorteo coincide con el alias del jugador 2
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de gengar
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto gengar a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getGengarPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGengarObject());

                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de gengar
                 * añade el objeto gengar a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getGengarPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGengarObject());

            }
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es igual que 2
             *  se mete en el codigo
             */
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de gengar
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto gengar a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getGengarPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGengarObject());
                /**
                 * añadimos la informacion al hashmap del jugador 2
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer2);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a infernape al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelInfernapeBothPlayers(){

        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {
            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de infernape
                 * añade el objeto infernape a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getInfernapePanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeInfernapeObject());

                /**
                 * si el ganador del sorteo coincide con el alias del jugador 1
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de infernape
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto infernape a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getInfernapePanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeInfernapeObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }

        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de infernape
                 * añade el objeto infernape a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getInfernapePanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeInfernapeObject());

            }
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es igual que 2
             *  se mete en el codigo
             */
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de infernape
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto infernape a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getInfernapePanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeInfernapeObject());
                /**
                 * añadimos la informacion al hashmap del jugador 2
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer2);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a lucario al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelLucarioBothPlayers(){
        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de lucario
                 * añade el objeto lucario a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getLucarioPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject());

                /**
                 * si el ganador del sorteo coincide con el alias del jugador 1
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de lucario
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto lucario a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getLucarioPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de lucario
                 * añade el objeto lucario a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getLucarioPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject());

            }
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es igual que 2
             *  se mete en el codigo
             */
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de lucario
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto lucario a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getLucarioPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject());
                /**
                 * añadimos la informacion al hashmap del jugador 2
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a luxray al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelLuxrayBothPlayers(){
        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {
            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de luxray
                 * añade el objeto luxray a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getLuxrayPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLuxrayObject());

                /**
                 * si el ganador del sorteo coincide con el alias del jugador 1
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de luxray
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto luxray a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getLuxrayPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLuxrayObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de luxray
                 * añade el objeto luxray a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getLuxrayPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLuxrayObject());

            }
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es igual que 2
             *  se mete en el codigo
             */
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de luxray
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto luxray a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getLuxrayPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLuxrayObject());
                /**
                 * añadimos la informacion al hashmap del jugador 2
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer2);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a marshadow al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelMarshadowBothPlayers(){
        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {
            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de marshadow
                 * añade el objeto marshadow a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getMarshadowPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMarshadowObject());

                /**
                 * si el ganador del sorteo coincide con el alias del jugador 1
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de marshadow
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto marshadow a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getMarshadowPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMarshadowObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de marshadow
                 * añade el objeto marshadow a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getMarshadowPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMarshadowObject());

            }
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es igual que 2
             *  se mete en el codigo
             */
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de marshadow
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto marshadow a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getMarshadowPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMarshadowObject());
                /**
                 * añadimos la informacion al hashmap del jugador 2
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer2);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a milotic al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelMiloticBothPlayers(){
        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {
            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de milotic
                 * añade el objeto milotic a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getMiloticPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMiloticObject());

                /**
                 * si el ganador del sorteo coincide con el alias del jugador 1
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de milotic
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto milotic a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getMiloticPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMiloticObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de milotic
                 * añade el objeto milotic a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getMiloticPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMiloticObject());

            }
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es igual que 2
             *  se mete en el codigo
             */
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de milotic
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto milotic a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getMiloticPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMiloticObject());
                /**
                 * añadimos la informacion al hashmap del jugador 2
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer2);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a snorlax al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelSnorlaxBothPlayers(){

        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {
            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de snorlax
                 * añade el objeto snorlax a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getSnorlaxPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeSnorlaxObject());

                /**
                 * si el ganador del sorteo coincide con el alias del jugador 1
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de snorlax
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto snorlax a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getSnorlaxPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeSnorlaxObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de snorlax
                 * añade el objeto snorlax a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getSnorlaxPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeSnorlaxObject());

            }
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es igual que 2
             *  se mete en el codigo
             */
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de snorlax
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto snorlax a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getSnorlaxPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeSnorlaxObject());
                /**
                 * añadimos la informacion al hashmap del jugador 2
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer2);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }
    }
    /**
     * metodo para añadir a tinkaton al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelTinkatonBothPlayers(){
        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {
            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de tinkaton
                 * añade el objeto tinkaton a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getTinkatonPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject());
                /**
                 * si el ganador del sorteo coincide con el alias del jugador 1
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de tinkaton
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto tinkaton a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getTinkatonPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de tinkaton
                 * añade el objeto tinkaton a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getTinkatonPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject());

            }
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es igual que 2
             *  se mete en el codigo
             */
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de tinkaton
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto tinkaton a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getTinkatonPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject());
                /**
                 * añadimos la informacion al hashmap del jugador 2
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer2);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }
    }
    /**
     * metodo para añadir a tyranitar al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelTyranitarBothPlayers(){

        /**
         * si el ganador del sorteo coincide con el alias del jugador 1 se mete en el codigo
         */
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {
            /**
             * si el ganador del sorteo coincide con el alias del jugador 1
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de tyranitar
                 * añade el objeto tyranitar a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getTyranitarPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTyranitarObject());

                /**
                 * si el ganador del sorteo coincide con el alias del jugador 1
                 * y el tamaño de la lista de los objetos de pokemons es igual que 2
                 *  se mete en el codigo
                 */
            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                /**
                 * llama a un metodo que limpia el panel del jugador 1
                 * añade el panel de tyranitar
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto tyranitar a la lista
                 */
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getTyranitarPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTyranitarObject());
                /**
                 * añadimos la informacion al hashmap del jugador 1
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer1);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 2
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es menor que 2
             *  se mete en el codigo
             */
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de tyranitar
                 * añade el objeto tyranitar a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getTyranitarPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTyranitarObject());

            }
            /**
             * si el ganador del sorteo coincide con el alias del jugador 2
             * y el tamaño de la lista de los objetos de pokemons es igual que 2
             *  se mete en el codigo
             */
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                /**
                 * llama a un metodo que limpia el panel del jugador 2
                 * añade el panel de tyranitar
                 * añade al final un tick verde en señal de que ha introducido correctamnete los pokemons
                 * añade el objeto tyranitar a la lista
                 */
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getTyranitarPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTyranitarObject());
                /**
                 * añadimos la informacion al hashmap del jugador 2
                 */
                putPlayersAndPokemons(MethodsInterfaceLuck.getAliasWinnerLuck(), pokemonsPLayer2);
                /**
                 * cambiamos el valor del ganador del sorteo para que ahora le toque al jugador 1
                 */
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            /**
             * retornamos el panel con la información actualizada
             */
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }
    }

    /**
     * metodo para añadir valores al hashmap de pokemons con vida  del jugador 1
     * @return el alias del jugador 1
     */
    public static void addLifePokemonsPlayer1(String aliasPlayer1){
        /**
         * recorremos el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si el alias del jugador 1 coincide con la clave del hashmap de jugadores
             * se mete en el codigo
             */
            if (key.equals(aliasPlayer1)) {

                /**
                 * si hay coincidencia, hacemos un arraylist de objetos igual al valor del hashmao
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * recorremos el arraylist de objetos
                     */
                    for (Object pokemon : pokemons) {
                        PokemonProperties auxPokemons = (PokemonProperties) pokemon;
                        /**
                         * añadimos los valores al hashmap de los pokemons con vida
                         */
                        String namePokemon = auxPokemons.getName().toLowerCase();
                        int lifePokemon = auxPokemons.getLife();
                        MethodsBattlePokemon.putValuesLifePokemonsPlayer1(namePokemon, lifePokemon);
                    }
                    break;
                }
            }
        }
    }
    /**
     * metodo para añadir valores al hashmap de pokemons con vida  del jugador 2
     * @return el alias del jugador 2
     */
    public static void addLifePokemonsPlayer2(String aliasPlayer2){
        /**
         * recorremos el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si el alias del jugador 1 coincide con la clave del hashmap de jugadores
             * se mete en el codigo
             */
            if (key.equals(aliasPlayer2)) {

                /**
                 * si hay coincidencia, hacemos un arraylist de objetos igual al valor del hashmao
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {

                    /**
                     * recorremos el arraylist de objetos
                     */
                    for (Object pokemon : pokemons) {
                        PokemonProperties auxPokemons = (PokemonProperties) pokemon;
                        /**
                         * añadimos los valores al hashmap de los pokemons con vida
                         */
                        String namePokemon = auxPokemons.getName().toLowerCase();
                        int lifePokemon = auxPokemons.getLife();
                        MethodsBattlePokemon.putValuesLifePokemonsPlayer2(namePokemon, lifePokemon);
                    }
                    break;
                }
            }
        }
    }


    /**
     * metodo para añadir valores al hashmap de los participantes en la batalla pokemon
     * @param alias el alias del jugador
     * @param pokemons los pokemons escogidos por el jugador
     */
    public static void putPlayersAndPokemons(String alias, ArrayList <Object> pokemons){
        playersBattle.put(alias, pokemons);
    }


    /**
     * metodo que reordena el panel del jugador 1 añadiendo 2 cosas:
     * 1. la imagen y el alias del jugador 1
     * los pokemons que va escogiendo el jugador 1
     * @param panelPokemon el Jpanel que va añadiendo el jugador 1
     * @return el panel del jugador 1
     */
    private static JPanel addSelectedPokemonPanelPlayer1(JPanel panelPokemon) {
        JPanel auxPanelAliasAndPokemon1 = new JPanel();
        SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
        SelectionPokemon.getGlobalPanelPlayer1().add(panelPokemon);
        auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());
        return auxPanelAliasAndPokemon1;
    }
    /**
     * metodo que reordena el panel del jugador 2 añadiendo 2 cosas:
     * 1. la imagen y el alias del jugador 2
     * los pokemons que va escogiendo el jugador 2
     * @param panelPokemon el Jpanel que va añadiendo el jugador 2
     * @return el panel del jugador 2
     */
    private static JPanel addSelectedPokemonPanelPlayer2(JPanel panelPokemon) {
        JPanel auxPanelAliasAndPokemon2 = new JPanel();
        SelectionPokemon.getGlobalPanelPlayer2().add(MethodsInterfaceLuck.selectAliasImagePlayer2());
        SelectionPokemon.getGlobalPanelPlayer2().add(panelPokemon);
        auxPanelAliasAndPokemon2.add(SelectionPokemon.getGlobalPanelPlayer2());
        return auxPanelAliasAndPokemon2;
    }

    /**
     * metodo que limpia el panel del jugador 1
     */
    private static void clearPanelPlayer1() {
        SelectionPokemon.getGlobalPanelPlayer1().removeAll();
        SelectionPokemon.getGlobalPanelPlayer1().revalidate();
        SelectionPokemon.getGlobalPanelPlayer1().repaint();
    }
    /**
     * metodo que limpia el panel del jugador 2
     */
    private static void clearPanelPlayer2() {
        SelectionPokemon.getGlobalPanelPlayer2().removeAll();
        SelectionPokemon.getGlobalPanelPlayer2().revalidate();
        SelectionPokemon.getGlobalPanelPlayer2().repaint();
    }

    /**
     * metodo booleano para comprobar si se han seleccionado tres pokemons para el jugador 1
     * @return true si se han seleccionado 3, false si no se han seleccionado aun 3
     */
    private static  boolean  checkSizeListPokemonsPLayer1(){

        return pokemonsPLayer1.size() < 2;
    }
    /**
     * metodo booleano para comprobar si se han seleccionado tres pokemons para el jugador 2
     * @return true si se han seleccionado 3, false si no se han seleccionado aun 3
     */
    private static  boolean  checkSizeListPokemonsPLayer2(){

        return pokemonsPLayer2.size() < 2;
    }

    /**
     * metodo que crea el panel dle jugador 1
     * @return el panel creado
     */
    private static JPanel makeContentPokemonPanel(){
        JPanel panelGroupPokemons = new JPanel();
        panelGroupPokemons.setLayout(new BoxLayout(panelGroupPokemons, BoxLayout.Y_AXIS));
        return panelGroupPokemons;
    }

    /**
     * getter y setter de los atributos de la clase
     * @return los atributos correspondientes
     */
    public static ArrayList<Object> getPokemonsPLayer1() {
        return pokemonsPLayer1;
    }

    public static void setPokemonsPLayer1(ArrayList<Object> pokemonsPLayer1) {
        MethosInterfaceSelectionPokemon.pokemonsPLayer1 = pokemonsPLayer1;
    }

    public static ArrayList<Object> getPokemonsPLayer2() {
        return pokemonsPLayer2;
    }

    public static void setPokemonsPLayer2(ArrayList<Object> pokemonsPLayer2) {
        MethosInterfaceSelectionPokemon.pokemonsPLayer2 = pokemonsPLayer2;
    }

    public static HashMap<String, ArrayList<Object>> getPlayersBattle() {
        return playersBattle;
    }

    public static JPanel getPanelPokemonsPlayer1() {
        return panelPokemonsPlayer1;
    }

    public static void setPanelPokemonsPlayer1(JPanel panelPokemonsPlayer1) {
        MethosInterfaceSelectionPokemon.panelPokemonsPlayer1 = panelPokemonsPlayer1;
    }

    public static boolean isWasDrampaChoosen() {
        return wasDrampaChoosen;
    }

    public static void setWasDrampaChoosen(boolean wasDrampaChoosen) {
        MethosInterfaceSelectionPokemon.wasDrampaChoosen = wasDrampaChoosen;
    }

    public static boolean isWasEmpoleonChoosen() {
        return wasEmpoleonChoosen;
    }

    public static void setWasEmpoleonChoosen(boolean wasEmpoleonChoosen) {
        MethosInterfaceSelectionPokemon.wasEmpoleonChoosen = wasEmpoleonChoosen;
    }

    public static boolean isWasGarchompChoosen() {
        return wasGarchompChoosen;
    }

    public static void setWasGarchompChoosen(boolean wasGarchompChoosen) {
        MethosInterfaceSelectionPokemon.wasGarchompChoosen = wasGarchompChoosen;
    }

    public static boolean isWasGengarChoosen() {
        return wasGengarChoosen;
    }

    public static void setWasGengarChoosen(boolean wasGengarChoosen) {
        MethosInterfaceSelectionPokemon.wasGengarChoosen = wasGengarChoosen;
    }

    public static boolean isWasInfernapeChoosen() {
        return wasInfernapeChoosen;
    }

    public static void setWasInfernapeChoosen(boolean wasInfernapeChoosen) {
        MethosInterfaceSelectionPokemon.wasInfernapeChoosen = wasInfernapeChoosen;
    }

    public static boolean isWasLucarioChoosen() {
        return wasLucarioChoosen;
    }

    public static void setWasLucarioChoosen(boolean wasLucarioChoosen) {
        MethosInterfaceSelectionPokemon.wasLucarioChoosen = wasLucarioChoosen;
    }

    public static boolean isWasLuxrayChoosen() {
        return wasLuxrayChoosen;
    }

    public static void setWasLuxrayChoosen(boolean wasLuxrayChoosen) {
        MethosInterfaceSelectionPokemon.wasLuxrayChoosen = wasLuxrayChoosen;
    }

    public static boolean isWasMarshadowChoosen() {
        return wasMarshadowChoosen;
    }

    public static void setWasMarshadowChoosen(boolean wasMarshadowChoosen) {
        MethosInterfaceSelectionPokemon.wasMarshadowChoosen = wasMarshadowChoosen;
    }

    public static boolean isWasMiloticChoosen() {
        return wasMiloticChoosen;
    }

    public static void setWasMiloticChoosen(boolean wasMiloticChoosen) {
        MethosInterfaceSelectionPokemon.wasMiloticChoosen = wasMiloticChoosen;
    }

    public static boolean isWasSnorlaxChoosen() {
        return wasSnorlaxChoosen;
    }

    public static void setWasSnorlaxChoosen(boolean wasSnorlaxChoosen) {
        MethosInterfaceSelectionPokemon.wasSnorlaxChoosen = wasSnorlaxChoosen;
    }

    public static boolean isWasTinkatonChoosen() {
        return wasTinkatonChoosen;
    }

    public static void setWasTinkatonChoosen(boolean wasTinkatonChoosen) {
        MethosInterfaceSelectionPokemon.wasTinkatonChoosen = wasTinkatonChoosen;
    }

    public static boolean isWasTyranitarChoosen() {
        return wasTyranitarChoosen;
    }

    public static void setWasTyranitarChoosen(boolean wasTyranitarChoosen) {
        MethosInterfaceSelectionPokemon.wasTyranitarChoosen = wasTyranitarChoosen;
    }
}

package com.dam.proyectoprogramacion.methodsandmain;

import com.dam.proyectoprogramacion.interfaces.SelectionPokemon;
import com.dam.proyectoprogramacion.panels.selectionpokemon.JLabelsPokemons;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow1;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow2;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow3;
import com.dam.proyectoprogramacion.pokemon.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    private static HashMap<String, ArrayList> playersBattle = new HashMap<>();
    private static ArrayList <Object> pokemonsPLayer1 = new ArrayList<>();
    private static ArrayList <Object> pokemonsPLayer2 = new ArrayList<>();

    /**
     * atributos privados de tipo pokemons que los haremos igual a los metodos que construyen los objetos
     */
    private static Drampa drampa;
    private static Empoleon empoleon;
    private static Garchomp garchomp;
    private static Gengar gengar;
    private static Infernape infernape;
    private static Lucario lucario;
    private static Luxray luxray;
    private static Marshadow marshadow;
    private static Milotic milotic;
    private static Snorlax snorlax;
    private static Tinkaton tinkaton;
    private static Tyranitar tyranitar;


    /**
     * metodo para añadir a drampa al panel dle jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelDrampaPlayer1(){

        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
        panelPokemonsPlayer1.add(PanelsPokemonRow1.getDrampaPanel());

        /**
         * devolvemos el nuevo panel creado
         */
    return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }


    /**
     * metodo para añadir a empoleon al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelEmpoleonPlayer1(){
        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
         panelPokemonsPlayer1.add(PanelsPokemonRow1.getEmpoleonPanel());

        /**
         * devolvemos el nuevo panel creado
         */
        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    /**
     * metodo para añadir a garchomp al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelGarchompPlayer1(){
        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
         panelPokemonsPlayer1.add(PanelsPokemonRow1.getGarchompPanel());
        /**
         * devolvemos el nuevo panel creado
         */
        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    /**
     * metodo para añadir a gengar al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelGengarPlayer1(){
        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
        panelPokemonsPlayer1.add(PanelsPokemonRow1.getGengarPanel());
        /**
         * devolvemos el nuevo panel creado
         */
        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    /**
     * metodo para añadir a infernape al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelInfernapePlayer1(){
        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
         panelPokemonsPlayer1.add(PanelsPokemonRow2.getInfernapePanel());
        /**
         * devolvemos el nuevo panel creado
         */
        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    /**
     * metodo para añadir a lucario al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelLucarioPlayer1(){
        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
         panelPokemonsPlayer1.add(PanelsPokemonRow2.getLucarioPanel());

        /**
         * devolvemos el nuevo panel creado
         */
        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    /**
     * metodo para añadir a luxray al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelLuxrayPlayer1(){

        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
         panelPokemonsPlayer1.add(PanelsPokemonRow2.getLuxrayPanel());
        /**
         * devolvemos el nuevo panel creado
         */
        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    /**
     * metodo para añadir a marshadow al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelMarshadowPlayer1(){
        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
         panelPokemonsPlayer1.add(PanelsPokemonRow2.getMarshadowPanel());

        /**
         * devolvemos el nuevo panel creado
         */
        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    /**
     * metodo para añadir a milotic al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelMiloticPlayer1(){
        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
         panelPokemonsPlayer1.add(PanelsPokemonRow3.getMiloticPanel());
        /**
         * devolvemos el nuevo panel creado
         */
        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    /**
     * metodo para añadir a snorlax al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelSnorlaxPlayer1(){

        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
         panelPokemonsPlayer1.add(PanelsPokemonRow3.getSnorlaxPanel());
        /**
         * devolvemos el nuevo panel creado
         */
        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    /**
     * metodo para añadir a tinkaton al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelTinkatonPlayer1(){

        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
         panelPokemonsPlayer1.add(PanelsPokemonRow3.getTinkatonPanel());
        /**
         * devolvemos el nuevo panel creado
         */
        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    /**
     * metodo para añadir a tyranitar al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelTyranitarPlayer1(){

        /**
         * este es un metodo que limpia el panel del jugador 1
         */
        clearPanelPlayer1();
        /**
         * añadimos el pokemon correspondiente
         */
         panelPokemonsPlayer1.add(PanelsPokemonRow3.getTyranitarPanel());
        /**
         * devolvemos el nuevo panel creado
         */
        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }

    /**
     * metodo que reordena el panel del jugador 1 añadiendo 2 cosas:
     * 1. la imagen y el alias del jugador 1
     * los pokemons que va escogiendo el jugador 1
     * @param panelPokemon el Jpanel que va añadiendo el jugador 1
     * @return el panel del jugador 1
     */
    private static JPanel addSelectedPokemonPanel(JPanel panelPokemon) {
        JPanel auxPanelAliasAndPokemon1 = new JPanel();
        SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
        auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());
        SelectionPokemon.getGlobalPanelPlayer1().add(panelPokemon);
        return auxPanelAliasAndPokemon1;
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
     * metodo que crea el panel dle jugador 1
     * @return el panel creado
     */
    private static JPanel makeContentPokemonPanel(){
        JPanel panelGroupPokemons = new JPanel();
        panelGroupPokemons.setLayout(new BoxLayout(panelGroupPokemons, BoxLayout.Y_AXIS));
        return panelGroupPokemons;
    }

    private static String chossingFirstPokemons(String winnerLuck){
        String firstTrainer = "";
        for(String name:MethodsInterfaceLuck.getLuckPlayers().keySet()){
            if(winnerLuck.equalsIgnoreCase(name)){
                firstTrainer = winnerLuck;
            }
        }
        return firstTrainer;
    }

}

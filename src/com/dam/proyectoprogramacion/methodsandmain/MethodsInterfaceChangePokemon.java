package com.dam.proyectoprogramacion.methodsandmain;

import javax.swing.*;

/**
 * clase con los metodos de la interfaz de cambio de pokemons
 * @author cristian
 * @version v1.0
 */
public class MethodsInterfaceChangePokemon {

    /**
     * atributos privados finales de tipo String con los nombres de los pokemons
     */
    private final static String DRAMPA = "drampa";
    private final static String EMPOLEON = "empoleon";
    private final static String GARCHOMP = "garchomp";
    private final static String GENGAR = "gengar";
    private final static String INFERNAPE = "infernape";
    private final static String LUCARIO = "lucario";
    private final static String LUXRAY = "luxray";
    private final static String MARSHADOW = "marshadow";
    private final static String MILOTIC = "milotic";
    private final static String SNORLAX = "snorlax";
    private final static String TINKATON = "tinkaton";
    private final static String TYRANITAR = "tyranitar";

    /**
     * metodo para escribir el nombre de los pokemons en los botones de cambio de pokemons
     * @param namePokemon1Team el nombre del 1º pokemon del equipo de cada jugador
     * @return el nombre del pokemon para meterlo en el boton correspondiente
     */
    public static String getNameChangePokemon1Team(String namePokemon1Team){

        switch (namePokemon1Team){
            case DRAMPA -> {
                return DRAMPA;
            }
            case EMPOLEON -> {
                return EMPOLEON;
            }
            case GARCHOMP -> {
                return GARCHOMP;
            }
            case GENGAR -> {
                return GENGAR;
            }
            case INFERNAPE -> {
                return INFERNAPE;
            }
            case LUCARIO -> {
                return LUCARIO;
            }
            case LUXRAY -> {
                return LUXRAY;
            }
            case MARSHADOW -> {
                return MARSHADOW;
            }
            case MILOTIC -> {
                return MILOTIC;
            }
            case SNORLAX -> {
                return SNORLAX;
            }
            case TINKATON -> {
                return TINKATON;
            }
            case TYRANITAR -> {
                return TYRANITAR;
            }
            /**
             * si no recibe nada, devolverá un null
             */
            default -> {
                return null;
            }

        }
    }
    /**
     * metodo para escribir el nombre de los pokemons en los botones de cambio de pokemons
     * @param namePokemon2Team el nombre del 2º pokemon del equipo de cada jugador
     * @return el nombre del pokemon para meterlo en el boton correspondiente
     */
    public static String getNameChangePokemon2Team(String namePokemon2Team){

        switch (namePokemon2Team){
            case DRAMPA -> {
                return DRAMPA;
            }
            case EMPOLEON -> {
                return EMPOLEON;
            }
            case GARCHOMP -> {
                return GARCHOMP;
            }
            case GENGAR -> {
                return GENGAR;
            }
            case INFERNAPE -> {
                return INFERNAPE;
            }
            case LUCARIO -> {
                return LUCARIO;
            }
            case LUXRAY -> {
                return LUXRAY;
            }
            case MARSHADOW -> {
                return MARSHADOW;
            }
            case MILOTIC -> {
                return MILOTIC;
            }
            case SNORLAX -> {
                return SNORLAX;
            }
            case TINKATON -> {
                return TINKATON;
            }
            case TYRANITAR -> {
                return TYRANITAR;
            }
            /**
             * si no recibe nada, devolverá un null
             */
            default -> {
                return null;
            }

        }
    }
    /**
     * metodo para escribir el nombre de los pokemons en los botones de cambio de pokemons
     * @param namePokemon3Team el nombre del 3º pokemon del equipo de cada jugador
     * @return el nombre del pokemon para meterlo en el boton correspondiente
     */
    public static String getNameChangePokemon3Team(String namePokemon3Team){

        switch (namePokemon3Team){
            case DRAMPA -> {
                return DRAMPA;
            }
            case EMPOLEON -> {
                return EMPOLEON;
            }
            case GARCHOMP -> {
                return GARCHOMP;
            }
            case GENGAR -> {
                return GENGAR;
            }
            case INFERNAPE -> {
                return INFERNAPE;
            }
            case LUCARIO -> {
                return LUCARIO;
            }
            case LUXRAY -> {
                return LUXRAY;
            }
            case MARSHADOW -> {
                return MARSHADOW;
            }
            case MILOTIC -> {
                return MILOTIC;
            }
            case SNORLAX -> {
                return SNORLAX;
            }
            case TINKATON -> {
                return TINKATON;
            }
            case TYRANITAR -> {
                return TYRANITAR;
            }
            /**
             * si no recibe nada, devolverá un null
             */
            default -> {
                return null;
            }

        }
    }


    public static ImageIcon getImagePokemonTeam1(String namePokemonTeam1) {
        ImageIcon imagePokemon;
        switch (namePokemonTeam1) {
            case DRAMPA -> {
                return imagePokemon = new ImageIcon("imagenes/drampa.png");
            }
            case EMPOLEON -> {
                return imagePokemon = new ImageIcon("imagenes/empoleon.png");
            }
            case GARCHOMP -> {
                return imagePokemon = new ImageIcon("imagenes/garchomp.png");
            }
            case GENGAR -> {
                return imagePokemon = new ImageIcon("imagenes/gengar.png");
            }
            case INFERNAPE -> {
                return imagePokemon = new ImageIcon("imagenes/infernape.png");
            }
            case LUCARIO -> {
                return imagePokemon = new ImageIcon("imagenes/lucario.png");
            }
            case LUXRAY -> {
                return imagePokemon = new ImageIcon("imagenes/luxray.png");
            }
            case MARSHADOW -> {
                return imagePokemon = new ImageIcon("imagenes/marshadow.png");
            }
            case MILOTIC -> {
                return imagePokemon = new ImageIcon("imagenes/milotic.png");
            }
            case SNORLAX -> {
                return imagePokemon = new ImageIcon("imagenes/snorlax.png");
            }
            case TINKATON -> {
                return imagePokemon = new ImageIcon("imagenes/tinkaton.png");
            }
            case TYRANITAR -> {
                return imagePokemon = new ImageIcon("imagenes/tyranitar.png");
            }
            default -> {
                return imagePokemon = null;
            }
        }


    }
    public static ImageIcon getImagePokemonTeam2(String namePokemonTeam2) {
        ImageIcon imagePokemon;
        switch (namePokemonTeam2) {
            case DRAMPA -> {
                return imagePokemon = new ImageIcon("imagenes/drampa.png");
            }
            case EMPOLEON -> {
                return imagePokemon = new ImageIcon("imagenes/empoleon.png");
            }
            case GARCHOMP -> {
                return imagePokemon = new ImageIcon("imagenes/garchomp.png");
            }
            case GENGAR -> {
                return imagePokemon = new ImageIcon("imagenes/gengar.png");
            }
            case INFERNAPE -> {
                return imagePokemon = new ImageIcon("imagenes/infernape.png");
            }
            case LUCARIO -> {
                return imagePokemon = new ImageIcon("imagenes/lucario.png");
            }
            case LUXRAY -> {
                return imagePokemon = new ImageIcon("imagenes/luxray.png");
            }
            case MARSHADOW -> {
                return imagePokemon = new ImageIcon("imagenes/marshadow.png");
            }
            case MILOTIC -> {
                return imagePokemon = new ImageIcon("imagenes/milotic.png");
            }
            case SNORLAX -> {
                return imagePokemon = new ImageIcon("imagenes/snorlax.png");
            }
            case TINKATON -> {
                return imagePokemon = new ImageIcon("imagenes/tinkaton.png");
            }
            case TYRANITAR -> {
                return imagePokemon = new ImageIcon("imagenes/tyranitar.png");
            }
            default -> {
                return imagePokemon = null;
            }
        }


    }
    public static ImageIcon getImagePokemonTeam3(String namePokemonTeam3) {
        ImageIcon imagePokemon;
        switch (namePokemonTeam3) {
            case DRAMPA -> {
                return imagePokemon = new ImageIcon("imagenes/drampa.png");
            }
            case EMPOLEON -> {
                return imagePokemon = new ImageIcon("imagenes/empoleon.png");
            }
            case GARCHOMP -> {
                return imagePokemon = new ImageIcon("imagenes/garchomp.png");
            }
            case GENGAR -> {
                return imagePokemon = new ImageIcon("imagenes/gengar.png");
            }
            case INFERNAPE -> {
                return imagePokemon = new ImageIcon("imagenes/infernape.png");
            }
            case LUCARIO -> {
                return imagePokemon = new ImageIcon("imagenes/lucario.png");
            }
            case LUXRAY -> {
                return imagePokemon = new ImageIcon("imagenes/luxray.png");
            }
            case MARSHADOW -> {
                return imagePokemon = new ImageIcon("imagenes/marshadow.png");
            }
            case MILOTIC -> {
                return imagePokemon = new ImageIcon("imagenes/milotic.png");
            }
            case SNORLAX -> {
                return imagePokemon = new ImageIcon("imagenes/snorlax.png");
            }
            case TINKATON -> {
                return imagePokemon = new ImageIcon("imagenes/tinkaton.png");
            }
            case TYRANITAR -> {
                return imagePokemon = new ImageIcon("imagenes/tyranitar.png");
            }
            default -> {
                return imagePokemon = null;
            }
        }


    }


}

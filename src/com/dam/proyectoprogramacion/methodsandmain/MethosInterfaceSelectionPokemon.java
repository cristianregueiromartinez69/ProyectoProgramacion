package com.dam.proyectoprogramacion.methodsandmain;

import com.dam.proyectoprogramacion.interfaces.SelectionPokemon;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer2Luck;
import com.dam.proyectoprogramacion.panels.selectionpokemon.*;
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
    private static JPanel panelPokemonsPlayer2 = makeContentPokemonPanel();


    private static HashMap<String, ArrayList> playersBattle = new HashMap<>();
    private static ArrayList <Object> pokemonsPLayer1 = new ArrayList<>();
    private static ArrayList <Object> pokemonsPLayer2 = new ArrayList<>();




    /**
     * metodo para añadir a drampa al panel dle jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelDrampaBothPlayers(){


        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getDrampaPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject());


            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getDrampaPanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject());

                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
               if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getDrampaPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject());


            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getDrampaPanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject());
                   MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

               }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }


    /**
     * metodo para añadir a empoleon al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelEmpoleonBothPlayers(){

        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getEmpoleonPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject());


            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getEmpoleonPanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject());

                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getEmpoleonPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject());


            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getEmpoleonPanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a garchomp al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelGarchompBothPlayers(){

        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getGarchompPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGarchompObject());


            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getGarchompPanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGarchompObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getGarchompPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGarchompObject());


            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getGarchompPanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGarchompObject());

                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a gengar al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelGengarBothPlayers(){

        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getGengarPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGengarObject());


            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow1.getGengarPanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGengarObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getGengarPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGengarObject());

            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow1.getGengarPanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeGengarObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a infernape al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelInfernapeBothPlayers(){

        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getInfernapePanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeInfernapeObject());

            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getInfernapePanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeInfernapeObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getInfernapePanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeInfernapeObject());

            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getInfernapePanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeInfernapeObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a lucario al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelLucarioBothPlayers(){
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getLucarioPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject());

            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getLucarioPanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getLucarioPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject());

            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getLucarioPanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a luxray al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelLuxrayBothPlayers(){
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getLuxrayPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLuxrayObject());

            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getLuxrayPanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLuxrayObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getLuxrayPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLuxrayObject());

            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getLuxrayPanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeLuxrayObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a marshadow al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelMarshadowBothPlayers(){
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getMarshadowPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMarshadowObject());

            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow2.getMarshadowPanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMarshadowObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getMarshadowPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMarshadowObject());

            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow2.getMarshadowPanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMarshadowObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a milotic al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelMiloticBothPlayers(){
        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getMiloticPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMiloticObject());

            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getMiloticPanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMiloticObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getMiloticPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMiloticObject());

            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getMiloticPanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeMiloticObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }

    }
    /**
     * metodo para añadir a snorlax al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelSnorlaxBothPlayers(){

        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getSnorlaxPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeSnorlaxObject());

            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getSnorlaxPanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeSnorlaxObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getSnorlaxPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeSnorlaxObject());

            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getSnorlaxPanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeSnorlaxObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }
    }
    /**
     * metodo para añadir a tinkaton al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelTinkatonBothPlayers(){

        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getTinkatonPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject());

            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getTinkatonPanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getTinkatonPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject());

            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getTinkatonPanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }
    }
    /**
     * metodo para añadir a tyranitar al panel del jugador 1
     * @return el panel creado
     */
    public static JPanel updatePanelTyranitarBothPlayers(){

        if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())) {

            if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    checkSizeListPokemonsPLayer1()) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getTyranitarPanel());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTyranitarObject());

            } else if (MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer1Luck.getAliasTextPlayer1().getText()) &&
                    pokemonsPLayer1.size() == 2) {
                clearPanelPlayer1();
                panelPokemonsPlayer1.add(PanelsPokemonRow3.getTyranitarPanel());
                panelPokemonsPlayer1.add(new EnterPanelPlayer1());
                pokemonsPLayer1.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTyranitarObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText());

            }
            return addSelectedPokemonPanelPlayer1(panelPokemonsPlayer1);
        }
        else{
            if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    checkSizeListPokemonsPLayer2()){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getTyranitarPanel());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTyranitarObject());

            }
            else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase
                    (InformationPanelPlayer2Luck.getAliasTextPlayer2().getText()) &&
                    pokemonsPLayer2.size() == 2){
                clearPanelPlayer2();
                panelPokemonsPlayer2.add(PanelsPokemonRow3.getTyranitarPanel());
                panelPokemonsPlayer2.add(new EnterPanelPlayer2());
                pokemonsPLayer2.add(MethosInterfaceSelectionPokemonCreatePokemons.makeTyranitarObject());
                MethodsInterfaceLuck.setAliasWinnerLuck(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText());

            }
            return addSelectedPokemonPanelPlayer2(panelPokemonsPlayer2);
        }
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
        auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());
        SelectionPokemon.getGlobalPanelPlayer1().add(panelPokemon);
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
        auxPanelAliasAndPokemon2.add(SelectionPokemon.getGlobalPanelPlayer2());
        SelectionPokemon.getGlobalPanelPlayer2().add(panelPokemon);
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


}

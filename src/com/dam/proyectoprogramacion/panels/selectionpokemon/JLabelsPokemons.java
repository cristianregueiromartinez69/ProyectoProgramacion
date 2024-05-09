package com.dam.proyectoprogramacion.panels.selectionpokemon;

import javax.swing.*;

public class JLabelsPokemons {

    /**
     * atributos privados estáticos de tipo JLabel
     * estos atributos tendrán la imagen de los pokemons a escoger
     */
    private static JLabel drampaLabel;
    private static JLabel empoleonLabel;
    private static JLabel garchompLabel;
    private static JLabel gengarLabel;
    private static JLabel infernapeLabel;
    private static JLabel lucarioLabel;
    private static JLabel luxrayLabel;
    private static JLabel marshadowLabel;
    private static JLabel miloticLabel;
    private static JLabel snorlaxLabel;
    private static JLabel tinkatonLabel;
    private static JLabel tyranitarLabel;

    /**
     * metodo que crea un JLabel con la imagen de drampa
     * @return el JLabel creado
     */
    public static JLabel makeDrampaLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/drampaSP.png");
        JLabel drampa = new JLabel();
        drampa.setIcon(imageIcon);
        return drampa;

    }
    /**
     * metodo que crea un JLabel con la imagen de empoleon
     * @return el JLabel creado
     */
    public static JLabel makeEmpoleonLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/empoleonSP.png");
        JLabel empoleon = new JLabel();
        empoleon.setIcon(imageIcon);
        return empoleon;

    }
    /**
     * metodo que crea un JLabel con la imagen de garchomp
     * @return el JLabel creado
     */
    public static JLabel makeGarchompLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/garchompSP.png");
        JLabel garchomp = new JLabel();
        garchomp.setIcon(imageIcon);
        return garchomp;

    }
    /**
     * metodo que crea un JLabel con la imagen de gengar
     * @return el JLabel creado
     */
    public static JLabel makeGengarLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/gengarSP.png");
        JLabel gengar = new JLabel();
        gengar.setIcon(imageIcon);
        return gengar;

    }
    /**
     * metodo que crea un JLabel con la imagen de infernape
     * @return el JLabel creado
     */
    public static JLabel makeInfernapeLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/infernapeSP.png");
        JLabel infernape = new JLabel();
        infernape.setIcon(imageIcon);
        return infernape;

    }
    /**
     * metodo que crea un JLabel con la imagen de lucario
     * @return el JLabel creado
     */
    public static JLabel makeLucarioLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/lucarioSP.png");
        JLabel lucario = new JLabel();
        lucario.setIcon(imageIcon);
        return lucario;

    }
    /**
     * metodo que crea un JLabel con la imagen de luxray
     * @return el JLabel creado
     */
    public static JLabel makeLuxrayLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/luxraySP.png");
        JLabel luxray = new JLabel();
        luxray.setIcon(imageIcon);
        return luxray;

    }
    /**
     * metodo que crea un JLabel con la imagen de marshadow
     * @return el JLabel creado
     */
    public static JLabel makeMarshadowLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/marshadowSP.png");
        JLabel marshadow = new JLabel();
        marshadow.setIcon(imageIcon);
        return marshadow;

    }
    /**
     * metodo que crea un JLabel con la imagen de milotic
     * @return el JLabel creado
     */
    public static JLabel makeMiloticLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/miloticSP.png");
        JLabel milotic = new JLabel();
        milotic.setIcon(imageIcon);
        return milotic;

    }
    /**
     * metodo que crea un JLabel con la imagen de snorlax
     * @return el JLabel creado
     */
    public static JLabel makeSnorlaxLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/snorlaxSP.png");
        JLabel snorlax = new JLabel();
        snorlax.setIcon(imageIcon);
        return snorlax;

    }
    /**
     * metodo que crea un JLabel con la imagen de tinkaton
     * @return el JLabel creado
     */
    public static JLabel makeTinkatonLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/tinkatonSP.png");
        JLabel tinkaton = new JLabel();
        tinkaton.setIcon(imageIcon);
        return tinkaton;

    }
    /**
     * metodo que crea un JLabel con la imagen de tyranitar
     * @return el JLabel creado
     */
    public static JLabel makeTyranitarLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/tyranitarSP.png");
        JLabel tyranitar = new JLabel();
        tyranitar.setIcon(imageIcon);
        return tyranitar;

    }

    /**
     * getter y setter de los atributos de tipo JLabel
     * @return el atributo correspondiente
     */
    public static JLabel getDrampaLabel() {
        return drampaLabel;
    }

    public static void setDrampaLabel(JLabel drampaLabel) {
        JLabelsPokemons.drampaLabel = drampaLabel;
    }

    public static JLabel getEmpoleonLabel() {
        return empoleonLabel;
    }

    public static void setEmpoleonLabel(JLabel empoleonLabel) {
        JLabelsPokemons.empoleonLabel = empoleonLabel;
    }

    public static JLabel getGarchompLabel() {
        return garchompLabel;
    }

    public static void setGarchompLabel(JLabel garchompLabel) {
        JLabelsPokemons.garchompLabel = garchompLabel;
    }

    public static JLabel getGengarLabel() {
        return gengarLabel;
    }

    public static void setGengarLabel(JLabel gengarLabel) {
        JLabelsPokemons.gengarLabel = gengarLabel;
    }

    public static JLabel getInfernapeLabel() {
        return infernapeLabel;
    }

    public static void setInfernapeLabel(JLabel infernapeLabel) {
        JLabelsPokemons.infernapeLabel = infernapeLabel;
    }

    public static JLabel getLucarioLabel() {
        return lucarioLabel;
    }

    public static void setLucarioLabel(JLabel lucarioLabel) {
        JLabelsPokemons.lucarioLabel = lucarioLabel;
    }

    public static JLabel getLuxrayLabel() {
        return luxrayLabel;
    }

    public static void setLuxrayLabel(JLabel luxrayLabel) {
        JLabelsPokemons.luxrayLabel = luxrayLabel;
    }

    public static JLabel getMarshadowLabel() {
        return marshadowLabel;
    }

    public static void setMarshadowLabel(JLabel marshadowLabel) {
        JLabelsPokemons.marshadowLabel = marshadowLabel;
    }

    public static JLabel getMiloticLabel() {
        return miloticLabel;
    }

    public static void setMiloticLabel(JLabel miloticLabel) {
        JLabelsPokemons.miloticLabel = miloticLabel;
    }

    public static JLabel getSnorlaxLabel() {
        return snorlaxLabel;
    }

    public static void setSnorlaxLabel(JLabel snorlaxLabel) {
        JLabelsPokemons.snorlaxLabel = snorlaxLabel;
    }

    public static JLabel getTinkatonLabel() {
        return tinkatonLabel;
    }

    public static void setTinkatonLabel(JLabel tinkatonLabel) {
        JLabelsPokemons.tinkatonLabel = tinkatonLabel;
    }

    public static JLabel getTyranitarLabel() {
        return tyranitarLabel;
    }

    public static void setTyranitarLabel(JLabel tyranitarLabel) {
        JLabelsPokemons.tyranitarLabel = tyranitarLabel;
    }
}

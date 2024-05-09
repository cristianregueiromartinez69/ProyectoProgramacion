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
         drampaLabel = new JLabel();
        drampaLabel.setIcon(imageIcon);
        return drampaLabel;

    }
    /**
     * metodo que crea un JLabel con la imagen de empoleon
     * @return el JLabel creado
     */
    public static JLabel makeEmpoleonLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/empoleonSP.png");
        empoleonLabel = new JLabel();
        empoleonLabel.setIcon(imageIcon);
        return empoleonLabel;

    }
    /**
     * metodo que crea un JLabel con la imagen de garchomp
     * @return el JLabel creado
     */
    public static JLabel makeGarchompLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/garchompSP.png");
        garchompLabel = new JLabel();
        garchompLabel.setIcon(imageIcon);
        return garchompLabel;

    }
    /**
     * metodo que crea un JLabel con la imagen de gengar
     * @return el JLabel creado
     */
    public static JLabel makeGengarLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/gengarSP.png");
        gengarLabel = new JLabel();
        gengarLabel.setIcon(imageIcon);
        return gengarLabel;

    }
    /**
     * metodo que crea un JLabel con la imagen de infernape
     * @return el JLabel creado
     */
    public static JLabel makeInfernapeLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/infernapeSP.png");
         infernapeLabel = new JLabel();
        infernapeLabel.setIcon(imageIcon);
        return infernapeLabel;

    }
    /**
     * metodo que crea un JLabel con la imagen de lucario
     * @return el JLabel creado
     */
    public static JLabel makeLucarioLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/lucarioSP.png");
         lucarioLabel = new JLabel();
        lucarioLabel.setIcon(imageIcon);
        return lucarioLabel;

    }
    /**
     * metodo que crea un JLabel con la imagen de luxray
     * @return el JLabel creado
     */
    public static JLabel makeLuxrayLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/luxraySP.png");
         luxrayLabel = new JLabel();
        luxrayLabel.setIcon(imageIcon);
        return luxrayLabel;

    }
    /**
     * metodo que crea un JLabel con la imagen de marshadow
     * @return el JLabel creado
     */
    public static JLabel makeMarshadowLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/marshadowSP.png");
         marshadowLabel = new JLabel();
        marshadowLabel.setIcon(imageIcon);
        return marshadowLabel;

    }
    /**
     * metodo que crea un JLabel con la imagen de milotic
     * @return el JLabel creado
     */
    public static JLabel makeMiloticLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/miloticSP.png");
         miloticLabel = new JLabel();
        miloticLabel.setIcon(imageIcon);
        return miloticLabel;

    }
    /**
     * metodo que crea un JLabel con la imagen de snorlax
     * @return el JLabel creado
     */
    public static JLabel makeSnorlaxLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/snorlaxSP.png");
         snorlaxLabel = new JLabel();
        snorlaxLabel.setIcon(imageIcon);
        return snorlaxLabel;

    }
    /**
     * metodo que crea un JLabel con la imagen de tinkaton
     * @return el JLabel creado
     */
    public static JLabel makeTinkatonLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/tinkatonSP.png");
         tinkatonLabel = new JLabel();
        tinkatonLabel.setIcon(imageIcon);
        return tinkatonLabel;

    }
    /**
     * metodo que crea un JLabel con la imagen de tyranitar
     * @return el JLabel creado
     */
    public static JLabel makeTyranitarLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/tyranitarSP.png");
         tyranitarLabel = new JLabel();
        tyranitarLabel.setIcon(imageIcon);
        return tyranitarLabel;

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

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
    public JLabel makeDrampaLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/drampaSP.png");
        JLabel drampa = new JLabel();
        drampa.setIcon(imageIcon);
        return drampa;

    }
    /**
     * metodo que crea un JLabel con la imagen de empoleon
     * @return el JLabel creado
     */
    public JLabel makeEmpoleonLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/empoleonSP.png");
        JLabel empoleon = new JLabel();
        empoleon.setIcon(imageIcon);
        return empoleon;

    }
    /**
     * metodo que crea un JLabel con la imagen de garchomp
     * @return el JLabel creado
     */
    public JLabel makeGarchompLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/garchompSP.png");
        JLabel garchomp = new JLabel();
        garchomp.setIcon(imageIcon);
        return garchomp;

    }
    /**
     * metodo que crea un JLabel con la imagen de gengar
     * @return el JLabel creado
     */
    public JLabel makeGengarLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/gengarSP.png");
        JLabel gengar = new JLabel();
        gengar.setIcon(imageIcon);
        return gengar;

    }
    /**
     * metodo que crea un JLabel con la imagen de infernape
     * @return el JLabel creado
     */
    public JLabel makeInfernapeLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/infernapeSP.png");
        JLabel infernape = new JLabel();
        infernape.setIcon(imageIcon);
        return infernape;

    }
    /**
     * metodo que crea un JLabel con la imagen de lucario
     * @return el JLabel creado
     */
    public JLabel makeLucarioLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/lucarioSP.png");
        JLabel lucario = new JLabel();
        lucario.setIcon(imageIcon);
        return lucario;

    }
    /**
     * metodo que crea un JLabel con la imagen de luxray
     * @return el JLabel creado
     */
    public JLabel makeLuxrayLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/luxraySP.png");
        JLabel luxray = new JLabel();
        luxray.setIcon(imageIcon);
        return luxray;

    }
    /**
     * metodo que crea un JLabel con la imagen de marshadow
     * @return el JLabel creado
     */
    public JLabel makeMarshadowLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/marshadowSP.png");
        JLabel marshadow = new JLabel();
        marshadow.setIcon(imageIcon);
        return marshadow;

    }
    /**
     * metodo que crea un JLabel con la imagen de milotic
     * @return el JLabel creado
     */
    public JLabel makeMiloticLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/miloticSP.png");
        JLabel milotic = new JLabel();
        milotic.setIcon(imageIcon);
        return milotic;

    }
    /**
     * metodo que crea un JLabel con la imagen de snorlax
     * @return el JLabel creado
     */
    public JLabel makeSnorlaxLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/snorlaxSP.png");
        JLabel snorlax = new JLabel();
        snorlax.setIcon(imageIcon);
        return snorlax;

    }
    /**
     * metodo que crea un JLabel con la imagen de tinkaton
     * @return el JLabel creado
     */
    public JLabel makeTinkatonLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/tinkatonSP.png");
        JLabel tinkaton = new JLabel();
        tinkaton.setIcon(imageIcon);
        return tinkaton;

    }
    /**
     * metodo que crea un JLabel con la imagen de tyranitar
     * @return el JLabel creado
     */
    public JLabel makeTyranitarLabel(){
        ImageIcon imageIcon = new ImageIcon("imagenes/tyranitarSP.png");
        JLabel tyranitar = new JLabel();
        tyranitar.setIcon(imageIcon);
        return tyranitar;

    }



}

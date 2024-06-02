package com.dam.proyectoprogramacion.view.panels.selectionpokemon;

import javax.swing.*;

/**
 * paneles de la primera fila de la interfaz seleccion de pokemons
 * @author cristian
 * @version v2.0
 */
public class PanelsPokemonRow2 extends JPanel {

    /**
     * atributos privados de tipo JPanel
     */
    private static JPanel infernapePanel;
    private static JPanel lucarioPanel;
    private static JPanel luxrayPanel;
    private static JPanel marshadowPanel;

    /**
     * constructor de la clase
     */
    public PanelsPokemonRow2(){
        /**
         * lo hacemos visible y le damos medidas
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        /**
         * iniciamos el panel de infernape y lo hacemos igual a un metodo que devuelve el panel
         */
        infernapePanel = new JPanel();
        infernapePanel = makeInfernapePanel();

        /**
         * iniciamos el panel de lucario y lo hacemos igual a un metodo que devuelve el panel
         */
        lucarioPanel = new JPanel();
        lucarioPanel = makeLucarioPanel();

        /**
         * iniciamos el panel de luxray y lo hacemos igual a un metodo que devuelve el panel
         */
        luxrayPanel = new JPanel();
        luxrayPanel = makeLuxrayPanel();

        /**
         * iniciamos el panel de marshadow y lo hacemos igual a un metodo que devuelve el panel
         */
        marshadowPanel = new JPanel();
        marshadowPanel = makeMarshadowPanel();

        /**
         * lo añadimos al panel central
         */
        this.add(infernapePanel);
        this.add(lucarioPanel);
        this.add(luxrayPanel);
        this.add(marshadowPanel);


    }

    /**
     * metodo que devuelve el panel de infernape
     * @return el panel creado
     */
    public JPanel makeInfernapePanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon1 = new JPanel();
        pokemon1.setLayout(new BoxLayout(pokemon1, BoxLayout.Y_AXIS));
        JLabel namePokemon1 = new JLabel("Infernape");
        pokemon1.add(namePokemon1);
        pokemon1.add(JLabelsPokemons.makeInfernapeLabel());
        return pokemon1;
    }
    /**
     * metodo que devuelve el panel de lucario
     * @return el panel creado
     */
    public JPanel makeLucarioPanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon2 = new JPanel();
        pokemon2.setLayout(new BoxLayout(pokemon2, BoxLayout.Y_AXIS));
        JLabel namePokemon2 = new JLabel("Lucario");
        pokemon2.add(namePokemon2);
        pokemon2.add(JLabelsPokemons.makeLucarioLabel());
        return pokemon2;
    }
    /**
     * metodo que devuelve el panel de luxray
     * @return el panel creado
     */
    public JPanel makeLuxrayPanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon3 = new JPanel();
        pokemon3.setLayout(new BoxLayout(pokemon3, BoxLayout.Y_AXIS));
        JLabel namePokemon3 = new JLabel("Luxray");
        pokemon3.add(namePokemon3);
        pokemon3.add(JLabelsPokemons.makeLuxrayLabel());
        return pokemon3;
    }
    /**
     * metodo que devuelve el panel de marshadow
     * @return el panel creado
     */
    public JPanel makeMarshadowPanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon4 = new JPanel();
        pokemon4.setLayout(new BoxLayout(pokemon4, BoxLayout.Y_AXIS));
        JLabel namePokemon4 = new JLabel("Marshadow");
        pokemon4.add(namePokemon4);
        pokemon4.add(JLabelsPokemons.makeMarshadowLabel());
        return pokemon4;
    }

    /**
     * getters de los paneles para cambiarles el color de fondo
     * @return el panel correspondiente
     */
    public static JPanel getInfernapePanel() {
        return infernapePanel;
    }

    public static JPanel getLucarioPanel() {
        return lucarioPanel;
    }

    public static JPanel getLuxrayPanel() {
        return luxrayPanel;
    }

    public static JPanel getMarshadowPanel() {
        return marshadowPanel;
    }
}

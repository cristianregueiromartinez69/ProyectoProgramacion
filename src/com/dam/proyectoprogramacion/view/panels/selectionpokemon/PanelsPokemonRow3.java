package com.dam.proyectoprogramacion.view.panels.selectionpokemon;

import javax.swing.*;

/**
 * paneles de la primera fila de la interfaz seleccion de pokemons
 * @author cristian
 * @version v2.0
 */
public class PanelsPokemonRow3 extends JPanel {

    /**
     * atributos privados de tipo JPanel
     */
    private static JPanel miloticPanel;
    private static JPanel snorlaxPanel;
    private static JPanel tinkatonPanel;
    private static JPanel tyranitarPanel;

    /**
     * constructor de la clase
     */
    public PanelsPokemonRow3(){
        /**
         * lo hacemos visible y le damos medidas
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        /**
         * iniciamos el panel de milotic y lo hacemos igual a un metodo que devuelve el panel
         */
        miloticPanel = new JPanel();
        miloticPanel = makeMiloticPanel();

        /**
         * iniciamos el panel de snorlax y lo hacemos igual a un metodo que devuelve el panel
         */
        snorlaxPanel = new JPanel();
        snorlaxPanel = makeSnorlaxPanel();

        /**
         * iniciamos el panel de tinkaton y lo hacemos igual a un metodo que devuelve el panel
         */
        tinkatonPanel = new JPanel();
        tinkatonPanel = makeTinkatonPanel();

        /**
         * iniciamos el panel de tyranitaar y lo hacemos igual a un metodo que devuelve el panel
         */
        tyranitarPanel = new JPanel();
        tyranitarPanel = makeTyranitarPanel();

        /**
         * lo añadimos al panel central
         */
        this.add(miloticPanel);
        this.add(snorlaxPanel);
        this.add(tinkatonPanel);
        this.add(tyranitarPanel);


    }

    /**
     * metodo que devuelve el panel de milotic
     * @return el panel creado
     */
    public JPanel makeMiloticPanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon1 = new JPanel();
        pokemon1.setLayout(new BoxLayout(pokemon1, BoxLayout.Y_AXIS));
        JLabel namePokemon1 = new JLabel("Milotic");
        pokemon1.add(namePokemon1);
        pokemon1.add(JLabelsPokemons.makeMiloticLabel());
        return pokemon1;
    }
    /**
     * metodo que devuelve el panel de snorlax
     * @return el panel creado
     */
    public JPanel makeSnorlaxPanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon2 = new JPanel();
        pokemon2.setLayout(new BoxLayout(pokemon2, BoxLayout.Y_AXIS));
        JLabel namePokemon2 = new JLabel("Snorlax");
        pokemon2.add(namePokemon2);
        pokemon2.add(JLabelsPokemons.makeSnorlaxLabel());
        return pokemon2;
    }
    /**
     * metodo que devuelve el panel de tinkaton
     * @return el panel creado
     */
    public JPanel makeTinkatonPanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon3 = new JPanel();
        pokemon3.setLayout(new BoxLayout(pokemon3, BoxLayout.Y_AXIS));
        JLabel namePokemon3 = new JLabel("Tinkaton");
        pokemon3.add(namePokemon3);
        pokemon3.add(JLabelsPokemons.makeTinkatonLabel());
        return pokemon3;
    }
    /**
     * metodo que devuelve el panel de Tyranitar
     * @return el panel creado
     */
    public JPanel makeTyranitarPanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon4 = new JPanel();
        pokemon4.setLayout(new BoxLayout(pokemon4, BoxLayout.Y_AXIS));
        JLabel namePokemon4 = new JLabel("Tyranitar");
        pokemon4.add(namePokemon4);
        pokemon4.add(JLabelsPokemons.makeTyranitarLabel());
        return pokemon4;
    }

    /**
     * getter de los paneles de los pokemons para cambiarles el color
     * @return el panel correspondiente
     */
    public static JPanel getMiloticPanel() {
        return miloticPanel;
    }

    public static JPanel getSnorlaxPanel() {
        return snorlaxPanel;
    }

    public static JPanel getTinkatonPanel() {
        return tinkatonPanel;
    }

    public static JPanel getTyranitarPanel() {
        return tyranitarPanel;
    }
}

package com.dam.proyectoprogramacion.panels.selectionpokemon;

import javax.swing.*;

/**
 * paneles de la primera fila de la interfaz seleccion de pokemons
 * @author cristian
 * @version v2.0
 */
public class PanelsPokemonRow1 extends JPanel {

    /**
     * atributos privados de tipo JPanel
     */
    private JPanel drampaPanel;
    private JPanel empoleonPanel;
    private JPanel garchompPanel;
    private JPanel gengarPanel;

    /**
     * constructor de la clase
     */
    public PanelsPokemonRow1(){
        /**
         * lo hacemos visible y le damos medidas
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        /**
         * iniciamos el panel de drampa y lo hacemos igual a un metodo que devuelve el panel
         */
        drampaPanel = new JPanel();
        drampaPanel = makeDrampaPanel();

        /**
         * iniciamos el panel de empoleon y lo hacemos igual a un metodo que devuelve el panel
         */
        empoleonPanel = new JPanel();
        empoleonPanel = makeEmpoleonPanel();

        /**
         * iniciamos el panel de garchomp y lo hacemos igual a un metodo que devuelve el panel
         */
        garchompPanel = new JPanel();
        garchompPanel = makeGarchompPanel();

        /**
         * iniciamos el panel de gengar y lo hacemos igual a un metodo que devuelve el panel
         */
        gengarPanel = new JPanel();
        gengarPanel = makeGengarPanel();

        /**
         * lo añadimos al panel central
         */
        this.add(drampaPanel);
        this.add(empoleonPanel);
        this.add(garchompPanel);
        this.add(gengarPanel);


    }

    /**
     * metodo que devuelve el panel de drampa
     * @return el panel creado
     */
    public JPanel makeDrampaPanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon1 = new JPanel();
        pokemon1.setLayout(new BoxLayout(pokemon1, BoxLayout.Y_AXIS));
        JLabel namePokemon1 = new JLabel("Drampa");
        pokemon1.add(namePokemon1);
        pokemon1.add(JLabelsPokemons.makeDrampaLabel());
        return pokemon1;
    }
    /**
     * metodo que devuelve el panel de empoleon
     * @return el panel creado
     */
    public JPanel makeEmpoleonPanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon2 = new JPanel();
        pokemon2.setLayout(new BoxLayout(pokemon2, BoxLayout.Y_AXIS));
        JLabel namePokemon2 = new JLabel("Empoleon");
        pokemon2.add(namePokemon2);
        pokemon2.add(JLabelsPokemons.makeEmpoleonLabel());
        return pokemon2;
    }
    /**
     * metodo que devuelve el panel de garchomp
     * @return el panel creado
     */
    public JPanel makeGarchompPanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon3 = new JPanel();
        pokemon3.setLayout(new BoxLayout(pokemon3, BoxLayout.Y_AXIS));
        JLabel namePokemon3 = new JLabel("Garchomp");
        pokemon3.add(namePokemon3);
        pokemon3.add(JLabelsPokemons.makeGarchompLabel());
        return pokemon3;
    }
    /**
     * metodo que devuelve el panel de gengar
     * @return el panel creado
     */
    public JPanel makeGengarPanel(){
        /**
         * el panel tendrá un box layout en vertical
         * en la parte de arriba estará el nombre del pokemon
         * en la de abajo la imagen del pokemon
         */
        JPanel pokemon4 = new JPanel();
        pokemon4.setLayout(new BoxLayout(pokemon4, BoxLayout.Y_AXIS));
        JLabel namePokemon4 = new JLabel("Gengar");
        pokemon4.add(namePokemon4);
        pokemon4.add(JLabelsPokemons.makeGengarLabel());
        return pokemon4;
    }

}

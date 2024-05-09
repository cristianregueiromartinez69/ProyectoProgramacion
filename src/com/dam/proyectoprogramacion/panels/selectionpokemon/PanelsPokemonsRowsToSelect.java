package com.dam.proyectoprogramacion.panels.selectionpokemon;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * clase que extiende de jPanel que tendrá la estructura de todos los paneles de seleccionar pokemons
 * @author cristian
 * @version v2.0
 */
public class PanelsPokemonsRowsToSelect extends JPanel {

    /**
     * atributos privados de tipo JPanel
     */
    private JPanel row1OF3PokemonsToChose;
    private JPanel row2OF3PokemonsToChose;
    private JPanel row3OF3PokemonsToChose;

    /**
     * constructor de la clase
     */
    public PanelsPokemonsRowsToSelect(){
        /**
         * hacemos el panel visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        /**
         * iniciamos los paneles y los hacemos iguales a metodos que construyen paneles
         */
        row1OF3PokemonsToChose = new JPanel();
        row1OF3PokemonsToChose = makeRow1OF3PokemonsToChose();
        this.add(row1OF3PokemonsToChose);
        row2OF3PokemonsToChose = new JPanel();
        row2OF3PokemonsToChose = makeRow2OF3PokemonsToChose();
        this.add(row2OF3PokemonsToChose);
        row3OF3PokemonsToChose = new JPanel();
        row3OF3PokemonsToChose = makeRow3OF3PokemonsToChose();
        this.add(row3OF3PokemonsToChose);




    }

    /**
     * metodo que construye la primera fila de los paneles de seleccion de pokemons
     * @return el panel creado
     */
    private JPanel makeRow1OF3PokemonsToChose() {
        JPanel row1 = new JPanel();
        Border border = BorderFactory.createLineBorder(Color.BLUE, 3);
        row1.setBorder(border);
        return row1;
    }
    /**
     * metodo que construye la segunda fila de los paneles de seleccion de pokemons
     * @return el panel creado
     */
    private JPanel makeRow2OF3PokemonsToChose() {
        JPanel row2 = new JPanel();
        Border border = BorderFactory.createLineBorder(Color.RED, 3);
        row2.setBorder(border);
        return row2;
    }
    /**
     * metodo que construye la primera tercera de los paneles de seleccion de pokemons
     * @return el panel creado
     */
    private JPanel makeRow3OF3PokemonsToChose() {
        JPanel row3 = new JPanel();
        Border border = BorderFactory.createLineBorder(Color.MAGENTA, 3);
        row3.setBorder(border);
        return row3;
    }


}

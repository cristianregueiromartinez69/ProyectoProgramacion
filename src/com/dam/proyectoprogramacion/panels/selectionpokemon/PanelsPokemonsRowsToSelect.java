package com.dam.proyectoprogramacion.panels.selectionpokemon;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelsPokemonsRowsToSelect extends JPanel {

    private JPanel row1OF3PokemonsToChose;
    private JPanel row2OF3PokemonsToChose;
    private JPanel row3OF3PokemonsToChose;

    public PanelsPokemonsRowsToSelect(){
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

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

    private JPanel makeRow1OF3PokemonsToChose() {
        JPanel row1 = new JPanel();
        Border border = BorderFactory.createLineBorder(Color.BLUE, 3);
        row1.setBorder(border);
        return row1;
    }
    private JPanel makeRow2OF3PokemonsToChose() {
        JPanel row2 = new JPanel();
        Border border = BorderFactory.createLineBorder(Color.RED, 3);
        row2.setBorder(border);
        return row2;
    }
    private JPanel makeRow3OF3PokemonsToChose() {
        JPanel row3 = new JPanel();
        Border border = BorderFactory.createLineBorder(Color.MAGENTA, 3);
        row3.setBorder(border);
        return row3;
    }


}

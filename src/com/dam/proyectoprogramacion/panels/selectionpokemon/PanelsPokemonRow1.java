package com.dam.proyectoprogramacion.panels.selectionpokemon;

import javax.swing.*;


public class PanelsPokemonRow1 extends JPanel {

    private JPanel drampaPanel;
    private JPanel empoleonPanel;
    private JPanel garchompPanel;
    private JPanel gengarPanel;

    public PanelsPokemonRow1(){
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        drampaPanel = new JPanel();
        drampaPanel = makeDrampaPanel();

        empoleonPanel = new JPanel();
        empoleonPanel = makeEmpoleonPanel();

        garchompPanel = new JPanel();
        garchompPanel = makeGarchompPanel();

        gengarPanel = new JPanel();
        gengarPanel = makeGengarPanel();

        this.add(drampaPanel);
        this.add(empoleonPanel);
        this.add(garchompPanel);
        this.add(gengarPanel);


    }
    public JPanel makeDrampaPanel(){
        JPanel pokemon1 = new JPanel();
        pokemon1.setLayout(new BoxLayout(pokemon1, BoxLayout.Y_AXIS));
        JLabel namePokemon1 = new JLabel("Drampa");
        pokemon1.add(namePokemon1);
        pokemon1.add(JLabelsPokemons.makeDrampaLabel());
        return pokemon1;
    }
    public JPanel makeEmpoleonPanel(){
        JPanel pokemon2 = new JPanel();
        pokemon2.setLayout(new BoxLayout(pokemon2, BoxLayout.Y_AXIS));
        JLabel namePokemon2 = new JLabel("Empoleon");
        pokemon2.add(namePokemon2);
        pokemon2.add(JLabelsPokemons.makeEmpoleonLabel();
        return pokemon2;
    }
    public JPanel makeGarchompPanel(){
        JPanel pokemon3 = new JPanel();
        pokemon3.setLayout(new BoxLayout(pokemon3, BoxLayout.Y_AXIS));
        JLabel namePokemon3 = new JLabel("Garchomp");
        pokemon3.add(namePokemon3);
        pokemon3.add(JLabelsPokemons.makeGarchompLabel();
        return pokemon3;
    }
    public JPanel makeGengarPanel(){
        JPanel pokemon4 = new JPanel();
        pokemon4.setLayout(new BoxLayout(pokemon4, BoxLayout.Y_AXIS));
        JLabel namePokemon4 = new JLabel("Gengar");
        pokemon4.add(namePokemon4);
        pokemon4.add(JLabelsPokemons.makeGengarLabel();
        return pokemon4;
    }

}

package com.dam.proyectoprogramacion.methodsandmain;

import com.dam.proyectoprogramacion.interfaces.SelectionPokemon;
import com.dam.proyectoprogramacion.panels.selectionpokemon.JLabelsPokemons;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow1;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow2;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow3;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MethosInterfaceSelectionPokemon {

    private static JPanel panelPokemonsPlayer1 = makeContentPokemonPanel();

    public static JPanel updatePanelDrampaPlayer1(){

        clearPanelPlayer1();
        panelPokemonsPlayer1.add(PanelsPokemonRow1.getDrampaPanel());

    return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }



    public static JPanel updatePanelEmpoleonPlayer1(){

        clearPanelPlayer1();
         panelPokemonsPlayer1.add(PanelsPokemonRow1.getEmpoleonPanel());

        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    public static JPanel updatePanelGarchompPlayer1(){

        clearPanelPlayer1();
         panelPokemonsPlayer1.add(PanelsPokemonRow1.getGarchompPanel());

        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    public static JPanel updatePanelGengarPlayer1(){

        clearPanelPlayer1();
        panelPokemonsPlayer1.add(PanelsPokemonRow1.getGengarPanel());

        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    public static JPanel updatePanelInfernapePlayer1(){

        clearPanelPlayer1();
         panelPokemonsPlayer1.add(PanelsPokemonRow2.getInfernapePanel());

        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    public static JPanel updatePanelLucarioPlayer1(){

        clearPanelPlayer1();
         panelPokemonsPlayer1.add(PanelsPokemonRow2.getLucarioPanel());

        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    public static JPanel updatePanelLuxrayPlayer1(){

        clearPanelPlayer1();
         panelPokemonsPlayer1.add(PanelsPokemonRow2.getLuxrayPanel());

        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    public static JPanel updatePanelMarshadowPlayer1(){

        clearPanelPlayer1();
         panelPokemonsPlayer1.add(PanelsPokemonRow2.getMarshadowPanel());

        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    public static JPanel updatePanelMiloticPlayer1(){

        clearPanelPlayer1();
         panelPokemonsPlayer1.add(PanelsPokemonRow3.getMiloticPanel());

        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    public static JPanel updatePanelSnorlaxPlayer1(){

        clearPanelPlayer1();
         panelPokemonsPlayer1.add(PanelsPokemonRow3.getSnorlaxPanel());

        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    public static JPanel updatePanelTinkatonPlayer1(){


        clearPanelPlayer1();
         panelPokemonsPlayer1.add(PanelsPokemonRow3.getTinkatonPanel());

        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }
    public static JPanel updatePanelTyranitarPlayer1(){


        clearPanelPlayer1();
         panelPokemonsPlayer1.add(PanelsPokemonRow3.getTyranitarPanel());

        return addSelectedPokemonPanel(panelPokemonsPlayer1);
    }

    private static JPanel addSelectedPokemonPanel(JPanel panelPokemon) {
        JPanel auxPanelAliasAndPokemon1 = new JPanel();
        SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
        auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());
        SelectionPokemon.getGlobalPanelPlayer1().add(panelPokemon);
        return auxPanelAliasAndPokemon1;
    }

    private static void clearPanelPlayer1() {
        SelectionPokemon.getGlobalPanelPlayer1().removeAll();
        SelectionPokemon.getGlobalPanelPlayer1().revalidate();
        SelectionPokemon.getGlobalPanelPlayer1().repaint();
    }

    private static JPanel makeContentPokemonPanel(){
        JPanel panelGroupPokemons = new JPanel();
        panelGroupPokemons.setLayout(new BoxLayout(panelGroupPokemons, BoxLayout.Y_AXIS));
        return panelGroupPokemons;
    }
}

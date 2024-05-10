package com.dam.proyectoprogramacion.methodsandmain;

import com.dam.proyectoprogramacion.interfaces.SelectionPokemon;
import com.dam.proyectoprogramacion.panels.selectionpokemon.JLabelsPokemons;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow1;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow2;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow3;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MethosInterfaceSelectionPokemon {


    public static JPanel updatePanelDrampaPlayer1(){

        SelectionPokemon.getGlobalPanelPlayer1().removeAll();
        SelectionPokemon.getGlobalPanelPlayer1().revalidate();
        SelectionPokemon.getGlobalPanelPlayer1().repaint();
        JPanel auxPanelAliasAndPokemon1 = new JPanel();


        SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
        SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow1.getDrampaPanel());
        auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());





    return auxPanelAliasAndPokemon1;
    }

}

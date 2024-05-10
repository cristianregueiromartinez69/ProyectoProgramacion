package com.dam.proyectoprogramacion.methodsandmain;

import com.dam.proyectoprogramacion.interfaces.SelectionPokemon;
import com.dam.proyectoprogramacion.panels.selectionpokemon.JLabelsPokemons;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow1;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow2;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow3;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MethosInterfaceSelectionPokemon {


    public static JPanel updatePanelPlayer1(ActionEvent e){

        SelectionPokemon.getGlobalPanelPlayer1().removeAll();
        SelectionPokemon.getGlobalPanelPlayer1().revalidate();
        SelectionPokemon.getGlobalPanelPlayer1().repaint();
        JPanel auxPanelAliasAndPokemon1 = new JPanel();


        if(e.getSource() == JLabelsPokemons.getDrampaLabel()){

            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow1.getDrampaPanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());


        }
        else if(e.getSource() == JLabelsPokemons.getEmpoleonLabel()){

            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow1.getEmpoleonPanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());

        }
        else if(e.getSource() == JLabelsPokemons.getGarchompLabel()){

            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow1.getGarchompPanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());

        }
        else if(e.getSource() == JLabelsPokemons.getGengarLabel()){
            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow1.getGengarPanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());

        }
        else if(e.getSource() == JLabelsPokemons.getInfernapeLabel()){
            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow2.getInfernapePanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());

        }
        else if(e.getSource() == JLabelsPokemons.getLucarioLabel()){
            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow2.getLucarioPanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());

        }
        else if(e.getSource() == JLabelsPokemons.getLuxrayLabel()){
            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow2.getLuxrayPanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());

        }

        else if(e.getSource() == JLabelsPokemons.getMarshadowLabel()){
            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow2.getMarshadowPanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());

        }
        else if(e.getSource() == JLabelsPokemons.getMiloticLabel()){
            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow3.getMiloticPanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());

        }
        else if(e.getSource() == JLabelsPokemons.getSnorlaxLabel()){
            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow3.getSnorlaxPanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());

        }
        else if(e.getSource() == JLabelsPokemons.getTinkatonLabel()){
            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow3.getTinkatonPanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());

        }
        else if(e.getSource() == JLabelsPokemons.getTyranitarLabel()){
            SelectionPokemon.getGlobalPanelPlayer1().add(MethodsInterfaceLuck.selectAliasImagePlayer1());
            SelectionPokemon.getGlobalPanelPlayer1().add(PanelsPokemonRow3.getTyranitarPanel());
            auxPanelAliasAndPokemon1.add(SelectionPokemon.getGlobalPanelPlayer1());

        }



return auxPanelAliasAndPokemon1;
    }

}

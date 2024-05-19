package com.dam.proyectoprogramacion.buttons;

import com.dam.proyectoprogramacion.methods.battle.DataNamesIconsColorsAttacksAndPokemonsPlayer2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * clase con los botones de la interfaz de cambios de pokemons para el jugador 2
 * @author cristian
 * @version v1.0
 */
public class ButtonInterfaceChangePokemonPlayer2 extends JPanel{

    /**
     * atributos privados de tipo JButton que son los 3 miembros del equipo y un boton para volver al combate
     */
    private static JButton pokemon1team;
    private static JButton pokemon2team;
    private static JButton pokemon3team;
    private static JButton back;

    /**
     * metodo para crear el boton del primer pokemon del equipo
     * @return el boton creado
     */
    public JButton makePokemon1TeamButton(){
        ImageIcon iconPokemon = new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getPathIconPokemon1());
        pokemon1team = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getNamePokemon1(), iconPokemon);
        setBackground(Color.GREEN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return pokemon1team;
    }
    /**
     * metodo para crear el boton del segundo pokemon del equipo
     * @return el boton creado
     */
    public JButton makePokemon2TeamButton(){
        ImageIcon iconPokemon = new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getPathIconPokemon2());
        pokemon2team = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getNamePokemon2(), iconPokemon);
        setBackground(Color.GREEN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return pokemon2team;
    }
    /**
     * metodo para crear el boton del tercer pokemon del equipo
     * @return el boton creado
     */
    public JButton makePokemon3TeamButton(){
        ImageIcon iconPokemon = new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getPathIconPokemon3());
        pokemon3team = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getNamePokemon3(), iconPokemon);
        setBackground(Color.GREEN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return pokemon3team;
    }
    /**
     * metodo para crear el boton de volver al combate pokemon en caso de que se quiera cambiar de estrategia
     * @return el boton creado
     */
    public JButton makeBackButton(){
        ImageIcon iconBack = new ImageIcon("imagenes/backMenu.png");
        back = new CreateButtons("volver", iconBack);
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return back;
    }

    public static JButton getPokemon1team() {
        return pokemon1team;
    }

    public static void setPokemon1team(JButton pokemon1team) {
        ButtonInterfaceChangePokemonPlayer2.pokemon1team = pokemon1team;
    }

    public static JButton getPokemon2team() {
        return pokemon2team;
    }

    public static void setPokemon2team(JButton pokemon2team) {
        ButtonInterfaceChangePokemonPlayer2.pokemon2team = pokemon2team;
    }

    public static JButton getPokemon3team() {
        return pokemon3team;
    }

    public static void setPokemon3team(JButton pokemon3team) {
        ButtonInterfaceChangePokemonPlayer2.pokemon3team = pokemon3team;
    }

    public static JButton getBack() {
        return back;
    }

    public static void setBack(JButton back) {
        ButtonInterfaceChangePokemonPlayer2.back = back;
    }
}


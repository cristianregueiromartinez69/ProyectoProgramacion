package com.dam.proyectoprogramacion.buttons;

import com.dam.proyectoprogramacion.methodsandmain.DataNamesIconsColorsAttacksAndPokemonsPlayer1;
import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceChangePokemon;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * clase con los botones de la interfaz de cambios de pokemons
 * @author cristian
 * @version v1.0
 */
public class ButtonInterfaceChangePokemon extends JPanel {

    /**
     * atributos privados de tipo JButton que son los 3 miembros del equipo y un boton para volver al combate
     */
    private JButton pokemon1team;
    private JButton pokemon2team;
    private JButton pokemon3team;
    private JButton back;

    /**
     * metodo para crear el boton del primer pokemon del equipo
     * @return el boton creado
     */
    public JButton makePokemon1TeamButton(){
        ImageIcon iconPokemon = new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getPathIconPokemon1());
        pokemon1team = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getNamePokemon1(), iconPokemon);
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
        ImageIcon iconPokemon = new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getPathIconPokemon2());
        pokemon2team = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getNamePokemon2(), iconPokemon);
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
        ImageIcon iconPokemon = new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getPathIconPokemon3());
        pokemon3team = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getNamePokemon3(), iconPokemon);
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

}

package com.dam.proyectoprogramacion.buttons;

import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceChangePokemon;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonInterfaceChangePokemon extends JPanel {

    private JButton pokemon1team;
    private JButton pokemon2team;
    private JButton pokemon3team;
    private JButton back;

    public JButton makePokemon1TeamButton(){
        ImageIcon iconGengar = MethodsInterfaceChangePokemon.getImagePokemonTeam1("gengar");
        pokemon1team = new CreateButtons(MethodsInterfaceChangePokemon.getNameChangePokemon1Team("gengar"), iconGengar);
        setBackground(Color.GREEN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return pokemon1team;
    }
    public JButton makePokemon2TeamButton(){
        ImageIcon iconMilotic = MethodsInterfaceChangePokemon.getImagePokemonTeam2("milotic");
        pokemon2team = new CreateButtons(MethodsInterfaceChangePokemon.getNameChangePokemon1Team("milotic"), iconMilotic);
        setBackground(Color.GREEN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return pokemon2team;
    }
    public JButton makePokemon3TeamButton(){
        ImageIcon iconSnorlax = MethodsInterfaceChangePokemon.getImagePokemonTeam3("snorlax");
        pokemon3team = new CreateButtons(MethodsInterfaceChangePokemon.getNameChangePokemon1Team("snorlax"), iconSnorlax);
        setBackground(Color.GREEN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return pokemon3team;
    }
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

package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonInterfaceChangePokemon extends JPanel {

    private JButton pokemon1team;
    private JButton pokemon2team;
    private JButton pokemon3team;
    private JButton back;

    public JButton makePokemon1TeamButton(){
<<<<<<< HEAD
        pokemon1team = new JButton("Drampa");
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
=======
        ImageIcon iconDrampa = new ImageIcon("imagenes/tyranitar.png");
        pokemon1team = new CreateButtons("Drampa", iconDrampa);
        setBackground(Color.CYAN);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
>>>>>>> cristian
        setBorder(borderboton);
        return pokemon1team;
    }
    public JButton makePokemon2TeamButton(){
        pokemon2team = new JButton("Gengar");
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
        setBorder(borderboton);
        return pokemon2team;
    }
    public JButton makePokemon3TeamButton(){
        pokemon3team = new JButton("Tinkaton");
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
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

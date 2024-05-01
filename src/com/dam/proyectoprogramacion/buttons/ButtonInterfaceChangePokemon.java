package com.dam.proyectoprogramacion.buttons;

<<<<<<< HEAD
=======
import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceChangePokemon;

>>>>>>> cristian
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

<<<<<<< HEAD
public class ButtonInterfaceChangePokemon extends JPanel {

=======
/**
 * clase con los botones de la interfaz de cambios de pokemons
 * @author cristian
 * @version v1.0
 */
public class ButtonInterfaceChangePokemon extends JPanel {

    /**
     * atributos privados de tipo JButton que son los 3 miembros del equipo y un boton para volver al combate
     */
>>>>>>> cristian
    private JButton pokemon1team;
    private JButton pokemon2team;
    private JButton pokemon3team;
    private JButton back;

<<<<<<< HEAD
    public JButton makePokemon1TeamButton(){
        pokemon1team = new JButton("Drampa");
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 3);
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
=======
    /**
     * metodo para crear el boton del primer pokemon del equipo
     * @return el boton creado
     */
    public JButton makePokemon1TeamButton(){
        ImageIcon iconGengar = MethodsInterfaceChangePokemon.getImagePokemonTeam1("gengar");
        pokemon1team = new CreateButtons(MethodsInterfaceChangePokemon.getNameChangePokemon1Team("gengar"), iconGengar);
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
        ImageIcon iconMilotic = MethodsInterfaceChangePokemon.getImagePokemonTeam2("milotic");
        pokemon2team = new CreateButtons(MethodsInterfaceChangePokemon.getNameChangePokemon1Team("milotic"), iconMilotic);
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
        ImageIcon iconSnorlax = MethodsInterfaceChangePokemon.getImagePokemonTeam3("snorlax");
        pokemon3team = new CreateButtons(MethodsInterfaceChangePokemon.getNameChangePokemon1Team("snorlax"), iconSnorlax);
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
>>>>>>> cristian
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

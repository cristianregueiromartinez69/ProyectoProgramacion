package com.dam.proyectoprogramacion.buttons;
import com.dam.proyectoprogramacion.methodsandmain.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * clase con los botones de la interfaz de ataques pokemon
 * @author cristian
 * @version v1.0
 */
public class ButtonInterfaceAttacks extends JPanel {

    /**
     * atributos privados de tippo JButton con los botones de los paneles de atauqes pokemon
     */
    private JButton attack1;
    private JButton attack2;
    private JButton attack3;
    private JButton attack4;
    private JButton back;


    /**
     * metodo para hacer el primer ataque del pokemon
     *
     * @return el boton creado
     */
    public JButton makeAttack1Button(){
        ImageIcon iconType = (MethodsInterfaceAttacks.putImageTypePokemon("hada"));
        attack1 = new CreateButtons("ataque 1", iconType);
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack1;
    }
    /**
     * metodo para hacer el segundo ataque del pokemon
     *
     * @return el boton creado
     */
    public JButton makeAttack2Button(){
        ImageIcon iconType = (MethodsInterfaceAttacks.putImageTypePokemon("fuego"));
        attack2 = new CreateButtons("ataque 2", iconType);
        setBackground(Color.YELLOW);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack2;
    }
    /**
     * metodo para hacer el tercer ataque del pokemon
     *
     * @return el boton creado
     */
    public JButton makeAttack3Button(){
        ImageIcon iconType = (MethodsInterfaceAttacks.putImageTypePokemon("fantasma"));
        attack3 = new CreateButtons("ataque 3", iconType);
        setBackground(Color.ORANGE);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack3;
    }
    /**
     * metodo para hacer el cuarto ataque del pokemon
     *
     * @return el boton creado
     */
    public JButton makeAttack4Button(){
        ImageIcon iconType = (MethodsInterfaceAttacks.putImageTypePokemon("tierra"));
        attack4 = new CreateButtons("ataque 4", iconType);
        setBackground(Color.PINK);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack4;
    }
    /**
     * metodo para hacer que se regrese al metu de ataque o cambio en caso de haberlo pulsado
     * erroneamente o de pensar en una estrategia mejor
     *
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

package com.dam.proyectoprogramacion.buttons;
import com.dam.proyectoprogramacion.methodsandmain.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonInterfaceAttacks extends JPanel {

    private JButton attack1;
    private JButton attack2;
    private JButton attack3;
    private JButton attack4;
    private JButton back;


    public JButton makeAttack1Button(){
        ImageIcon iconType = (MethodsInterfaceAttacks.putImageTypePokemon("hada"));
        attack1 = new CreateButtons("ataque 1", iconType);
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack1;
    }
    public JButton makeAttack2Button(){
        ImageIcon iconType = (MethodsInterfaceAttacks.putImageTypePokemon("fuego"));
        attack2 = new CreateButtons("ataque 2", iconType);
        setBackground(Color.YELLOW);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack2;
    }
    public JButton makeAttack3Button(){
        ImageIcon iconType = (MethodsInterfaceAttacks.putImageTypePokemon("fantasma"));
        attack3 = new CreateButtons("ataque 3", iconType);
        setBackground(Color.ORANGE);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack3;
    }
    public JButton makeAttack4Button(){
        ImageIcon iconType = (MethodsInterfaceAttacks.putImageTypePokemon("tierra"));
        attack4 = new CreateButtons("ataque 4", iconType);
        setBackground(Color.PINK);
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack4;
    }



}

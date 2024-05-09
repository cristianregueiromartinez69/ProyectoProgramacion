package com.dam.proyectoprogramacion.panels.selectionpokemon;

import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceAccountCreate;
import com.dam.proyectoprogramacion.methodsandmain.MethodsLogicalAccountCreate;

import javax.swing.*;

public class PanelPlayer1 extends JPanel {

    public PanelPlayer1(){
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(makePanelPlayer1());

    }

    public JPanel makePanelPlayer1(){
        JPanel pokemon4 = new JPanel();
        pokemon4.setLayout(new BoxLayout(pokemon4, BoxLayout.Y_AXIS));
        JLabel namePokemon4 = new JLabel("Jugador 1");
        pokemon4.add(namePokemon4);
        pokemon4.add(MethodsLogicalAccountCreate.makeSelectImage1Player1());
        return pokemon4;
    }
}

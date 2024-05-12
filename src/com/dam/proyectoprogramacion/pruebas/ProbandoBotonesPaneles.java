package com.dam.proyectoprogramacion.pruebas;
import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.buttons.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProbandoBotonesPaneles extends JFrame {

    public void suma(){
        int randomNumberSelection = (int)(1+Math.random()*2);
        System.out.println(randomNumberSelection);
    }
}
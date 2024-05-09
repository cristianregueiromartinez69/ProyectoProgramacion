package com.dam.proyectoprogramacion.panels.selectionpokemon;

import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceAccountCreate;
import com.dam.proyectoprogramacion.methodsandmain.MethodsLogicalAccountCreate;

import javax.swing.*;

/**
 * clase que será el panel para el jugador 1 en la interfaz de seleccion de pokemon
 * @author cristian
 * @verison v2.0
 */
public class PanelPlayer1 extends JPanel {

    /**
     * constructor d ela clase
     */
    public PanelPlayer1(){
        /**
         * establecemos las características del panel
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        /**
         * añadimos al panel central un metodo que devueleve un panel
         */
        this.add(makePanelPlayer1());

    }

    /**
     * metodo que crea el panel del jugador 1
     * @return el panel creado
     */
    public JPanel makePanelPlayer1(){
        JPanel pokemon4 = new JPanel();
        pokemon4.setLayout(new BoxLayout(pokemon4, BoxLayout.Y_AXIS));
        JLabel namePokemon4 = new JLabel("Jugador 1");
        pokemon4.add(namePokemon4);
        pokemon4.add(MethodsLogicalAccountCreate.makeSelectImage1Player1());
        return pokemon4;
    }
}

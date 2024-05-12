package com.dam.proyectoprogramacion.panels.selectionpokemon;

import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceAccountCreate;
import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceLuck;
import com.dam.proyectoprogramacion.methodsandmain.MethodsLogicalAccountCreate;
import com.dam.proyectoprogramacion.methodsandmain.MethosInterfaceSelectionPokemon;

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
        this.add(MethosInterfaceSelectionPokemon.addEnterButonPlayer1Panel(new EnterPanelPlayer1()));



    }

    /**
     * metodo que crea el panel del jugador 1
     * @return el panel creado
     */
    public JPanel makePanelPlayer1(){
        JPanel player1 = new JPanel();
        player1.setLayout(new BoxLayout(player1, BoxLayout.Y_AXIS));
        player1 = MethodsInterfaceLuck.selectAliasImagePlayer1();
        return player1;
    }
}

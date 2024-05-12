package com.dam.proyectoprogramacion.panels.selectionpokemon;

import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceAccountCreate;
import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceLuck;
import com.dam.proyectoprogramacion.methodsandmain.MethodsLogicalAccountCreate;
import com.dam.proyectoprogramacion.methodsandmain.MethosInterfaceSelectionPokemon;

import javax.swing.*;

/**
 * clase que será el panel para el jugador 2 en la interfaz de seleccion de pokemon
 * @author cristian
 * @verison v2.0
 */
public class PanelPlayer2 extends JPanel {

    /**
     * constructor d ela clase
     */
    public PanelPlayer2(){
        /**
         * establecemos las características del panel
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        /**
         * añadimos al panel central un metodo que devueleve un panel
         */
        this.add(makePanelPlayer2());

    }

    /**
     * metodo que crea el panel del jugador 1
     * @return el panel creado
     */
    public JPanel makePanelPlayer2(){
        JPanel player2 = new JPanel();
        player2.setLayout(new BoxLayout(player2, BoxLayout.Y_AXIS));
        player2 = MethodsInterfaceLuck.selectAliasImagePlayer2();
       return player2;
    }
}

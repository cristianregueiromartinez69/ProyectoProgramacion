package com.dam.proyectoprogramacion.panels.battle.battlePlayer1;
import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceLuck;


import javax.swing.*;

/**
 * clase que será el panel para el alias y el logo del jugador 1 en la interfaz de combate
 * @author cristian
 * @version v3.0
 */
public class AliasAndLogoPlayer1 extends JPanel {

    /**
     * constructor de la clase
     */
    public AliasAndLogoPlayer1(){
        /**
         * establecemos las características del panel
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        /**
         * añadimos al panel central un metodo que devuelve un panel
         */
        this.add(makePanelPlayer1());



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

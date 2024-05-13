package com.dam.proyectoprogramacion.panels.battle.battleplayer2;
import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceLuck;


import javax.swing.*;

/**
 * clase que será el panel para el alias y el logo del jugador 1 en la interfaz de combate
 * @author cristian
 * @version v3.0
 */
public class AliasAndLogoPlayer2 extends JPanel {

    /**
     * constructor de la clase
     */
    public AliasAndLogoPlayer2(){
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
        JPanel player2 = new JPanel();
        player2.setLayout(new BoxLayout(player2, BoxLayout.Y_AXIS));
        player2 = MethodsInterfaceLuck.selectAliasImagePlayer2();
        return player2;
    }
}

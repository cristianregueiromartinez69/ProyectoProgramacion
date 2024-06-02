package com.dam.proyectoprogramacion.view.panels.luck;

import com.dam.proyectoprogramacion.controller.methods.luck.MethodsInterfaceLuck;

import javax.swing.*;
/**
 * clase con el panel del alias del jugador 2
 * @author cristian
 * @version v2.0
 */
public class selectAliasPlayer2 extends JPanel {
    /**
     * atributo privados de tipo jpanel
     */
    private JPanel aliasImagePlayer2;


    /**
     * constructor de la clase
     */
    public selectAliasPlayer2(){
        /**
         * lo hacemos visible y le ponemos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        /**
         * hacemos que el panel sea igual a el de otra clase
         */
        aliasImagePlayer2 = MethodsInterfaceLuck.selectAliasImagePlayer2();
        /**
         * lo añadimos
         */
        this.add(aliasImagePlayer2);



    }
}

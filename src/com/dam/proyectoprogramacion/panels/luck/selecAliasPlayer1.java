package com.dam.proyectoprogramacion.panels.luck;

import javax.swing.*;
import com.dam.proyectoprogramacion.methodsandmain.*;

/**
 * clase con el panel del alias del jugador 1
 * @author cristian
 * @version v2.0
 */
public class selecAliasPlayer1 extends JPanel {

    /**
     * atributos privados de tipo jpanel
     * el primero sirve para poner el alias y el logo escogido por el jugador 1
     * el segundo sirve para poner los botones de cara o cruz
     */
    private JPanel aliasImagePlayer1;
    private JPanel faceOrTailPlayer1;
    private JPanel confirmFaceOrTAilPlayer1;

    /**
     * constructor de la clase
     */
    public selecAliasPlayer1(){
        /**
         * lo hacemos visible y le ponemos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        /**
         * hacemos que el panel sea igual a el de otra clase
         */
        aliasImagePlayer1 = MethodsInterfaceLuck.selectAliasImagePlayer1();
        /**
         * lo añadimos
         */
        this.add(aliasImagePlayer1);



    }

}

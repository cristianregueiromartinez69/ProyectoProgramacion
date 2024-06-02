package com.dam.proyectoprogramacion.view.panels.luck;

import com.dam.proyectoprogramacion.controller.methods.luck.MethodsInterfaceLuck;

import javax.swing.*;

/**
 * clase que almacenará la imagen de winner y el alias del jugador 1
 * @author cristian
 * @version v2.0
 */
public class WinnerPlayer1Luck extends JPanel {

    /**
     * atributos privados de tipo jpanel para almacenar otros paneles
     */
    private JPanel winnerImagePanel;
    private JPanel aliasWinnerPanel;


    /**
     * constructor de la clase
     */
    public WinnerPlayer1Luck(){

        /**
         * lo hacemos visible y le damos un layout
          */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        /**
         * cada atributo lo hacemos igual a metodos que crean paneles
         * los añadimos a el panel this que es la propia clase la cual es un panel
         */
        winnerImagePanel = MethodsInterfaceLuck.makeImageWinnerPanel();
        this.add(winnerImagePanel);
        aliasWinnerPanel = MethodsInterfaceLuck.selectAliasImagePlayer1();
        this.add(aliasWinnerPanel);



    }
}

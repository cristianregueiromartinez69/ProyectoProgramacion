package com.dam.proyectoprogramacion.view.panels.battle.logicalbattle;

import javax.swing.*;
import java.awt.*;

/**
 * clase para poner el panel de texto de la informacion de la batalla pokemon
 * @author cristian
 * @version v3.0
 */
public class TextAreaPanelBattle extends JPanel {

    /**
     * atributos privados de la clase
     */
    private JPanel textPanel;
    private static JTextArea informationBattle;

    /**
     * constructor de la clase
     */
    public TextAreaPanelBattle(){

        /**
         * haciendo el panel visible y estableciendo un layout
         */
        setVisible(true);
        setLayout(new FlowLayout());

        /**
         * iniciamos el panel
         */
        textPanel = new JPanel();
        /**
         * hacemos que el textArea sea igual a una clase que hereda de textarea
         * esa clase contiene una imagen de fondo
         */
        informationBattle = new TextAreaBattle();
        /**
         * hacemos que no se pueda editar
         */
        informationBattle.setEditable(false);
        informationBattle.setPreferredSize(new Dimension(700, 35));
        informationBattle.setMaximumSize(new Dimension(700,35));
        informationBattle.setMinimumSize(new Dimension(700,35));
        /**
         * lo añadimos al panel
         */
        textPanel.add(new JScrollPane(informationBattle));

        this.add(textPanel);
    }

    public static JTextArea getInformationBattle() {
        return informationBattle;
    }

    public static void setInformationBattle(JTextArea informationBattle) {
        TextAreaPanelBattle.informationBattle = informationBattle;
    }
}

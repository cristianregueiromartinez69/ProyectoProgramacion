package com.dam.proyectoprogramacion.panels.battle.logicalbattle;

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
         *
         */
        setVisible(true);
        setLayout(new FlowLayout());

        textPanel = new JPanel();
        informationBattle = new TextAreaBattle();
        informationBattle.setEditable(false);
        textPanel.add(new JScrollPane(informationBattle));

        this.add(textPanel);
    }
}

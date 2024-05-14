package com.dam.proyectoprogramacion.panels.battle.battleplayer2;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;

import javax.swing.*;
import java.awt.*;

/**
 * clase con el panel para volver atras en el menu de ataques pokemon del jugador 2
 * @author cristian
 * @version v3.0
 */
public class BackAttacksPokemonPlayer2 extends JPanel {
    /**
     * atributo privado de tipo jpanel
     */
    private JPanel backPanel;

    public BackAttacksPokemonPlayer2(){

        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        /**
         * iniciamos el panel de volver atras y le damos un layout
         */
        backPanel = new JPanel();
        backPanel.setLayout(new BoxLayout(backPanel, BoxLayout.X_AXIS));

        /**
         * instanciamos un boton y lo hacemos igual a un metodo que crea el boton
         */
        JButton backToAttackChange = new ButtonInterfaceAttacks().makeBackButtonPlayer2();
        backToAttackChange.setBackground(Color.BLUE);
        backToAttackChange.setForeground(Color.WHITE);

        /**
         * lo añadimos
         */
        backPanel.add(backToAttackChange);
        this.add(backPanel);
    }
}

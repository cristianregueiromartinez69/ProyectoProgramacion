package com.dam.proyectoprogramacion.view.panels.battle.battleplayer2;

import com.dam.proyectoprogramacion.view.buttons.ButtonInterfaceChangePokemonPlayer2;

import javax.swing.*;
import java.awt.*;

/**
 * clase con el panel para volver atras en el menu de cambio de  pokemon el jugador 2
 * @author cristian
 * @version v3.0
 */
public class BackChangePokemonPlayer2 extends JPanel {

    /**
     * atributo privado de tipo jpanel
     */
    private JPanel backPanel;

    public BackChangePokemonPlayer2(){

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
        JButton backToAttackChange = new ButtonInterfaceChangePokemonPlayer2().makeBackButton();
        backToAttackChange.setBackground(Color.BLUE);
        backToAttackChange.setForeground(Color.WHITE);
        /**
         * lo añadimos
         */
        backPanel.add(backToAttackChange);
        this.add(backPanel);
    }
}

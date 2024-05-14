package com.dam.proyectoprogramacion.panels.selectionpokemon;
import com.dam.proyectoprogramacion.buttons.*;

import javax.swing.*;
import java.awt.*;

public class EnterPanelPlayer2 extends JPanel {

    private static JButton enterButtonPlayer2;

    public EnterPanelPlayer2(){
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        enterButtonPlayer2 = new ButtonInterfacePokemonSelect().makeReadyPlayer2Button();
        enterButtonPlayer2.setPreferredSize(new Dimension(150,40));
        enterButtonPlayer2.setBackground(Color.GREEN);
        enterButtonPlayer2.setForeground(Color.WHITE);
        this.add(enterButtonPlayer2);
    }

    public static JButton getEnterButtonPlayer2() {
        return enterButtonPlayer2;
    }
}

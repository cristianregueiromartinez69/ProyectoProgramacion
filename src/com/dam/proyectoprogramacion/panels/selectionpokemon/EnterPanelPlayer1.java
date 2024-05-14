package com.dam.proyectoprogramacion.panels.selectionpokemon;
import com.dam.proyectoprogramacion.buttons.*;

import javax.swing.*;
import java.awt.*;

public class EnterPanelPlayer1 extends JPanel {

    private static JButton enterButtonPlayer1;

    public EnterPanelPlayer1(){
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        enterButtonPlayer1 = new ButtonInterfacePokemonSelect().makeReadyPlayer1Button();
        enterButtonPlayer1.setPreferredSize(new Dimension(150,40));
        enterButtonPlayer1.setBackground(Color.GREEN);
        enterButtonPlayer1.setForeground(Color.WHITE);
        this.add(enterButtonPlayer1);
    }

    public static JButton getEnterButtonPlayer1() {
        return enterButtonPlayer1;
    }
}

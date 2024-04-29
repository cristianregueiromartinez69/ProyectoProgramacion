package com.dam.proyectoprogramacion.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonInterfaceLuck extends JPanel {

    private JButton faceButton;
    private JButton tailButton;

    public  JButton makeAccountButton(){

        ImageIcon iconAccount = new ImageIcon("imagenes/crearCuenta.png");
        createAccountButton = new CreateButtons("Crear Cuenta", iconAccount);
        setBackground(Color.ORANGE);
        setForeground(Color.BLACK);
        setPreferredSize(new Dimension(150,50));
        Border borderboton = BorderFactory.createLineBorder(Color.YELLOW, 2);
        setBorder(borderboton);
        return createAccountButton;
    }

    public  JButton makeBattleButton(){

        ImageIcon iconBattle = new ImageIcon("imagenes/iconoBatalla.png");
        combatButton = new CreateButtons("Batalla", iconBattle);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setPreferredSize(new Dimension(150,50));
        Border borderboton = BorderFactory.createLineBorder(Color.YELLOW, 2);
        setBorder(borderboton);
        return combatButton;
    }


}

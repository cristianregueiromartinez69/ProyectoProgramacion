package com.dam.proyectoprogramacion.interfaces;
import com.dam.proyectoprogramacion.background.*;
import com.dam.proyectoprogramacion.buttons.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HallOfFame extends JFrame{

    ButtonInterfaceSkipHall buttonsHall = new ButtonInterfaceSkipHall();
    private static JPanel backgroundImage;
    private static JPanel Player;
    private static JPanel Pokemon1;
    private static JPanel Pokemon2;
    private static JPanel Pokemon3;

    public void HallofFame () {

        /**
         * Llamar a la musica que va a sonar en el hall of fame
         */


        Image image = new ImageIcon("imagenes/Registro_en_el_Hall_de_la_Fama_Pt.png").getImage();
        backgroundImage.setLayout(new BorderLayout());

        JPanel background = new JPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(800,700,700,700);

        backgroundImage.add(background,BorderLayout.CENTER);

        add(backgroundImage);
        setVisible(true);

        gbc.gridy = 0;
        gbc.gridx = 0;
        JButton back = buttonsHall.makeBackButton();
        back.setPreferredSize(new Dimension(200,50));
        backgroundImage.add(back,gbc);
    }
}

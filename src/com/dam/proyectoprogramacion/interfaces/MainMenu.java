package com.dam.proyectoprogramacion.interfaces;
import com.dam.proyectoprogramacion.methodsandmain.MusicMainMenu;
import com.dam.proyectoprogramacion.panels.*;
import com.dam.proyectoprogramacion.buttons.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenu extends JFrame {
    ButtonInterfaceMenu buttonsMenu = new ButtonInterfaceMenu();
    public MainMenu() {
        MusicMainMenu.music();
        setTitle("Pokemon Showdown");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);


        Image backgroundImage = new ImageIcon("imagenes/imagenPruebaFondo.jpg").getImage();

        BackgroundMainMenuPanel backgroundPanel = new BackgroundMainMenuPanel(backgroundImage);
        backgroundPanel.setLayout(new BorderLayout());


        JPanel contentPanel = makeContentPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(500, 300, 300, 300);


        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


        add(backgroundPanel);

        setVisible(true);

        gbc.gridx = 0;
        gbc.gridy = 0;



        JButton battle = buttonsMenu.makeBattleButton();
        contentPanel.add(ButtonBattlePanel(battle), gbc);


        gbc.gridx = 1;
        gbc.gridy = 0;


        JButton account = buttonsMenu.makeAccountButton();
        contentPanel.add(CreateDashboardAccount(account), gbc);


        battle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                battle.setBackground(Color.WHITE);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                battle.setBackground(Color.RED);
            }
        });

        account.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                account.setBackground(Color.ORANGE.brighter());

            }

            @Override
            public void mouseExited(MouseEvent e) {
                account.setBackground(Color.ORANGE);
            }
        });


    }

    private JPanel ButtonBattlePanel(JButton battle) {
        JPanel playBattlePanel = new JPanel();
        playBattlePanel.setLayout(new GridBagLayout());
        playBattlePanel.add(battle);
        return playBattlePanel;
    }

    private JPanel CreateDashboardAccount(JButton cuenta) {
        JPanel createAccountPanel = new JPanel();
        createAccountPanel.setLayout(new GridBagLayout());
        createAccountPanel.add(cuenta);
        return createAccountPanel;
    }

    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

}

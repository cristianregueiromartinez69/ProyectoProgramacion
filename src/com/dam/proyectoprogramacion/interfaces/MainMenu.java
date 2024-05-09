package com.dam.proyectoprogramacion.interfaces;
import com.dam.proyectoprogramacion.pokemonSongs.MusicMainMenu;
import com.dam.proyectoprogramacion.background.*;
import com.dam.proyectoprogramacion.buttons.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * clase interfaz del menu principal del proyecto
 * @author cristian
 * @version v1.0
 */
public class MainMenu extends JFrame {
    /**
     * objeto del paquete botones para crear los botones de la interfaz
     */
    ButtonInterfaceMenu buttonsMenu = new ButtonInterfaceMenu();
    public MainMenu() {
        /**
         * metodo para llamar a la musica que sonará en el menu principal
         */
        MusicMainMenu.music();
        /**
         * defenimos características de la interfaz
         */
        setTitle("Pokemon Showdown");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

/**
 * varibale de tipo imagen que tiene el path de la imagen de fondo
 */
        Image backgroundImage = new ImageIcon("imagenes/imagenPruebaFondo.jpg").getImage();

        BackgroundMainMenuPanel backgroundPanel = new BackgroundMainMenuPanel(backgroundImage);
        backgroundPanel.setLayout(new BorderLayout());

        /**
         * creamos un jpanel que es igual a un metodo que nos vuelve un jpanel
         */
        JPanel contentPanel = makeContentPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(500, 300, 300, 300);


        /**
         * añadimos el panel creado
         */
        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


        add(backgroundPanel);

        setVisible(true);

        gbc.gridx = 0;
        gbc.gridy = 0;


        /**
         * creamos un boton que será la batalla que es igual al metodo creado en el paquete de los botones de la interfaz del menu
         */
        JButton battle = buttonsMenu.makeBattleButton();
        battle.setPreferredSize(new Dimension(150, 50));
        contentPanel.add(ButtonBattlePanel(battle), gbc);


        gbc.gridx = 1;
        gbc.gridy = 0;


        /**
         * creamos un boton que será la creacion de la cuenta que es igual al metodo creado en el paquete de los botones de la interfaz del menu
         */
        JButton account = buttonsMenu.makeAccountButton();
        account.setPreferredSize(new Dimension(150, 50));
        contentPanel.add(CreateDashboardAccount(account), gbc);


        /**
         * metodo para establecer el hover del boton
         * al pasar el raton por el boton, el boton sale de un color diferente
         */
        battle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                battle.setBackground(Color.YELLOW.brighter());

            }

            /**
             * cuando dejemos de paar el cursor por encima, vuelve a su color original
             * @param e the event to be processed un evento de tipo mouseevent
             */
            @Override
            public void mouseExited(MouseEvent e) {
                battle.setBackground(Color.WHITE);
            }
        });

        /**
         * metodo para establecer el hover del boton
         * al pasar el raton por el boton, el boton sale de un color diferente
         */
        account.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                account.setBackground(Color.MAGENTA);

            }

            /**
             * cuando dejemos de paar el cursor por encima, vuelve a su color original
             * @param e the event to be processed un evento de tipo mouseevent
             */
            @Override
            public void mouseExited(MouseEvent e) {
                account.setBackground(Color.ORANGE);
            }
        });
        account.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AccountCreate();

            }
        });
        battle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Luck();
            }
        });


    }

    /**
     * metodo para crear el panel con el boton de batalla
     * @param battle un objeto de tipo JButton
     * @return el panel creado
     */
    private JPanel ButtonBattlePanel(JButton battle) {
        JPanel playBattlePanel = new JPanel();
        playBattlePanel.setLayout(new GridBagLayout());
        playBattlePanel.add(battle);
        return playBattlePanel;
    }

    /**
     * metodo para crear el panel con el boton de crear cuenta
     * @param cuenta objeto de tipo JButton
     * @return el panel creado
     */
    private JPanel CreateDashboardAccount(JButton cuenta) {
        JPanel createAccountPanel = new JPanel();
        createAccountPanel.setLayout(new GridBagLayout());
        createAccountPanel.add(cuenta);
        return createAccountPanel;
    }

    /**
     * metodo para crear el panel que contendrá la imagen de fondo
     * @return el panel creado
     */
    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        /**
         * tenemos que poner que el panel sea falso en opaco para que no se sobreponga
         */
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

}

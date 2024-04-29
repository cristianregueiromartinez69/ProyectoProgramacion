package com.dam.proyectoprogramacion.pruebas;
import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.buttons.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProbandoBotonesPaneles extends JFrame {

    ButtonInterfacePokemonSelect selectPokemon = new ButtonInterfacePokemonSelect();

    public ProbandoBotonesPaneles(){

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
        JButton drampa = selectPokemon.makeDrampaButton();
        drampa.setForeground(Color.WHITE);
        drampa.setPreferredSize(new Dimension(150, 50));
        contentPanel.add(ButtonBattlePanel(drampa), gbc);


        gbc.gridx = 1;
        gbc.gridy = 0;


        /**
         * creamos un boton que será la creacion de la cuenta que es igual al metodo creado en el paquete de los botones de la interfaz del menu
         */
        JButton empoleon = selectPokemon.makeEmpoleonButton();
        empoleon.setForeground(Color.WHITE);
        empoleon.setPreferredSize(new Dimension(150, 50));
        contentPanel.add(CreateDashboardAccount(empoleon), gbc);


        /**
         * metodo para establecer el hover del boton
         * al pasar el raton por el boton, el boton sale de un color diferente
         */
        drampa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                drampa.setBackground(Color.GREEN.darker().darker());

            }

            /**
             * cuando dejemos de paar el cursor por encima, vuelve a su color original
             * @param e the event to be processed un evento de tipo mouseevent
             */
            @Override
            public void mouseExited(MouseEvent e) {
                drampa.setBackground(Color.GREEN.brighter());
            }
        });

        /**
         * metodo para establecer el hover del boton
         * al pasar el raton por el boton, el boton sale de un color diferente
         */
        empoleon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                empoleon.setBackground(Color.BLUE.darker());

            }

            /**
             * cuando dejemos de paar el cursor por encima, vuelve a su color original
             * @param e the event to be processed un evento de tipo mouseevent
             */
            @Override
            public void mouseExited(MouseEvent e) {
                empoleon.setBackground(Color.GRAY.darker());
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



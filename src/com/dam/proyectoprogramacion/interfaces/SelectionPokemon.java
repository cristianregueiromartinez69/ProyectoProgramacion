package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.panels.selectionpokemon.JLabelsPokemons;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonRow1;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonsRowsToSelect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Interfaz de seleccion de pokemons
 * @author cristian
 * @version v2.0
 */
public class SelectionPokemon extends JFrame {

    /**
     * atributos privados de tipo JPanel de la interfaz
     */
    private JPanel globalPanelPlayer1;
    private JPanel globalPanelSelectionPokemon;
    private JPanel globalPanelPlayer2;
    private JPanel goToBattlePanel;

    /**
     * constructor de la clase
     */
    public SelectionPokemon(){
        /**
         * defenimos características de la interfaz
         */
        setTitle("Seleccion de POkemon");
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /**
         * varibale de tipo imagen que tiene el path de la imagen de fondo
         */
        Image backgroundImage = new ImageIcon("imagenes/backSeleccionPokemon.png").getImage();

        /**
         * creamos un jpanel que es igual a un metodo que nos vuelve un jpanel
         */
        BackgroundMainMenuPanel backgroundPanel = new BackgroundMainMenuPanel(backgroundImage);
        backgroundPanel.setLayout(new BorderLayout());

        /**
         * añadimos el panel creado
         */
        JPanel contentPanel = makeContentPanel();
        GridBagConstraints gbc = new GridBagConstraints();

        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


        add(backgroundPanel);
        /**
         * establecemos dimensiones
         */
        gbc.gridy = 1;
        gbc.gridx = 0;

        /**
         * añadimos al panel central, un panel con toda la información de los pokemons
         */
        contentPanel.add(new PanelsPokemonsRowsToSelect(), gbc);

        /**
         * al JLabel de drampa le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         */
        JLabelsPokemons.getDrampaLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow1.getDrampaPanel().setBackground(Color.GREEN);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow1.getDrampaPanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });


    }

    /**
     * metodo que nos devuelve un JPanel para poner la imagen de fondo
     * @return el panel creado
     */
    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

}

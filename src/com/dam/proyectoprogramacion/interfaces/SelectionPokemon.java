package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.panels.selectionpokemon.PanelsPokemonsRowsToSelect;

import javax.swing.*;
import java.awt.*;

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

        contentPanel.add(new PanelsPokemonsRowsToSelect());


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

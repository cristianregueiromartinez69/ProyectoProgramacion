package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.panels.selectionpokemon.*;
import com.dam.proyectoprogramacion.pokemonSongs.*;

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
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
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
               DrampaSong.musicDrampa();
            }
        });

        /**
         * al JLabel de empoleon le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
         */
        JLabelsPokemons.getEmpoleonLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow1.getEmpoleonPanel().setBackground(Color.BLUE);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow1.getEmpoleonPanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                EmpoleonSong.musicEmpoleon();
            }
        });

        /**
         * al JLabel de garchomp le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
         */
        JLabelsPokemons.getGarchompLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow1.getGarchompPanel().setBackground(Color.BLUE.darker());
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow1.getGarchompPanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                GarchompSong.musicGarchomp();
            }
        });

        /**
         * al JLabel de gengar le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
         */
        JLabelsPokemons.getGengarLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow1.getGengarPanel().setBackground(Color.MAGENTA.darker());
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow1.getGengarPanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                GengarSong.musicGengar();
            }
        });

        /**
         * al JLabel de infernape le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
         */
        JLabelsPokemons.getInfernapeLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow2.getInfernapePanel().setBackground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow2.getInfernapePanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
               InfernapeSong.musicInfernape();
            }
        });

        /**
         * al JLabel de lucario le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
         */
        JLabelsPokemons.getLucarioLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow2.getLucarioPanel().setBackground(Color.CYAN.darker());
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow2.getLucarioPanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                LucarioSong.musicLucario();
            }
        });

        /**
         * al JLabel de luxray le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
         */
        JLabelsPokemons.getLuxrayLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow2.getLuxrayPanel().setBackground(Color.YELLOW);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow2.getLuxrayPanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                LuxraySong.musicLuxray();
            }
        });

        /**
         * al JLabel de Marshadow le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
         */
        JLabelsPokemons.getMarshadowLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow2.getMarshadowPanel().setBackground(Color.PINK.darker().darker());
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow2.getMarshadowPanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                MarshadowSong.musicMarshadow();
            }
        });

        /**
         * al JLabel de milotic le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
         */
        JLabelsPokemons.getMiloticLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow3.getMiloticPanel().setBackground(Color.ORANGE.brighter());
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow3.getMiloticPanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                MiloticSong.musicMilotic();
            }
        });

        /**
         * al JLabel de snorlax le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
         */
        JLabelsPokemons.getSnorlaxLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow3.getSnorlaxPanel().setBackground(Color.GREEN.darker().darker());
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow3.getSnorlaxPanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                SnorlaxSong.musicSnorlax();
            }
        });

        /**
         * al JLabel de tinkaton le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
         */
        JLabelsPokemons.getTinkatonLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow3.getTinkatonPanel().setBackground(Color.PINK);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow3.getTinkatonPanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                TinkatonSong.musicTinkaton();
            }
        });

        /**
         * al JLabel de Tyranitar le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de psar el cursor por encima, vuelva al coolor original
         * La tercera que para cuando pulses el boton, selecciones el pokemon
         * Además, sonará el sonido del pokemon y elimina al pokemon del panel, para que no pueda ser escogido
         */
        JLabelsPokemons.getTyranitarLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                PanelsPokemonRow3.getTyranitarPanel().setBackground(Color.GREEN.darker().darker());
            }
            @Override
            public void mouseExited(MouseEvent e) {
                PanelsPokemonRow3.getTyranitarPanel().setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                TyranitarSong.musicTyranitar();
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

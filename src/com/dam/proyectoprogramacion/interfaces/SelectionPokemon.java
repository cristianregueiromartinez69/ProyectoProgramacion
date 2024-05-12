package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.buttons.ButtonInterfacePokemonSelect;
import com.dam.proyectoprogramacion.methodsandmain.MethodsInterfaceLuck;
import com.dam.proyectoprogramacion.methodsandmain.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer2Luck;
import com.dam.proyectoprogramacion.panels.selectionpokemon.*;
import com.dam.proyectoprogramacion.pokemonSongs.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private static JPanel globalPanelPlayer1;
    private static JPanel globalPanelSelectionPokemon;
    private static JPanel globalPanelPlayer2;
    private JPanel contentPanel;
    private JPanel tickPanelPlayer1;
    private JPanel tickPanelPlayer2;
    private static JPanel goToBattlePanel;

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
         contentPanel = makeContentPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 0, 30, 1000);

        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


        add(backgroundPanel);

        /**
         * establecemos dimensiones
         */
        gbc.gridy = 0;
        gbc.gridx = 0;
        /**
         * iniciamos el panel del jugdor 1
         * hacemos que sea igual a la clase que crea el panel
         */
        globalPanelPlayer1 = new JPanel();
        globalPanelPlayer1.add(new PanelPlayer1());
        /**
         * lo añadimos al panel principal
         */
        contentPanel.add(globalPanelPlayer1, BorderLayout.WEST);

        /**
         * establecemos dimensiones
         */
        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.insets = new Insets(0, 100, 30, 0);

        /**
         * iniciamos el panel de los pokemons y añadimos todos los pokemons
         */
        globalPanelSelectionPokemon = new JPanel();
        globalPanelSelectionPokemon.add(new PanelsPokemonsRowsToSelect());
        /**
         * lo añadimos al panel principal
         */
        contentPanel.add(globalPanelSelectionPokemon, BorderLayout.CENTER);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.insets = new Insets(0, 1200, 30, 0);

        globalPanelPlayer2 = new JPanel();
        globalPanelPlayer2.add(new PanelPlayer2());
        contentPanel.add(globalPanelPlayer2, BorderLayout.EAST);

        tickPanelPlayer1 = new JPanel();
        tickPanelPlayer1 = MethosInterfaceSelectionPokemon.makeTickReadyButtonPlayer1();

        tickPanelPlayer2 = new JPanel();
        tickPanelPlayer2 = MethosInterfaceSelectionPokemon.makeTickReadyButtonPlayer2();

        goToBattlePanel = new JPanel();
        goToBattlePanel.add(new GoToBattlePanel());

        contentPanel.add(showFinishPanel(), BorderLayout.SOUTH);









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

               if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                   contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelDrampaBothPlayers(), BorderLayout.WEST);
               }
               else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                   contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelDrampaBothPlayers(), BorderLayout.EAST);
               }


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

                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelEmpoleonBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelEmpoleonBothPlayers(), BorderLayout.EAST);
                }
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
                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelGarchompBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelGarchompBothPlayers(), BorderLayout.EAST);
                }
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
                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelGengarBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelGengarBothPlayers(), BorderLayout.EAST);
                }
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
                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelInfernapeBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelInfernapeBothPlayers(), BorderLayout.EAST);
                }
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
                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelLucarioBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelLucarioBothPlayers(), BorderLayout.EAST);
                }
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
                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelLuxrayBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelLuxrayBothPlayers(), BorderLayout.EAST);
                }
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
                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelMarshadowBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelMarshadowBothPlayers(), BorderLayout.EAST);
                }
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
                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelMiloticBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelMiloticBothPlayers(), BorderLayout.EAST);
                }
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
                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelSnorlaxBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelSnorlaxBothPlayers(), BorderLayout.EAST);
                }
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
                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelTinkatonBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelTinkatonBothPlayers(), BorderLayout.EAST);
                }
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
                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelTyranitarBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelTyranitarBothPlayers(), BorderLayout.EAST);
                }
            }
        });
        ButtonInterfacePokemonSelect.getStartButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hola");
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
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setPreferredSize(new Dimension(1000,1000));
        return contentPanel;
    }
    private JPanel showFinishPanel(){
        JPanel auxPanel = new JPanel();

            auxPanel = goToBattlePanel;

        return auxPanel;
    }

    /**
     * getter y setter de os atributos de la interfaz de seleccion de pokemon
     * @return los atributos de la clase
     */
    public static JPanel getGlobalPanelPlayer1() {
        return globalPanelPlayer1;
    }

    public static JPanel getGlobalPanelSelectionPokemon() {
        return globalPanelSelectionPokemon;
    }

    public static JPanel getGlobalPanelPlayer2() {
        return globalPanelPlayer2;
    }

    public static JPanel getGoToBattlePanel() {
        return goToBattlePanel;
    }
}

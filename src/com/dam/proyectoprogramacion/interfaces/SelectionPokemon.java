package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.buttons.ButtonInterfacePokemonSelect;
import com.dam.proyectoprogramacion.methodsandmain.MethodsBattlePlayer1;
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

        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


        add(backgroundPanel);

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
         * iniciamos el panel de los pokemons y añadimos todos los pokemons
         */
        globalPanelSelectionPokemon = new JPanel();
        globalPanelSelectionPokemon.add(new PanelsPokemonsRowsToSelect());
        /**
         * lo añadimos al panel principal
         */
        contentPanel.add(globalPanelSelectionPokemon, BorderLayout.CENTER);


        /**
         * iniciamos el panel del jugador 2 y lo ponemos a la derecha
         */
        globalPanelPlayer2 = new JPanel();
        globalPanelPlayer2.add(new PanelPlayer2());
        contentPanel.add(globalPanelPlayer2, BorderLayout.EAST);


        /**
         * iniciamos el panel donde estará el boton de ir a la batalla y lo ponemos al sur
         */
        goToBattlePanel = new JPanel();
        goToBattlePanel.add(new GoToBattlePanel());

        contentPanel.add(showFinishPanel(), BorderLayout.SOUTH);









        /**
         * al JLabel de drampa le ponemos 3 acciones
         * La primera es que para cuando pases el cursor por encima, cambie de color el fondo
         * La segunda que para cuando dejes de pasar el cursor por encima, vuelva al coolor original
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

                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
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

                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
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
                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
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
                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
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
                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
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
                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
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
                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
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
                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
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
                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
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
                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
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
                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
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
                /**
                 * si el ganador del sorteo es el jugador 1, se actualiza el panel del jugador 1
                 * en caso contrario se actualiza el del jugador 2
                 */
                if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer1Luck.getAliasTextPlayer1().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelTyranitarBothPlayers(), BorderLayout.WEST);
                }
                else if(MethodsInterfaceLuck.getAliasWinnerLuck().equalsIgnoreCase(InformationPanelPlayer2Luck.getAliasTextPlayer2().getText())){
                    contentPanel.add(MethosInterfaceSelectionPokemon.updatePanelTyranitarBothPlayers(), BorderLayout.EAST);
                }
            }
        });
        /**
         * action listener del boton de ir a batalla de la interfaz
         * Solo funciona si el jugador 1 y 2 tienen 3 pokemons escogidos
         */
        ButtonInterfacePokemonSelect.getStartButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(MethosInterfaceSelectionPokemon.getPokemonsPLayer1().size() == 3 &&
               MethosInterfaceSelectionPokemon.getPokemonsPLayer2().size() == 3){
                   ButtonInterfaceCombat.setPathPokemonBattlePlayer1(MethodsBattlePlayer1.putImageAttackButtonPlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   new Battle();
                   dispose();
               }
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

    /**
     * metodo para crear el panel con el boton de batalla de la interfaz
     * @return el panel creado
     */
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

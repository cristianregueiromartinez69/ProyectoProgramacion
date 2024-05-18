package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.background.BackgroundMainMenuPanel;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.buttons.ButtonInterfacePokemonSelect;
import com.dam.proyectoprogramacion.methods.battle.*;
import com.dam.proyectoprogramacion.methods.luck.MethodsInterfaceLuck;
import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.LifePokemonInBattlePlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.LifePokemonInBattlePlayer2;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.LifePokemonInBattlePlayer2;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer2Luck;
import com.dam.proyectoprogramacion.panels.selectionpokemon.*;
import com.dam.proyectoprogramacion.Songs.*;

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
                   /**
                    * establecemos todos los valores de los pokemons del jugador 1
                    */
                   ButtonInterfaceCombat.setPathPokemonBattlePlayer1(MethodsBattlePlayer1.putImageAttackButtonPlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack1(MethodsBattlePlayer1.getTypeAttack1PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack1(MethodsBattlePlayer1.getNameAttack1PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack1(MethodsBattlePlayer1.getColorAttack1PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack2(MethodsBattlePlayer1.getTypeAttack2PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack2(MethodsBattlePlayer1.getNameAttack2PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack2(MethodsBattlePlayer1.getColorAttack2PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack3(MethodsBattlePlayer1.getTypeAttack3PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack3(MethodsBattlePlayer1.getNameAttack3PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack3(MethodsBattlePlayer1.getColorAttack3PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack4(MethodsBattlePlayer1.getTypeAttack4PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack4(MethodsBattlePlayer1.getNameAttack4PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack4(MethodsBattlePlayer1.getColorAttack4PokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconPokemon1(MethodsBattlePlayer1.getPathPokemon1Player1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNamePokemon1(MethodsBattlePlayer1.getNamePokemon1Player1(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconPokemon2(MethodsBattlePlayer1.getPathPokemon2Player1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNamePokemon2(MethodsBattlePlayer1.getNamePokemon2Player1(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconPokemon3(MethodsBattlePlayer1.getPathPokemon3Player1(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNamePokemon3(MethodsBattlePlayer1.getNamePokemon3Player1(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   LifePokemonInBattlePlayer1.setActualLifePokemonInBattlePlayer1(MethodsLifeBattlePokemonPlayer1.getLifePokemon1Player1());
                   LifePokemonInBattlePlayer1.setAuxLife(MethodsLifeBattlePokemonPlayer1.getLifePokemon1Player1());
                   LifePokemonInBattlePlayer1.setLifePokemon1PLayer1(MethodsLifeBattlePokemonPlayer1.getLifePokemon1Player1());
                   LifePokemonInBattlePlayer1.setLifePokemon2PLayer1(MethodsLifeBattlePokemonPlayer1.getLifePokemon2Player1());
                   LifePokemonInBattlePlayer1.setLifePokemon3PLayer1(MethodsLifeBattlePokemonPlayer1.getLifePokemon3Player1());

                   DataNamesIconsColorsAttacksAndPokemonsPlayer1.setImagePokemonInBattlePlayer1(MethodsBattlePlayer1.putImagePokemonInBattlePlayer1(MethosInterfaceSelectionPokemon.getPlayersBattle()));


                   /**
                    * establecemos todos los valores de los pokemons del jugador 2
                    */
                   ButtonInterfaceCombat.setPathPokemonBattlePlayer2(MethodsBattlePlayer2.putImageAttackButtonPlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack1(MethodsBattlePlayer2.getTypeAttack1PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack1(MethodsBattlePlayer2.getNameAttack1PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack1(MethodsBattlePlayer2.getColorAttack1PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack2(MethodsBattlePlayer2.getTypeAttack2PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack2(MethodsBattlePlayer2.getNameAttack2PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack2(MethodsBattlePlayer2.getColorAttack2PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack3(MethodsBattlePlayer2.getTypeAttack3PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack3(MethodsBattlePlayer2.getNameAttack3PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack3(MethodsBattlePlayer2.getColorAttack3PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack4(MethodsBattlePlayer2.getTypeAttack4PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack4(MethodsBattlePlayer2.getNameAttack4PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack4(MethodsBattlePlayer2.getColorAttack4PokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));


                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconPokemon1(MethodsBattlePlayer2.getPathPokemon1Player2(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNamePokemon1(MethodsBattlePlayer2.getNamePokemon1Player2(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconPokemon2(MethodsBattlePlayer2.getPathPokemon2Player2(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNamePokemon2(MethodsBattlePlayer2.getNamePokemon2Player2(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconPokemon3(MethodsBattlePlayer2.getPathPokemon3Player2(MethosInterfaceSelectionPokemon.getPlayersBattle()));
                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNamePokemon3(MethodsBattlePlayer2.getNamePokemon3Player2(MethosInterfaceSelectionPokemon.getPlayersBattle()));

                   LifePokemonInBattlePlayer2.setActualLifePokemonInBattlePlayer2(MethodsLifeBattlePokemonPlayer2.getLifePokemon1Player2());
                   LifePokemonInBattlePlayer2.setAuxLifePlayer2(MethodsLifeBattlePokemonPlayer2.getLifePokemon1Player2());
                   LifePokemonInBattlePlayer2.setLifePokemon1PLayer2(MethodsLifeBattlePokemonPlayer2.getLifePokemon1Player2());
                   LifePokemonInBattlePlayer2.setLifePokemon2PLayer2(MethodsLifeBattlePokemonPlayer2.getLifePokemon2Player2());
                   LifePokemonInBattlePlayer2.setLifePokemon3PLayer2(MethodsLifeBattlePokemonPlayer2.getLifePokemon3Player2());

                   DataNamesIconsColorsAttacksAndPokemonsPlayer2.setImagePokemonInBattlePlayer2(MethodsBattlePlayer2.putImagePokemonInBattlePlayer2(MethosInterfaceSelectionPokemon.getPlayersBattle()));



                   MusicIntroGame.stopMusic();
                   new Battle();
                   MusicBattleGame.music();
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

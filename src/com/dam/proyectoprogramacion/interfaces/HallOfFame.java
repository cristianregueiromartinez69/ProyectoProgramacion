package com.dam.proyectoprogramacion.interfaces;

import com.dam.proyectoprogramacion.Songs.MusicBattleGame;
import com.dam.proyectoprogramacion.Songs.MusicIntroGame;
import com.dam.proyectoprogramacion.background.*;
import com.dam.proyectoprogramacion.buttons.*;
import com.dam.proyectoprogramacion.Songs.HallOfFameSong;
import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePokemon;
import com.dam.proyectoprogramacion.methods.halloffame.DisableInformation;
import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.AliasAndLogoPlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.AliasAndLogoPlayer2;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer2Luck;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class HallOfFame extends JFrame {

    private static JPanel pokemon1;
    private static JPanel pokemon2;
    private static JPanel pokemon3;
    private static JPanel player;
    private static ImageIcon pokemon1Player1_img = new ImageIcon(putImagePokemon1InBattlePlayer1());
    private static ImageIcon pokemon2Player1_img = new ImageIcon(putImagePokemon2InBattlePlayer1());
    private static ImageIcon pokemon3Player1_img = new ImageIcon(putImagePokemon3InBattlePlayer1());
    private static final JLabel labelPokemon1Player1 = new JLabel("", pokemon1Player1_img, JLabel.CENTER);
    private static final JLabel labelPokemon2Player1 = new JLabel("", pokemon2Player1_img, JLabel.CENTER);
    private static final JLabel labelPokemon3Player1 = new JLabel("", pokemon3Player1_img, JLabel.CENTER);
    private static ImageIcon pokemon1Player2_img = new ImageIcon(putImagePokemonInBattle1Player2());
    private static ImageIcon pokemon2Player2_img = new ImageIcon(putImagePokemonInBattle2Player2());
    private static ImageIcon pokemon3Player2_img = new ImageIcon(putImagePokemonInBattle3Player2());
    private static final JLabel labelPokemon1Player2 = new JLabel("", pokemon1Player2_img, JLabel.CENTER);
    private static final JLabel labelPokemon2Player2 = new JLabel("", pokemon2Player2_img, JLabel.CENTER);
    private static final JLabel labelPokemon3Player2 = new JLabel("", pokemon3Player2_img, JLabel.CENTER);

    MethosInterfaceSelectionPokemon seleccion = new MethosInterfaceSelectionPokemon();
    MethodsBattlePokemon equipo = new MethodsBattlePokemon();
    ButtonInterfaceSkipHall buttonsHall = new ButtonInterfaceSkipHall();

    public HallOfFame() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setBounds(600, 600, 600, 600);

        // Llamar a la musica que va a sonar en el hall of fame
        HallOfFameSong.hallOfFameMusic();

        // Variable con la imagen de fondo
        Image image = new ImageIcon("imagenes/Hall.png").getImage();
        BackgroundHallOfFame backgroundHall = new BackgroundHallOfFame(image);
        backgroundHall.setLayout(new GridBagLayout());

        // Crear panel de fondo
        JPanel background = makePanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20); // Aumentar espacio entre componentes
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.CENTER;
        backgroundHall.add(background, gbc);

        add(backgroundHall);
        setVisible(true);

        // Configurar y agregar paneles de Pokémon
        gbc.gridwidth = 1;
        gbc.gridy++;
        pokemon1 = pokemon1Panel();
        background.add(pokemon1, gbc);

        gbc.gridx++;
        pokemon2 = pokemon2Panel();
        background.add(pokemon2, gbc);

        gbc.gridx++;
        pokemon3 = pokemon3Panel();

        background.add(pokemon3, gbc);



        if (!equipo.isTeamPokemonAlivePlayer1()) {
            pokemon1.add(labelPokemon1Player1);
            pokemon2.add(labelPokemon2Player1);
            pokemon3.add(labelPokemon3Player1);
            gbc.gridx++;
            player = playerPanel();
            player.add(new AliasAndLogoPlayer1());
            background.add(player, gbc);
        } else {
            pokemon1.add(labelPokemon1Player2);
            pokemon2.add(labelPokemon2Player2);
            pokemon3.add(labelPokemon3Player2);
            gbc.gridx++;
            player = playerPanel();
            player.add(new AliasAndLogoPlayer2());
            background.add(player, gbc);
        }

        // Configurar botones y agregarlos a la parte inferior
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 10));
        buttonPanel.setOpaque(false); // Hacer que el fondo del panel de botones sea transparente
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.SOUTH;
        backgroundHall.add(buttonPanel, gbc);

        JButton back = buttonsHall.makeBackButton();
        back.setPreferredSize(new Dimension(150, 50));
        buttonPanel.add(back);

        JButton playAgain = buttonsHall.makePlayAgainButton();
        playAgain.setPreferredSize(new Dimension(150, 50));
        buttonPanel.add(playAgain);

        // Agregar eventos de ratón a los botones
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                back.setBackground(Color.BLUE.brighter());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                back.setBackground(Color.WHITE);
            }
        });

        playAgain.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                playAgain.setBackground(Color.RED.brighter());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                playAgain.setBackground(Color.WHITE);
            }
        });

        // Agregar eventos de acción a los botones
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HallOfFame.this.dispose();
                MainMenu menu = new MainMenu();
                menu.setVisible(true);
                HallOfFameSong.stopMusic();
                MusicIntroGame.music();
                DisableInformation.disableInformationBattlePlayer1();
                DisableInformation.disableInformationBattlePlayer2();
                DisableInformation.disableInformationInterfaceLuck();
                DisableInformation.disableInformationInterfaceSelectionPokemon();
                DisableInformation.disableInformationInterfaceLuck();
            }
        });

        playAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HallOfFame.this.dispose();
                SelectionPokemon play = new SelectionPokemon();
                play.setVisible(true);
                HallOfFameSong.stopMusic();
                MusicBattleGame.music();
                DisableInformation.disableInformationBattlePlayer1();
                DisableInformation.disableInformationBattlePlayer2();
                DisableInformation.disableInformationInterfaceLuck();
                DisableInformation.disableInformationInterfaceSelectionPokemon();
            }
        });
    }

    private JPanel makePanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }

    public static JPanel pokemon1Panel() {
        JPanel pokemon1 = new JPanel();
        pokemon1.setLayout(new BoxLayout(pokemon1, BoxLayout.Y_AXIS));
        pokemon1.setOpaque(false);
        return pokemon1;
    }

    public static JPanel pokemon2Panel() {
        JPanel pokemon2 = new JPanel();
        pokemon2.setLayout(new BoxLayout(pokemon2, BoxLayout.Y_AXIS));
        pokemon2.setOpaque(false);
        return pokemon2;
    }

    public static JPanel pokemon3Panel() {
        JPanel pokemon3 = new JPanel();
        pokemon3.setLayout(new BoxLayout(pokemon3, BoxLayout.Y_AXIS));
        pokemon3.setOpaque(false);
        return pokemon3;
    }

    public static JPanel playerPanel() {
        JPanel player = new JPanel();
        player.setLayout(new BoxLayout(player, BoxLayout.Y_AXIS));
        player.setOpaque(false);
        return player;
    }

    public static String putImagePokemon1InBattlePlayer1() {

        String pathImagePokemon = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si encuentra la clave, entra en la condicion
             */
            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {
                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    String name = firstPokemon.getName().toLowerCase();
                    pathImagePokemon = "imagenes/" + name + "SP.png";
                    break;

                } else {
                    /**
                     * si no hay nada, devuelve null
                     */
                    pathImagePokemon = null;
                }

            }
        }
        return pathImagePokemon;
    }

    public static String putImagePokemon2InBattlePlayer1() {

        String pathImagePokemon = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si encuentra la clave, entra en la condicion
             */
            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {
                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(1);
                    String name = firstPokemon.getName().toLowerCase();
                    pathImagePokemon = "imagenes/" + name + "SP.png";
                    break;

                } else {
                    /**
                     * si no hay nada, devuelve null
                     */
                    pathImagePokemon = null;
                }

            }
        }
        return pathImagePokemon;
    }


    public static String putImagePokemon3InBattlePlayer1() {

        String pathImagePokemon = "";
        String aliasPlayer1 = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si encuentra la clave, entra en la condicion
             */
            if (key.equals(aliasPlayer1)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {
                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(2);
                    String name = firstPokemon.getName().toLowerCase();
                    pathImagePokemon = "imagenes/" + name + "SP.png";
                    break;

                } else {
                    /**
                     * si no hay nada, devuelve null
                     */
                    pathImagePokemon = null;
                }

            }
        }
        return pathImagePokemon;
    }


    public static String putImagePokemonInBattle1Player2() {

        String pathImagePokemon = "";
        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();
        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si encuentra la clave, entra en la condicion
             */
            if (key.equals(aliasPlayer2)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {
                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(0);
                    String name = firstPokemon.getName().toLowerCase();
                    pathImagePokemon = "imagenes/" + name + "SP.png";
                    break;

                } else {
                    /**
                     * si no hay nada, devuelve null
                     */
                    pathImagePokemon = null;
                }

            }
        }
        return pathImagePokemon;
    }


    public static String putImagePokemonInBattle2Player2() {

        String pathImagePokemon = "";
        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();
        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si encuentra la clave, entra en la condicion
             */
            if (key.equals(aliasPlayer2)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {
                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(1);
                    String name = firstPokemon.getName().toLowerCase();
                    pathImagePokemon = "imagenes/" + name + "SP.png";
                    break;

                } else {
                    /**
                     * si no hay nada, devuelve null
                     */
                    pathImagePokemon = null;
                }

            }
        }
        return pathImagePokemon;
    }

    public static String putImagePokemonInBattle3Player2() {

        String pathImagePokemon = "";
        String aliasPlayer2 = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();
        /**
         * for para recorrer el hashmap de los jugadores
         */
        for (String key : MethosInterfaceSelectionPokemon.getPlayersBattle().keySet()) {
            /**
             * si encuentra la clave, entra en la condicion
             */
            if (key.equals(aliasPlayer2)) {
                /**
                 * iniciamos un array de objetos y lo hacemos igual al valor del hashmap de jugadores
                 */
                ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPlayersBattle().get(key);
                if (!pokemons.isEmpty()) {
                    /**
                     * hacemos un objeto de pokemons y decimos que es igual al primer elemento de la lista de pokemons
                     */
                    PokemonProperties firstPokemon = (PokemonProperties) pokemons.get(2);
                    String name = firstPokemon.getName().toLowerCase();
                    pathImagePokemon = "imagenes/" + name + "SP.png";
                    break;

                } else {
                    /**
                     * si no hay nada, devuelve null
                     */
                    pathImagePokemon = null;
                }

            }
        }
        return pathImagePokemon;
    }
}

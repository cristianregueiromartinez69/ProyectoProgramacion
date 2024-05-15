package com.dam.proyectoprogramacion.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer1;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer2;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.methods.battle.DataNamesIconsColorsAttacksAndPokemonsPlayer1;
import com.dam.proyectoprogramacion.methods.battle.DataNamesIconsColorsAttacksAndPokemonsPlayer2;
import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePlayer1;
import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePlayer2;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.*;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.AliasAndLogoPlayer2;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.AttacksAndChangesPokemonPlayer2;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.AttacksPokemonPlayer2;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.PokemonsToChoosePlayer2;

/**
 * interfaz del combate pokemon
 * @author cristian & chema
 * @version v3.0
 */
public class Battle extends JFrame {

    /**
     * qatributos privados de tipo jpanel de la interfaz
     */
    private static JPanel contentPanel;
    private  static JPanel globalPanelPLayer1;
    private static JPanel aliasLogoPlayer1;
    private static JPanel attacksChangesPokemon1Player1;
    private  static JPanel attacksPanelPlayer1;
    private static JPanel changesPokemonsPLayer1;
    private  static JPanel battlePanel;
    private  static JPanel globalPanelPLayer2;
    private static JPanel aliasLogoPlayer2;
    private static JPanel attacksChangesPokemon1Player2;
    private  static JPanel attacksPanelPlayer2;
    private static JPanel changesPokemonsPLayer2;
    private  static JPanel lifePanelPokemons;


    /**
     * constructor de la clase
     */
    public Battle(){

        /**
         * lo hacemos visible y le damos un layout
         */
        setVisible(true);
        setLayout(new BorderLayout());
        setBounds(600,600,600,600);

        /**
         * hacemos el panel que contendrá a todos los paneles
         */
        contentPanel = new JPanel();
        contentPanel = makeContentPanel();
        add(contentPanel);

        /**
         * instanciamos el panel del jugador 1
         */
        globalPanelPLayer1 = new JPanel();
        globalPanelPLayer1.setLayout(new BoxLayout(globalPanelPLayer1, BoxLayout.Y_AXIS));
        /**
         * iniciamos un panel que será el alias y el logo del jugador 1 y lo hacemos igual a un panel de otra clase
         */
         aliasLogoPlayer1 = new AliasAndLogoPlayer1();
        globalPanelPLayer1.add(aliasLogoPlayer1);
        /**
         * iniciamos un panel que serán los botones de cambio y ataque del jugador 1 y lo hacemos igual a un panel de otra clase
         */
        attacksChangesPokemon1Player1 = new AttacksAndChangesPokemonPlayer1();
        globalPanelPLayer1.add(attacksChangesPokemon1Player1);
        contentPanel.add(globalPanelPLayer1, BorderLayout.WEST);

        /**
         * Jpanel que va a albergar los 4 ataques del pokemon en batalla del jugador 1
         */
        attacksPanelPlayer1 = new JPanel();
        attacksPanelPlayer1.setLayout(new BoxLayout(attacksPanelPlayer1, BoxLayout.Y_AXIS));
        /**
         * lo hacemos igual a un panel con los ataques del pokemon
         */
        attacksPanelPlayer1.add(new AttacksPokemonPlayer1());
        attacksPanelPlayer1.setVisible(false);
        globalPanelPLayer1.add(attacksPanelPlayer1);

        /**
         * iniciamos el panel de cambio de pokemons y le damos un layout
         */
        changesPokemonsPLayer1 = new JPanel();
        changesPokemonsPLayer1.setLayout(new BoxLayout(changesPokemonsPLayer1, BoxLayout.Y_AXIS));

        /**
         * hacemos el panel de cambio de pokemon del jugador 1 clase que es un panel que lo crea
         */
        changesPokemonsPLayer1.add(new PokemonsToChoosePlayer1());
        changesPokemonsPLayer1.setVisible(false);
        globalPanelPLayer1.add(changesPokemonsPLayer1);




        /**
         * iniciamos el panel del jugador 2 y le damos un layout
         */
        globalPanelPLayer2 = new JPanel();
        globalPanelPLayer2.setLayout(new BoxLayout(globalPanelPLayer2, BoxLayout.Y_AXIS));

        /**
         * añadimos al panel global del jugador 2 el logo y alias
         */
        aliasLogoPlayer2 = new AliasAndLogoPlayer2();
        globalPanelPLayer2.add(aliasLogoPlayer2);

        /**
         * añadimos al panel global del jugador 2 los ataques
         */
        attacksChangesPokemon1Player2 = new AttacksAndChangesPokemonPlayer2();
        globalPanelPLayer2.add(attacksChangesPokemon1Player2);
        contentPanel.add(globalPanelPLayer2, BorderLayout.EAST);

        /**
         * iniciamos el panel de ataques del jugador 2
         */
        attacksPanelPlayer2 = new JPanel();
        attacksPanelPlayer2.setLayout(new BoxLayout(attacksPanelPlayer2, BoxLayout.Y_AXIS));
        /**
         * lo hacemos igual a un panel con los ataques del pokemon
         */
        attacksPanelPlayer2.add(new AttacksPokemonPlayer2());
        attacksPanelPlayer2.setVisible(false);
        globalPanelPLayer2.add(attacksPanelPlayer2);

        /**
         * iniciamos el panel de cambio de pokemons y le damos un layout
         */
        changesPokemonsPLayer2 = new JPanel();
        changesPokemonsPLayer2.setLayout(new BoxLayout(changesPokemonsPLayer2, BoxLayout.Y_AXIS));

        /**
         * hacemos el panel de cambio de pokemon del jugador 1 clase que es un panel que lo crea
         */
        changesPokemonsPLayer2.add(new PokemonsToChoosePlayer2());
        changesPokemonsPLayer2.setVisible(false);
        globalPanelPLayer2.add(changesPokemonsPLayer2);

        pokemonBattle();


    }

    /**
     * Metemos las acciones de los botones en un metodo para poder actualizar los cambios
     */
    public static void pokemonBattle(){

        //---------------------------Botones del jugador 1----------------------//
        /**
         * actionListener del boton de atacar
         */
        ButtonInterfaceCombat.getAttackButtonPlayer1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * hace visible un panel y oculta otro
                 */
                clearGlobalPanelPlayer1WhenPressAttack();
            }
        });

        /**
         * acionlistener para volver atras en el menu de atacar
         */
        ButtonInterfaceAttacks.getBackPlayer1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * hace visible un panel y oculta otro
                 */
                clearGlobalPanelPlayer1WhenPressBackinAttack();
            }
        });
        /**
         * actionlistener del boton de cambiar de pokemon
         */
        ButtonInterfaceCombat.getChangePokemonButtonPlayer1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearGlobalPanelPlayer1WhenPressChange();
            }
        });
        /**
         * actionlistener del boton de ir hacia atras en el cambio de pokemon
         */
        ButtonInterfaceChangePokemonPlayer1.getBack().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearGlobalPanelPlayer1WhenPressBackInChangePokemon();
            }
        });
        /**
         * actionListener para cambiar un pokemon por otro
         * al cambiar se actualizan las características y todo
         */
        ButtonInterfaceChangePokemonPlayer1.getPokemon1team().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * llamamos al metodo que actualiza los paneles al cambiar de pokemon
                 */
                new LifePokemonInBattlePlayer1();
                System.out.println("vida de " + ButtonInterfaceChangePokemonPlayer1.getPokemon1team().getText() + ": " + LifePokemonInBattlePlayer1.getLifePokemon1PLayer1());
                clearGlobalPanelPlayer1WhenPressButtonToChangePokemon1InChangePokemon();
                /**
                 * llamamos al propio metodo para actualizar todo
                 */
                pokemonBattle();
            }
        });
        /**
         * actionListener para cambiar un pokemon por otro
         * al cambiar se actualizan las características y todo
         */
        ButtonInterfaceChangePokemonPlayer1.getPokemon2team().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * llamamos al metodo que actualiza los paneles al cambiar de pokemon
                 */
                new LifePokemonInBattlePlayer1();
                System.out.println("vida de " + ButtonInterfaceChangePokemonPlayer1.getPokemon2team().getText() + ": " + LifePokemonInBattlePlayer1.getLifePokemon2PLayer1());
                clearGlobalPanelPlayer1WhenPressButtonToChangePokemon2InChangePokemon();
                /**
                 * llamamos al propio metodo para actualizar todo
                 */
                pokemonBattle();
            }
        });
        /**
         * actionListener para cambiar un pokemon por otro
         * al cambiar se actualizan las características y todo
         */
        ButtonInterfaceChangePokemonPlayer1.getPokemon3team().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * llamamos al metodo que actualiza los paneles al cambiar de pokemon
                 */
                new LifePokemonInBattlePlayer1();
                System.out.println("vida de " + ButtonInterfaceChangePokemonPlayer1.getPokemon3team().getText() + ": " + LifePokemonInBattlePlayer1.getLifePokemon3PLayer1());
                clearGlobalPanelPlayer1WhenPressButtonToChangePokemon3InChangePokemon();
                /**
                 * llamamos al propio metodo para actualizar todo
                 */
                pokemonBattle();
            }
        });



          //---------------------------Botones del jugador 2----------------------//

        /**
         * actionListener del boton de atacar
         */
        ButtonInterfaceCombat.getAttackButtonPlayer2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * hace visible un panel y oculta otro
                 */
                clearGlobalPanelPlayer2WhenPressAttack();
            }
        });

        /**
         * acionlistener para volver atras en el menu de atacar
         */
        ButtonInterfaceAttacks.getBackPlayer2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * hace visible un panel y oculta otro
                 */
                clearGlobalPanelPlayer2WhenPressBackinAttack();
            }
        });
        /**
         * actionlistener del boton de cambiar de pokemon
         */
        ButtonInterfaceCombat.getChangePokemonButtonPlayer2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearGlobalPanelPlayer2WhenPressChange();
            }
        });
        /**
         * actionlistener del boton de ir hacia atras en el cambio de pokemon
         */
        ButtonInterfaceChangePokemonPlayer2.getBack().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearGlobalPanelPlayer2WhenPressBackInChangePokemon();
            }
        });
        /**
         * actionListener para cambiar un pokemon por otro
         * al cambiar se actualizan las características y todo
         */
        ButtonInterfaceChangePokemonPlayer2.getPokemon1team().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * llamamos al metodo que actualiza los paneles al cambiar de pokemon
                 */
                clearGlobalPanelPlayer2WhenPressButtonToChangePokemon1InChangePokemon();
                /**
                 * llamamos al propio metodo para actualizar todo
                 */
                pokemonBattle();
            }
        });
        /**
         * actionListener para cambiar un pokemon por otro
         * al cambiar se actualizan las características y todo
         */
        ButtonInterfaceChangePokemonPlayer2.getPokemon2team().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * llamamos al metodo que actualiza los paneles al cambiar de pokemon
                 */
                clearGlobalPanelPlayer2WhenPressButtonToChangePokemon2InChangePokemon();
                /**
                 * llamamos al propio metodo para actualizar todo
                 */
                pokemonBattle();
            }
        });
        /**
         * actionListener para cambiar un pokemon por otro
         * al cambiar se actualizan las características y todo
         */
        ButtonInterfaceChangePokemonPlayer2.getPokemon3team().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * llamamos al metodo que actualiza los paneles al cambiar de pokemon
                 */
                clearGlobalPanelPlayer2WhenPressButtonToChangePokemon3InChangePokemon();
                /**
                 * llamamos al propio metodo para actualizar todo
                 */
                pokemonBattle();
            }
        });


    }


    /**
     * metodo que hace el panel que contiene a todos los paneles de la interfaz
     * @return el panel creado
     */
    private static JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new BorderLayout());
        return contentPanel;
    }

    //---------------------------metodos para cambios de paneles dle jugador 1-----------------------------------//

    /**
     * metodo que hace visible el panel de ataques y oculta el de ataque y cambio
     */
    private static void clearGlobalPanelPlayer1WhenPressAttack(){

        attacksPanelPlayer1.setVisible(true);
        attacksChangesPokemon1Player1.setVisible(false);
    }

    /**
     * metodo que hace visible el panel de ataque y cambio y oculta el de ataques
     */
    private static void clearGlobalPanelPlayer1WhenPressBackinAttack(){
       attacksPanelPlayer1.setVisible(false);
       attacksChangesPokemon1Player1.setVisible(true);
    }

    /**
     * metodo que hace visible los pokemons a elegir y oculta el de ataque y cambio
     */
    private  static void clearGlobalPanelPlayer1WhenPressChange(){

        changesPokemonsPLayer1.setVisible(true);
        attacksChangesPokemon1Player1.setVisible(false);
    }
    /**
     * metodo que hace visible el ataque y cambio de pokemon y oculta los pokemons a cambiar
     */
    private static void clearGlobalPanelPlayer1WhenPressBackInChangePokemon(){
        changesPokemonsPLayer1.setVisible(false);
        attacksChangesPokemon1Player1.setVisible(true);
    }

    /**
     * metodo para limpiar el panel entero al cambiar de pokemon
     */
    private static  void clearGlobalPanelPlayer1WhenPressButtonToChangePokemon1InChangePokemon(){
        /**
         * establecemos la nueva imagen del pokemon
         */
        ButtonInterfaceCombat.setPathPokemonBattlePlayer1(MethodsBattlePlayer1.newPathIconPokemon1Player1());

        /**
         * establecemos los nuevos valores del primer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack1(MethodsBattlePlayer1.newName1Attack1Pokemon1Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack1(MethodsBattlePlayer1.newColor1Attack1Pokemon1Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack1(MethodsBattlePlayer1.newType1Attack1Pokemon1Player1());

        /**
         * establecemos los nuevos valores del segundo ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack2(MethodsBattlePlayer1.newName2Attack2Pokemon1Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack2(MethodsBattlePlayer1.newColor2Attack2Pokemon1Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack2(MethodsBattlePlayer1.newType2Attack2Pokemon1Player1());

        /**
         * establecemos los nuevos valores del tercer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack3(MethodsBattlePlayer1.newName3Attack3Pokemon1Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack3(MethodsBattlePlayer1.newColor3Attack3Pokemon1Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack3(MethodsBattlePlayer1.newType3Attack3Pokemon1Player1());

        /**
         * establecemos los nuevos valores del cuarto ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack4(MethodsBattlePlayer1.newName4Attack4Pokemon1Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack4(MethodsBattlePlayer1.newColor4Attack4Pokemon1Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack4(MethodsBattlePlayer1.newType4Attack4Pokemon1Player1());



        /**
         * limpiamos el panel de ataque y cambio
         */
        attacksChangesPokemon1Player1.removeAll();
        attacksChangesPokemon1Player1.repaint();
        attacksChangesPokemon1Player1.revalidate();

        /**
         * limpiamos el panel de ataques
         */
        attacksPanelPlayer1.removeAll();
        attacksPanelPlayer1.repaint();
        attacksPanelPlayer1.revalidate();

        /**
         * volvemos a añadir el panel de ataque y cambio
         */
        attacksChangesPokemon1Player1.add(new AttacksAndChangesPokemonPlayer1());
        /**
         * volvemos a añadir el panel de ataques
         */
        attacksPanelPlayer1.add(new AttacksPokemonPlayer1());
        globalPanelPLayer1.add(attacksChangesPokemon1Player1);
        globalPanelPLayer1.add(attacksPanelPlayer1);
        contentPanel.add(globalPanelPLayer1, BorderLayout.WEST);



        contentPanel.repaint();
        contentPanel.revalidate();

        changesPokemonsPLayer1.setVisible(false);
        attacksChangesPokemon1Player1.setVisible(true);
    }
    /**
     * metodo para limpiar el panel entero al cambiar de pokemon
     */
    private static  void clearGlobalPanelPlayer1WhenPressButtonToChangePokemon2InChangePokemon(){
        /**
         * establecemos la nueva imagen del pokemon
         */
        ButtonInterfaceCombat.setPathPokemonBattlePlayer1(MethodsBattlePlayer1.newPathIconPokemon2Player1());

        /**
         * establecemos los nuevos valores del primer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack1(MethodsBattlePlayer1.newName1Attack1Pokemon2Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack1(MethodsBattlePlayer1.newColor1Attack1Pokemon2Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack1(MethodsBattlePlayer1.newType1Attack1Pokemon2Player1());

        /**
         * establecemos los nuevos valores del segundo ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack2(MethodsBattlePlayer1.newName2Attack2Pokemon2Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack2(MethodsBattlePlayer1.newColor2Attack2Pokemon2Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack2(MethodsBattlePlayer1.newType2Attack2Pokemon2Player1());

        /**
         * establecemos los nuevos valores del tercer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack3(MethodsBattlePlayer1.newName3Attack3Pokemon2Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack3(MethodsBattlePlayer1.newColor3Attack3Pokemon2Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack3(MethodsBattlePlayer1.newType3Attack3Pokemon2Player1());

        /**
         * establecemos los nuevos valores del cuarto ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack4(MethodsBattlePlayer1.newName4Attack4Pokemon2Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack4(MethodsBattlePlayer1.newColor4Attack4Pokemon2Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack4(MethodsBattlePlayer1.newType4Attack4Pokemon2Player1());



        /**
         * limpiamos el panel de ataque y cambio
         */
        attacksChangesPokemon1Player1.removeAll();
        attacksChangesPokemon1Player1.repaint();
        attacksChangesPokemon1Player1.revalidate();

        /**
         * limpiamos el panel de ataques
         */
        attacksPanelPlayer1.removeAll();
        attacksPanelPlayer1.repaint();
        attacksPanelPlayer1.revalidate();

        /**
         * volvemos a añadir el panel de ataque y cambio
         */
        attacksChangesPokemon1Player1.add(new AttacksAndChangesPokemonPlayer1());
        /**
         * volvemos a añadir el panel de ataques
         */
        attacksPanelPlayer1.add(new AttacksPokemonPlayer1());
        globalPanelPLayer1.add(attacksChangesPokemon1Player1);
        globalPanelPLayer1.add(attacksPanelPlayer1);
        contentPanel.add(globalPanelPLayer1, BorderLayout.WEST);



        contentPanel.repaint();
        contentPanel.revalidate();

        changesPokemonsPLayer1.setVisible(false);
        attacksChangesPokemon1Player1.setVisible(true);
    }
    /**
     * metodo para limpiar el panel entero al cambiar de pokemon
     */
    private static  void clearGlobalPanelPlayer1WhenPressButtonToChangePokemon3InChangePokemon(){
        /**
         * establecemos la nueva imagen del pokemon
         */
        ButtonInterfaceCombat.setPathPokemonBattlePlayer1(MethodsBattlePlayer1.newPathIconPokemon3Player1());

        /**
         * establecemos los nuevos valores del primer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack1(MethodsBattlePlayer1.newName1Attack1Pokemon3Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack1(MethodsBattlePlayer1.newColor1Attack1Pokemon3Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack1(MethodsBattlePlayer1.newType1Attack1Pokemon3Player1());

        /**
         * establecemos los nuevos valores del segundo ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack2(MethodsBattlePlayer1.newName2Attack2Pokemon3Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack2(MethodsBattlePlayer1.newColor2Attack2Pokemon3Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack2(MethodsBattlePlayer1.newType2Attack2Pokemon3Player1());

        /**
         * establecemos los nuevos valores del tercer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack3(MethodsBattlePlayer1.newName3Attack3Pokemon3Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack3(MethodsBattlePlayer1.newColor3Attack3Pokemon3Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack3(MethodsBattlePlayer1.newType3Attack3Pokemon3Player1());

        /**
         * establecemos los nuevos valores del cuarto ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack4(MethodsBattlePlayer1.newName4Attack4Pokemon3Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack4(MethodsBattlePlayer1.newColor4Attack4Pokemon3Player1());
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack4(MethodsBattlePlayer1.newType4Attack4Pokemon3Player1());



        /**
         * limpiamos el panel de ataque y cambio
         */
        attacksChangesPokemon1Player1.removeAll();
        attacksChangesPokemon1Player1.repaint();
        attacksChangesPokemon1Player1.revalidate();

        /**
         * limpiamos el panel de ataques
         */
        attacksPanelPlayer1.removeAll();
        attacksPanelPlayer1.repaint();
        attacksPanelPlayer1.revalidate();

        /**
         * volvemos a añadir el panel de ataque y cambio
         */
        attacksChangesPokemon1Player1.add(new AttacksAndChangesPokemonPlayer1());
        /**
         * volvemos a añadir el panel de ataques
         */
        attacksPanelPlayer1.add(new AttacksPokemonPlayer1());
        globalPanelPLayer1.add(attacksChangesPokemon1Player1);
        globalPanelPLayer1.add(attacksPanelPlayer1);
        contentPanel.add(globalPanelPLayer1, BorderLayout.WEST);



        contentPanel.repaint();
        contentPanel.revalidate();

        changesPokemonsPLayer1.setVisible(false);
        attacksChangesPokemon1Player1.setVisible(true);
    }
    //---------------------------metodos para cambios de paneles dle jugador 2-----------------------------------//

    /**
     * metodo que hace visible el panel de ataques y oculta el de ataque y cambio
     */
    private static void clearGlobalPanelPlayer2WhenPressAttack(){

        attacksPanelPlayer2.setVisible(true);
        attacksChangesPokemon1Player2.setVisible(false);
    }

    /**
     * metodo que hace visible el panel de ataque y cambio y oculta el de ataques
     */
    private static void clearGlobalPanelPlayer2WhenPressBackinAttack(){
        attacksPanelPlayer2.setVisible(false);
        attacksChangesPokemon1Player2.setVisible(true);
    }

    /**
     * metodo que hace visible los pokemons a elegir y oculta el de ataque y cambio
     */
    private  static void clearGlobalPanelPlayer2WhenPressChange(){

        changesPokemonsPLayer2.setVisible(true);
        attacksChangesPokemon1Player2.setVisible(false);
    }
    /**
     * metodo que hace visible el ataque y cambio de pokemon y oculta los pokemons a cambiar
     */
    private static void clearGlobalPanelPlayer2WhenPressBackInChangePokemon(){
        changesPokemonsPLayer2.setVisible(false);
        attacksChangesPokemon1Player2.setVisible(true);
    }


    /**
     * metodo para limpiar el panel entero al cambiar de pokemon
     */
    private static  void clearGlobalPanelPlayer2WhenPressButtonToChangePokemon1InChangePokemon(){
        /**
         * establecemos la nueva imagen del pokemon
         */
        ButtonInterfaceCombat.setPathPokemonBattlePlayer2(MethodsBattlePlayer2.newPathIconPokemon1Player2());

        /**
         * establecemos los nuevos valores del primer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack1(MethodsBattlePlayer2.newName1Attack1Pokemon1Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack1(MethodsBattlePlayer2.newColor1Attack1Pokemon1Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack1(MethodsBattlePlayer2.newType1Attack1Pokemon1Player2());

        /**
         * establecemos los nuevos valores del segundo ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack2(MethodsBattlePlayer2.newName2Attack2Pokemon1Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack2(MethodsBattlePlayer2.newColor2Attack2Pokemon1Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack2(MethodsBattlePlayer2.newType2Attack2Pokemon1Player2());

        /**
         * establecemos los nuevos valores del tercer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack3(MethodsBattlePlayer2.newName3Attack3Pokemon1Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack3(MethodsBattlePlayer2.newColor3Attack3Pokemon1Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack3(MethodsBattlePlayer2.newType3Attack3Pokemon1Player2());

        /**
         * establecemos los nuevos valores del cuarto ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack4(MethodsBattlePlayer2.newName4Attack4Pokemon1Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack4(MethodsBattlePlayer2.newColor4Attack4Pokemon1Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack4(MethodsBattlePlayer2.newType4Attack4Pokemon1Player2());



        /**
         * limpiamos el panel de ataque y cambio
         */
        attacksChangesPokemon1Player2.removeAll();
        attacksChangesPokemon1Player2.repaint();
        attacksChangesPokemon1Player2.revalidate();

        /**
         * limpiamos el panel de ataques
         */
        attacksPanelPlayer2.removeAll();
        attacksPanelPlayer2.repaint();
        attacksPanelPlayer2.revalidate();

        /**
         * volvemos a añadir el panel de ataque y cambio
         */
        attacksChangesPokemon1Player2.add(new AttacksAndChangesPokemonPlayer2());
        /**
         * volvemos a añadir el panel de ataques
         */
        attacksPanelPlayer2.add(new AttacksPokemonPlayer2());
        globalPanelPLayer2.add(attacksChangesPokemon1Player2);
        globalPanelPLayer2.add(attacksPanelPlayer2);
        contentPanel.add(globalPanelPLayer2, BorderLayout.EAST);



        contentPanel.repaint();
        contentPanel.revalidate();

        changesPokemonsPLayer2.setVisible(false);
        attacksChangesPokemon1Player2.setVisible(true);
    }
    /**
     * metodo para limpiar el panel entero al cambiar de pokemon
     */
    private static void clearGlobalPanelPlayer2WhenPressButtonToChangePokemon2InChangePokemon(){
        /**
         * establecemos la nueva imagen del pokemon
         */
        ButtonInterfaceCombat.setPathPokemonBattlePlayer2(MethodsBattlePlayer2.newPathIconPokemon2Player2());

        /**
         * establecemos los nuevos valores del primer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack1(MethodsBattlePlayer2.newName1Attack1Pokemon2Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack1(MethodsBattlePlayer2.newColor1Attack1Pokemon2Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack1(MethodsBattlePlayer2.newType1Attack1Pokemon2Player2());

        /**
         * establecemos los nuevos valores del segundo ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack2(MethodsBattlePlayer2.newName2Attack2Pokemon2Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack2(MethodsBattlePlayer2.newColor2Attack2Pokemon2Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack2(MethodsBattlePlayer2.newType2Attack2Pokemon2Player2());

        /**
         * establecemos los nuevos valores del tercer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack3(MethodsBattlePlayer2.newName3Attack3Pokemon2Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack3(MethodsBattlePlayer2.newColor3Attack3Pokemon2Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack3(MethodsBattlePlayer2.newType3Attack3Pokemon2Player2());

        /**
         * establecemos los nuevos valores del cuarto ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack4(MethodsBattlePlayer2.newName4Attack4Pokemon2Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack4(MethodsBattlePlayer2.newColor4Attack4Pokemon2Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack4(MethodsBattlePlayer2.newType4Attack4Pokemon2Player2());



        /**
         * limpiamos el panel de ataque y cambio
         */
        attacksChangesPokemon1Player2.removeAll();
        attacksChangesPokemon1Player2.repaint();
        attacksChangesPokemon1Player2.revalidate();

        /**
         * limpiamos el panel de ataques
         */
        attacksPanelPlayer2.removeAll();
        attacksPanelPlayer2.repaint();
        attacksPanelPlayer2.revalidate();

        /**
         * volvemos a añadir el panel de ataque y cambio
         */
        attacksChangesPokemon1Player2.add(new AttacksAndChangesPokemonPlayer2());
        /**
         * volvemos a añadir el panel de ataques
         */
        attacksPanelPlayer2.add(new AttacksPokemonPlayer2());
        globalPanelPLayer2.add(attacksChangesPokemon1Player2);
        globalPanelPLayer2.add(attacksPanelPlayer2);
        contentPanel.add(globalPanelPLayer2, BorderLayout.EAST);



        contentPanel.repaint();
        contentPanel.revalidate();

        changesPokemonsPLayer2.setVisible(false);
        attacksChangesPokemon1Player2.setVisible(true);
    }
    /**
     * metodo para limpiar el panel entero al cambiar de pokemon
     */
    private static  void clearGlobalPanelPlayer2WhenPressButtonToChangePokemon3InChangePokemon(){
        /**
         * establecemos la nueva imagen del pokemon
         */
        ButtonInterfaceCombat.setPathPokemonBattlePlayer2(MethodsBattlePlayer2.newPathIconPokemon3Player2());

        /**
         * establecemos los nuevos valores del primer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack1(MethodsBattlePlayer2.newName1Attack1Pokemon3Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack1(MethodsBattlePlayer2.newColor1Attack1Pokemon3Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack1(MethodsBattlePlayer2.newType1Attack1Pokemon3Player2());

        /**
         * establecemos los nuevos valores del segundo ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack2(MethodsBattlePlayer2.newName2Attack2Pokemon3Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack2(MethodsBattlePlayer2.newColor2Attack2Pokemon3Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack2(MethodsBattlePlayer2.newType2Attack2Pokemon3Player2());

        /**
         * establecemos los nuevos valores del tercer ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack3(MethodsBattlePlayer2.newName3Attack3Pokemon3Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack3(MethodsBattlePlayer2.newColor3Attack3Pokemon3Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack3(MethodsBattlePlayer2.newType3Attack3Pokemon3Player2());

        /**
         * establecemos los nuevos valores del cuarto ataque
         */
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack4(MethodsBattlePlayer2.newName4Attack4Pokemon3Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack4(MethodsBattlePlayer2.newColor4Attack4Pokemon3Player2());
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack4(MethodsBattlePlayer2.newType4Attack4Pokemon3Player2());



        /**
         * limpiamos el panel de ataque y cambio
         */
        attacksChangesPokemon1Player2.removeAll();
        attacksChangesPokemon1Player2.repaint();
        attacksChangesPokemon1Player2.revalidate();

        /**
         * limpiamos el panel de ataques
         */
        attacksPanelPlayer2.removeAll();
        attacksPanelPlayer2.repaint();
        attacksPanelPlayer2.revalidate();

        /**
         * volvemos a añadir el panel de ataque y cambio
         */
        attacksChangesPokemon1Player2.add(new AttacksAndChangesPokemonPlayer2());
        /**
         * volvemos a añadir el panel de ataques
         */
        attacksPanelPlayer2.add(new AttacksPokemonPlayer2());
        globalPanelPLayer2.add(attacksChangesPokemon1Player2);
        globalPanelPLayer2.add(attacksPanelPlayer2);
        contentPanel.add(globalPanelPLayer2, BorderLayout.EAST);



        contentPanel.repaint();
        contentPanel.revalidate();

        changesPokemonsPLayer2.setVisible(false);
        attacksChangesPokemon1Player2.setVisible(true);
    }


    /**
     * getter y setter de los atributos de la clase
     * @return los atributos
     */
    public JPanel getContentPanel() {
        return contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public JPanel getGlobalPanelPLayer1() {
        return globalPanelPLayer1;
    }

    public void setGlobalPanelPLayer1(JPanel globalPanelPLayer1) {
        this.globalPanelPLayer1 = globalPanelPLayer1;
    }

    public JPanel getAttacksPanelPlayer1() {
        return attacksPanelPlayer1;
    }

    public void setAttacksPanelPlayer1(JPanel attacksPanelPlayer1) {
        this.attacksPanelPlayer1 = attacksPanelPlayer1;
    }

    public JPanel getBattlePanel() {
        return battlePanel;
    }

    public void setBattlePanel(JPanel battlePanel) {
        this.battlePanel = battlePanel;
    }

    public JPanel getGlobalPanelPLayer2() {
        return globalPanelPLayer2;
    }

    public void setGlobalPanelPLayer2(JPanel globalPanelPLayer2) {
        this.globalPanelPLayer2 = globalPanelPLayer2;
    }

    public JPanel getLifePanelPokemons() {
        return lifePanelPokemons;
    }

    public void setLifePanelPokemons(JPanel lifePanelPokemons) {
        this.lifePanelPokemons = lifePanelPokemons;
    }
}

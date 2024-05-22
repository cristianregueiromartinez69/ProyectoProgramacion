package com.dam.proyectoprogramacion.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceAttacks;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer1;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer2;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.methods.battle.*;
import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.*;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.*;
import com.dam.proyectoprogramacion.panels.battle.logicalbattle.PanelImageBattlePokemon;
import com.dam.proyectoprogramacion.panels.battle.logicalbattle.TextAreaPanelBattle;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer2Luck;

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
    private static JPanel attacksChangesPokemon1Player1;
    private  static JPanel attacksPanelPlayer1;
    private static JPanel changesPokemonsPLayer1;
    private  static JPanel battlePanel;
    private  static JPanel globalPanelPLayer2;
    private static JPanel attacksChangesPokemon1Player2;
    private  static JPanel attacksPanelPlayer2;
    private static JPanel changesPokemonsPLayer2;
    private  static JPanel lifePanelPokemon;
    private static JPanel textAreaPanel;

    /**
     * atributos privados de tipo int para saber la velocidad de los pokemons
     */
   private static int speedPlayer1 = MethodsBattlePlayer1.getSpeedPokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1());
   private static int speedPlayer2 = MethodsBattlePlayer2.getSpeedPokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2());

   /**
    * atributos privados de tipo int para saber el daño de los pokemons
    */
   private static int damagePlayer1;
   private static int damagePlayer2;





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

        //---------------------paneles del jugador 1-------------------//

        /**
         * instanciamos el panel del jugador 1
         */
        globalPanelPLayer1 = new JPanel();
        globalPanelPLayer1.setLayout(new BoxLayout(globalPanelPLayer1, BoxLayout.Y_AXIS));
        /**
         * iniciamos un panel que será el alias y el logo del jugador 1 y lo hacemos igual a un panel de otra clase
         */

        globalPanelPLayer1.add(new AliasAndLogoPlayer1());
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
         * iniciamos el panel de la vida del pokemon
         */
        lifePanelPokemon = new JPanel();
        lifePanelPokemon.setLayout(new FlowLayout());
        contentPanel.add(lifePanelPokemon, BorderLayout.NORTH);


        /**
         * añadimos al panel de la vida del pokemon un panel que será la vida del pokemon en batalla
         */
        lifePanelPokemon.add(new LifePokemonInBattlePlayer1(MethodsLifeBattlePokemonPlayer1.getLifePokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1())));



        //---------------------paneles del jugador 2-------------------//




        /**
         * iniciamos el panel del jugador 2 y le damos un layout
         */
        globalPanelPLayer2 = new JPanel();
        globalPanelPLayer2.setLayout(new BoxLayout(globalPanelPLayer2, BoxLayout.Y_AXIS));

        /**
         * añadimos al panel global del jugador 2 el logo y alias
         */

        globalPanelPLayer2.add(new AliasAndLogoPlayer2());

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


        /**
         * lo añadimos
         */
        lifePanelPokemon.add(new LifePokemonInBattlePlayer2(MethodsLifeBattlePokemonPlayer2.getLifePokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()
                ), MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2())));

        //---------------------paneles de ambos jugadores-------------------//

        /**
         * iniciamos el panel de texto de la batalla
         */
        textAreaPanel = new JPanel();
        contentPanel.add(textAreaPanel, BorderLayout.SOUTH);

        textAreaPanel.add(new TextAreaPanelBattle());

        /**
         * iniciamos el panel de batalla pokemon
         * lo añadimos al panel central
         */
        battlePanel = new JPanel();
        contentPanel.add(battlePanel, BorderLayout.CENTER);
        /**
         * el panel de batalla será igual al que tiene las siguientes imagenes:
         * 1. el del pokemon en batalla del jugador 1
         * 2. el del pokemon en batalla del jugador 2
         * 3. el escenario de la batalla pokemon
         */
        battlePanel.add(new PanelImageBattlePokemon());



        /**
         * llamamos al metodo que contiene los actionListener de los botones
         */
        pokemonBattle();


    }

    /**
     * Metemos las acciones de los botones en un metodo para poder actualizar los cambios
     */
    public void pokemonBattle(){

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
         * actionListener del boton de ataque 1 del jugador 1
         */
        ButtonInterfaceAttacks.getAttack1Player1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


              clearGlobalPanelPlayer1WhenPressAttack1Buttons();

            }
        });
        ButtonInterfaceAttacks.getAttack1Player1().addActionListener(this::putInformationAreaTextBattlePlayer1);
        /**
         * actionListener del boton de ataque 2 del jugador 1
         */
        ButtonInterfaceAttacks.getAttack2PLayer1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                                clearGlobalPanelPlayer1WhenPressAttack2Buttons();
            }
        });
        ButtonInterfaceAttacks.getAttack2PLayer1().addActionListener(this::putInformationAreaTextBattlePlayer1);

        /**
         * actionListener del boton de ataque 3 del jugador 1
         */
        ButtonInterfaceAttacks.getAttack3Player1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                               clearGlobalPanelPlayer1WhenPressAttack3Buttons();
            }
        });
        ButtonInterfaceAttacks.getAttack3Player1().addActionListener(this::putInformationAreaTextBattlePlayer1);

        /**
         * actionListener del boton de ataque 4 del jugador 1
         */
        ButtonInterfaceAttacks.getAttack4Player1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 clearGlobalPanelPlayer1WhenPressAttack4Buttons();
            }
        });
        ButtonInterfaceAttacks.getAttack4Player1().addActionListener(this::putInformationAreaTextBattlePlayer1);

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
         * llamamos otra vez a los listener de los cambios de pokemon para actualizar la vida
         */
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
         * al cambiar se actualizan las características y all
         */
        ButtonInterfaceChangePokemonPlayer1.getPokemon1team().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /**
                 * llamamos al metodo que actualiza los paneles al cambiar de pokemon
                 */
                clearGlobalPanelPlayer1WhenPressButtonToChangePokemon1InChangePokemon();
                /**
                 * llamamos al propio metodo para actualizar all
                 */

                pokemonBattle();
                /**
                 * llamamos al metodo que pone el sonido de cambio de pokemon
                 */
                MethodsSongBattle.PutPokemonSoundOnExitAndChangeInBattle(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1());

            }
        });
        ButtonInterfaceChangePokemonPlayer1.getPokemon1team().addActionListener(this::putInformationAreaTextBattlePlayer1);
        /**
         * actionListener para cambiar un pokemon por otro
         * al cambiar se actualizan las características y all
         */
        ButtonInterfaceChangePokemonPlayer1.getPokemon2team().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * llamamos al metodo que actualiza los paneles al cambiar de pokemon
                 */
                clearGlobalPanelPlayer1WhenPressButtonToChangePokemon2InChangePokemon();
                /**
                 * llamamos al propio metodo para actualizar all
                 */
                pokemonBattle();
                /**
                 * llamamos al metodo que pone el sonido de cambio de pokemon
                 */
                MethodsSongBattle.PutPokemonSoundOnExitAndChangeInBattle(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1());

            }
        });

        ButtonInterfaceChangePokemonPlayer1.getPokemon2team().addActionListener(this::putInformationAreaTextBattlePlayer1);

        /**
         * actionListener para cambiar un pokemon por otro
         * al cambiar se actualizan las características y all
         */
        ButtonInterfaceChangePokemonPlayer1.getPokemon3team().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * llamamos al metodo que actualiza los paneles al cambiar de pokemon
                 */
                clearGlobalPanelPlayer1WhenPressButtonToChangePokemon3InChangePokemon();
                /**
                 * llamamos al propio metodo para actualizar
                 */

                pokemonBattle();
                /**
                 * llamamos al metodo que pone el sonido de cambio de pokemon
                 */
                MethodsSongBattle.PutPokemonSoundOnExitAndChangeInBattle(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1());

            }
        });
        ButtonInterfaceChangePokemonPlayer1.getPokemon3team().addActionListener(this::putInformationAreaTextBattlePlayer1);





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
         * actionListener del boton de ataque 1 del jugador 1
         */
        ButtonInterfaceAttacks.getAttack1Player2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                       clearGlobalPanelPlayer2WhenPressAttack1Buttons();
            }
        });
        ButtonInterfaceAttacks.getAttack1Player2().addActionListener(this::putInformationAreaTextBattlePlayer2);
        /**
         * actionListener del boton de ataque 2 del jugador 1
         */
        ButtonInterfaceAttacks.getAttack2PLayer2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                clearGlobalPanelPlayer2WhenPressAttack2Buttons();
            }
        });
        ButtonInterfaceAttacks.getAttack2PLayer2().addActionListener(this::putInformationAreaTextBattlePlayer2);

        /**
         * actionListener del boton de ataque 3 del jugador 1
         */
        ButtonInterfaceAttacks.getAttack3Player2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                      clearGlobalPanelPlayer2WhenPressAttack3Buttons();
            }
        });
        ButtonInterfaceAttacks.getAttack3Player2().addActionListener(this::putInformationAreaTextBattlePlayer2);

        /**
         * actionListener del boton de ataque 4 del jugador 1
         */
        ButtonInterfaceAttacks.getAttack4Player2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                          clearGlobalPanelPlayer2WhenPressAttack4Buttons();
            }
        });
        ButtonInterfaceAttacks.getAttack4Player2().addActionListener(this::putInformationAreaTextBattlePlayer2);


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
                 * llamamos al propio metodo para actualizar all
                 */
                pokemonBattle();
                /**
                 * llamamos al metodo que pone el sonido de cambio de pokemon
                 */
                MethodsSongBattle.PutPokemonSoundOnExitAndChangeInBattle(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2());

            }
        });
        ButtonInterfaceChangePokemonPlayer2.getPokemon1team().addActionListener(this::putInformationAreaTextBattlePlayer2);


        /**
         * actionListener para cambiar un pokemon por otro
         * al cambiar se actualizan las características y all
         */
        ButtonInterfaceChangePokemonPlayer2.getPokemon2team().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * llamamos al metodo que actualiza los paneles al cambiar de pokemon
                 */
                clearGlobalPanelPlayer2WhenPressButtonToChangePokemon2InChangePokemon();
                /**
                 * llamamos al propio metodo para actualizar all
                 */

                pokemonBattle();
                /**
                 * llamamos al metodo que pone el sonido de cambio de pokemon
                 */
                MethodsSongBattle.PutPokemonSoundOnExitAndChangeInBattle(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2());

            }
        });
        ButtonInterfaceChangePokemonPlayer2.getPokemon2team().addActionListener(this::putInformationAreaTextBattlePlayer2);

        /**
         * actionListener para cambiar un pokemon por otro
         * al cambiar se actualizan las características y all
         */
        ButtonInterfaceChangePokemonPlayer2.getPokemon3team().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * llamamos al metodo que actualiza los paneles al cambiar de pokemon
                 */
                clearGlobalPanelPlayer2WhenPressButtonToChangePokemon3InChangePokemon();
                /**
                 * llamamos al propio metodo para actualizar all
                 */

                pokemonBattle();
                /**
                 * llamamos al metodo que pone el sonido de cambio de pokemon
                 */
                MethodsSongBattle.PutPokemonSoundOnExitAndChangeInBattle(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2());

            }
        });
        ButtonInterfaceChangePokemonPlayer2.getPokemon3team().addActionListener(this::putInformationAreaTextBattlePlayer2);
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
    private static void clearGlobalPanelPlayer1WhenPressAttack() {
        /**
         * si la velocidad del jugador 1 es mayor que la del jugador 2 y es el turno del jugador 1
         * se hace visible el panel de ataques y se oculta el de ataque y cambio
         */
        if (speedPlayer1 > speedPlayer2 && MethodsBattlePokemon.turnsToCombat() == 1) {
            attacksPanelPlayer1.setVisible(true);
            attacksChangesPokemon1Player1.setVisible(false);

            /**
             * si la velocidad del jugador 1 es menor que la del jugador 2 y es el turno del jugador 2
             * se hace visible el panel de ataques y se oculta el de ataque y cambio
             */
        } else if (speedPlayer1 < speedPlayer2 && MethodsBattlePokemon.turnsToCombat() == 2) {
            attacksPanelPlayer1.setVisible(true);
            attacksChangesPokemon1Player1.setVisible(false);

        }
    }

    /**
     * metodo para atacar y hacer visivle el panel de atacar y cambio e invisible el de ataques del jugador 1
     */
    private static void clearGlobalPanelPlayer1WhenPressAttack1Buttons(){


            attacksPanelPlayer1.setVisible(false);
            attacksChangesPokemon1Player1.setVisible(true);
            /**
             * llamamos al metodo que calcula el daño del ataque
             */
            damagePlayer1 = (int) MethodsBattlePokemon.getDamageAttacksPokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1(),
                    MethodsTextAreaBattlePlayer1.getTypeAttack1PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                    MethodsBattlePlayer1.getAmountAttackPokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                    MethodsBattlePlayer1.getPowerAttack1PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                    MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2(), MethodsBattlePlayer1.getDefenseOpposingPokemonInBattle(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()));

            /**
             * llamamos al hashmap para recoger la vida del pokemon en batalla
             */
        int currentLife = MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2());
        /**
         * llamamos al hashmap para poner la vida del pokemon en batalla
         */
        MethodsBattlePokemon.putValuesLifePokemonsPlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2(), currentLife - damagePlayer1);
        /**
         * llamamos al panel de la vida del pokemon para poner la vida del pokemon despues de recibir daño
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().setValue(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()));
        /**
         * llamamos al panel de la vida del pokemon para poner el color de la barra de vida
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().setForeground(LifePokemonInBattlePlayer2.getBackgroundColorLifeBarPokemonPlayer2(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2())));
        /**
         * llamamos al panel de la vida del pokemon para repintar la barra de vida
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().repaint();

        /**
         * si el pokemon del jugador 2 muere tendrá que ser forzado a cambiar de pokemon
         */
        if(!MethodsBattlePokemon.isPokemonAlivePlayer2(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()))){
            MethodsBattlePokemon.changePokemonWhenDiesPokemonInBattlePlayer2();
            MethodsBattlePokemon.setTurnsToCombat(1);

        }


        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 1){
            MethodsBattlePokemon.setTurnsToCombat(2);
        }
        else if(MethodsBattlePokemon.turnsToCombat() == 2){
            MethodsBattlePokemon.setTurnsToCombat(1);
        }


    }
    /**
     * metodo para atacar y hacer visible el panel de atacar y cambio e invisible el de ataques del jugador 1
     */
    private static void clearGlobalPanelPlayer1WhenPressAttack2Buttons(){


            attacksPanelPlayer1.setVisible(false);
            attacksChangesPokemon1Player1.setVisible(true);

            /**
             * llamamos al metodo que calcula el daño del ataque
             */
        damagePlayer1 = (int) MethodsBattlePokemon.getDamageAttacksPokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1(),
                MethodsTextAreaBattlePlayer1.getTypeAttack2PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                MethodsBattlePlayer1.getAmountAttackPokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                MethodsBattlePlayer1.getPowerAttack2PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2(), MethodsBattlePlayer1.getDefenseOpposingPokemonInBattle(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()));

        /**
         * llamamos al hashmap para recoger la vida del pokemon en batalla
         */
        int currentLife = MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2());
        /**
         * llamamos al hashmap para poner la vida del pokemon en batalla
         */
        MethodsBattlePokemon.putValuesLifePokemonsPlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2(), currentLife - damagePlayer1);
        /**
         * llamamos al panel de la vida del pokemon para poner la vida del pokemon despues de recibir daño
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().setValue(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()));
        /**
         * llamamos al panel de la vida del pokemon para poner el color de la barra de vida
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().setForeground(LifePokemonInBattlePlayer2.getBackgroundColorLifeBarPokemonPlayer2(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2())));
        /**
         * llamamos al panel de la vida del pokemon para repintar la barra de vida
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().repaint();

        /**
         * si el pokemon del jugador 2 muere tendrá que ser forzado a cambiar de pokemon
         */
        if(!MethodsBattlePokemon.isPokemonAlivePlayer2(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()))){
            MethodsBattlePokemon.changePokemonWhenDiesPokemonInBattlePlayer2();
            MethodsBattlePokemon.setTurnsToCombat(1);

        }

        /**
         * cambiamos los turnos de los jugadores
         */
            if(MethodsBattlePokemon.turnsToCombat()== 1){
                MethodsBattlePokemon.setTurnsToCombat(2);
            }
            else if(MethodsBattlePokemon.turnsToCombat() == 2){
                MethodsBattlePokemon.setTurnsToCombat(1);
            }



    }
    /**
     * metodo para atacar y hacer visible el panel de atacar y cambio e invisible el de ataques del jugador 1
     */
    private static void clearGlobalPanelPlayer1WhenPressAttack3Buttons(){

            attacksPanelPlayer1.setVisible(false);
            attacksChangesPokemon1Player1.setVisible(true);
            /**
             * llamamos al metodo que calcula el daño del ataque
             */
        damagePlayer1 = (int) MethodsBattlePokemon.getDamageAttacksPokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1(),
                MethodsTextAreaBattlePlayer1.getTypeAttack3PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                MethodsBattlePlayer1.getAmountAttackPokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                MethodsBattlePlayer1.getPowerAttack3PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2(), MethodsBattlePlayer1.getDefenseOpposingPokemonInBattle(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()));

        /**
         * llamamos al hashmap para recoger la vida del pokemon en batalla
         */
        int currentLife = MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2());
        /**
         * llamamos al hashmap para poner la vida del pokemon en batalla
         */
        MethodsBattlePokemon.putValuesLifePokemonsPlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2(), currentLife - damagePlayer1);
        /**
         * llamamos al panel de la vida del pokemon para poner la vida del pokemon despues de recibir daño
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().setValue(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()));
        /**
         * llamamos al panel de la vida del pokemon para poner el color de la barra de vida
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().setForeground(LifePokemonInBattlePlayer2.getBackgroundColorLifeBarPokemonPlayer2(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2())));
        /**
         * llamamos al panel de la vida del pokemon para repintar la barra de vida
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().repaint();

        /**
         * si el pokemon del jugador 2 muere tendrá que ser forzado a cambiar de pokemon
         */
        if(!MethodsBattlePokemon.isPokemonAlivePlayer2(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()))){
            MethodsBattlePokemon.changePokemonWhenDiesPokemonInBattlePlayer2();
            MethodsBattlePokemon.setTurnsToCombat(1);

        }
        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 1){
                MethodsBattlePokemon.setTurnsToCombat(2);
            }
            else if(MethodsBattlePokemon.turnsToCombat() == 2){
                MethodsBattlePokemon.setTurnsToCombat(1);
            }

    }
    private static void clearGlobalPanelPlayer1WhenPressAttack4Buttons(){

            attacksPanelPlayer1.setVisible(false);
            attacksChangesPokemon1Player1.setVisible(true);

        damagePlayer1 = (int) MethodsBattlePokemon.getDamageAttacksPokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1(),
                MethodsTextAreaBattlePlayer1.getTypeAttack4PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                MethodsBattlePlayer1.getAmountAttackPokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                MethodsBattlePlayer1.getPowerAttack4PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2(), MethodsBattlePlayer1.getDefenseOpposingPokemonInBattle(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()));
        /**
         * llamamos al hashmap para recoger la vida del pokemon en batalla
         */
        int currentLife = MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2());
        /**
         * llamamos al hashmap para poner la vida del pokemon en batalla
         */
        MethodsBattlePokemon.putValuesLifePokemonsPlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2(), currentLife - damagePlayer1);
        /**
         * llamamos al panel de la vida del pokemon para poner la vida del pokemon despues de recibir daño
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().setValue(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()));
        /**
         * llamamos al panel de la vida del pokemon para poner el color de la barra de vida
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().setForeground(LifePokemonInBattlePlayer2.getBackgroundColorLifeBarPokemonPlayer2(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2())));
        /**
         * llamamos al panel de la vida del pokemon para repintar la barra de vida
         */
        LifePokemonInBattlePlayer2.getLifePokemonBarPlayer2().repaint();

        /**
         * si el pokemon del jugador 2 muere tendrá que ser forzado a cambiar de pokemon
         */
        if(!MethodsBattlePokemon.isPokemonAlivePlayer2(MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()))){
            MethodsBattlePokemon.changePokemonWhenDiesPokemonInBattlePlayer2();
            MethodsBattlePokemon.setTurnsToCombat(1);

        }
            /**
             * cambiamos los turnos de los jugadores
             */
            if(MethodsBattlePokemon.turnsToCombat()== 1){
                MethodsBattlePokemon.setTurnsToCombat(2);
            }
            else if(MethodsBattlePokemon.turnsToCombat() == 2){
                MethodsBattlePokemon.setTurnsToCombat(1);
            }
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
        /**
         * si la velocidad del jugador 1 es mayor que la del jugador 2 y es el turno del jugador 1
         * se hace visible el panel de cambio de pokemons y se oculta el de ataque y cambio
         */
        if(speedPlayer1 > speedPlayer2 && MethodsBattlePokemon.turnsToCombat() == 1){
            changesPokemonsPLayer1.setVisible(true);
            attacksChangesPokemon1Player1.setVisible(false);

        }
        else if(speedPlayer1 < speedPlayer2 && MethodsBattlePokemon.turnsToCombat() == 2){
            changesPokemonsPLayer1.setVisible(true);
            attacksChangesPokemon1Player1.setVisible(false);
        }
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
        clearContentPanel();
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

        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setImagePokemonInBattlePlayer1(MethodsBattlePlayer1.newImagePokemonInBattle1Player1());


        /**
         * lo añadimos
         */
        contentPanel.add(makeAgainContentPanel(contentPanel));


        revalidateContentPanel();
        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 1){
            MethodsBattlePokemon.setTurnsToCombat(2);
        }
        else if(MethodsBattlePokemon.turnsToCombat() == 2){
            MethodsBattlePokemon.setTurnsToCombat(1);
        }
        changesPokemonsPLayer1.setVisible(false);
        attacksChangesPokemon1Player1.setVisible(true);
    }
    /**
     * metodo para limpiar el panel entero al cambiar de pokemon
     */
    private static  void clearGlobalPanelPlayer1WhenPressButtonToChangePokemon2InChangePokemon(){

        clearContentPanel();
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

        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setImagePokemonInBattlePlayer1(MethodsBattlePlayer1.newImagePokemonInBattle2Player1());


        contentPanel.add(makeAgainContentPanel(contentPanel));
        revalidateContentPanel();

        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 1){
            MethodsBattlePokemon.setTurnsToCombat(2);
        }
        else if(MethodsBattlePokemon.turnsToCombat() == 2){
            MethodsBattlePokemon.setTurnsToCombat(1);
        }

        changesPokemonsPLayer1.setVisible(false);
        attacksChangesPokemon1Player1.setVisible(true);
    }
    /**
     * metodo para limpiar el panel entero al cambiar de pokemon
     */
    private static  void clearGlobalPanelPlayer1WhenPressButtonToChangePokemon3InChangePokemon(){

        clearContentPanel();
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

        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setImagePokemonInBattlePlayer1(MethodsBattlePlayer1.newImagePokemonInBattle3Player1());


        contentPanel.add(makeAgainContentPanel(contentPanel));
        revalidateContentPanel();

        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 1){
            MethodsBattlePokemon.setTurnsToCombat(2);
        }
        else if(MethodsBattlePokemon.turnsToCombat() == 2){
            MethodsBattlePokemon.setTurnsToCombat(1);
        }

        changesPokemonsPLayer1.setVisible(false);
        attacksChangesPokemon1Player1.setVisible(true);
    }





    /**
     * metodo para escribir en el textarea de la batalla cuando se realiza una accion del jugador 1
     * @param e el objeto de tipo Action Event
     */
    public void putInformationAreaTextBattlePlayer1(ActionEvent e) {

        /**
         * si el jugador pulsa del ataque 1, se mete en la condicion y escribe
         */
        if (e.getSource() == ButtonInterfaceAttacks.getAttack1Player1()){
            TextAreaPanelBattle.getInformationBattle().setText(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()
                    + " ha usado " + MethodsTextAreaBattlePlayer1.getNameAttack1PokemonPLayer1() +
                    " contra " + MethodsTextAreaBattlePlayer1.KnowTheNameOfTheOpposingPokemon() +
                    " ha sido " + MethosTargetType.getResultOfAttacksBothPlayer(MethodsTextAreaBattlePlayer1.getTypeAttack1PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()
            ), MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2()));
        }
        /**
         * si el jugador pulsa del ataque 2, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceAttacks.getAttack2PLayer1()){
            TextAreaPanelBattle.getInformationBattle().setText(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()
                    + " ha usado " + MethodsTextAreaBattlePlayer1.getNameAttack2PokemonPLayer1() +
                    " contra " + MethodsTextAreaBattlePlayer1.KnowTheNameOfTheOpposingPokemon() +
                    " ha sido " + MethosTargetType.getResultOfAttacksBothPlayer(MethodsTextAreaBattlePlayer1.getTypeAttack2PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()
            ), MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2()));
        }
        /**
         * si el jugador pulsa del ataque 3, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceAttacks.getAttack3Player1()){
            TextAreaPanelBattle.getInformationBattle().setText(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()
                    + " ha usado " + MethodsTextAreaBattlePlayer1.getNameAttack3PokemonPLayer1() +
                    " contra " + MethodsTextAreaBattlePlayer1.KnowTheNameOfTheOpposingPokemon() +
                    " ha sido " + MethosTargetType.getResultOfAttacksBothPlayer(MethodsTextAreaBattlePlayer1.getTypeAttack3PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()
            ), MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2()));
        }
        /**
         * si el jugador pulsa del ataque 4, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceAttacks.getAttack4Player1()){
            TextAreaPanelBattle.getInformationBattle().setText(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()
                    + " ha usado " + MethodsTextAreaBattlePlayer1.getNameAttack4PokemonPLayer1() +
                    " contra " + MethodsTextAreaBattlePlayer1.KnowTheNameOfTheOpposingPokemon() +
                    " ha sido " + MethosTargetType.getResultOfAttacksBothPlayer(MethodsTextAreaBattlePlayer1.getTypeAttack4PokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()
            ), MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2()));
        }
        /**
         * si el jugador pulsa del cambio 1, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceChangePokemonPlayer1.getPokemon1team()){
            TextAreaPanelBattle.getInformationBattle().setText("El jugador " + InformationPanelPlayer1Luck.getAliasTextPlayer1().getText() +
                    " ha hecho un cambio de pokemon, sale al campo de batalla " + MethodsTextAreaBattlePlayer1.getNamePokemon1ToChangePLayer1());

        }
        /**
         * si el jugador pulsa del cambio 2, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceChangePokemonPlayer1.getPokemon2team()){
            TextAreaPanelBattle.getInformationBattle().setText("El jugador " + InformationPanelPlayer1Luck.getAliasTextPlayer1().getText() +
                    " ha hecho un cambio de pokemon, sale al campo de batalla " + MethodsTextAreaBattlePlayer1.getNamePokemon2ToChangePLayer1());
        }
        /**
         * si el jugador pulsa del cambio 3, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceChangePokemonPlayer1.getPokemon3team()){
            TextAreaPanelBattle.getInformationBattle().setText("El jugador " + InformationPanelPlayer1Luck.getAliasTextPlayer1().getText() +
                    " ha hecho un cambio de pokemon, sale al campo de batalla " + MethodsTextAreaBattlePlayer1.getNamePokemon3ToChangePLayer1());
        }

    }



    //---------------------------metodos para cambios de paneles del jugador 2-----------------------------------//

    /**
     * metodo que hace visible el panel de ataques y oculta el de ataque y cambio
     */
    private static void clearGlobalPanelPlayer2WhenPressAttack(){
        /**
         * si la velocidad del jugador 1 es mayor que la del jugador 2 y es el turno del jugador 2
         * se hace visible el panel de ataques y se oculta el de ataque y cambio
         */
        if(speedPlayer1 > speedPlayer2 && MethodsBattlePokemon.turnsToCombat() == 2){
            attacksPanelPlayer2.setVisible(true);
            attacksChangesPokemon1Player2.setVisible(false);

        }
        /**
         * si la velocidad del jugador 1 es menor que la del jugador 2 y es el turno del jugador 1
         * se hace visible el panel de ataques y se oculta el de ataque y cambio
         */
        else if(speedPlayer1 < speedPlayer2 && MethodsBattlePokemon.turnsToCombat() == 1){
            attacksPanelPlayer2.setVisible(true);
            attacksChangesPokemon1Player2.setVisible(false);

        }


     }
    /**
     * metodo para atacar y hacer visivle el panel de atacar y cambio e invisible el de ataques del jugador 2
     */
    private static void clearGlobalPanelPlayer2WhenPressAttack1Buttons(){
            attacksPanelPlayer2.setVisible(false);
            attacksChangesPokemon1Player2.setVisible(true);

            /**
             * llamamos al metodo que calcula el daño del ataque
             */
            damagePlayer2 = (int) MethodsBattlePokemon.getDamageAttacksPokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2(),
                    MethodsTextAreaBattlePlayer2.getTypeAttack1PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                    MethodsBattlePlayer2.getAmountAttackPokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                    MethodsBattlePlayer2.getPowerAttack1PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                    MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1(), MethodsBattlePlayer2.getDefenseOpposingPokemonInBattle(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()));

        /**
         * llamamos al hashmap para recoger la vida del pokemon en batalla
         */
        int currentLife = MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1());
        /**
         * llamamos al hashmap para poner la vida del pokemon en batalla
         */
        MethodsBattlePokemon.putValuesLifePokemonsPlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1(), currentLife - damagePlayer2);
        /**
         * llamamos al panel de la vida del pokemon para poner la vida del pokemon despues de recibir daño
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().setValue(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()));
        /**
         * llamamos al panel de la vida del pokemon para poner el color de la barra de vida
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().setForeground(LifePokemonInBattlePlayer1.getBackgroundColorLifeBarPokemonPlayer1(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1())));
        /**
         * llamamos al panel de la vida del pokemon para repintar la barra de vida
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().repaint();

        /**
         * si el pokemon muere, se cambia de pokemon
         */
        if(!MethodsBattlePokemon.isPokemonAlivePlayer1(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()))){
            MethodsBattlePokemon.changePokemonWhenDiesPokemonInBattlePlayer1();
            MethodsBattlePokemon.setTurnsToCombat(1);
        }
        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 2){
            MethodsBattlePokemon.setTurnsToCombat(1);
        }
        else if(MethodsBattlePokemon.turnsToCombat() == 1){
            MethodsBattlePokemon.setTurnsToCombat(2);
        }


    }
    /**
     * metodo para atacar y hacer visible el panel de atacar y cambio e invisible el de ataques del jugador 2
     */
    private static void clearGlobalPanelPlayer2WhenPressAttack2Buttons(){
            attacksPanelPlayer2.setVisible(false);
            attacksChangesPokemon1Player2.setVisible(true);

            /**
             * llamamos al metodo que calcula el daño del ataque
             */
        damagePlayer2 = (int) MethodsBattlePokemon.getDamageAttacksPokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2(),
                MethodsTextAreaBattlePlayer2.getTypeAttack2PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                MethodsBattlePlayer2.getAmountAttackPokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                MethodsBattlePlayer2.getPowerAttack2PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1(), MethodsBattlePlayer2.getDefenseOpposingPokemonInBattle(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()));


        /**
         * llamamos al hashmap para recoger la vida del pokemon en batalla
         */
        int currentLife = MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1());
        /**
         * llamamos al hashmap para poner la vida del pokemon en batalla
         */
        MethodsBattlePokemon.putValuesLifePokemonsPlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1(), currentLife - damagePlayer2);
        /**
         * llamamos al panel de la vida del pokemon para poner la vida del pokemon despues de recibir daño
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().setValue(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()));
        /**
         * llamamos al panel de la vida del pokemon para poner el color de la barra de vida
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().setForeground(LifePokemonInBattlePlayer1.getBackgroundColorLifeBarPokemonPlayer1(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1())));
        /**
         * llamamos al panel de la vida del pokemon para repintar la barra de vida
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().repaint();


        /**
         * si el pokemon muere, se cambia de pokemon
         */
        if(!MethodsBattlePokemon.isPokemonAlivePlayer1(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()))){
            MethodsBattlePokemon.changePokemonWhenDiesPokemonInBattlePlayer1();
            MethodsBattlePokemon.setTurnsToCombat(1);

        }
        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 2){
            MethodsBattlePokemon.setTurnsToCombat(1);
        }
        else if(MethodsBattlePokemon.turnsToCombat() == 1){
            MethodsBattlePokemon.setTurnsToCombat(2);
        }

    }
    /**
     * metodo para atacar y hacer visible el panel de atacar y cambio e invisible el de ataques del jugador 2
     */
    private static void clearGlobalPanelPlayer2WhenPressAttack3Buttons(){
            attacksPanelPlayer2.setVisible(false);
            attacksChangesPokemon1Player2.setVisible(true);
            /**
             * llamamos al metodo que calcula el daño del ataque
             */
        damagePlayer2 = (int) MethodsBattlePokemon.getDamageAttacksPokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2(),
                MethodsTextAreaBattlePlayer2.getTypeAttack3PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                MethodsBattlePlayer2.getAmountAttackPokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                MethodsBattlePlayer2.getPowerAttack3PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1(), MethodsBattlePlayer2.getDefenseOpposingPokemonInBattle(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()));


        /**
         * llamamos al hashmap para recoger la vida del pokemon en batalla
         */
        int currentLife = MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1());
        /**
         * llamamos al hashmap para poner la vida del pokemon en batalla
         */
        MethodsBattlePokemon.putValuesLifePokemonsPlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1(), currentLife - damagePlayer2);
        /**
         * llamamos al panel de la vida del pokemon para poner la vida del pokemon despues de recibir daño
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().setValue(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()));
        /**
         * llamamos al panel de la vida del pokemon para poner el color de la barra de vida
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().setForeground(LifePokemonInBattlePlayer1.getBackgroundColorLifeBarPokemonPlayer1(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1())));
        /**
         * llamamos al panel de la vida del pokemon para repintar la barra de vida
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().repaint();

        /**
         * si el pokemon muere, se cambia de pokemon
         */
        if(!MethodsBattlePokemon.isPokemonAlivePlayer1(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()))){
            MethodsBattlePokemon.changePokemonWhenDiesPokemonInBattlePlayer1();
            MethodsBattlePokemon.setTurnsToCombat(1);

        }
        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 2){
            MethodsBattlePokemon.setTurnsToCombat(1);
        }
        else if(MethodsBattlePokemon.turnsToCombat() == 1){
            MethodsBattlePokemon.setTurnsToCombat(2);
        }

    }
    /**
     * metodo para atacar y hacer visible el panel de atacar y cambio e invisible el de ataques del jugador 2
     */
    private static void clearGlobalPanelPlayer2WhenPressAttack4Buttons(){
            attacksPanelPlayer2.setVisible(false);
            attacksChangesPokemon1Player2.setVisible(true);

            /**
             * llamamos al metodo que calcula el daño del ataque
             */
        damagePlayer2 = (int) MethodsBattlePokemon.getDamageAttacksPokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2(),
                MethodsTextAreaBattlePlayer2.getTypeAttack4PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                MethodsBattlePlayer2.getAmountAttackPokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                MethodsBattlePlayer2.getPowerAttack4PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()),
                MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1(), MethodsBattlePlayer2.getDefenseOpposingPokemonInBattle(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()));


        /**
         * llamamos al hashmap para recoger la vida del pokemon en batalla
         */
        int currentLife = MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1());
        /**
         * llamamos al hashmap para poner la vida del pokemon en batalla
         */
        MethodsBattlePokemon.putValuesLifePokemonsPlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1(), currentLife - damagePlayer2);
        /**
         * llamamos al panel de la vida del pokemon para poner la vida del pokemon despues de recibir daño
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().setValue(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()));
        /**
         * llamamos al panel de la vida del pokemon para poner el color de la barra de vida
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().setForeground(LifePokemonInBattlePlayer1.getBackgroundColorLifeBarPokemonPlayer1(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1())));
        /**
         * llamamos al panel de la vida del pokemon para repintar la barra de vida
         */
        LifePokemonInBattlePlayer1.getLifePokemonBarPlayer1().repaint();

        /**
         * si el pokemon muere, se cambia de pokemon
         */
        if(!MethodsBattlePokemon.isPokemonAlivePlayer1(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()))){
            MethodsBattlePokemon.changePokemonWhenDiesPokemonInBattlePlayer1();
            MethodsBattlePokemon.setTurnsToCombat(1);
        }

        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 2){
            MethodsBattlePokemon.setTurnsToCombat(1);
        }
        else if(MethodsBattlePokemon.turnsToCombat() == 1){
            MethodsBattlePokemon.setTurnsToCombat(2);
        }
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
       /**
         * si la velocidad del jugador 1 es mayor que la del jugador 2 y es el turno del jugador 2
         * se hace visible el panel de cambio de pokemons y se oculta el de ataque y cambio
         */
        if(speedPlayer1 > speedPlayer2 && MethodsBattlePokemon.turnsToCombat() == 2){
            changesPokemonsPLayer2.setVisible(true);
            attacksChangesPokemon1Player2.setVisible(false);

        }
        /**
         * si la velocidad del jugador 1 es menor que la del jugador 2 y es el turno del jugador 1
         * se hace visible el panel de cambio de pokemons y se oculta el de ataque y cambio
         */
        else if(speedPlayer1 < speedPlayer2 && MethodsBattlePokemon.turnsToCombat() == 1){
            changesPokemonsPLayer2.setVisible(true);
            attacksChangesPokemon1Player2.setVisible(false);
        }

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
        clearContentPanel();
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

        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setImagePokemonInBattlePlayer2(MethodsBattlePlayer2.newImagePokemonInBattle1Player2());



        contentPanel.add(makeAgainContentPanel(contentPanel));
        revalidateContentPanel();
        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 2){
            MethodsBattlePokemon.setTurnsToCombat(1);
        }
        else if(MethodsBattlePokemon.turnsToCombat() == 1){
            MethodsBattlePokemon.setTurnsToCombat(2);
        }


        changesPokemonsPLayer2.setVisible(false);
        attacksChangesPokemon1Player2.setVisible(true);
    }
    /**
     * metodo para limpiar el panel entero al cambiar de pokemon
     */
    private static void clearGlobalPanelPlayer2WhenPressButtonToChangePokemon2InChangePokemon(){
        clearContentPanel();

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

        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setImagePokemonInBattlePlayer2(MethodsBattlePlayer2.newImagePokemonInBattle2Player2());



        contentPanel.add(makeAgainContentPanel(contentPanel));
        revalidateContentPanel();
        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 2){
            MethodsBattlePokemon.setTurnsToCombat(1);
        }
        else if(MethodsBattlePokemon.turnsToCombat() == 1){
            MethodsBattlePokemon.setTurnsToCombat(2);
        }


        changesPokemonsPLayer2.setVisible(false);
        attacksChangesPokemon1Player2.setVisible(true);
    }
    /**
     * metodo para limpiar el panel entero al cambiar de pokemon
     */
    private static  void clearGlobalPanelPlayer2WhenPressButtonToChangePokemon3InChangePokemon(){
        clearContentPanel();

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

        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setImagePokemonInBattlePlayer2(MethodsBattlePlayer2.newImagePokemonInBattle3Player2());

        /**
         * cambiamos los turnos de los jugadores
         */
        if(MethodsBattlePokemon.turnsToCombat()== 2){
            MethodsBattlePokemon.setTurnsToCombat(1);
        }
        else if(MethodsBattlePokemon.turnsToCombat() == 1){
            MethodsBattlePokemon.setTurnsToCombat(2);
        }

        contentPanel.add(makeAgainContentPanel(contentPanel));
        revalidateContentPanel();

        changesPokemonsPLayer2.setVisible(false);
        attacksChangesPokemon1Player2.setVisible(true);
    }




    /**
     * metodo para escribir en el textarea de la batalla cuando se realiza una accion del jugador 2
     * @param e el objeto de tipo Action Event
     */
    public void putInformationAreaTextBattlePlayer2(ActionEvent e) {
        /**
         * si el jugador pulsa del ataque 1, se mete en la condicion y escribe
         */
        if (e.getSource() == ButtonInterfaceAttacks.getAttack1Player2()){
            TextAreaPanelBattle.getInformationBattle().setText(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()
                    + " ha usado " + MethodsTextAreaBattlePlayer2.getNameAttack1PokemonPLayer2() +
                    " contra " + MethodsTextAreaBattlePlayer2.KnowTheNameOfTheOpposingPokemon() +
                    " ha sido " + MethosTargetType.getResultOfAttacksBothPlayer(MethodsTextAreaBattlePlayer2.getTypeAttack1PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()
            ), MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1()));
        }
        /**
         * si el jugador pulsa del ataque 2, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceAttacks.getAttack2PLayer2()){
            TextAreaPanelBattle.getInformationBattle().setText(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()
                    + " ha usado " + MethodsTextAreaBattlePlayer2.getNameAttack2PokemonPLayer2() +
                    " contra " + MethodsTextAreaBattlePlayer2.KnowTheNameOfTheOpposingPokemon() +
                    " ha sido " + MethosTargetType.getResultOfAttacksBothPlayer(MethodsTextAreaBattlePlayer2.getTypeAttack2PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()
            ), MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1()));
        }
        /**
         * si el jugador pulsa del ataque 3, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceAttacks.getAttack3Player2()){
            TextAreaPanelBattle.getInformationBattle().setText(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()
                    + " ha usado " + MethodsTextAreaBattlePlayer2.getNameAttack3PokemonPLayer2() +
                    " contra " + MethodsTextAreaBattlePlayer2.KnowTheNameOfTheOpposingPokemon() +
                    " ha sido " + MethosTargetType.getResultOfAttacksBothPlayer(MethodsTextAreaBattlePlayer2.getTypeAttack3PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()
            ), MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1()));
        }
        /**
         * si el jugador pulsa del ataque 4, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceAttacks.getAttack4Player2()){
            TextAreaPanelBattle.getInformationBattle().setText(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()
                    + " ha usado " + MethodsTextAreaBattlePlayer2.getNameAttack4PokemonPLayer2() +
                    " contra " + MethodsTextAreaBattlePlayer2.KnowTheNameOfTheOpposingPokemon() +
                    " ha sido " + MethosTargetType.getResultOfAttacksBothPlayer(MethodsTextAreaBattlePlayer2.getTypeAttack4PokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()
            ), MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1()));
        }
        /**
         * si el jugador pulsa del cambio 1, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceChangePokemonPlayer2.getPokemon1team()){
            TextAreaPanelBattle.getInformationBattle().setText("El jugador " + InformationPanelPlayer2Luck.getAliasTextPlayer2().getText() +
                    " ha hecho un cambio de pokemon, sale al campo de batalla " + MethodsTextAreaBattlePlayer2.getNamePokemon1ToChangePLayer2());
        }
        /**
         * si el jugador pulsa del cambio 2, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceChangePokemonPlayer2.getPokemon2team()){
            TextAreaPanelBattle.getInformationBattle().setText("El jugador " + InformationPanelPlayer2Luck.getAliasTextPlayer2().getText() +
                    " ha hecho un cambio de pokemon, sale al campo de batalla " + MethodsTextAreaBattlePlayer2.getNamePokemon2ToChangePLayer2());
        }
        /**
         * si el jugador pulsa del cambio 3, se mete en la condicion y escribe
         */
        else if(e.getSource() == ButtonInterfaceChangePokemonPlayer2.getPokemon3team()){
            TextAreaPanelBattle.getInformationBattle().setText("El jugador " + InformationPanelPlayer2Luck.getAliasTextPlayer2().getText() +
                    " ha hecho un cambio de pokemon, sale al campo de batalla " + MethodsTextAreaBattlePlayer2.getNamePokemon3ToChangePLayer2());
        }

    }


    /**
     * metodo para limpiar todos los paneles de la interfaz
     */
    private static void clearContentPanel(){
        contentPanel.removeAll();
        globalPanelPLayer1.removeAll();
        attacksChangesPokemon1Player1.removeAll();
        attacksPanelPlayer1.removeAll();
        changesPokemonsPLayer1.removeAll();
        battlePanel.removeAll();
        globalPanelPLayer2.removeAll();
        attacksChangesPokemon1Player2.removeAll();
        attacksPanelPlayer2.removeAll();
        changesPokemonsPLayer2.removeAll();
        lifePanelPokemon.removeAll();
        textAreaPanel.removeAll();
    }

    /**
     * metodo para repintar y validar todos los paneles de la interfaz
     */
    private static void revalidateContentPanel(){
        contentPanel.repaint();
        contentPanel.revalidate();
        globalPanelPLayer1.repaint();
        globalPanelPLayer1.revalidate();
        attacksChangesPokemon1Player1.repaint();
        attacksChangesPokemon1Player1.revalidate();
        attacksPanelPlayer1.repaint();
        attacksPanelPlayer1.revalidate();
        changesPokemonsPLayer1.repaint();
        changesPokemonsPLayer1.revalidate();
        battlePanel.repaint();
        battlePanel.revalidate();
        globalPanelPLayer2.repaint();
        globalPanelPLayer2.revalidate();
        attacksChangesPokemon1Player2.repaint();
        attacksChangesPokemon1Player2.revalidate();
        attacksPanelPlayer2.repaint();
        attacksPanelPlayer2.revalidate();
        changesPokemonsPLayer2.repaint();
        changesPokemonsPLayer2.revalidate();
        lifePanelPokemon.repaint();
        lifePanelPokemon.revalidate();
        textAreaPanel.repaint();
        textAreaPanel.revalidate();
    }

    /**
     * metodo para volver a añadir todos los paneles de la interfaz
     * @param auxPanel el panel central
     * @return el nuevo panel central
     */
    private static JPanel makeAgainContentPanel(JPanel auxPanel){
        auxPanel = new JPanel();
        auxPanel = makeContentPanel();
        globalPanelPLayer1.add(new AliasAndLogoPlayer1());
        attacksChangesPokemon1Player1 = new AttacksAndChangesPokemonPlayer1();
        globalPanelPLayer1.add(attacksChangesPokemon1Player1);
        attacksPanelPlayer1.add(new AttacksPokemonPlayer1());
        globalPanelPLayer1.add(attacksPanelPlayer1);
        changesPokemonsPLayer1.add(new PokemonsToChoosePlayer1());
        globalPanelPLayer1.add(changesPokemonsPLayer1);
        auxPanel.add(globalPanelPLayer1, BorderLayout.WEST);

        auxPanel.add(lifePanelPokemon, BorderLayout.NORTH);
        lifePanelPokemon.add(new LifePokemonInBattlePlayer1(MethodsLifeBattlePokemonPlayer1.getLifePokemonInBattlePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1()),
                MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1())));
        lifePanelPokemon.add(new LifePokemonInBattlePlayer2(MethodsLifeBattlePokemonPlayer2.getLifePokemonInBattlePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2()
        ), MethodsBattlePokemon.getLifePokemonsPlayer2().get(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2())));


        globalPanelPLayer2.add(new AliasAndLogoPlayer2());
        attacksChangesPokemon1Player2 = new AttacksAndChangesPokemonPlayer2();
        globalPanelPLayer2.add(attacksChangesPokemon1Player2);
        attacksPanelPlayer2.add(new AttacksPokemonPlayer2());
        globalPanelPLayer2.add(attacksPanelPlayer2);
        changesPokemonsPLayer2.add(new PokemonsToChoosePlayer2());
        globalPanelPLayer2.add(changesPokemonsPLayer2);
        auxPanel.add(globalPanelPLayer2, BorderLayout.EAST);

        auxPanel.add(textAreaPanel, BorderLayout.SOUTH);
        textAreaPanel.add(new TextAreaPanelBattle());

        auxPanel.add(battlePanel, BorderLayout.CENTER);
        battlePanel.add(new PanelImageBattlePokemon());
        return auxPanel;
    }


    /**
     * getter y setter de los atributos de la clase
     * @return los atributos
     */


    public static JPanel getAttacksChangesPokemon1Player1() {
        return attacksChangesPokemon1Player1;
    }



    public static JPanel getChangesPokemonsPLayer1() {
        return changesPokemonsPLayer1;
    }



    public static JPanel getAttacksChangesPokemon1Player2() {
        return attacksChangesPokemon1Player2;
    }


    public static JPanel getChangesPokemonsPLayer2() {
        return changesPokemonsPLayer2;
    }


}

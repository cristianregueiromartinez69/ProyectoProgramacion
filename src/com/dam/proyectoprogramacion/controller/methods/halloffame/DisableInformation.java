package com.dam.proyectoprogramacion.controller.methods.halloffame;
import com.dam.proyectoprogramacion.controller.methods.luck.MethodsInterfaceLuck;
import com.dam.proyectoprogramacion.controller.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.controller.methods.battle.*;
import com.dam.proyectoprogramacion.view.panels.battle.battleplayer1.*;
import com.dam.proyectoprogramacion.view.panels.battle.battleplayer2.*;
import com.dam.proyectoprogramacion.view.buttons.*;
/**
 * clase con metodos para deshabilitar la informacion de las intefaces
 * @author cristian
 * @version v4.0
 */
public class DisableInformation {

    /**
     * metodo para deshabilitar los datos de la interfaz de la suerte
     */
    public static void disableInformationInterfaceLuck(){
    MethodsInterfaceLuck.setAuxMapAliasPlayer1Luck(null);
    MethodsInterfaceLuck.setAuxMapAliasPlayer2Luck(null);
    MethodsInterfaceLuck.setChosenItem(0);
    MethodsInterfaceLuck.setChosenItem2(0);
    MethodsInterfaceLuck.getLuckPlayers().clear();
    MethodsInterfaceLuck.setHaveIChoosenFace(false);
    MethodsInterfaceLuck.setHaveIChoosenTail(false);
    }

     /**
     * metodo para deshabilitar los datos de la interfaz de seleccion de pokemons
     */
     public static void disableInformationInterfaceSelectionPokemon(){
            MethosInterfaceSelectionPokemon.getPlayersBattle().clear();
            MethosInterfaceSelectionPokemon.getPokemonsPLayer1().clear();
            MethosInterfaceSelectionPokemon.getPokemonsPLayer2().clear();

            MethosInterfaceSelectionPokemon.setWasDrampaChoosen(false);
            MethosInterfaceSelectionPokemon.setWasEmpoleonChoosen(false);
            MethosInterfaceSelectionPokemon.setWasGarchompChoosen(false);
            MethosInterfaceSelectionPokemon.setWasGengarChoosen(false);

            MethosInterfaceSelectionPokemon.setWasInfernapeChoosen(false);
            MethosInterfaceSelectionPokemon.setWasLucarioChoosen(false);
            MethosInterfaceSelectionPokemon.setWasLuxrayChoosen(false);
            MethosInterfaceSelectionPokemon.setWasMarshadowChoosen(false);

            MethosInterfaceSelectionPokemon.setWasMiloticChoosen(false);
            MethosInterfaceSelectionPokemon.setWasSnorlaxChoosen(false);
            MethosInterfaceSelectionPokemon.setWasTinkatonChoosen(false);
            MethosInterfaceSelectionPokemon.setWasTyranitarChoosen(false);
     }

    /**
     * metodo para deshabilitar los datos de la interfaz de la batalla del jugador 1
     */
    public static void disableInformationBattlePlayer1(){
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack1(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack2(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack3(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNameAttack4(null);

            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack1(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack2(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack3(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconAttack4(null);

            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack1(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack2(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack3(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setColorBackgroundAttack4(null);

            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconPokemon1(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconPokemon2(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconPokemon3(null);

            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNamePokemon1(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNamePokemon2(null);
            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setNamePokemon3(null);

            DataNamesIconsColorsAttacksAndPokemonsPlayer1.setImagePokemonInBattlePlayer1(null);
            MethodsBattlePokemon.getLifePokemonsPlayer1().clear();
            MethodsBattlePokemon.setTurnsToCombat(1);

            LifePokemonInBattlePlayer1.setLifePokemon1PLayer1(0);
            LifePokemonInBattlePlayer1.setLifePokemon2PLayer1(0);
            LifePokemonInBattlePlayer1.setLifePokemon3PLayer1(0);

            LifePokemonInBattlePlayer1.setActualLifePokemonInBattlePlayer1(0);
            LifePokemonInBattlePlayer1.setAuxLife(0);

            ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon1(true);
            ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon2(true);
            ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon3(true);
     }

    /**
     * metodo para deshabilitar los datos de la interfaz de la batalla del jugador 2
     */
    public static void disableInformationBattlePlayer2(){
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack1(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack2(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack3(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNameAttack4(null);

        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack1(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack2(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack3(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconAttack4(null);

        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack1(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack2(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack3(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setColorBackgroundAttack4(null);

        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconPokemon1(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconPokemon2(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setPathIconPokemon3(null);

        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNamePokemon1(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNamePokemon2(null);
        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setNamePokemon3(null);

        DataNamesIconsColorsAttacksAndPokemonsPlayer2.setImagePokemonInBattlePlayer2(null);
        MethodsBattlePokemon.getLifePokemonsPlayer2().clear();


        LifePokemonInBattlePlayer2.setLifePokemon1PLayer2(0);
        LifePokemonInBattlePlayer2.setLifePokemon2PLayer2(0);
        LifePokemonInBattlePlayer2.setLifePokemon3PLayer2(0);

        LifePokemonInBattlePlayer2.setActualLifePokemonInBattlePlayer2(0);
        LifePokemonInBattlePlayer2.setAuxLifePlayer2(0);

        ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon1(true);
        ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon2(true);
        ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon3(true);
    }




}

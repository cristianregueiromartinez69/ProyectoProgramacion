package com.dam.proyectoprogramacion.methods.halloffame;
import com.dam.proyectoprogramacion.methods.luck.MethodsInterfaceLuck;
import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.methods.battle.*;
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
     }




}

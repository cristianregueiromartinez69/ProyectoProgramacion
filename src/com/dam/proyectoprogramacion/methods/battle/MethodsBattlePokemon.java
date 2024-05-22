package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer1;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceChangePokemonPlayer2;
import com.dam.proyectoprogramacion.interfaces.Battle;
import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.PokemonsToChoosePlayer1;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * metodos para la batalla pokemon de los jugadores 1 y 2
 * @author cristian
 * @version v3.0
 */
public class MethodsBattlePokemon {

    /**
     * atributos finales que serán la bonificacion de stab
     * la bonificaicon pir stab es si el ataque que usa el pokemon es el mismo que su propio tipo
     */
    public static final float STAB = 1.5f;
    public static final float NOT_STAB = 1.0f;

    /**
     * atributos finales que servirán para saber el daño que recibe el pokemon adersario
     */
    public static final float NULL_DAMAGE = 0f;
    public static final float VERY_INEFFECTIVE_DAMAGE = 0.25f;
    public static final float INEFFECTIVE_DAMAGE = 0.5f;
    public static final float NEUTRAL_DAMAGE = 1.0f;
    public static final float EFFECTIVE_DAMAGE = 2f;
    public static final float SUPER_EFFECTIVE_DAMAGE = 4f;

    /**
     * varible de daño comprendida entre 85 y 100
     */
    public static float variation;

    /**
     * nivel del pokemon que siempre será 100
     */
    public static final float LEVEL = 100f;

    /**
     * variable para saber el turno de combate
     */
    private static int turnsToCombat = 1;

    private static HashMap<String, Integer> lifePokemonsPlayer1 = new HashMap<>();
    private static HashMap<String, Integer> lifePokemonsPlayer2 = new HashMap<>();




    //--------------------------------------------------------------------------//

//----------------------------Jugador 1-----------------------------------//

//--------------------------------------------------------------------------//



    /**
     * metodo para hacer la formula de daño del ataque 1 pokemon en batalla del jugador 1
     *
     * @param typePokemonUser          el tipo del pokemon en batalla del jugador 1
     * @param typeAttackPokemonUser    el tipo del ataque 1 del pokemon en batalla del jugador 1
     * @param powerAttackPokemonUser   el poder de ataque del pokemon en batalla del jugador 1
     * @param powerOfAttackPokemonUser la cantidad de ataque del pokemon en batalla del jugador 1
     * @param typeOpposingPokemon      el tipo de pokemon rival en batalla
     * @param defenseOpppsingPokemon   la defensa del pokemon rival en batalla
     * @return el daño que le hacemos
     */
    public static float getDamageAttacksPokemonInBattlePlayer1(String typePokemonUser, String typeAttackPokemonUser,
                                                               int powerAttackPokemonUser, int powerOfAttackPokemonUser,
                                                               String typeOpposingPokemon, int defenseOpppsingPokemon) {
        /**
         * asignamos una variable local de tipo float el metodo que nos dice si hay o no stab
         */
        float stab = getBonificationStabAttacksPokemonInBattlePlayer1(typePokemonUser);

        /**
         * asignamos en una variable local de tipo float el metodo para saber la efectividad del ataque sobre el pokemon rival
         */
        float effectiveness = getEffectivenessForTheOpposingPokemonPlayer1(typeAttackPokemonUser, typeOpposingPokemon);

        /**
         * asignamos en una variable local de tipo floar, el metodo que nos da un valor de 85 a 100         */
        float variation = getValueOfVariation();

        /**
         * formula de daño
         */
        float damage = 0.01f * stab * effectiveness * variation *
                (((0.2f * LEVEL + 1) * powerOfAttackPokemonUser * powerAttackPokemonUser) /
                        (25 * defenseOpppsingPokemon) + 2);

        /**
         * devolvemos el daño
         */
        return damage;
    }




    /**
     * metodo para saber si el ataque 1 del pokemon en batalla pega por stab dle jugador 1
     *
     * @param type el tipo del ataque 1 del pokemon en batalla
     * @return el daño por stab
     */
    public static float getBonificationStabAttacksPokemonInBattlePlayer1(String type) {

        /**
         * recogemos en un array los tipos del pokemon desglosado
         */
        String[] desgloseType = breakDownPokemonTypeInBattlePlayer1(MethodsTextAreaBattlePlayer1.getTypePokemonInBattlePlayer1());
        /**
         * variable local que inicialmente será de no stab
         */
        float auxDamage = NOT_STAB;
        /**
         * for para recorrer el tipo desglosado
         */
        for (String auxType : desgloseType) {
            /**
             * si hay coincidencias de tipos, se le asigna el stab
             */
            if (auxType.equalsIgnoreCase(type)) {
                auxDamage = STAB;
                return auxDamage;
            }
        }

        /**
         * si no devolverá que no pega por stab
         */
        return auxDamage;
    }

    /**
     * metodo para saber la efectividad del ataque al pokemon rival
     *
     * @param typeAttack          el tipo del ataque que usa el pokemon
     * @param typeOpposingPokemon el tipo del rival
     * @return
     */
    public static float getEffectivenessForTheOpposingPokemonPlayer1(String typeAttack, String typeOpposingPokemon) {

        /**
         * iniciamos un string que almacenará el resultado en frase de la efectividad del ataque
         */
        String result = MethosTargetType.getResultOfAttacksBothPlayer(typeAttack, typeOpposingPokemon);
        /**
         * si coincide con los valores de:
         * Nulo
         * muy poco eficaz
         * poco eficaz
         * neutro
         * eficaz
         * super eficaz
         * devolverá un valor o otro
         */
        if (result.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.NULL)) {
            return NULL_DAMAGE;
        } else if (result.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE)) {
            return VERY_INEFFECTIVE_DAMAGE;
        } else if (result.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.INEFFECTIVE)) {
            return INEFFECTIVE_DAMAGE;
        } else if (result.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.NEUTRAL)) {
            return NEUTRAL_DAMAGE;
        } else if (result.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.EFFECTIVE)) {
            return EFFECTIVE_DAMAGE;
        } else {
            return SUPER_EFFECTIVE_DAMAGE;
        }

    }

    /**
     * metodo para desglosar el tipo del pokemon en batalla para verificar el stab
     *
     * @param type el tipo del pokemon en batalla
     * @return el array con los 2 tipos del pokemon en caso de que tenga 2
     */
    public static String[] breakDownPokemonTypeInBattlePlayer1(String type) {
        /**
         * si el pokemon del jugador 1 tiene doble tipo, se desglosa
         */
        if (type.contains("-")) {
            return type.split("-");
        } else {
            /**
             * si no lo tiene, devolverá el único tipo que tiene
             */
            return new String[]{type};
        }
    }
    /**
     * metodo para saber si el pokemon está vivo
     * @param life la vida del pokemon
     * @return si está vivo o no
     */
    public static boolean isPokemonAlivePlayer1(int life){
        /**
         * variable local que inicialmente será falsa
         */
        boolean marca = false;
        /**
         * si la vida es mayor que 0, devolverá que está vivo
         */
        if(life > 0){
            marca = true;
        }
        return marca;
    }
    /**
     * metodo para cambiar de pokemon cuando muere el pokemon en batalla del jugador 1
     */
    public static void changePokemonWhenDiesPokemonInBattlePlayer1(){

            Battle.getAttacksChangesPokemon1Player1().setVisible(false);
            Battle.getChangesPokemonsPLayer1().setVisible(true);
            /**
             * se deshabilitará el boton de atrás
             */
            ButtonInterfaceChangePokemonPlayer1.getBack().setEnabled(false);
            /**
             * llamamos al metodo que hará que se deshabilite el boton del pokemon muerto
             */
            setEnabledButtonPokemonDiePlayer1(MethodsTextAreaBattlePlayer1.getNamePokemon1PLayer1());
            /**
             * reiniciamos el turno de combate al inicial
             */

    }
    /**
     * metodo para deshabilitar el boton del pokemon muerto en batalla
     * @param namePokemon nombre del pokemon en batalla
     */
    public static void setEnabledButtonPokemonDiePlayer1(String namePokemon){
        /**
         * array de botones de los nombres de los pokemons
         */
        JButton [] namePokemonsButtons = {ButtonInterfaceChangePokemonPlayer1.getPokemon1team(), ButtonInterfaceChangePokemonPlayer1.getPokemon2team(),
                ButtonInterfaceChangePokemonPlayer1.getPokemon3team()};
        for(int i = 0; i < namePokemonsButtons.length; i++){
            /**
             * si el nombre del pokemon coincide con el nombre del pokemon en batalla, se deshabilitará el boton
             */
            if(namePokemonsButtons[i].getText().equalsIgnoreCase(namePokemon)){
                /**
                 * se deshabilitará el boton
                 */
                namePokemonsButtons[i].setEnabled(false);
                /**
                 * si el boton es el 1, se deshabilitará el boton 1
                 */
                if(i == 0) {
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon1(false);
                    /**
                     * si el boton es el 2, se deshabilitará el boton 2
                     */
                }else if(i == 1){
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon2(false);
                    /**
                     * si el boton es el 3, se deshabilitará el boton 3
                     */
                }else{
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon3(false);
                }
            }
        }
    }

    /**
     * metodo para prevenir que un pokemon cambie si está en batalla del jugador 1
     * @param namePokemon nombre del pokemon
     */
    public static void preventAPokemonFromChangingThatIsInBattlePlayer1(String namePokemon){

        /**
         * array de botones de los nombres de los pokemons
         */
        JButton [] namePokemonsButtons = {ButtonInterfaceChangePokemonPlayer1.getPokemon1team(), ButtonInterfaceChangePokemonPlayer1.getPokemon2team(),
                ButtonInterfaceChangePokemonPlayer1.getPokemon3team()};
        /**
         * for para recorrer los botones
         */
        for(int i = 0; i < namePokemonsButtons.length; i++){
            /**
             * si el nombre del pokemon coincide con el nombre del pokemon en batalla, se deshabilitará el boton
             */
            if(namePokemonsButtons[i].getText().equalsIgnoreCase(namePokemon)){
                namePokemonsButtons[i].setEnabled(false);
                /**
                 * si el boton es el 1, se deshabilitará el boton 1
                 * se habilitan los demas
                 */
                if(i == 0) {
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon1(false);
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon2(true);
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon3(true);
                }else if(i == 1){
                    /**
                     * si el boton es el 2, se deshabilitará el boton 2
                     * se habilitan los demas
                     */
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon2(false);
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon1(true);
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon3(true);
                }
                else{
                    /**
                     * si el boton es el 3, se deshabilitará el boton 3
                     * se habilitan los demas
                     */
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon3(false);
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon1(true);
                    ButtonInterfaceChangePokemonPlayer1.setEnableButtonPokemon2(true);
                }

            }
        }
    }
    public static boolean isTeamPokemonAlivePlayer1(){
        boolean marca = false;
        if(MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon1ToChangePLayer1()) > 0 &&
                MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon2ToChangePLayer1()) > 0 &&
                MethodsBattlePokemon.getLifePokemonsPlayer1().get(MethodsTextAreaBattlePlayer1.getNamePokemon3ToChangePLayer1()) > 0){
            marca = true;
        }
        return marca;
    }
    /**
     * metodo para poner valores al hashmap de la vida de los pokemons del jugador 1
     * @param namePokemon nombre de los pokemons del jugador 1
     * @param life vida de los pokemons del jugador 1
     */
    public static void putValuesLifePokemonsPlayer1(String namePokemon, int life){
        lifePokemonsPlayer1.put(namePokemon, life);
    }

    public static HashMap<String, Integer> getLifePokemonsPlayer1() {
        return lifePokemonsPlayer1;
    }
    public static void putValuesLifePokemonsPlayer2(String namePokemon, int life){
        lifePokemonsPlayer2.put(namePokemon, life);
    }

    public static HashMap<String, Integer> getLifePokemonsPlayer2() {
        return lifePokemonsPlayer2;
    }

    //--------------------------------------------------------------------------//

//----------------------------Jugador 2-----------------------------------//

//--------------------------------------------------------------------------//

    /**
     * metodo para hacer la formula de daño del ataque  pokemon en batalla del jugador 2
     *
     * @param typePokemonUser          el tipo del pokemon en batalla del jugador 2
     * @param typeAttackPokemonUser    el tipo del ataque del pokemon en batalla del jugador 2
     * @param powerAttackPokemonUser   el poder de ataque del pokemon en batalla del jugador 2
     * @param powerOfAttackPokemonUser la cantidad de ataque del pokemon en batalla del jugador 2
     * @param typeOpposingPokemon      el tipo de pokemon rival en batalla
     * @param defenseOpppsingPokemon   la defensa del pokemon rival en batalla
     * @return el daño que le hacemos
     */
    public static float getDamageAttacksPokemonInBattlePlayer2(String typePokemonUser, String typeAttackPokemonUser,
                                                               int powerAttackPokemonUser, int powerOfAttackPokemonUser,
                                                               String typeOpposingPokemon, int defenseOpppsingPokemon) {
        /**
         * asignamos una variable local de tipo float el metodo que nos dice si hay o no stab
         */
        float stab = getBonificationStabAttacksPokemonInBattlePlayer2(typePokemonUser);

        /**
         * asignamos en una variable local de tipo float el metodo para saber la efectividad del ataque sobre el pokemon rival
         */
        float effectiveness = getEffectivenessForTheOpposingPokemonPlayer2(typeAttackPokemonUser, typeOpposingPokemon);

        /**
         * asignamos en una variable local de tipo floar, el metodo que nos da un valor de 85 a 100         */
        float variation = getValueOfVariation();

        /**
         * formula de daño
         */
        float damage = 0.01f * stab * effectiveness * variation *
                (((0.2f * LEVEL + 1) * powerOfAttackPokemonUser * powerAttackPokemonUser) /
                        (25 * defenseOpppsingPokemon) + 2);

        /**
         * devolvemos el daño
         */
        return damage;
    }




    /**
     * metodo para saber si el ataque 1 del pokemon en batalla pega por stab del jugador 2
     *
     * @param type el tipo del ataque 1 del pokemon en batalla
     * @return el daño por stab
     */
    public static float getBonificationStabAttacksPokemonInBattlePlayer2(String type) {

        /**
         * recogemos en un array los tipos del pokemon desglosado
         */
        String[] desgloseType = breakDownPokemonTypeInBattlePlayer2(MethodsTextAreaBattlePlayer2.getTypePokemonInBattlePlayer2());
        /**
         * variable local que inicialmente será de no stab
         */
        float auxDamage = NOT_STAB;
        /**
         * for para recorrer el tipo desglosado
         */
        for (String auxType : desgloseType) {
            /**
             * si hay coincidencias de tipos, se le asigna el stab
             */
            if (auxType.equalsIgnoreCase(type)) {
                auxDamage = STAB;
                return auxDamage;
            }
        }

        /**
         * si no devolverá que no pega por stab
         */
        return auxDamage;
    }

    /**
     * metodo para saber la efectividad del ataque al pokemon rival
     *
     * @param typeAttack          el tipo del ataque que usa el pokemon
     * @param typeOpposingPokemon el tipo del rival
     * @return
     */
    public static float getEffectivenessForTheOpposingPokemonPlayer2(String typeAttack, String typeOpposingPokemon) {

        /**
         * iniciamos un string que almacenará el resultado en frase de la efectividad del ataque
         */
        String result = MethosTargetType.getResultOfAttacksBothPlayer(typeAttack, typeOpposingPokemon);
        /**
         * si coincide con los valores de:
         * Nulo
         * muy poco eficaz
         * poco eficaz
         * neutro
         * eficaz
         * super eficaz
         * devolverá un valor o otro
         */
        if (result.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.NULL)) {
            return NULL_DAMAGE;
        } else if (result.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE)) {
            return VERY_INEFFECTIVE_DAMAGE;
        } else if (result.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.INEFFECTIVE)) {
            return INEFFECTIVE_DAMAGE;
        } else if (result.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.NEUTRAL)) {
            return NEUTRAL_DAMAGE;
        } else if (result.equalsIgnoreCase(MethodsTextAreaBattlePlayer1.EFFECTIVE)) {
            return EFFECTIVE_DAMAGE;
        } else {
            return SUPER_EFFECTIVE_DAMAGE;
        }

    }

    /**
     * metodo para desglosar el tipo del pokemon en batalla para verificar el stab
     *
     * @param type el tipo del pokemon en batalla
     * @return el array con los 2 tipos del pokemon en caso de que tenga 2
     */
    public static String[] breakDownPokemonTypeInBattlePlayer2(String type) {
        /**
         * si el pokemon del jugador 2 tiene doble tipo, se desglosa
         */
        if (type.contains("-")) {
            return type.split("-");
        } else {
            /**
             * si no lo tiene, devolverá el único tipo que tiene
             */
            return new String[]{type};
        }
    }
    /**
     * metodo para saber si el pokemon está vivo
     * @param life la vida del pokemon
     * @return si está vivo o no
     */
    public static boolean isPokemonAlivePlayer2(int life){
        /**
         * variable local que inicialmente será falsa
         */
        boolean marca = false;
        /**
         * si la vida es mayor que 0, devolverá que está vivo
         */
        if(life > 0){
            marca = true;
        }
        return marca;
    }
    /**
     * metodo para cambiar de pokemon cuando muere el pokemon en batalla del jugador 2
     */
    public static void changePokemonWhenDiesPokemonInBattlePlayer2(){

        Battle.getAttacksChangesPokemon1Player2().setVisible(false);
        Battle.getChangesPokemonsPLayer2().setVisible(true);
        /**
         * se deshabilitará el boton de atrás
         */
        ButtonInterfaceChangePokemonPlayer2.getBack().setEnabled(false);
        /**
         * llamamos al metodo que hará que se deshabilite el boton del pokemon muerto
         */
        setEnabledButtonPokemonDiePlayer2(MethodsTextAreaBattlePlayer2.getNamePokemon1PLayer2());
        /**
         * reiniciamos el turno de combate al inicial
         */

    }
    /**
     * metodo para deshabilitar el boton del pokemon muerto en batalla
     * @param namePokemon nombre del pokemon en batalla
     */
    public static void setEnabledButtonPokemonDiePlayer2(String namePokemon){
        /**
         * array de botones de los nombres de los pokemons
         */
        JButton [] namePokemonsButtons = {ButtonInterfaceChangePokemonPlayer2.getPokemon1team(), ButtonInterfaceChangePokemonPlayer2.getPokemon2team(),
                ButtonInterfaceChangePokemonPlayer2.getPokemon3team()};
        for(int i = 0; i < namePokemonsButtons.length; i++){
            /**
             * si el nombre del pokemon coincide con el nombre del pokemon en batalla, se deshabilitará el boton
             */
            if(namePokemonsButtons[i].getText().equalsIgnoreCase(namePokemon)){
                /**
                 * se deshabilitará el boton
                 */
                namePokemonsButtons[i].setEnabled(false);
                /**
                 * si el boton es el 1, se deshabilitará el boton 1
                 */
                if(i == 0) {
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon1(false);
                    /**
                     * si el boton es el 2, se deshabilitará el boton 2
                     */
                }else if(i == 1){
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon2(false);
                    /**
                     * si el boton es el 3, se deshabilitará el boton 3
                     */
                }else{
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon3(false);
                }
            }
        }
    }
    /**
     * metodo para prevenir que un pokemon cambie si está en batalla del jugador 1
     * @param namePokemon nombre del pokemon
     */
    public static void preventAPokemonFromChangingThatIsInBattlePlayer2(String namePokemon){

        /**
         * array de botones de los nombres de los pokemons
         */
        JButton [] namePokemonsButtons = {ButtonInterfaceChangePokemonPlayer2.getPokemon1team(), ButtonInterfaceChangePokemonPlayer2.getPokemon2team(),
                ButtonInterfaceChangePokemonPlayer2.getPokemon3team()};
        /**
         * for para recorrer los botones
         */
        for(int i = 0; i < namePokemonsButtons.length; i++){
            /**
             * si el nombre del pokemon coincide con el nombre del pokemon en batalla, se deshabilitará el boton
             */
            if(namePokemonsButtons[i].getText().equalsIgnoreCase(namePokemon)){
                namePokemonsButtons[i].setEnabled(false);
                /**
                 * si el boton es el 1, se deshabilitará el boton 1
                 * se habilitan los demas
                 */
                if(i == 0) {
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon1(false);
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon2(true);
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon3(true);
                }else if(i == 1){
                    /**
                     * si el boton es el 2, se deshabilitará el boton 2
                     * se habilitan los demas
                     */
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon2(false);
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon1(true);
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon3(true);
                }
                else{
                    /**
                     * si el boton es el 3, se deshabilitará el boton 3
                     * se habilitan los demas
                     */
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon3(false);
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon1(true);
                    ButtonInterfaceChangePokemonPlayer2.setEnableButtonPokemon2(true);
                }

            }
        }
    }

    public static boolean isTeamPokemonAlivePlayer2(){
        boolean marca = false;
        if(ButtonInterfaceChangePokemonPlayer2.getPokemon1team().isEnabled() &&
                ButtonInterfaceChangePokemonPlayer2.getPokemon2team().isEnabled() &&
                ButtonInterfaceChangePokemonPlayer2.getPokemon3team().isEnabled()){
            marca = true;
        }
        return marca;
    }

    //--------------------------------------------------------------------------//

//----------------------------Ambos jugadores-----------------------------------//

//--------------------------------------------------------------------------//

    /**
     * metodo para generar un numero aleatorio entre 85 y 100
     *
     * @return el numero generado
     */
    public static float getValueOfVariation() {

        int randomValue = 85 + (int) (Math.random() * 16);
        return (float) randomValue;
    }




    public static int turnsToCombat() {
        return turnsToCombat;
    }

    public static void setTurnsToCombat(int turnsToCombat) {
        MethodsBattlePokemon.turnsToCombat = turnsToCombat;
    }

}

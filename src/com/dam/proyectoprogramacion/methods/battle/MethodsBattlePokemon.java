package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.methods.selectionpokemon.MethosInterfaceSelectionPokemon;
import com.dam.proyectoprogramacion.panels.battle.battleplayer1.LifePokemonInBattlePlayer1;
import com.dam.proyectoprogramacion.panels.battle.battleplayer2.LifePokemonInBattlePlayer2;
import com.dam.proyectoprogramacion.pokemon.PokemonProperties;

import java.util.ArrayList;

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
     * variables para almacenar la cantidad de ataque, defensa y poder de ataque del pokemon en batalla del jugador 1
     */

    /**
     * variables para almacenar la cantidad de ataque, defensa y poder de ataque del pokemon en batalla del jugador 2
     */


    //--------------------------------------------------------------------------//

//----------------------------Jugador 1-----------------------------------//

//--------------------------------------------------------------------------//

    /**
     * metodo para devolver la vida del pokemon en batalla del jugador 1
     *
     * @param namePokemon el nombre del pokemon en batalla
     * @return la vida del pokemon
     */
    public static int setValueOfLifePokemonInBattlePlayer1(String namePokemon) {
        /**
         * iniciamos la cantidad de defensa a 0
         */
        int life = 0;

        /**
         * iniciamos un array de objetos igual a la lista de pokemons escogida por el jugador 1
         */
        ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPokemonsPLayer1();

        /**
         * recorremos con un for el array de pokemons
         */
        for (int i = 0; i < pokemons.size(); i++) {

            PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);

            /**
             * si algun nombre coincide con el pokemon en batalla, entra en la condicion
             */
            if (pokemon.getName().equalsIgnoreCase(namePokemon)) {
                /**
                 * lo indicamos
                 */
                pokemon = (PokemonProperties) pokemons.get(i);

                /**
                 * almacenamos el valor de la defensa
                 */

                life = pokemon.getLife();

                break;


            }
        }
        /**
         * devolvemos el ataque
         */
        return life;
    }


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

//--------------------------------------------------------------------------//

//----------------------------Jugador 2-----------------------------------//

//--------------------------------------------------------------------------//

    /**
     * metodo para devolver la vida del pokemon en batalla del jugador 1
     *
     * @param namePokemon el nombre del pokemon en batalla
     * @return la vida del pokemon
     */
    public static int setValueOfLifePokemonInBattlePlayer2(String namePokemon) {
        /**
         * iniciamos la cantidad de defensa a 0
         */
        int life = 0;

        /**
         * iniciamos un array de objetos igual a la lista de pokemons escogida por el jugador 1
         */
        ArrayList<Object> pokemons = MethosInterfaceSelectionPokemon.getPokemonsPLayer2();

        /**
         * recorremos con un for el array de pokemons
         */
        for (int i = 0; i < pokemons.size(); i++) {

            PokemonProperties pokemon = (PokemonProperties) pokemons.get(i);

            /**
             * si algun nombre coincide con el pokemon en batalla, entra en la condicion
             */
            if (pokemon.getName().equalsIgnoreCase(namePokemon)) {
                /**
                 * lo indicamos
                 */
                pokemon = (PokemonProperties) pokemons.get(i);

                /**
                 * almacenamos el valor de la defensa
                 */

                life = pokemon.getLife();

                break;


            }
        }
        /**
         * devolvemos el ataque
         */
        return life;
    }


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

    public static int damageOppossingPokemon(int speedPokemonPlayer1, int speedPokemonPlayer2){
        int damage = 0;
        if(speedPokemonPlayer1 > speedPokemonPlayer2){

        }

    }

}

package com.dam.proyectoprogramacion.methods.battle;

/**
 * clase con los metodos de la tabla de tipos para el combate
 * @author cristian
 * @version v3.0
 */
public class MethosTargetType {

    public static String getResultOfAttacksBothPlayer(String typeAttackPokemon, String typeTargetPokemon){

        if(typeAttackPokemon.equalsIgnoreCase("acero")){
            return getResultSteelAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("agua")){
            return getResultWatterAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("bicho")){
            return getResultBugAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("dragon")){
            return getResultDragonAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("electrico")){
            return getResultElectricAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("fantasma")){
            return getResultGhostAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("fuego")){
            return getResultFireAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("hada")){
            return getResultFairyAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("hielo")){
            return getResultIceAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("lucha")){
            return getResultFightingAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("normal")){
            return getResultNormalAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("planta")){
            return getResultGrassAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("psiquico")){
            return getResultPsychicAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("roca")){
            return getResultRockAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("siniestro")){
            return getResultDarkAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("tierra")){
            return getResultGroundAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("veneno")){
            return getResultPoisonAttackType(typeTargetPokemon);
        }
        else if(typeAttackPokemon.equalsIgnoreCase("volador")){
            return getResultFlyingAttackType(typeTargetPokemon);
        }



     return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){

        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo agua al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultWatterAttackType(String targetType){

        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo bicho al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultBugAttackType(String targetType){

        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo dragon al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultDragonAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo electrico al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultElectricAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo fantasma al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultGhostAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo fuego al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultFireAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo hada al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultFairyAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo hielo al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultIceAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.SUPER_EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo lucha al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultFightingAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.SUPER_EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo normal al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultNormalAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo planta al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultGrassAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo psquico al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultPsychicAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo roca al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultRockAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo siniestro al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultDarkAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo tierra al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultGroundAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo veneno al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultPoisonAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.NULL;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }

    /**
     * metodo para saber el resultado de un ataque de tipo volador al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultFlyingAttackType(String targetType){
        /**
         * segun el tipo del pokemon rival, el ataque tendrá un daño diferente
         */
        if(targetType.equalsIgnoreCase("normal-dragon")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("agua-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("normal")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("hada-acero")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fantasma-veneno")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("roca-siniestro")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("fuego-lucha")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("lucha-acero")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("electrico")){
            return MethodsTextAreaBattlePlayer1.INEFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("dragon-tierra")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        else if(targetType.equalsIgnoreCase("lucha-fantasma")){
            return MethodsTextAreaBattlePlayer1.EFFECTIVE;
        }
        else if(targetType.equalsIgnoreCase("agua")){
            return MethodsTextAreaBattlePlayer1.NEUTRAL;
        }
        return null;
    }


}

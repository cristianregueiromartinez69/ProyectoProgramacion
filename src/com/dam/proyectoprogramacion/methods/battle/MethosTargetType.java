package com.dam.proyectoprogramacion.methods.battle;

/**
 * clase con los metodos de la tabla de tipos para el combate
 * @author cristian
 * @version v3.0
 */
public class MethosTargetType {

    public static String getResultOfAttacksBothPlayer(String typeAttackPokemon, String typeTargetPokemon){


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
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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
     * metodo para saber el resultado de un ataque de tipo acero al objetivo
     * @param targetType el tipo del pokemon rival
     * @return el resultado
     */
    public static String getResultSteelAttackType(String targetType){
        String resultAttackSteel = "";
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


}

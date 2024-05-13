package com.dam.proyectoprogramacion.methodsandmain;

import java.awt.*;

/**
 * clase para almacenar datos de ataques, nombres y colores de fondo que iran cambiando en batalla
 * @author cristian
 * @version v3.0
 */
public class DataNamesIconsColorsAttacksPlayer1 {

    /**
     * atributos privados de la clase
     */
    private static String nameAttack;
    private static String pathIconAttack;
    private static Color colorBackgroundAttack;

    /**
     * getter y setter de los atributos de la clase
     * @return el atributo correspondiente
     */
    public static String getNameAttack() {
        return nameAttack;
    }

    public static void setNameAttack(String nameAttack) {
        DataNamesIconsColorsAttacksPlayer1.nameAttack = nameAttack;
    }

    public static String getPathIconAttack() {
        return pathIconAttack;
    }

    public static void setPathIconAttack(String pathIconAttack) {
        DataNamesIconsColorsAttacksPlayer1.pathIconAttack = pathIconAttack;
    }

    public static Color getColorBackgroundAttack() {
        return colorBackgroundAttack;
    }

    public static void setColorBackgroundAttack(Color colorBackgroundAttack) {
        DataNamesIconsColorsAttacksPlayer1.colorBackgroundAttack = colorBackgroundAttack;
    }
}

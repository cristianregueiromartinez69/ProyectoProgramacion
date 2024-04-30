package com.dam.proyectoprogramacion.methodsandmain;

import javax.swing.*;

public class MethodsInterfaceAttacks {

    private static final String NORMAL = "normal";
    private static final String FIRE = "fuego";
    private static final String WATER = "agua";
    private static final String ELECTRIC = "electrico";
    private static final String GRASS = "planta";
    private static final String ICE = "hielo";
    private static final String FIGHTING = "lucha";
    private static final String POISON = "veneno";
    private static final String GROUND = "tierra";
    private static final String FLYING = "volador";
    private static final String PSYCHIC = "psiquico";
    private static final String BUG = "bicho";
    private static final String ROCK = "roca";
    private static final String GHOST = "fantasma";
    private static final String DARK = "siniestro";
    private static final String DRAGON = "dragon";
    private static final String STEEL = "acero";
    private static final String FAIRY = "hada";


    public static ImageIcon putImageTypePokemon(String type) {
        ImageIcon iconType;
        switch (type) {
            case NORMAL -> {
                iconType = new ImageIcon("imagenes/normal.png");
                break;
            }
            case FIRE -> {
                iconType = new ImageIcon("imagenes/fuego.png");
                break;
            }
            case WATER -> {
                iconType = new ImageIcon("imagenes/agua.png");
                break;
            }
            case ELECTRIC -> {
                iconType = new ImageIcon("imagenes/electrico.png");
                break;
            }
            case GRASS -> {
                iconType = new ImageIcon("imagenes/planta.png");
                break;
            }
            case ICE -> {
                iconType = new ImageIcon("imagenes/hielo.png");
                break;
            }
            case FIGHTING -> {
                iconType = new ImageIcon("imagenes/lucha.png");
                break;
            }
            case POISON -> {
                iconType = new ImageIcon("imagenes/veneno.png");
                break;
            }
            case GROUND -> {
                iconType = new ImageIcon("imagenes/tierra.png");
                break;
            }
            case FLYING -> {
                iconType = new ImageIcon("imagenes/volador.png");
                break;
            }
            case PSYCHIC -> {
                iconType = new ImageIcon("imagenes/psiquico.png");
                break;
            }
            case BUG -> {
                iconType = new ImageIcon("imagenes/bicho.png");
                break;
            }
            case ROCK -> {
                iconType = new ImageIcon("imagenes/roca.png");
                break;
            }
            case GHOST -> {
                iconType = new ImageIcon("imagenes/fantasma.png");
                break;
            }
            case DARK -> {
                iconType = new ImageIcon("imagenes/siniestro.png");
                break;
            }
            case DRAGON -> {
                iconType = new ImageIcon("imagenes/dragon.png");
                break;
            }
            case STEEL -> {
                iconType = new ImageIcon("imagenes/acero.png");
                break;
            }
            case FAIRY -> {
                iconType = new ImageIcon("imagenes/hada.png");
                break;
            }
            default -> {
                iconType = null;

            }
        }

        return iconType;
    }

}

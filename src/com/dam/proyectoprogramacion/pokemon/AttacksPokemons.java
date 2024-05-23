package com.dam.proyectoprogramacion.pokemon;

public class AttacksPokemons {

    private String type;
    private String name;
    private int power;
    private int precision;

    public AttacksPokemons(String type, String name, int power, int precision) {
        this.type = type;
        this.name = name;
        this.power = power;
        this.precision = precision;
    }

    public static String [] allAttacks(){
        return new String[]{"pulso dragon", "hiperrayo", "viento hielo", "rayo",
        "envite acuatico", "garra metal", "acua jet", "salmuera",
        "enfado", "terremoto", "pataleta", "garra dragon",
        "bola sombra", "pulso umbrio", "bomba acida", "carga toxica",
        "ultra puño", "a bocajarro", "envite igneo", "acrobata",
        "ataque oseo", "a bocajarro", "esfera aural", "onda vacio",
        "mordisco", "voltio cruel", "colmillo rayo", "psicocolmillo",
        "puño sombra", "a bocajarro", "golpe bajo", "puño trueno",
        "rayo hielo", "surf", "hidrobomba", "cola dragon",
        "fuerza equina", "machada", "gigaimpacto", "golpe cuerpo",
        "martillo colosal", "desarme", "martillo de hielo", "sorpresa",
        "roca afilada", "avalancha", "triturar", "pataleta"};
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return
                "tipo: " + type + "\n" +
                "nombre: " + name + "\n" +
                "poder: " + power + "\n" +
                "precision: " + precision + "\n"
                ;
    }
}

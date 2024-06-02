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

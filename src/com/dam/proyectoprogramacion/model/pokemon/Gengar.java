package com.dam.proyectoprogramacion.model.pokemon;

public class Gengar extends PokemonProperties{

    private String type;
    private Integer level;
    private Integer life;
    private String sex;

    /**
     * Implementacion de los metodos
     * @return
     */
    @Override
    public Integer atacar() {
        return 0;
    }

    @Override
    public Boolean vivir() {
        return null;
    }
}

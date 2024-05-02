package com.dam.proyectoprogramacion.pokemon;

import java.lang.reflect.Array;

/**
 * Clase abstracta con todos los atributos de los pokemon los cuales van a heredar cada uno
 */
public abstract class PokemonProperties implements IPokemon{

    private String name;
    private String type;
    private Integer level;
    private Integer life;
    private String sex;
    private Integer speed;
    private Array attacks;
    private Float size;
    private Float weight;

    /**
     * getter y setter de la variable name
     * @return name
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter y setter de la variable type
     * @return type
     */

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * getter y setter de la variable level
     * @return level
     */

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * getter y setter de la variable life
     * @return life
     */

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    /**
     * getter y setter de la variable sex
     * @return sex
     */

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * getter y setter de la variable sex
     * @return sex
     */

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * getter y setter de la variable syze
     * @return syze
     */

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    /**
     * getter y setter de la variable attacks
     * @return attacks
     */

    public Array getAttacks() {
        return attacks;
    }

    public void setAttacks(Array attacks) {
        this.attacks = attacks;
    }

    /**
     * getter y setter de la variable weight
     * @return weight
     */

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }



}

package com.dam.proyectoprogramacion.model.pokemon;

import java.util.Arrays;

/**
 * Clase abstracta con todos los atributos de los pokemon los cuales van a heredar cada uno
 */
public abstract class PokemonProperties implements IPokemon{

    private String name;
    private String type;
    private Integer level;
    private Integer life;
    private String sex;
    private Integer attack;
    private Integer defense;
    private Integer speed;
    private AttacksPokemons[] attacks;
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

    public AttacksPokemons[] getAttacks() {
        return attacks;
    }

    public void setAttacks(AttacksPokemons[] attacks) {
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

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return
                "nombre: " + name + "\n" +
                "tipo: " + type + "\n" +
                "nivel: " + level + "\n" +
                "vida: " + life + "\n" +
                "sexo: " + sex + "\n" +
                "velocidad: " + speed +  "\n" +
                "ataques: " + Arrays.toString(attacks) + "\n" +
                "ataque" + attack +
                "defensa" + defense +
                "tamaño: " + size +  "\n" +
                "peso: " + weight;
    }


}

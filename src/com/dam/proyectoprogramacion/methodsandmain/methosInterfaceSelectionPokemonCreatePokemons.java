package com.dam.proyectoprogramacion.methodsandmain;

import com.dam.proyectoprogramacion.pokemon.*;

/**
 * Clase con los metodos para crear objetos de los pokemons y añadirles atributos
 * @author cristian
 * @version v2.0
 */
public class methosInterfaceSelectionPokemonCreatePokemons {

    /**
     * atributos estáticos de tipo pokemon
     */
    static Drampa drampa = new Drampa();
    static Empoleon empoleon = new Empoleon();
    static Garchomp garchomp = new Garchomp();
    static Gengar gengar = new Gengar();
    static Infernape infernape = new Infernape();
    static Lucario lucario = new Lucario();
    static Luxray luxray = new Luxray();
    static Marshadow marshadow = new Marshadow();
    static Milotic milotic = new Milotic();
    static Snorlax snorlax = new Snorlax();
    static Tinkaton tinkaton = new Tinkaton();
    static Tyranitar tyranitar = new Tyranitar();

    /**
     * metodo para crear el objeto drampa
     * @return el objeto creado
     */
    public static Drampa makeDrampaObject() {

        drampa.setName("drampa");
        drampa.setType("normal-dragon");
        drampa.setLevel(50);
        drampa.setLife(185);
        drampa.setSex("Macho");
        drampa.setSpeed(36);
        AttacksPokemons[] drampaAttacks = {
                new AttacksPokemons("Dragon", "Pulso dragon", 85, 100),
                new AttacksPokemons("Psiquico", "Paranormal", 85, 100),
                new AttacksPokemons("Fuego", "Lanzallamas", 90, 100),
                new AttacksPokemons("Normal", "Vozarron", 90, 100)
        };
        drampa.setAttacks(drampaAttacks);
        drampa.setSize(3.0f);
        drampa.setWeight(185.0f);

      return drampa;
    }

    public static Empoleon makeEmpoleonObject() {

        empoleon.setName("Empoleon");
        empoleon.setType("agua-acero");
        empoleon.setLevel(50);
        empoleon.setLife(191);
        empoleon.setSex("Macho");
        empoleon.setSpeed(96);
        AttacksPokemons[] empoleonAttacks = {
                new AttacksPokemons("Roca", "Trampa rocas", 0, 100),
                new AttacksPokemons("Agua", "Surf", 90, 100),
                new AttacksPokemons("Hielo", "Rayo hielo", 90, 100),
                new AttacksPokemons("Volador", "Respiro", 0, 100)
        };
        empoleon.setAttacks(empoleonAttacks);
        empoleon.setSize(1.7f);
        empoleon.setWeight(84.5f);

        return empoleon;
    }




}

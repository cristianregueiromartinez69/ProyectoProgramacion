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
    /**
     * metodo para crear el objeto empoleon
     * @return el objeto creado
     */
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
    /**
     * metodo para crear el objeto garchomp
     * @return el objeto creado
     */
    public static Garchomp makeGarchompObject() {

        garchomp.setName("Garchomp");
        garchomp.setType("dragon-tierra");
        garchomp.setLevel(50);
        garchomp.setLife(195);
        garchomp.setSex("Hembra");
        garchomp.setSpeed(169);
        AttacksPokemons[] garchompAttacks = {
                new AttacksPokemons("Dragon", "Garra Dragon", 80, 100),
                new AttacksPokemons("Tierra", "Terremoto", 100, 100),
                new AttacksPokemons("Acero", "Cabeza de hierro", 80, 100),
                new AttacksPokemons("Normal", "Danza espada", 0, 100)
        };
        garchomp.setAttacks(garchompAttacks);
        garchomp.setSize(1.9f);
        garchomp.setWeight(95.0f);

        return garchomp;
    }
    /**
     * metodo para crear el objeto gengar
     * @return el objeto creado
     */
    public static Gengar makeGengarObject() {

        gengar.setName("Gengar");
        gengar.setType("fantasma-veneno");
        gengar.setLevel(50);
        gengar.setLife(135);
        gengar.setSex("Macho");
        gengar.setSpeed(178);
        AttacksPokemons[] gengarAttacks = {
                new AttacksPokemons("Fantasma", "Bola sombra", 80, 100),
                new AttacksPokemons("Veneno", "Onda toxica", 95, 100),
                new AttacksPokemons("Lucha", "Onda certera", 120, 70),
                new AttacksPokemons("Electrico", "Rayo", 90, 100)
        };
        gengar.setAttacks(gengarAttacks);
        gengar.setSize(1.5f);
        gengar.setWeight(40.5f);

        return gengar;
    }
    /**
     * metodo para crear el objeto Infernape
     * @return el objeto creado
     */
    public static Infernape makeInfernapeObject() {

        infernape.setName("Infernape");
        infernape.setType("fuego-lucha");
        infernape.setLevel(50);
        infernape.setLife(160);
        infernape.setSex("Macho");
        infernape.setSpeed(176);
        AttacksPokemons[] infernapeAttacks = {
                new AttacksPokemons("Fuego", "Envite igneo", 120, 100),
                new AttacksPokemons("Lucha", "A bocajarro", 95, 100),
                new AttacksPokemons("Bicho", "Ida y vuelta", 70, 100),
                new AttacksPokemons("Electrico", "Puño electrico", 75, 100)
        };
        infernape.setAttacks(infernapeAttacks);
        infernape.setSize(1.2f);
        infernape.setWeight(55.0f);

        return infernape;
    }
    /**
     * metodo para crear el objeto Lucario
     * @return el objeto creado
     */
    public static Lucario makeLucarioObject() {

        lucario.setName("Lucario");
        lucario.setType("lucha-acero");
        lucario.setLevel(50);
        lucario.setLife(150);
        lucario.setSex("Macho");
        lucario.setSpeed(156);
        AttacksPokemons[] lucarioAttacks = {
                new AttacksPokemons("Normal", "Danza espada", 0, 100),
                new AttacksPokemons("Lucha", "A bocajarro", 95, 100),
                new AttacksPokemons("Acero", "Puño meteoro", 90, 90),
                new AttacksPokemons("Normal", "Velocidad extrema", 80, 100)
        };
        lucario.setAttacks(lucarioAttacks);
        lucario.setSize(1.2f);
        lucario.setWeight(54.0f);

        return lucario;
    }
    /**
     * metodo para crear el objeto Luxray
     * @return el objeto creado
     */
    public static Luxray makeLuxrayObject() {

        luxray.setName("Luxray");
        luxray.setType("electrico");
        luxray.setLevel(50);
        luxray.setLife(160);
        luxray.setSex("Hembra");
        luxray.setSpeed(134);
        AttacksPokemons[] luxrayAttacks = {
                new AttacksPokemons("Electrico", "Voltio cruel", 90, 100),
                new AttacksPokemons("Electrico", "Voltiocambio", 70, 100),
                new AttacksPokemons("Planta", "abrecaminos", 50, 100),
                new AttacksPokemons("Siniestro", "Triturar", 80, 100)
        };
        luxray.setAttacks(luxrayAttacks);
        luxray.setSize(1.4f);
        luxray.setWeight(42.0f);

        return luxray;
    }





}

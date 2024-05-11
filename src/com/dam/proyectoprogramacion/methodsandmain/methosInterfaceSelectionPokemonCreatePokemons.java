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
                new AttacksPokemons("Lucha", "A bocajarro", 120, 100),
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
                new AttacksPokemons("Lucha", "A bocajarro", 120, 100),
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
    /**
     * metodo para crear el objeto marshadow
     * @return el objeto creado
     */
    public static Marshadow makeMarshadowObject() {

        marshadow.setName("Marshadow");
        marshadow.setType("lucha-fantasma");
        marshadow.setLevel(50);
        marshadow.setLife(170);
        marshadow.setSex(null);
        marshadow.setSpeed(194);
        AttacksPokemons[] marshadowAttacks = {
                new AttacksPokemons("Fantasma", "Roba sombra", 90, 100),
                new AttacksPokemons("Hielo", "Puño hielo", 75, 100),
                new AttacksPokemons("Lucha", "A bocajarro", 120, 100),
                new AttacksPokemons("Fantasma", "Sombre vil", 40, 100)
        };
        marshadow.setAttacks(marshadowAttacks);
        marshadow.setSize(0.7f);
        marshadow.setWeight(22.2f);

        return marshadow;
    }
    /**
     * metodo para crear el objeto milotic
     * @return el objeto creado
     */
    public static Milotic makeMiloticObject() {

        milotic.setName("Milotic");
        milotic.setType("agua");
        milotic.setLevel(50);
        milotic.setLife(202);
        milotic.setSex("Hembra");
        milotic.setSpeed(138);
        AttacksPokemons[] miloticAttacks = {
                new AttacksPokemons("Agua", "Escaldar", 80, 100),
                new AttacksPokemons("Hielo", "Niebla", 0, 100),
                new AttacksPokemons("Veneno", "Toxico", 0, 100),
                new AttacksPokemons("Normal", "Recuperacion", 0, 100)
        };
        milotic.setAttacks(miloticAttacks);
        milotic.setSize(6.2f);
        milotic.setWeight(162.0f);

        return milotic;
    }

    /**
     * metodo para crear el objeto snorlax
     * @return el objeto creado
     */
    public static Snorlax makeSnorlaxObject() {

        snorlax.setName("Snorlax");
        snorlax.setType("normal");
        snorlax.setLevel(50);
        snorlax.setLife(267);
        snorlax.setSex("Macho");
        snorlax.setSpeed(31);
        AttacksPokemons[] snorlaxAttacks = {
                new AttacksPokemons("Normal", "Tambor", 0, 100),
                new AttacksPokemons("Normal", "Golpe Cuerpo", 85, 100),
                new AttacksPokemons("Psiquico", "Descanso", 0, 100),
                new AttacksPokemons("Psiquico", "Cabezazo zen", 80, 90)
        };
        snorlax.setAttacks(snorlaxAttacks);
        snorlax.setSize(2.1f);
        snorlax.setWeight(460.0f);

        return snorlax;
    }
    /**
     * metodo para crear el objeto tinkaton
     * @return el objeto creado
     */
    public static Tinkaton makeTinkatonObject() {

        tinkaton.setName("Tinkaton");
        tinkaton.setType("hada-acero");
        tinkaton.setLevel(50);
        tinkaton.setLife(180);
        tinkaton.setSex("Hembra");
        tinkaton.setSpeed(160);
        AttacksPokemons[] tinkatonAttacks = {
                new AttacksPokemons("Acero", "Martillo colosal", 160, 100),
                new AttacksPokemons("Siniestro", "Desarme", 65, 100),
                new AttacksPokemons("Hielo", "Martillo de hielo", 100, 90),
                new AttacksPokemons("Normal", "Sorpresa", 40, 100)
        };
        tinkaton.setAttacks(tinkatonAttacks);
        tinkaton.setSize(0.7f);
        tinkaton.setWeight(112.8f);

        return tinkaton;
    }
    /**
     * metodo para crear el objeto tyranitar
     * @return el objeto creado
     */
    public static Tyranitar makeTyranitarObject() {

        tyranitar.setName("Tyranitar");
        tyranitar.setType("roca-siniestro");
        tyranitar.setLevel(50);
        tyranitar.setLife(207);
        tyranitar.setSex("Hembra");
        tyranitar.setSpeed(110);
        AttacksPokemons[] tyranitarAttacks = {
                new AttacksPokemons("Roca", "Roca afilada", 100, 80),
                new AttacksPokemons("Siniestro", "Desarme", 65, 100),
                new AttacksPokemons("Electrico", "Onda trueno", 0, 90),
                new AttacksPokemons("Tierra", "Terremoto", 100, 100)
        };
        tyranitar.setAttacks(tyranitarAttacks);
        tyranitar.setSize(2.0f);
        tyranitar.setWeight(202.0f);

        return tyranitar;
    }






}

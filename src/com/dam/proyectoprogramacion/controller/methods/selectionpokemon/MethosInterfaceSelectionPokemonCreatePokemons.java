package com.dam.proyectoprogramacion.controller.methods.selectionpokemon;

import com.dam.proyectoprogramacion.model.pokemon.*;

/**
 * Clase con los metodos para crear objetos de los pokemons y añadirles atributos
 * @author cristian
 * @version v2.0
 */
public class MethosInterfaceSelectionPokemonCreatePokemons {

    /**
     * atributos estáticos de tipo pokemon
     */
    private static Drampa drampa;
    private static Empoleon empoleon;
    private static Garchomp garchomp;
    private static Gengar gengar;
    private static Infernape infernape;
    private static Lucario lucario;
    private static Luxray luxray;
    private static Marshadow marshadow;
    private static Milotic milotic;
    private static Snorlax snorlax;
    private static Tinkaton tinkaton;
    private static Tyranitar tyranitar;

    /**
     * metodo para crear el objeto drampa
     * @return el objeto creado
     */
    public static Drampa makeDrampaObject() {
        drampa = new Drampa();
        drampa.setName("Drampa");
        drampa.setType("normal-dragon");
        drampa.setLevel(100);
        drampa.setLife(297);
        drampa.setSex("Macho");
        drampa.setAttack(98);
        drampa.setDefense(88);
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
         empoleon = new Empoleon();
        empoleon.setName("Empoleon");
        empoleon.setType("agua-acero");
        empoleon.setLevel(100);
        empoleon.setLife(309);
        empoleon.setSex("Macho");
        empoleon.setAttack(99);
        empoleon.setDefense(95);
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
        garchomp = new Garchomp();
        garchomp.setName("Garchomp");
        garchomp.setType("dragon-tierra");
        garchomp.setLevel(100);
        garchomp.setLife(357);
        garchomp.setAttack(105);
        garchomp.setDefense(90);
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
         gengar = new Gengar();
        gengar.setName("Gengar");
        gengar.setType("fantasma-veneno");
        gengar.setLevel(100);
        gengar.setLife(261);
        gengar.setSex("Macho");
        gengar.setAttack(98);
        gengar.setDefense(68);
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
        infernape = new Infernape();
        infernape.setName("Infernape");
        infernape.setType("fuego-lucha");
        infernape.setLevel(100);
        infernape.setLife(293);
        infernape.setSex("Macho");
        infernape.setAttack(104);
        infernape.setDefense(71);
        infernape.setSpeed(176);
        AttacksPokemons[] infernapeAttacks = {
                new AttacksPokemons("Fuego", "Envite igneo", 120, 100),
                new AttacksPokemons("Lucha", "A bocajarro", 120, 100),
                new AttacksPokemons("Bicho", "Ida y vuelta", 70, 100),
                new AttacksPokemons("Electrico", "Puño trueno", 75, 100)
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
        lucario = new Lucario();
        lucario.setName("Lucario");
        lucario.setType("lucha-acero");
        lucario.setLevel(100);
        lucario.setLife(281);
        lucario.setSex("Macho");
        lucario.setAttack(113);
        lucario.setDefense(70);
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
         luxray = new Luxray();
        luxray.setName("Luxray");
        luxray.setType("electrico");
        luxray.setLevel(100);
        luxray.setLife(301);
        luxray.setSex("Hembra");
        luxray.setAttack(108);
        luxray.setDefense(79);
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
        marshadow = new Marshadow();
        marshadow.setName("Marshadow");
        marshadow.setType("lucha-fantasma");
        marshadow.setLevel(100);
        marshadow.setLife(321);
        marshadow.setSex(null);
        marshadow.setAttack(108);
        marshadow.setDefense(85);
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
        milotic = new Milotic();
        milotic.setName("Milotic");
        milotic.setType("agua");
        milotic.setLevel(100);
        milotic.setLife(331);
        milotic.setSex("Hembra");
        milotic.setAttack(80);
        milotic.setDefense(102);
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
        snorlax = new Snorlax();
        snorlax.setName("Snorlax");
        snorlax.setType("normal");
        snorlax.setLevel(100);
        snorlax.setLife(461);
        snorlax.setSex("Macho");
        snorlax.setAttack(88);
        snorlax.setDefense(88);
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
        tinkaton = new Tinkaton();
        tinkaton.setName("Tinkaton");
        tinkaton.setType("hada-acero");
        tinkaton.setLevel(100);
        tinkaton.setLife(311);
        tinkaton.setSex("Hembra");
        tinkaton.setAttack(73);
        tinkaton.setDefense(91);
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
        tyranitar = new Tyranitar();
        tyranitar.setName("Tyranitar");
        tyranitar.setType("roca-siniestro");
        tyranitar.setLevel(100);
        tyranitar.setLife(341);
        tyranitar.setSex("Hembra");
        tyranitar.setAttack(115);
        tyranitar.setDefense(105);
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


    /**
     * getters de los atributos de tipo pokemon
     * @return los atributos correspondientes
     */
    public static Drampa getDrampa() {
        return drampa;
    }

    public static Empoleon getEmpoleon() {
        return empoleon;
    }

    public static Garchomp getGarchomp() {
        return garchomp;
    }

    public static Gengar getGengar() {
        return gengar;
    }

    public static Infernape getInfernape() {
        return infernape;
    }

    public static Lucario getLucario() {
        return lucario;
    }

    public static Luxray getLuxray() {
        return luxray;
    }

    public static Marshadow getMarshadow() {
        return marshadow;
    }

    public static Milotic getMilotic() {
        return milotic;
    }

    public static Snorlax getSnorlax() {
        return snorlax;
    }

    public static Tinkaton getTinkaton() {
        return tinkaton;
    }

    public static Tyranitar getTyranitar() {
        return tyranitar;
    }
}

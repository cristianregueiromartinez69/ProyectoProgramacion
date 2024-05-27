import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePokemon;
import com.dam.proyectoprogramacion.pokemon.*;
import com.dam.proyectoprogramacion.methods.selectionpokemon.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSelectionPokemon {


    @Test
    @DisplayName("crear Objeto Drampa")
    public void testMakeDrampaObject() {
        Drampa drampa = MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject();
        assertNotNull(drampa);
        assertEquals("Drampa", drampa.getName());
        assertEquals("normal-dragon", drampa.getType());
        assertEquals(50, (int) drampa.getLevel());
        assertEquals(185, (int) drampa.getLife());
        assertEquals("Macho", drampa.getSex());
        assertEquals(98, (int) drampa.getAttack());
        assertEquals(88, (int) drampa.getDefense());
        assertEquals(36, (int) drampa.getSpeed());
        assertEquals(3.0f, drampa.getSize(), 0.0f);
        assertEquals(185.0f, drampa.getWeight(), 0.0f);

    }

    @Test
    @DisplayName("crear ataques Drampa")
    public void testDrampaAttacks() {
        // Crear los ataques esperados
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Dragon", "Pulso dragon", 85, 100),
                new AttacksPokemons("Psiquico", "Paranormal", 85, 100),
                new AttacksPokemons("Fuego", "Lanzallamas", 90, 100),
                new AttacksPokemons("Normal", "Vozarron", 90, 100)
        };

        Drampa drampa = MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject();
        drampa.setAttacks(expectedAttacks);

        AttacksPokemons[] drampaAttacks = drampa.getAttacks();

        assertArrayEquals(expectedAttacks, drampaAttacks);
    }

    @Test
    @DisplayName("crear Objeto Empoleon")
    public void testMakeEmpoleonObject() {
        Empoleon empoleon = MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject();
        assertNotNull(empoleon);
        assertEquals("Empoleon", empoleon.getName());
        assertEquals("agua-acero", empoleon.getType());
        assertEquals(50, (int) empoleon.getLevel());
        assertEquals(191, (int) empoleon.getLife());
        assertEquals("Macho", empoleon.getSex());
        assertEquals(99, (int) empoleon.getAttack());
        assertEquals(95, (int) empoleon.getDefense());
        assertEquals(96, (int) empoleon.getSpeed());
        assertEquals(1.7f, empoleon.getSize(), 0.0f);
        assertEquals(84.5f, empoleon.getWeight(), 0.0f);
    }

    @Test
    @DisplayName("crear ataques Empoleon")
    public void testEmpoleonAttacks() {
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Roca", "Trampa rocas", 0, 100),
                new AttacksPokemons("Agua", "Surf", 90, 100),
                new AttacksPokemons("Hielo", "Rayo hielo", 90, 100),
                new AttacksPokemons("Volador", "Respiro", 0, 100)
        };

        Empoleon empoleon = MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject();
        empoleon.setAttacks(expectedAttacks);

        AttacksPokemons[] empoleonAttacks = empoleon.getAttacks();

        assertArrayEquals(expectedAttacks, empoleonAttacks);
    }

    @Test
    @DisplayName("crear Objeto Garchomp")
    public void testMakeGarchompObject() {
        Garchomp garchomp = MethosInterfaceSelectionPokemonCreatePokemons.makeGarchompObject();
        assertNotNull(garchomp);
        assertEquals("Garchomp", garchomp.getName());
        assertEquals("dragon-tierra", garchomp.getType());
        assertEquals(50, (int) garchomp.getLevel());
        assertEquals(195, (int) garchomp.getLife());
        assertEquals("Hembra", garchomp.getSex());
        assertEquals(105, (int) garchomp.getAttack());
        assertEquals(90, (int) garchomp.getDefense());
        assertEquals(169, (int) garchomp.getSpeed());
        assertEquals(1.9f, garchomp.getSize(), 0.0f);
        assertEquals(95.0f, garchomp.getWeight(), 0.0f);
    }

    @Test
    @DisplayName("crear ataques Garchomp")
    public void testGarchompAttacks() {
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Dragon", "Garra Dragon", 80, 100),
                new AttacksPokemons("Tierra", "Terremoto", 100, 100),
                new AttacksPokemons("Acero", "Cabeza de hierro", 80, 100),
                new AttacksPokemons("Normal", "Danza espada", 0, 100)
        };
        Garchomp garchomp = MethosInterfaceSelectionPokemonCreatePokemons.makeGarchompObject();
        garchomp.setAttacks(expectedAttacks);

        AttacksPokemons[] garchompAttacks = garchomp.getAttacks();

        assertArrayEquals(expectedAttacks, garchompAttacks);
    }

    @Test
    @DisplayName("crear Objeto Gengar")
    public void testMakeGengarObject() {
        Gengar gengar = MethosInterfaceSelectionPokemonCreatePokemons.makeGengarObject();
        assertNotNull(gengar);
        assertEquals("Gengar", gengar.getName());
        assertEquals("fantasma-veneno", gengar.getType());
        assertEquals(50, (int) gengar.getLevel());
        assertEquals(135, (int) gengar.getLife());
        assertEquals("Macho", gengar.getSex());
        assertEquals(98, (int) gengar.getAttack());
        assertEquals(68, (int) gengar.getDefense());
        assertEquals(178, (int) gengar.getSpeed());
        assertEquals(1.5f, gengar.getSize(), 0.0f);
        assertEquals(40.5f, gengar.getWeight(), 0.0f);
    }

    @Test
    @DisplayName("crear ataques Gengar")
    public void testGengarAttacks() {
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Fantasma", "Bola sombra", 80, 100),
                new AttacksPokemons("Veneno", "Onda toxica", 95, 100),
                new AttacksPokemons("Lucha", "Onda certera", 120, 70),
                new AttacksPokemons("Electrico", "Rayo", 90, 100)
        };
        Gengar gengar = MethosInterfaceSelectionPokemonCreatePokemons.makeGengarObject();
        gengar.setAttacks(expectedAttacks);

        AttacksPokemons[] gengarAttacks = gengar.getAttacks();

        assertArrayEquals(expectedAttacks, gengarAttacks);
    }

    @Test
    @DisplayName("crear Objeto Infernape")
    public void testMakeInfernapeObject() {
        Infernape infernape = MethosInterfaceSelectionPokemonCreatePokemons.makeInfernapeObject();
        assertNotNull(infernape);
        assertEquals("Infernape", infernape.getName());
        assertEquals("fuego-lucha", infernape.getType());
        assertEquals(50, (int) infernape.getLevel());
        assertEquals(160, (int) infernape.getLife());
        assertEquals("Macho", infernape.getSex());
        assertEquals(104, (int) infernape.getAttack());
        assertEquals(71, (int) infernape.getDefense());
        assertEquals(176, (int) infernape.getSpeed());
        assertEquals(1.2f, infernape.getSize(), 0.0f);
        assertEquals(55.0f, infernape.getWeight(), 0.0f);
    }

    @Test
    @DisplayName("crear ataques Infernape")
    public void testInfernapeAttacks() {
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Fuego", "Envite igneo", 120, 100),
                new AttacksPokemons("Lucha", "A bocajarro", 120, 100),
                new AttacksPokemons("Bicho", "Ida y vuelta", 70, 100),
                new AttacksPokemons("Electrico", "Puño trueno", 75, 100)
        };
        Infernape infernape = MethosInterfaceSelectionPokemonCreatePokemons.makeInfernapeObject();
        infernape.setAttacks(expectedAttacks);

        AttacksPokemons[] infernapeAttacks = infernape.getAttacks();

        assertArrayEquals(expectedAttacks, infernapeAttacks);
    }

    @Test
    @DisplayName("crear Objeto Lucario")
    public void testMakeLucarioObject() {
        Lucario lucario = MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject();
        assertNotNull(lucario);
        assertEquals("Lucario", lucario.getName());
        assertEquals("lucha-acero", lucario.getType());
        assertEquals(50, (int) lucario.getLevel());
        assertEquals(150, (int) lucario.getLife());
        assertEquals("Macho", lucario.getSex());
        assertEquals(113, (int) lucario.getAttack());
        assertEquals(70, (int) lucario.getDefense());
        assertEquals(156, (int) lucario.getSpeed());
        assertEquals(1.2f, lucario.getSize(), 0.0f);
        assertEquals(54.0f, lucario.getWeight(), 0.0f);
    }

    @Test
    @DisplayName("crear ataques Lucario")
    public void testLucarioAttacks() {
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Normal", "Danza espada", 0, 100),
                new AttacksPokemons("Lucha", "A bocajarro", 120, 100),
                new AttacksPokemons("Acero", "Puño meteoro", 90, 90),
                new AttacksPokemons("Normal", "Velocidad extrema", 80, 100)
        };
        Lucario lucario = MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject();
        lucario.setAttacks(expectedAttacks);

        AttacksPokemons[] lucarioAttacks = lucario.getAttacks();

        assertArrayEquals(expectedAttacks, lucarioAttacks);
    }

    @Test
    @DisplayName("crear Objeto Luxray")
    public void testMakeLuxrayObject() {
        Luxray luxray = MethosInterfaceSelectionPokemonCreatePokemons.makeLuxrayObject();
        assertNotNull(luxray);
        assertEquals("Luxray", luxray.getName());
        assertEquals("electrico", luxray.getType());
        assertEquals(50, (int) luxray.getLevel());
        assertEquals(160, (int) luxray.getLife());
        assertEquals("Hembra", luxray.getSex());
        assertEquals(108, (int) luxray.getAttack());
        assertEquals(79, (int) luxray.getDefense());
        assertEquals(134, (int) luxray.getSpeed());
        assertEquals(1.4f, luxray.getSize(), 0.0f);
        assertEquals(42.0f, luxray.getWeight(), 0.0f);

    }

    @Test
    @DisplayName("crear ataques Luxray")
    public void testLuxrayAttacks() {
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Electrico", "Voltio cruel", 90, 100),
                new AttacksPokemons("Electrico", "Voltiocambio", 70, 100),
                new AttacksPokemons("Planta", "abrecaminos", 50, 100),
                new AttacksPokemons("Siniestro", "Triturar", 80, 100)
        };
        Luxray luxray = MethosInterfaceSelectionPokemonCreatePokemons.makeLuxrayObject();
        luxray.setAttacks(expectedAttacks);

        AttacksPokemons[] luxrayAttacks = luxray.getAttacks();

        assertArrayEquals(expectedAttacks, luxrayAttacks);
    }

    @Test
    @DisplayName("crear Objeto Marshadow")
    public void testMakeMarshadowObject() {
        Marshadow marshadow = MethosInterfaceSelectionPokemonCreatePokemons.makeMarshadowObject();
        assertNotNull(marshadow);
        assertEquals("Marshadow", marshadow.getName());
        assertEquals("lucha-fantasma", marshadow.getType());
        assertEquals(50, (int) marshadow.getLevel());
        assertEquals(170, (int) marshadow.getLife());
        assertNull(marshadow.getSex());
        assertEquals(108, (int) marshadow.getAttack());
        assertEquals(85, (int) marshadow.getDefense());
        assertEquals(194, (int) marshadow.getSpeed());
        assertEquals(0.7f, marshadow.getSize(), 0.0f);
        assertEquals(22.2f, marshadow.getWeight(), 0.0f);

    }

    @Test
    @DisplayName("crear ataques Marshadow")
    public void testMarshadowAttacks() {
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Fantasma", "Roba sombra", 90, 100),
                new AttacksPokemons("Hielo", "Puño hielo", 75, 100),
                new AttacksPokemons("Lucha", "A bocajarro", 120, 100),
                new AttacksPokemons("Fantasma", "Sombre vil", 40, 100)
        };
        Marshadow marshadow = MethosInterfaceSelectionPokemonCreatePokemons.makeMarshadowObject();
        marshadow.setAttacks(expectedAttacks);

        AttacksPokemons[] marshadowAttacks = marshadow.getAttacks();

        assertArrayEquals(expectedAttacks, marshadowAttacks);
    }

    @Test
    @DisplayName("crear Objeto Milotic")
    public void testMakeMiloticObject() {
        Milotic milotic = MethosInterfaceSelectionPokemonCreatePokemons.makeMiloticObject();
        assertNotNull(milotic);
        assertEquals("Milotic", milotic.getName());
        assertEquals("agua", milotic.getType());
        assertEquals(50, (int) milotic.getLevel());
        assertEquals(202, (int) milotic.getLife());
        assertEquals("Hembra", milotic.getSex());
        assertEquals(80, (int) milotic.getAttack());
        assertEquals(102, (int) milotic.getDefense());
        assertEquals(138, (int) milotic.getSpeed());
        assertEquals(6.2f, milotic.getSize(), 0.0f);
        assertEquals(162.0f, milotic.getWeight(), 0.0f);
    }

    @Test
    @DisplayName("crear ataques Milotic")
    public void testMiloticAttacks() {
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Agua", "Escaldar", 80, 100),
                new AttacksPokemons("Hielo", "Niebla", 0, 100),
                new AttacksPokemons("Veneno", "Toxico", 0, 100),
                new AttacksPokemons("Normal", "Recuperacion", 0, 100)
        };
        Milotic milotic = MethosInterfaceSelectionPokemonCreatePokemons.makeMiloticObject();
        milotic.setAttacks(expectedAttacks);

        AttacksPokemons[] miloticAttacks = milotic.getAttacks();

        assertArrayEquals(expectedAttacks, miloticAttacks);
    }

    @Test
    @DisplayName("crear Objeto Snorlax")
    public void testMakeSnorlaxObject() {
        Snorlax snorlax = MethosInterfaceSelectionPokemonCreatePokemons.makeSnorlaxObject();
        assertNotNull(snorlax);
        assertEquals("Snorlax", snorlax.getName());
        assertEquals("normal", snorlax.getType());
        assertEquals(50, (int) snorlax.getLevel());
        assertEquals(267, (int) snorlax.getLife());
        assertEquals("Macho", snorlax.getSex());
        assertEquals(88, (int) snorlax.getAttack());
        assertEquals(88, (int) snorlax.getDefense());
        assertEquals(31, (int) snorlax.getSpeed());
        assertEquals(2.1f, snorlax.getSize(), 0.0f);
        assertEquals(460.0f, snorlax.getWeight(), 0.0f);
    }

    @Test
    @DisplayName("crear ataques Snorlax")
    public void testSnorlaxAttacks() {
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Normal", "Tambor", 0, 100),
                new AttacksPokemons("Normal", "Golpe Cuerpo", 85, 100),
                new AttacksPokemons("Psiquico", "Descanso", 0, 100),
                new AttacksPokemons("Psiquico", "Cabezazo zen", 80, 90)
        };
        Snorlax snorlax = MethosInterfaceSelectionPokemonCreatePokemons.makeSnorlaxObject();
        snorlax.setAttacks(expectedAttacks);

        AttacksPokemons[] snorlaxAttacks = snorlax.getAttacks();

        assertArrayEquals(expectedAttacks, snorlaxAttacks);
    }

    @Test
    @DisplayName("crear Objeto Tinkaton")
    public void testMakeTinkatonObject() {
        Tinkaton tinkaton = MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject();
        assertNotNull(tinkaton);
        assertEquals("Tinkaton", tinkaton.getName());
        assertEquals("hada-acero", tinkaton.getType());
        assertEquals(50, (int) tinkaton.getLevel());
        assertEquals(180, (int) tinkaton.getLife());
        assertEquals("Hembra", tinkaton.getSex());
        assertEquals(73, (int) tinkaton.getAttack());
        assertEquals(91, (int) tinkaton.getDefense());
        assertEquals(160, (int) tinkaton.getSpeed());
        assertEquals(0.7f, tinkaton.getSize(), 0.0f);
        assertEquals(112.8f, tinkaton.getWeight(), 0.0f);
    }

    @Test
    @DisplayName("crear ataques Tinkaton")
    public void testTinkatonAttacks() {
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Acero", "Martillo colosal", 160, 100),
                new AttacksPokemons("Siniestro", "Desarme", 65, 100),
                new AttacksPokemons("Hielo", "Martillo de hielo", 100, 90),
                new AttacksPokemons("Normal", "Sorpresa", 40, 100)
        };
        Tinkaton tinkaton = MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject();
        tinkaton.setAttacks(expectedAttacks);

        AttacksPokemons[] tinkatonAttacks = tinkaton.getAttacks();

        assertArrayEquals(expectedAttacks, tinkatonAttacks);
    }

    @Test
    @DisplayName("crear Objeto Tyranitar")
    public void testMakeTyranitarObject() {
        Tyranitar tyranitar = MethosInterfaceSelectionPokemonCreatePokemons.makeTyranitarObject();
        assertNotNull(tyranitar);
        assertEquals("Tyranitar", tyranitar.getName());
        assertEquals("roca-siniestro", tyranitar.getType());
        assertEquals(50, (int) tyranitar.getLevel());
        assertEquals(207, (int) tyranitar.getLife());
        assertEquals("Hembra", tyranitar.getSex());
        assertEquals(115, (int) tyranitar.getAttack());
        assertEquals(105, (int) tyranitar.getDefense());
        assertEquals(110, (int) tyranitar.getSpeed());
        assertEquals(2.0f, tyranitar.getSize(), 0.0f);
        assertEquals(202.0f, tyranitar.getWeight(), 0.0f);
    }

    @Test
    @DisplayName("crear ataques Tyranitar")
    public void testTyranitarAttacks() {
        AttacksPokemons[] expectedAttacks = {
                new AttacksPokemons("Roca", "Roca afilada", 100, 80),
                new AttacksPokemons("Siniestro", "Desarme", 65, 100),
                new AttacksPokemons("Electrico", "Onda trueno", 0, 90),
                new AttacksPokemons("Tierra", "Terremoto", 100, 100)
        };
        Tyranitar tyranitar = MethosInterfaceSelectionPokemonCreatePokemons.makeTyranitarObject();
        tyranitar.setAttacks(expectedAttacks);

        AttacksPokemons[] tyranitarAttacks = tyranitar.getAttacks();

        assertArrayEquals(expectedAttacks, tyranitarAttacks);
    }


    @Test
    @DisplayName("comprobar que se añaden jugadores y pokemons correctamente")
    public void testPutPlayersAndPokemons() {
        String alias = "Player1";
        ArrayList<Object> pokemons = new ArrayList<>();
        pokemons.add("Pokemon1");
        pokemons.add("Pokemon2");

        MethosInterfaceSelectionPokemon.putPlayersAndPokemons(alias, pokemons);

        HashMap<String, ArrayList<Object>> playersBattle = MethosInterfaceSelectionPokemon.getPlayersBattle();

        assertTrue(playersBattle.containsKey(alias));
        assertEquals(pokemons, playersBattle.get(alias));
    }

    @Test
    @DisplayName("comprobar que se añade vida a los pokemons correctamente")
    public void testAddLifePokemonsPlayer1() {
        // Crear un alias y una lista de pokemons
        String alias = "Player1";
        ArrayList<Object> pokemons = new ArrayList<>();
        Drampa pokemon1 = new Drampa();
        pokemon1.setName("Pokemon1");
        pokemon1.setLife(100);
        pokemons.add(pokemon1);

        Empoleon pokemon2 = new Empoleon();
        pokemon2.setName("Pokemon2");
        pokemon2.setLife(200);
        pokemons.add(pokemon2);

        MethosInterfaceSelectionPokemon.putPlayersAndPokemons(alias, pokemons);

        MethosInterfaceSelectionPokemon.addLifePokemonsPlayer1(alias);

        HashMap<String, Integer> lifePokemonsPlayer1 = MethodsBattlePokemon.getLifePokemonsPlayer1();

        // Comprobar que los pokemons y sus vidas se añadieron correctamente
        assertEquals(100, lifePokemonsPlayer1.get("pokemon1"));
        assertEquals(200, lifePokemonsPlayer1.get("pokemon2"));
    }


    @Test
    @DisplayName("comprobar que hay 3 pokemons en la lista")
    public void testCheckSizeListPokemonsPlayer1() {

        MethosInterfaceSelectionPokemon.getPokemonsPLayer1().add("Pokemon1");
        MethosInterfaceSelectionPokemon.getPokemonsPLayer1().add("Pokemon2");
        MethosInterfaceSelectionPokemon.getPokemonsPLayer1().add("Pokemon2");

        assertFalse(MethosInterfaceSelectionPokemon.checkSizeListPokemonsPLayer1());
    }

}

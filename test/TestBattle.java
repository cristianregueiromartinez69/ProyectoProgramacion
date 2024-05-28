import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePlayer1;
import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePokemon;
import com.dam.proyectoprogramacion.pokemon.*;
import com.dam.proyectoprogramacion.methods.selectionpokemon.*;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBattle {


    @Test
    @DisplayName("comprobar que se divide el tipo en 2 del pokemon en batalla del jugador 1 correctamente")
    public void testBreakDownPokemonTypeInBattlePlayer1() {
        String[] result = MethodsBattlePokemon.breakDownPokemonTypeInBattlePlayer1("Fire-Water");
        assertArrayEquals(new String[]{"Fire", "Water"}, result);

        result = MethodsBattlePokemon.breakDownPokemonTypeInBattlePlayer1("Fire");
        assertArrayEquals(new String[]{"Fire"}, result);
    }

    @Test
    @DisplayName("comprobar que el pokemon en batalla del jugador 1 vive")
    public void testIsPokemonAlivePlayer1() {
        boolean result = MethodsBattlePokemon.isPokemonAlivePlayer1(50);
        assertTrue(result);

        result = MethodsBattlePokemon.isPokemonAlivePlayer1(0);
        assertFalse(result);

        result = MethodsBattlePokemon.isPokemonAlivePlayer1(-50);
        assertFalse(result);
    }


    @Test
    @DisplayName("comprobar el ataque total del pokemon del jugador 1 en batalla")
    public void testGetAmountAttackPokemonInBattlePlayer1() {
        MethosInterfaceSelectionPokemon.getPokemonsPLayer1().add(MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject());
        int result = MethodsBattlePlayer1.getAmountAttackPokemonInBattlePlayer1("Tinkaton");
        assertEquals(73, result);

        result = MethodsBattlePlayer1.getAmountAttackPokemonInBattlePlayer1("NonExistentPokemon");
        assertEquals(0, result);
    }

    @Test
    @DisplayName("comprobar el poder de ataque 1 del pokemon del jugador 1 en batalla")
    public void testGetPowerAttack1PokemonInBattlePlayer1() {
        MethosInterfaceSelectionPokemon.getPokemonsPLayer1().add(MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject());
        int result = MethodsBattlePlayer1.getPowerAttack1PokemonInBattlePlayer1("Drampa");
        assertEquals(85, result);

        result = MethodsBattlePlayer1.getPowerAttack1PokemonInBattlePlayer1("NonExistentPokemon");
        assertEquals(0, result);
    }

    @Test
    @DisplayName("comprobar el poder de ataque 2 del pokemon del jugador 1 en batalla")
    public void testGetPowerAttack2PokemonInBattlePlayer1() {
        MethosInterfaceSelectionPokemon.getPokemonsPLayer1().add(MethosInterfaceSelectionPokemonCreatePokemons.makeSnorlaxObject());
        int result = MethodsBattlePlayer1.getPowerAttack2PokemonInBattlePlayer1("Snorlax");
        assertEquals(85, result);

        result = MethodsBattlePlayer1.getPowerAttack1PokemonInBattlePlayer1("NonExistentPokemon");
        assertEquals(0, result);
    }

    @Test
    @DisplayName("comprobar el poder de ataque 3 del pokemon del jugador 1 en batalla")
    public void testGetPowerAttack3PokemonInBattlePlayer1() {
        MethosInterfaceSelectionPokemon.getPokemonsPLayer1().add(MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject());
        int result = MethodsBattlePlayer1.getPowerAttack3PokemonInBattlePlayer1("Empoleon");
        assertEquals(90, result);

        result = MethodsBattlePlayer1.getPowerAttack1PokemonInBattlePlayer1("NonExistentPokemon");
        assertEquals(0, result);
    }

    @Test
    @DisplayName("comprobar el poder de ataque 4 del pokemon del jugador 1 en batalla")
    public void testGetPowerAttack4PokemonInBattlePlayer1() {
        MethosInterfaceSelectionPokemon.getPokemonsPLayer1().add(MethosInterfaceSelectionPokemonCreatePokemons.makeInfernapeObject());
        int result = MethodsBattlePlayer1.getPowerAttack4PokemonInBattlePlayer1("Infernape");
        assertEquals(75, result);

        result = MethodsBattlePlayer1.getPowerAttack1PokemonInBattlePlayer1("NonExistentPokemon");
        assertEquals(0, result);
    }

    @Test
    @DisplayName("comprobar la velocidad del pokemon en batalla")
    public void testGetSpeddPokemonInBattlePlayer1() {
        MethosInterfaceSelectionPokemon.getPokemonsPLayer1().add(MethosInterfaceSelectionPokemonCreatePokemons.makeTyranitarObject());
        int result = MethodsBattlePlayer1.getSpeedPokemonInBattlePlayer1("Tyranitar");
        assertEquals(110, result);

        result = MethodsBattlePlayer1.getPowerAttack1PokemonInBattlePlayer1("NonExistentPokemon");
        assertEquals(0, result);
    }

    @Test
    @DisplayName("comprobar la defensa del pokemon en batalla")
    public void testGetDefenseOpposingPokemonInBattle() {
        MethosInterfaceSelectionPokemon.getPokemonsPLayer2().add(MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject());
        int result = MethodsBattlePlayer1.getDefenseOpposingPokemonInBattle("Lucario");
        assertEquals(70, result);

        result = MethodsBattlePlayer1.getPowerAttack1PokemonInBattlePlayer1("NonExistentPokemon");
        assertEquals(0, result);
    }


    @Test
    @DisplayName("comprobar el tipo de ataque del pokemon en batalla")
    public void testChooseAttackIconPokemon1Player1() {
        // Test with all possible types
        assertEquals("imagenes/bicho.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("bicho"));
        assertEquals("imagenes/siniestro.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("siniestro"));
        assertEquals("imagenes/dragon.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("dragon"));
        assertEquals("imagenes/electrico.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("electrico"));
        assertEquals("imagenes/hada.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("hada"));
        assertEquals("imagenes/lucha.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("lucha"));
        assertEquals("imagenes/fuego.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("fuego"));
        assertEquals("imagenes/volador.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("volador"));
        assertEquals("imagenes/fantasma.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("fantasma"));
        assertEquals("imagenes/planta.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("planta"));
        assertEquals("imagenes/normal.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("normal"));
        assertEquals("imagenes/veneno.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("veneno"));
        assertEquals("imagenes/roca.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("roca"));
        assertEquals("imagenes/acero.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("acero"));
        assertEquals("imagenes/tierra.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("tierra"));
        assertEquals("imagenes/agua.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("agua"));
        assertEquals("imagenes/psiquico.png", MethodsBattlePlayer1.chooseAttackIconPokemon1Player1("psiquico"));

    }


    @Test
    public void testChooseColorAttacksPokemonPlayer1() {
        assertEquals(Color.GREEN.brighter(), MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("bicho"));
        assertEquals(Color.MAGENTA.darker(), MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("siniestro"));
        assertEquals(Color.BLUE.brighter(), MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("dragon"));
        assertEquals(Color.YELLOW, MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("electrico"));
        assertEquals(Color.PINK, MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("hada"));
        assertEquals(Color.ORANGE, MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("lucha"));
        assertEquals(Color.RED.brighter(), MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("fuego"));
        assertEquals(Color.CYAN, MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("volador"));
        assertEquals(Color.MAGENTA.darker().darker(), MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("fantasma"));
        assertEquals(Color.GREEN, MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("planta"));
        assertEquals(Color.GRAY.brighter(), MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("normal"));
        assertEquals(Color.PINK.darker(), MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("veneno"));
        assertEquals(Color.GRAY.darker(), MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("roca"));
        assertEquals(Color.GRAY, MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("acero"));
        assertEquals(Color.ORANGE.darker(), MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("tierra"));
        assertEquals(Color.BLUE, MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("agua"));
        assertEquals(Color.MAGENTA, MethodsBattlePlayer1.chooseColorAttacksPokemonPlayer1("psiquico"));


    }



}

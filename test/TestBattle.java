import com.dam.proyectoprogramacion.buttons.ButtonInterfaceCombat;
import com.dam.proyectoprogramacion.methods.battle.*;
import com.dam.proyectoprogramacion.pokemon.*;
import com.dam.proyectoprogramacion.methods.selectionpokemon.*;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static com.dam.proyectoprogramacion.methods.battle.MethodsBattlePokemon.*;
import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePlayer1;
import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePokemon;
import com.dam.proyectoprogramacion.pokemon.*;
import com.dam.proyectoprogramacion.methods.selectionpokemon.*;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
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




    @Test
    @DisplayName("comprobar que se añaden valores a lifePokemonsPlayer1 correctamente")
    public void testPutValuesLifePokemonsPlayer1() {
        MethodsBattlePokemon.putValuesLifePokemonsPlayer1("Pokemon1", 50);
        assertEquals(50, MethodsBattlePokemon.getLifePokemonsPlayer1().get("Pokemon1"));

        MethodsBattlePokemon.putValuesLifePokemonsPlayer1("Pokemon2", 100);
        assertEquals(100, MethodsBattlePokemon.getLifePokemonsPlayer1().get("Pokemon2"));
    }



    @Test
    public void testGetEffectivenessForTheOpposingPokemonPlayer1() {
        assertEquals(MethodsBattlePokemon.NULL_DAMAGE, MethodsBattlePokemon.getEffectivenessForTheOpposingPokemonPlayer1("fantasma", "normal"));
        assertEquals(MethodsBattlePokemon.VERY_INEFFECTIVE_DAMAGE, MethodsBattlePokemon.getEffectivenessForTheOpposingPokemonPlayer1("acero", "agua-acero"));
        assertEquals(MethodsBattlePokemon.INEFFECTIVE_DAMAGE, MethodsBattlePokemon.getEffectivenessForTheOpposingPokemonPlayer1("fuego", "agua"));
        assertEquals(MethodsBattlePokemon.NEUTRAL_DAMAGE, MethodsBattlePokemon.getEffectivenessForTheOpposingPokemonPlayer1("hada", "electrico"));
        assertEquals(MethodsBattlePokemon.EFFECTIVE_DAMAGE, MethodsBattlePokemon.getEffectivenessForTheOpposingPokemonPlayer1("lucha", "agua-acero"));
        assertEquals(MethodsBattlePokemon.SUPER_EFFECTIVE_DAMAGE, MethodsBattlePokemon.getEffectivenessForTheOpposingPokemonPlayer1("lucha", "roca-siniestro"));
    }


    @Test
    @DisplayName("comprobar que el stab se hace correctamente")
    public void testGetBonificationStabAttacksPokemonInBattlePlayer1() {

         MethosInterfaceSelectionPokemon.getPokemonsPLayer1().add(MethosInterfaceSelectionPokemonCreatePokemons.makeTinkatonObject());


        ButtonInterfaceCombat.setPathPokemonBattlePlayer1("imagenes/tinkaton.png");
        assertEquals(MethodsBattlePokemon.STAB, MethodsBattlePokemon.getBonificationStabAttacksPokemonInBattlePlayer1("hada"));

        assertEquals(MethodsBattlePokemon.NOT_STAB, MethodsBattlePokemon.getBonificationStabAttacksPokemonInBattlePlayer1("siniestro"));

        ButtonInterfaceCombat.setPathPokemonBattlePlayer1("imagenes/lucario.png");

        MethosInterfaceSelectionPokemon.getPokemonsPLayer1().add(MethosInterfaceSelectionPokemonCreatePokemons.makeLucarioObject());

        assertEquals(MethodsBattlePokemon.STAB, MethodsBattlePokemon.getBonificationStabAttacksPokemonInBattlePlayer1("lucha"));
    }


    @Test
    @DisplayName("comprobar si los nombres de los pokemons en cambio son esos")
    public void testGetNamePokemonToChangePlayer1() {
        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconPokemon1("/path/to/pokemon1.png");
        assertEquals("pokemon1", MethodsTextAreaBattlePlayer1.getNamePokemon1ToChangePLayer1());

        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconPokemon2("/path/to/pokemon2.png");
        assertEquals("pokemon2", MethodsTextAreaBattlePlayer1.getNamePokemon2ToChangePLayer1());

        DataNamesIconsColorsAttacksAndPokemonsPlayer1.setPathIconPokemon3("/path/to/pokemon3.png");
        assertEquals("pokemon3", MethodsTextAreaBattlePlayer1.getNamePokemon3ToChangePLayer1());

    }

    @Test
    @DisplayName("comprobar si se conoce el nombre del pokemon contrario")
    public void testKnowTheNameOfTheOpposingPokemon() {
        ButtonInterfaceCombat.setPathPokemonBattlePlayer2("/path/to/opposingPokemon.png");
        assertEquals("opposingPokemon", MethodsTextAreaBattlePlayer1.KnowTheNameOfTheOpposingPokemon());

    }



    @Test
    @DisplayName("conocer el daño de un ataque de tipo acero al oponente")
    public void testGetResultSteelAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultSteelAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE, MethosTargetType.getResultSteelAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultSteelAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultSteelAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultSteelAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultSteelAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultSteelAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultSteelAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultSteelAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultSteelAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultSteelAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultSteelAttackType("agua"));
        assertNull(MethosTargetType.getResultSteelAttackType("tipoExistente"));
    }

    @Test
    @DisplayName("conocer el daño de un ataque de tipo agua al oponente")
    public void testGetResultWaterAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultWatterAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultWatterAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultWatterAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultWatterAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultWatterAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultWatterAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultWatterAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultWatterAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultWatterAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultWatterAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultWatterAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultWatterAttackType("agua"));
        assertNull(MethosTargetType.getResultWatterAttackType("tipoExistente"));
    }
    @Test
    @DisplayName("conocer el daño de un ataque de tipo bicho al oponente")
    public void testGetResultBugAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultBugAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultBugAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultBugAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE, MethosTargetType.getResultBugAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE, MethosTargetType.getResultBugAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultBugAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE, MethosTargetType.getResultBugAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE, MethosTargetType.getResultBugAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultBugAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultBugAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE, MethosTargetType.getResultBugAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultBugAttackType("agua"));
        assertNull(MethosTargetType.getResultBugAttackType("tipoExistente"));
    }
    @Test
    @DisplayName("conocer el daño de un ataque de tipo dragon al oponente")
    public void testGetResultDragonAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultDragonAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultDragonAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDragonAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultDragonAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDragonAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDragonAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDragonAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultDragonAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDragonAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultDragonAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDragonAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDragonAttackType("agua"));
        assertNull(MethosTargetType.getResultDragonAttackType("tipoExistente"));
    }

    @Test
    @DisplayName("conocer el daño de un ataque de tipo electrico al oponente")
    public void testGetResultElectricAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultElectricAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultElectricAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultElectricAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultElectricAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultElectricAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultElectricAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultElectricAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultElectricAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultElectricAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultElectricAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultElectricAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultElectricAttackType("agua"));
        assertNull(MethosTargetType.getResultElectricAttackType("tipoExistente"));
    }

    @Test
    @DisplayName("conocer el daño de un ataque de tipo hada al oponente")
    public void testGetResultFairyAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFairyAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFairyAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFairyAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFairyAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFairyAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFairyAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFairyAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFairyAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFairyAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFairyAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFairyAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFairyAttackType("agua"));
        assertNull(MethosTargetType.getResultFairyAttackType("tipoExistente"));
    }
    @Test
    @DisplayName("conocer el daño de un ataque de tipo fantasma al oponente")
    public void testGetResultGhostAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultGhostAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGhostAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultGhostAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGhostAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultGhostAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultGhostAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGhostAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGhostAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGhostAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGhostAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultGhostAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGhostAttackType("agua"));
        assertNull(MethosTargetType.getResultGhostAttackType("tipoExistente"));
    }

    @Test
    @DisplayName("conocer el daño de un ataque de tipo lucha al oponente")
    public void testGetResultFightAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFightingAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFightingAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFightingAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFightingAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultFightingAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.SUPER_EFFECTIVE, MethosTargetType.getResultFightingAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFightingAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFightingAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFightingAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFightingAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultFightingAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFightingAttackType("agua"));
        assertNull(MethosTargetType.getResultFightingAttackType("tipoExistente"));
    }

    @Test
    @DisplayName("conocer el daño de un ataque de tipo fuego al oponente")
    public void testGetResultFireAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFireAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFireAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFireAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFireAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFireAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFireAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFireAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFireAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFireAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFireAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFireAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFireAttackType("agua"));
        assertNull(MethosTargetType.getResultFireAttackType("tipoExistente"));
    }
    @Test
    @DisplayName("conocer el daño de un ataque de tipo volador al oponente")
    public void testGetResultFlyingAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFlyingAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFlyingAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFlyingAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFlyingAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFlyingAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFlyingAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFlyingAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFlyingAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultFlyingAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFlyingAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultFlyingAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultFlyingAttackType("agua"));
        assertNull(MethosTargetType.getResultFlyingAttackType("tipoExistente"));
    }
    @Test
    @DisplayName("conocer el daño de un ataque de tipo planta al oponente")
    public void testGetResultGrassAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultGrassAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGrassAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGrassAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultGrassAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultGrassAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultGrassAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultGrassAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultGrassAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGrassAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGrassAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGrassAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultGrassAttackType("agua"));
        assertNull(MethosTargetType.getResultGrassAttackType("tipoExistente"));
    }
    @Test
    @DisplayName("conocer el daño de un ataque de tipo normal al oponente")
    public void testGetResultNormalAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultNormalAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultNormalAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultNormalAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultNormalAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultNormalAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultNormalAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultNormalAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultNormalAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultNormalAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultNormalAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultNormalAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultNormalAttackType("agua"));
        assertNull(MethosTargetType.getResultNormalAttackType("tipoExistente"));
    }

    @Test
    @DisplayName("conocer el daño de un ataque de tipo veneno al oponente")
    public void testGetResultPoisonAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultPoisonAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultPoisonAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultPoisonAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultPoisonAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE, MethosTargetType.getResultPoisonAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultPoisonAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultPoisonAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultPoisonAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultPoisonAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultPoisonAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultPoisonAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultPoisonAttackType("agua"));
        assertNull(MethosTargetType.getResultPoisonAttackType("tipoExistente"));
    }

    @Test
    @DisplayName("conocer el daño de un ataque de tipo roca al oponente")
    public void testGetResultRockAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultRockAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultRockAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultRockAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultRockAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultRockAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultRockAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultRockAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE, MethosTargetType.getResultRockAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultRockAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultRockAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultRockAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultRockAttackType("agua"));
        assertNull(MethosTargetType.getResultRockAttackType("tipoExistente"));
    }
    @Test
    @DisplayName("conocer el daño de un ataque de tipo hielo al oponente")
    public void testGetResultIceAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultIceAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.VERY_INEFFECTIVE, MethosTargetType.getResultIceAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultIceAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultIceAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultIceAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultIceAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultIceAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultIceAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultIceAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.SUPER_EFFECTIVE, MethosTargetType.getResultIceAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultIceAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultIceAttackType("agua"));
        assertNull(MethosTargetType.getResultIceAttackType("tipoExistente"));
    }

    @Test
    @DisplayName("conocer el daño de un ataque de tipo psiquico al oponente")
    public void testGetResultPsychicAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultPsychicAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultPsychicAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultPsychicAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultPsychicAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultPsychicAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.NULL, MethosTargetType.getResultPsychicAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultPsychicAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultPsychicAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultPsychicAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultPsychicAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultPsychicAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultPsychicAttackType("agua"));
        assertNull(MethosTargetType.getResultPsychicAttackType("tipoExistente"));
    }
    @Test
    @DisplayName("conocer el daño de un ataque de tipo tierra al oponente")
    public void testGetResultGroundAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGroundAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultGroundAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGroundAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultGroundAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultGroundAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultGroundAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultGroundAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultGroundAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultGroundAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGroundAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGroundAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultGroundAttackType("agua"));
        assertNull(MethosTargetType.getResultGroundAttackType("tipoExistente"));
    }
    @Test
    @DisplayName("conocer el daño de un ataque de tipo siniestro al oponente")
    public void testGetResultDarkAttackType() {
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDarkAttackType("normal-dragon"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDarkAttackType("agua-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDarkAttackType("normal"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultDarkAttackType("hada-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.EFFECTIVE, MethosTargetType.getResultDarkAttackType("fantasma-veneno"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultDarkAttackType("roca-siniestro"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultDarkAttackType("fuego-lucha"));
        assertEquals(MethodsTextAreaBattlePlayer1.INEFFECTIVE, MethosTargetType.getResultDarkAttackType("lucha-acero"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDarkAttackType("electrico"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDarkAttackType("dragon-tierra"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDarkAttackType("lucha-fantasma"));
        assertEquals(MethodsTextAreaBattlePlayer1.NEUTRAL, MethosTargetType.getResultDarkAttackType("agua"));
        assertNull(MethosTargetType.getResultDarkAttackType("tipoExistente"));
    }


    @Test
    @DisplayName("saber si el valor de daño variable va de 85 a 100")
    public void testGetValueOfVariation() {
        for (int i = 0; i < 1000; i++) {
            float result = MethodsBattlePokemon.getValueOfVariation();

            assertTrue(result >= 85.0f && result <= 100.0f);
        }
    }


}

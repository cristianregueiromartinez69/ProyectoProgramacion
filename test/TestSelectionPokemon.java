import com.dam.proyectoprogramacion.pokemon.Drampa;
import com.dam.proyectoprogramacion.methods.selectionpokemon.*;
import com.dam.proyectoprogramacion.pokemon.Empoleon;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;
public class TestSelectionPokemon {


    @Test
    public void testMakeDrampaObject() {
        Drampa drampa = MethosInterfaceSelectionPokemonCreatePokemons.makeDrampaObject();
        assertNotNull(drampa);
        assertEquals("Drampa", drampa.getName());
        assertEquals("normal-dragon", drampa.getType());
        assertEquals(50, (int) drampa.getLevel());

    }

    @Test
    public void testMakeEmpoleonObject() {
        Empoleon empoleon = MethosInterfaceSelectionPokemonCreatePokemons.makeEmpoleonObject();
        assertNotNull(empoleon);
        assertEquals("Empoleon", empoleon.getName());
        assertEquals("agua-acero", empoleon.getType());
    }

}

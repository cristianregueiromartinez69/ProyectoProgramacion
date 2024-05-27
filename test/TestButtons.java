
import com.dam.proyectoprogramacion.methods.battle.DataNamesIconsColorsAttacksAndPokemonsPlayer1;
import com.dam.proyectoprogramacion.pruebas.ProbandoBotonesPaneles;
import com.dam.proyectoprogramacion.buttons.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TestButtons {

    @Mock
    private DataNamesIconsColorsAttacksAndPokemonsPlayer1 mockDataPlayer1;

    private ButtonInterfaceAttacks panelAttacks;
    private ButtonInterfacePokemonSelect select;
    private ButtonInterfaceMenu account;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        panelAttacks = new ButtonInterfaceAttacks();
    }

    @Test
    public void testMakeAttack1ButtonPlayer1() {
        when(mockDataPlayer1.getPathIconAttack1()).thenReturn("path/to/icon1.png");
        when(mockDataPlayer1.getNameAttack1()).thenReturn("Attack1");
        when(mockDataPlayer1.getColorBackgroundAttack1()).thenReturn(Color.RED);

        JButton button = panelAttacks.makeAttack1ButtonPlayer1();

        assertEquals("Attack1", button.getText());
        assertEquals(Color.RED, button.getBackground());
        assertEquals(Color.WHITE, button.getForeground());
        assertTrue(button.getIcon() instanceof ImageIcon);
        assertNotNull(button.getBorder());
    }

    @Test
    public void testMakeAttack2ButtonPlayer1() {
        when(mockDataPlayer1.getPathIconAttack2()).thenReturn("path/to/icon2.png");
        when(mockDataPlayer1.getNameAttack2()).thenReturn("Attack2");
        when(mockDataPlayer1.getColorBackgroundAttack2()).thenReturn(Color.BLUE);

        JButton button = panelAttacks.makeAttack2ButtonPlayer1();

        assertEquals("Attack2", button.getText());
        assertEquals(Color.BLUE, button.getBackground());
        assertEquals(Color.BLACK, button.getForeground());
        assertTrue(button.getIcon() instanceof ImageIcon);
        assertNotNull(button.getBorder());
    }

    @Test
    public void testMakeDrampaButton() {
        JButton button = select.makeDrampaButton();

        assertEquals("Drampa", button.getText());
        assertEquals(Color.GREEN.brighter(), button.getBackground());
        assertEquals(Color.WHITE, button.getForeground());
        assertTrue(button.getIcon() instanceof ImageIcon);
        assertNotNull(button.getBorder());
    }

    @Test
    public void testMakeEmpoleonButton() {
        JButton button = select.makeEmpoleonButton();

        assertEquals("Empoleon", button.getText());
        assertEquals(Color.GRAY.darker(), button.getBackground());
        assertEquals(Color.WHITE, button.getForeground());
        assertTrue(button.getIcon() instanceof ImageIcon);
        assertNotNull(button.getBorder());
    }

    @Test
    public void testMakeAccountButton() {
        JButton button = account.makeAccountButton();

        assertEquals("Crear Cuenta", button.getText());
        assertEquals(Color.ORANGE, button.getBackground());
        assertEquals(Color.BLACK, button.getForeground());
        assertTrue(button.getIcon() instanceof ImageIcon);
        assertEquals(new Dimension(150, 50), button.getPreferredSize());
        assertNotNull(button.getBorder());
    }
}

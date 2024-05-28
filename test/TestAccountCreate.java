import com.dam.proyectoprogramacion.methods.accountcreate.MethodsInterfaceAccountCreate;
import com.dam.proyectoprogramacion.methods.battle.MethodsBattlePokemon;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.pokemon.*;
import com.dam.proyectoprogramacion.methods.selectionpokemon.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestAccountCreate {

    @Test
    @DisplayName("comprobar que se añaden valores a players correctamente")
    public void testPutPlayersInformation() {
        String alias = "Player1";
        ImageIcon image = new ImageIcon("path/to/image");

        MethodsInterfaceAccountCreate.putPlayersInformation(alias, image);

        HashMap<String, ImageIcon> players = MethodsInterfaceAccountCreate.getPlayers();

        Assertions.assertTrue(players.containsKey(alias));
        assertEquals(image, players.get(alias));
    }


}

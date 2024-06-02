import com.dam.proyectoprogramacion.controller.methods.accountcreate.MethodsInterfaceAccountCreate;
import com.dam.proyectoprogramacion.controller.methods.accountcreate.MethodsLogicalAccountCreate;
import com.dam.proyectoprogramacion.controller.methods.battle.MethodsBattlePokemon;
import com.dam.proyectoprogramacion.view.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.model.pokemon.*;
import com.dam.proyectoprogramacion.controller.methods.selectionpokemon.*;
import org.junit.Assert;
import org.junit.jupiter.api.*;

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


    @Test
    @DisplayName("comprobar que el jugador 1 y 2 no introducen el mismoa alias al empezar la batalla")
    public void testCheck2AliasAreTheSame() {
        Assertions.assertTrue(MethodsLogicalAccountCreate.check2AliasAreTheSame("alias", "alias"));

        Assertions.assertFalse(MethodsLogicalAccountCreate.check2AliasAreTheSame("alias1", "alias2"));
    }







}

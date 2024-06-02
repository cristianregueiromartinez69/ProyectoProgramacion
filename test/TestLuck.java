import com.dam.proyectoprogramacion.controller.methods.accountcreate.MethodsInterfaceAccountCreate;
import com.dam.proyectoprogramacion.controller.methods.battle.MethodsBattlePokemon;
import com.dam.proyectoprogramacion.controller.methods.luck.MethodsInterfaceLuck;
import com.dam.proyectoprogramacion.view.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.model.pokemon.*;
import com.dam.proyectoprogramacion.controller.methods.selectionpokemon.*;
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
public class TestLuck {


    @Test
    @DisplayName("comprobar que se aladen valores a luckPlayers correctamente")
    public void testSetLuckPlayers() {
        String alias = "Player1";
        Integer faceOrTail = MethodsInterfaceLuck.CARA;

        MethodsInterfaceLuck.setLuckPlayers(alias, faceOrTail);

        HashMap<String, Integer> luckPlayers = MethodsInterfaceLuck.getLuckPlayers();

        Assertions.assertTrue(luckPlayers.containsKey(alias));
        assertEquals(faceOrTail, luckPlayers.get(alias));
    }

}

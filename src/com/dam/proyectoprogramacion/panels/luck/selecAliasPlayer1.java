package com.dam.proyectoprogramacion.panels.luck;

import javax.swing.*;
import com.dam.proyectoprogramacion.methodsandmain.*;

public class selecAliasPlayer1 extends JPanel {

    private JPanel aliasImagePlayer1;
    private JPanel faceOrTailPlayer1;

    public selecAliasPlayer1(){
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        aliasImagePlayer1 = MethodsInterfaceLuck.selectAliasImagePlayer1();
        this.add(aliasImagePlayer1);



    }

}

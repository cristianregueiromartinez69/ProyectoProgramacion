package com.dam.proyectoprogramacion.methodsandmain;

import javax.swing.*;
import com.dam.proyectoprogramacion.panels.*;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;

import java.util.Map;

public class MethodsInterfaceLuck {

    public static JPanel selectAliasImagePlayer1(){
        JPanel aliasPlayer1 = new JPanel();
        aliasPlayer1.setLayout(new BoxLayout(aliasPlayer1, BoxLayout.Y_AXIS));
        String aliasToLookFor = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        ImageIcon imageAlias;
        for (Map.Entry<String, ImageIcon> entry : MethodsInterfaceAccountCreate.getPlayers().entrySet()) {
            if (entry.getKey().equals(aliasToLookFor)) {
                    JLabel aliasText = new JLabel(aliasToLookFor);
                    aliasPlayer1.add(aliasText);
                    imageAlias = new ImageIcon(String.valueOf(entry.getValue()));
                    JLabel imageLabel = new JLabel();
                    imageLabel.setIcon(imageAlias);
                    aliasPlayer1.add(imageLabel);
                }
            }
        return aliasPlayer1;
        }

    }




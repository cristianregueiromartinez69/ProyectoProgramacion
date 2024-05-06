package com.dam.proyectoprogramacion.methodsandmain;

import javax.swing.*;
import com.dam.proyectoprogramacion.panels.luck.*;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;

import java.util.Map;

/**
 * clase con los metodos de la interfaz luck
 * @author cristian
 * 2version v2.0
 */
public class MethodsInterfaceLuck {

    /**
     * metodo para crear un panel en función del alias escrito
     * @return el panel creado
     */
    public static JPanel selectAliasImagePlayer1(){
        JPanel aliasPlayer1 = new JPanel();
        aliasPlayer1.setLayout(new BoxLayout(aliasPlayer1, BoxLayout.Y_AXIS));
        /**
         * variable de tipo string que es igual a lo introducido en el jtexfield de la intefaz luck
         */
        String aliasToLookFor = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        ImageIcon imageAlias;
        /**
         * este for recorre le hashmao de los juagdores
         * si coincide con uno existente, se crea el panel con el alias y la foto escogida
         */
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

    /**
     * metodo para verificar si el usuario existe en el hashmap para el boton de enter
     * @return true si existe y false si no existe
     */
    public static boolean checkAliasPlayer1(){
            String aliasToLookFor = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
            boolean marca = false;
            for (Map.Entry<String, ImageIcon> entry : MethodsInterfaceAccountCreate.getPlayers().entrySet()) {
                if (entry.getKey().equals(aliasToLookFor)) {
                 marca = true;
                }
            }
            return marca;
        }

    }




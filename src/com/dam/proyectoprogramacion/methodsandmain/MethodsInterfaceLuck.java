package com.dam.proyectoprogramacion.methodsandmain;

import javax.swing.*;
import com.dam.proyectoprogramacion.panels.luck.*;
import com.dam.proyectoprogramacion.panels.luck.InformationPanelPlayer1Luck;
import com.dam.proyectoprogramacion.buttons.ButtonInterfaceLuck;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
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
    public final static  int CARA = 1;
    public final static  int CRUZ = 2;
    private int randomNumberSelection;
    private static HashMap <String, Integer> luckPlayers = new HashMap<>();

    public static JPanel selectAliasImagePlayer1(){
        JPanel aliasPlayer1 = new JPanel();
        aliasPlayer1.setLayout(new BoxLayout(aliasPlayer1, BoxLayout.Y_AXIS));
        /**
         * variable de tipo string que es igual a lo introducido en el jtexfield de la intefaz luck
         */
        String aliasToLookFor = InformationPanelPlayer1Luck.getAliasTextPlayer1().getText();
        ImageIcon imageAlias;
        /**
         * este for recorre le hashmap de los juagdores
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

        public static JPanel faceOrTailPanelPlayer1(){

        JPanel faceOrTailPanel = new JPanel();
        faceOrTailPanel.setLayout(new BoxLayout(faceOrTailPanel, BoxLayout.X_AXIS));
        JButton faceButton = new ButtonInterfaceLuck().makeFaceButton();
        faceButton.setBackground(Color.ORANGE.brighter());
        faceButton.setForeground(Color.BLACK);
        faceButton.setPreferredSize(new Dimension(140,50));
        faceOrTailPanel.add(faceButton);
        JButton tailButton = new ButtonInterfaceLuck().makeTailButton();
        tailButton.setBackground(Color.CYAN);
        tailButton.setForeground(Color.BLACK);
        tailButton.setPreferredSize(new Dimension(140,50));
        faceOrTailPanel.add(tailButton);

        return faceOrTailPanel;
        }

        public static void disableButtonsAndAliases(){

        ButtonInterfaceLuck.getFaceButton().setEnabled(false);
        ButtonInterfaceLuck.getTailButton().setEnabled(false);
        InformationPanelPlayer1Luck.getAliasTextPlayer1().setEditable(false);
        EnterPanelPlayer1Luck.getEnterButtonPlayer1().setEnabled(false);

        }

    public static HashMap<String, Integer> getLuckPlayers() {
        return luckPlayers;
    }

    public static void setLuckPlayers(String alias, Integer faceOrTail) {
        luckPlayers.put(alias, faceOrTail);
    }


}






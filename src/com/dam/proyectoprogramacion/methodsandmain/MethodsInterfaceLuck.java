package com.dam.proyectoprogramacion.methodsandmain;

import javax.swing.*;

import com.dam.proyectoprogramacion.buttons.ButtonInterfaceLuck2;
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
     * atributos privados estáticos y finales de cara o cruz
     */
    public final static  int CARA = 1;
    public final static  int CRUZ = 2;
    /**
     * las variables que será introducidas en el hashmap
     */
    private static String auxMapAliasPlayer1Luck;
    private static  int chosenItem;
    private static String auxMapAliasPlayer2Luck;
    private static  int chosenItem2;
    /**
     * variable que nos ayudará a determinar quien gana o pierde el sorteo
     */
    private int randomNumberSelection;
    /**
     * el hashmap donde vamos a guardar los valores introducidos
     */
    private static HashMap <String, Integer> luckPlayers = new HashMap<>();

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
     * metodo para crear un panel en función del alias escrito
     * @return el panel creado
     */
    public static JPanel selectAliasImagePlayer2(){
        JPanel aliasPlayer2 = new JPanel();
        aliasPlayer2.setLayout(new BoxLayout(aliasPlayer2, BoxLayout.Y_AXIS));
        /**
         * variable de tipo string que es igual a lo introducido en el jtexfield de la intefaz luck
         */
        String aliasToLookFor = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();
        ImageIcon imageAlias;
        /**
         * este for recorre le hashmap de los juagdores
         * si coincide con uno existente, se crea el panel con el alias y la foto escogida
         */
        for (Map.Entry<String, ImageIcon> entry : MethodsInterfaceAccountCreate.getPlayers().entrySet()) {
            if (entry.getKey().equals(aliasToLookFor)) {
                JLabel aliasText = new JLabel(aliasToLookFor);
                aliasPlayer2.add(aliasText);
                imageAlias = new ImageIcon(String.valueOf(entry.getValue()));
                JLabel imageLabel = new JLabel();
                imageLabel.setIcon(imageAlias);
                aliasPlayer2.add(imageLabel);
            }
        }
        return aliasPlayer2;
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
    /**
     * metodo para verificar si el usuario existe en el hashmap para el boton de enter
     * @return true si existe y false si no existe
     */
    public static boolean checkAliasPlayer2(){
        String aliasToLookFor = InformationPanelPlayer2Luck.getAliasTextPlayer2().getText();
        boolean marca = false;
        for (Map.Entry<String, ImageIcon> entry : MethodsInterfaceAccountCreate.getPlayers().entrySet()) {
            if (entry.getKey().equals(aliasToLookFor)) {
                marca = true;
            }
        }
        return marca;
    }

    /**
     * metodo para crear el panel de cara o cruz del jugador 1
     * @return el panel creado
     */
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
    /**
     * metodo para crear el panel de cara o cruz del jugador 2
     * @return el panel creado
     */
    public static JPanel faceOrTailPanelPlayer2(){

        JPanel faceOrTailPanel = new JPanel();
        faceOrTailPanel.setLayout(new BoxLayout(faceOrTailPanel, BoxLayout.X_AXIS));
        JButton faceButton = new ButtonInterfaceLuck2().makeFaceButton();
        faceButton.setBackground(Color.ORANGE.brighter());
        faceButton.setForeground(Color.BLACK);
        faceButton.setPreferredSize(new Dimension(140,50));
        faceOrTailPanel.add(faceButton);
        JButton tailButton = new ButtonInterfaceLuck2().makeTailButton();
        tailButton.setBackground(Color.CYAN);
        tailButton.setForeground(Color.BLACK);
        tailButton.setPreferredSize(new Dimension(140,50));
        faceOrTailPanel.add(tailButton);

        return faceOrTailPanel;
    }


    /**
     * metodo que será usado en el boton de enter una vez has elegido cara o cruz
     * el metodo deshabilita todos los botones del juagdor 1
     */
    public static void disableButtonsAndAliasesPlayer1Luck(){


        InformationPanelPlayer1Luck.getAliasTextPlayer1().setEditable(false);
        EnterPanelPlayer1Luck.getEnterButtonPlayer1().setEnabled(false);

        }
    /**
     * metodo que será usado en el boton de enter una vez has elegido cara o cruz
     * el metodo deshabilita todos los botones del juagdor 2
     */
    public static void disableButtonsAndAliasesPlayer2Luck(){


        InformationPanelPlayer2Luck.getAliasTextPlayer2().setEditable(false);
        EnterPanelPlayer2Luck.getEnterButtonPlayer2().setEnabled(false);

    }

    /**
     * getter y setter de los atributos de la clase
     * @return el atributo correspondiente
     */
    public static HashMap<String, Integer> getLuckPlayers() {
        return luckPlayers;
    }

    public static void setLuckPlayers(String alias, Integer faceOrTail) {
        luckPlayers.put(alias, faceOrTail);
    }

    public static String getAuxMapAliasPlayer1Luck() {
        return auxMapAliasPlayer1Luck;
    }

    public static void setAuxMapAliasPlayer1Luck(String auxMapAliasPlayer1Luck) {
        MethodsInterfaceLuck.auxMapAliasPlayer1Luck = auxMapAliasPlayer1Luck;
    }

    public static int getChosenItem() {
        return chosenItem;
    }

    public static void setChosenItem(int chosenItem) {
        MethodsInterfaceLuck.chosenItem = chosenItem;
    }

    public static String getAuxMapAliasPlayer2Luck() {
        return auxMapAliasPlayer2Luck;
    }

    public static void setAuxMapAliasPlayer2Luck(String auxMapAliasPlayer2Luck) {
        MethodsInterfaceLuck.auxMapAliasPlayer2Luck = auxMapAliasPlayer2Luck;
    }

    public static int getChosenItem2() {
        return chosenItem2;
    }

    public static void setChosenItem2(int chosenItem2) {
        MethodsInterfaceLuck.chosenItem2 = chosenItem2;
    }

    public int getRandomNumberSelection() {
        return randomNumberSelection;
    }

    public void setRandomNumberSelection(int randomNumberSelection) {
        this.randomNumberSelection = randomNumberSelection;
    }

    public static void setLuckPlayers(HashMap<String, Integer> luckPlayers) {
        MethodsInterfaceLuck.luckPlayers = luckPlayers;
    }
}






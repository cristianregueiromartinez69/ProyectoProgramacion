package com.dam.proyectoprogramacion.buttons;
import com.dam.proyectoprogramacion.methodsandmain.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * clase con los botones de la interfaz de ataques pokemon
 * @author cristian
 * @version v1.0
 */
public class ButtonInterfaceAttacks extends JPanel {

    /**
     * atributos privados de tippo JButton con los botones de los paneles de atauqes pokemon
     */
    private static JButton attack1Player1;
    private static JButton attack2PLayer1;
    private static JButton attack3Player1;
    private static JButton attack4Player1;
    private static JButton backPlayer1;

    private static JButton attack1Player2;
    private static JButton attack2PLayer2;
    private static JButton attack3Player2;
    private static JButton attack4Player2;
    private static JButton backPlayer2;


    /**
     * metodo para hacer el primer ataque del pokemon
     *
     * @return el boton creado
     */
    //-----------------------------------ataques del jugador 1-----------------------------------------//

    public JButton makeAttack1ButtonPlayer1(){
        ImageIcon iconType = new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getPathIconAttack1());
        attack1Player1 = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getNameAttack1(), iconType);
        setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getColorBackgroundAttack1());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack1Player1;
    }
    /**
     * metodo para hacer el segundo ataque del pokemon
     *
     * @return el boton creado
     */
    public JButton makeAttack2ButtonPlayer1(){
        ImageIcon iconType = new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getPathIconAttack2());
        attack2PLayer1 = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getNameAttack2(), iconType);
        setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getColorBackgroundAttack2());
        setForeground(Color.BLACK);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack2PLayer1;
    }
    /**
     * metodo para hacer el tercer ataque del pokemon
     *
     * @return el boton creado
     */
    public JButton makeAttack3ButtonPlayer1(){
        ImageIcon iconType = new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getPathIconAttack3());
        attack3Player1 = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getNameAttack3(), iconType);
        setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getColorBackgroundAttack3());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack3Player1;
    }
    /**
     * metodo para hacer el cuarto ataque del pokemon
     *
     * @return el boton creado
     */
    public JButton makeAttack4ButtonPLayer1(){
        ImageIcon iconType = new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getPathIconAttack4());
        attack4Player1 = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getNameAttack4(), iconType);
        setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getColorBackgroundAttack4());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack4Player1;
    }
    /**
     * metodo para hacer que se regrese al metu de ataque o cambio en caso de haberlo pulsado
     * erroneamente o de pensar en una estrategia mejor
     *
     * @return el boton creado
     */
    public JButton makeBackButtonPLayer1(){
        ImageIcon iconBack = new ImageIcon("imagenes/backMenu.png");
        backPlayer1 = new CreateButtons("volver", iconBack);
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return backPlayer1;
    }
    //-----------------------------------ataques del jugador 2-----------------------------------------//

    public JButton makeAttack1ButtonPlayer2(){
        ImageIcon iconType = (new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getPathIconAttack1()));
        attack1Player2 = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getNameAttack1(), iconType);
        setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getColorBackgroundAttack1());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack1Player2;
    }
    /**
     * metodo para hacer el segundo ataque del pokemon
     *
     * @return el boton creado
     */
    public JButton makeAttack2ButtonPlayer2(){
        ImageIcon iconType = (new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getPathIconAttack2()));
        attack2PLayer2 = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getNameAttack2(), iconType);
        setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getColorBackgroundAttack2());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack2PLayer2;
    }
    /**
     * metodo para hacer el tercer ataque del pokemon
     *
     * @return el boton creado
     */
    public JButton makeAttack3ButtonPlayer2(){
        ImageIcon iconType = (new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getPathIconAttack3()));
        attack3Player2 = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getNameAttack3(), iconType);
        setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getColorBackgroundAttack3());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack3Player2;
    }
    /**
     * metodo para hacer el cuarto ataque del pokemon
     *
     * @return el boton creado
     */
    public JButton makeAttack4ButtonPlayer2(){
        ImageIcon iconType = (new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getPathIconAttack4()));
        attack4Player2 = new CreateButtons(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getNameAttack4(), iconType);
        setBackground(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getColorBackgroundAttack4());
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return attack4Player2;
    }
    /**
     * metodo para hacer que se regrese al metu de ataque o cambio en caso de haberlo pulsado
     * erroneamente o de pensar en una estrategia mejor
     *
     * @return el boton creado
     */
    public JButton makeBackButtonPlayer2(){
        ImageIcon iconBack = new ImageIcon("imagenes/backMenu.png");
        backPlayer2 = new CreateButtons("volver", iconBack);
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        Border borderboton = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borderboton);
        return backPlayer2;
    }


    //TODO: faltarían los nombres, pero no podemos hasta más adelante


    public static JButton getAttack1Player1() {
        return attack1Player1;
    }

    public static void setAttack1Player1(JButton attack1Player1) {
        ButtonInterfaceAttacks.attack1Player1 = attack1Player1;
    }

    public static JButton getAttack2PLayer1() {
        return attack2PLayer1;
    }

    public static void setAttack2PLayer1(JButton attack2PLayer1) {
        ButtonInterfaceAttacks.attack2PLayer1 = attack2PLayer1;
    }

    public static JButton getAttack3Player1() {
        return attack3Player1;
    }

    public static void setAttack3Player1(JButton attack3Player1) {
        ButtonInterfaceAttacks.attack3Player1 = attack3Player1;
    }

    public static JButton getAttack4Player1() {
        return attack4Player1;
    }

    public static void setAttack4Player1(JButton attack4Player1) {
        ButtonInterfaceAttacks.attack4Player1 = attack4Player1;
    }

    public static JButton getBackPlayer1() {
        return backPlayer1;
    }

    public static void setBackPlayer1(JButton backPlayer1) {
        ButtonInterfaceAttacks.backPlayer1 = backPlayer1;
    }

    public static JButton getAttack1Player2() {
        return attack1Player2;
    }

    public static void setAttack1Player2(JButton attack1Player2) {
        ButtonInterfaceAttacks.attack1Player2 = attack1Player2;
    }

    public static JButton getAttack2PLayer2() {
        return attack2PLayer2;
    }

    public static void setAttack2PLayer2(JButton attack2PLayer2) {
        ButtonInterfaceAttacks.attack2PLayer2 = attack2PLayer2;
    }

    public static JButton getAttack3Player2() {
        return attack3Player2;
    }

    public static void setAttack3Player2(JButton attack3Player2) {
        ButtonInterfaceAttacks.attack3Player2 = attack3Player2;
    }

    public static JButton getAttack4Player2() {
        return attack4Player2;
    }

    public static void setAttack4Player2(JButton attack4Player2) {
        ButtonInterfaceAttacks.attack4Player2 = attack4Player2;
    }

    public static JButton getBackPlayer2() {
        return backPlayer2;
    }

    public static void setBackPlayer2(JButton backPlayer2) {
        ButtonInterfaceAttacks.backPlayer2 = backPlayer2;
    }
}

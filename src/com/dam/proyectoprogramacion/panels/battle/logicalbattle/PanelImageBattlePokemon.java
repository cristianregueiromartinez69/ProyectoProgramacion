package com.dam.proyectoprogramacion.panels.battle.logicalbattle;

import javax.swing.*;
import java.awt.*;

/**
 * clase con el panel de imagen de la batalla pokemon
 * @author cristian
 * @version v3.0
 */
public class PanelImageBattlePokemon extends JPanel {

    private static Image pokemonPlayer1;
    private static Image pokemonPlayer2;
    private static Image battleScenario;

    // Variables para ajustar la posición vertical
    private static int offsetPlayer1Y = 250;
    private static int offsetPlayer2Y = 250;

    public PanelImageBattlePokemon() {

        // Configurar el panel principal
        setVisible(true);
        setLayout(new BorderLayout());

        // Iniciar imágenes
        battleScenario = new ImageIcon("imagenes/batalla.jpg").getImage();
        pokemonPlayer1 = new ImageIcon("imagenes/snorlaxSP.png").getImage();
        pokemonPlayer2 = new ImageIcon("imagenes/tinkatonSP.png").getImage();

        // Panel de fondo con Pokémon
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(battleScenario, 0, 0, getWidth(), getHeight(), this);

                // Dibujar Pokémon del jugador 1
                int player1X = getWidth() / 4 - pokemonPlayer1.getWidth(null) / 2;
                int player1Y = getHeight() - pokemonPlayer1.getHeight(null) - offsetPlayer1Y;
                g.drawImage(pokemonPlayer1, player1X, player1Y, this);

                // Dibujar Pokémon del jugador 2
                int player2X = 3 * getWidth() / 4 - pokemonPlayer2.getWidth(null) / 2;
                int player2Y = getHeight() - pokemonPlayer2.getHeight(null) - offsetPlayer2Y;
                g.drawImage(pokemonPlayer2, player2X, player2Y, this);
            }
        };
        backgroundPanel.setPreferredSize(new Dimension(battleScenario.getWidth(null), battleScenario.getHeight(null)));

        add(backgroundPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel de Batalla Pokémon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PanelImageBattlePokemon());
        frame.pack();
        frame.setVisible(true);
    }


    /**
     * getter y setter de los atributos de la clase
     * @return los atributos de la clase
     */
    public static Image getPokemonPlayer1() {
        return pokemonPlayer1;
    }

    public static void setPokemonPlayer1(Image pokemonPlayer1) {
        PanelImageBattlePokemon.pokemonPlayer1 = pokemonPlayer1;
    }

    public static Image getPokemonPlayer2() {
        return pokemonPlayer2;
    }

    public static void setPokemonPlayer2(Image pokemonPlayer2) {
        PanelImageBattlePokemon.pokemonPlayer2 = pokemonPlayer2;
    }

    public static Image getBattleScenario() {
        return battleScenario;
    }

    public static void setBattleScenario(Image battleScenario) {
        PanelImageBattlePokemon.battleScenario = battleScenario;
    }

    public static int getOffsetPlayer1Y() {
        return offsetPlayer1Y;
    }

    public static void setOffsetPlayer1Y(int offsetPlayer1Y) {
        PanelImageBattlePokemon.offsetPlayer1Y = offsetPlayer1Y;
    }

    public static int getOffsetPlayer2Y() {
        return offsetPlayer2Y;
    }

    public static void setOffsetPlayer2Y(int offsetPlayer2Y) {
        PanelImageBattlePokemon.offsetPlayer2Y = offsetPlayer2Y;
    }
}

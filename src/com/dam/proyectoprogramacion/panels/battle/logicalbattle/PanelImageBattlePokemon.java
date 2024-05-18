package com.dam.proyectoprogramacion.panels.battle.logicalbattle;

import com.dam.proyectoprogramacion.methods.battle.DataNamesIconsColorsAttacksAndPokemonsPlayer1;
import com.dam.proyectoprogramacion.methods.battle.DataNamesIconsColorsAttacksAndPokemonsPlayer2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

/**
 * Clase con el panel de imagen de la batalla Pokémon
 * @version v3.0
 */
public class PanelImageBattlePokemon extends JPanel {

    private static BufferedImage pokemonPlayer1;
    private static BufferedImage pokemonPlayer2;
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
        pokemonPlayer1 = toBufferedImage(new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getImagePokemonInBattlePlayer1()).getImage());
        pokemonPlayer2 = toBufferedImage(new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getImagePokemonInBattlePlayer2()).getImage());

        // Invertir horizontalmente las imágenes de los Pokémon
        pokemonPlayer1 = flipImageHorizontally(pokemonPlayer1);

        // Panel de fondo con Pokémon
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(battleScenario, 0, 0, getWidth(), getHeight(), this);

                // Dibujar Pokémon del jugador 1
                int player1X = getWidth() / 3 - pokemonPlayer1.getWidth(null) / 2;
                int player1Y = getHeight() - pokemonPlayer1.getHeight(null) - offsetPlayer1Y;
                g.drawImage(pokemonPlayer1, player1X, player1Y, this);

                // Dibujar Pokémon del jugador 2
                int player2X = 2 * getWidth() / 3 - pokemonPlayer2.getWidth(null) / 2;
                int player2Y = getHeight() - pokemonPlayer2.getHeight(null) - offsetPlayer2Y;
                g.drawImage(pokemonPlayer2, player2X, player2Y, this);
            }
        };

        // Ajustar la altura preferida del escenario de batalla
        int newHeight = battleScenario.getHeight(null) + 200; // Ajustar según sea necesario
        backgroundPanel.setPreferredSize(new Dimension(battleScenario.getWidth(null), newHeight));

        add(backgroundPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel de Batalla Pokémon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PanelImageBattlePokemon());
        frame.pack();
        frame.setSize(frame.getWidth(), frame.getHeight() + 200); // Ajustar la altura del frame
        frame.setVisible(true);
    }

    /**
     * Convierte una imagen a BufferedImage
     * @param img la imagen a convertir
     * @return la BufferedImage resultante
     */
    private static BufferedImage toBufferedImage(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();
        return bimage;
    }

    /**
     * Invierte horizontalmente una imagen
     * @param img la imagen a invertir
     * @return la imagen invertida
     */
    private static BufferedImage flipImageHorizontally(BufferedImage img) {
        AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
        tx.translate(-img.getWidth(), 0);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        return op.filter(img, null);
    }
}

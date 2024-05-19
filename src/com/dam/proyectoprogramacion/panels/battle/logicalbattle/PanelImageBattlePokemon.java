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
 * @author cristian
 * @version v3.0
 */
public class PanelImageBattlePokemon extends JPanel {

    /**
     * atributos privados de la clase
     */
    private static BufferedImage pokemonPlayer1;
    private static BufferedImage pokemonPlayer2;
    private static Image battleScenario;

    /**
     * variables para ajustar la posicion vertical de las imagenes de los pokemons
     */
    private static int offsetPlayer1Y = 350;
    private static int offsetPlayer2Y = 350;

    /**
     * constructor de la clase
     */
    public PanelImageBattlePokemon() {

        /**
         * configuramos el panel principal
         */
        setVisible(true);
        setLayout(new BorderLayout());

        /**
         * iniciamos las imagenes
         */
        battleScenario = new ImageIcon("imagenes/batalla.jpg").getImage();
        pokemonPlayer1 = toBufferedImage(new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer1.getImagePokemonInBattlePlayer1()).getImage());
        pokemonPlayer2 = toBufferedImage(new ImageIcon(DataNamesIconsColorsAttacksAndPokemonsPlayer2.getImagePokemonInBattlePlayer2()).getImage());

        /**
         * invertimos horizontalemnte la imagen del pokemon del jugador 1 para que mire para el pokemon del jugador 2
         */
        pokemonPlayer1 = flipImageHorizontally(pokemonPlayer1);

        /**
         * panel de fondo con los pokemons
         */
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                /**
                 * pintamos el escenario
                 */
                g.drawImage(battleScenario, 0, 0, getWidth(), getHeight(), this);

                /**
                 * dibujamos el pokemon del jugador 1
                 */
                int player1X = getWidth() / 3 - pokemonPlayer1.getWidth(null) / 2;
                int player1Y = getHeight() - pokemonPlayer1.getHeight(null) - offsetPlayer1Y;
                g.drawImage(pokemonPlayer1, player1X, player1Y, this);

                /**
                 * dibujamos el pokemon del jugador 2
                 */
                int player2X = 2 * getWidth() / 3 - pokemonPlayer2.getWidth(null) / 2;
                int player2Y = getHeight() - pokemonPlayer2.getHeight(null) - offsetPlayer2Y;
                g.drawImage(pokemonPlayer2, player2X, player2Y, this);
            }
        };

        /**
         * ajustamos la altura del escenario de la batalla pokemon
         */
        int newHeight = battleScenario.getHeight(null) + 200; // Ajustar según sea necesario
        backgroundPanel.setPreferredSize(new Dimension(battleScenario.getWidth(null), newHeight));

        add(backgroundPanel, BorderLayout.CENTER);
    }



    /**
     * metodo para convertir  una imagen a BufferedImage
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
     * metodo para invertir horizontalmente una imagen
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

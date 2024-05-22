package com.dam.proyectoprogramacion.Songs;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * clase con la musica de la batalla del juego cuando un pokemon tiene vida mayor que 0 y menor del 20%
 * @author cristian & chema
 * @version v4.0
 */
public class LifeRedPokemonInBattleSong {

    /**
     * atributo privado de la clase
     */
    private static Clip clip;

    public static void musicLifeRed() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/vidaroja.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            /**
             *  Obtener el formato de audio
             */
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            /**
             * / Abrir el clip
             */
             clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);


            /**
             * / Reproducir el audio en bucle infinito
             */
            clip.start();



            /**
             * capturamos la excepcion en caso de que no se reproduzca la musica
             */
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    /**
     * metodo para parar la musica
     */
    public static void stopMusic() {
        if (clip != null && clip.isOpen()) {
            clip.stop();
            clip.close();
        }
    }
}

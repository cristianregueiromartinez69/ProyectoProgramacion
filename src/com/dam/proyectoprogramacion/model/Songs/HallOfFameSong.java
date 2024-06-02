package com.dam.proyectoprogramacion.model.Songs;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class HallOfFameSong {

    private static Clip clip;

    public static void hallOfFameMusic() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/halloffamesong.wav");
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
            clip.loop(Clip.LOOP_CONTINUOUSLY);

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
    public static void stopMusic() {
        if (clip != null && clip.isOpen()) {
            clip.stop();
            clip.close();
        }
    }
}

package com.dam.proyectoprogramacion.Songs;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * clase con la musica del menu dle juego
 * @author cristian
 * @version v3.0
 */
public class MusicIntroGame {


    private static Clip clip;

    public static void music() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/otramusicaredyblue.wav");
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

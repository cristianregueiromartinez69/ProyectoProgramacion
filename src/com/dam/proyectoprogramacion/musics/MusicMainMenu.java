package com.dam.proyectoprogramacion.musics;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * clase con la musica del menu dle juego
 * @author cristian
 * @version v1.0
 */
public class MusicMainMenu {

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
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);

            /**
             * / Reproducir el audio en bucle infinito
             */
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);


            /**
             * capturamos la excepcion en caso de que no se reproduzca la musica
             */
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}

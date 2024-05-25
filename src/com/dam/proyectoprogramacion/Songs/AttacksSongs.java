package com.dam.proyectoprogramacion.Songs;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AttacksSongs {


    /**
     * metodo que reproduce la musica del ataque a bocajarro
     */
    public static void musicAbocajarro() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/abocajarrosonido.wav");
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
             * / Reproducir el audio
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
     * metodo que reproduce la musica del ataque de acrobata
     */
    public static void musicAcrobata() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/acrobatasonido.wav");
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
             * / Reproducir el audio
             */
            clip.start();



            /**
             * capturamos la excepcion en caso de que no se reproduzca la musica
             */
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    }

package com.dam.proyectoprogramacion.methodsandmain;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicMainMenu {

    public static void music() {
        try {
            // Cargar el archivo de audio
            File audioFile = new File("canciones/otramusicaredyblue.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            // Obtener el formato de audio
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Abrir el clip
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);

            // Reproducir el audio en bucle infinito
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);





        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}

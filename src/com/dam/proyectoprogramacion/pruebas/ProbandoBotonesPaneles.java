package com.dam.proyectoprogramacion.pruebas;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class ProbandoBotonesPaneles extends JFrame {

    public static void musicprueba() {
        try {
            // Cargar el archivo de audio
            File audioFile = new File("canciones/cargatoxicasonido.wav");
            if (!audioFile.exists()) {
                System.err.println("El archivo de audio no existe: " + audioFile.getAbsolutePath());
                return;
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            // Obtener el formato de audio
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Abrir el clip
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);

            // Reproducir el audio
            clip.start();

            // Esperar a que termine el audio
            while (!clip.isRunning()) {
                Thread.sleep(10);
            }
            while (clip.isRunning()) {
                Thread.sleep(10);
            }

            // Cerrar los recursos
            clip.close();
            audioStream.close();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        musicprueba();
    }
}

package com.dam.proyectoprogramacion.Songs;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AttacksSongs {


    /**
     * metodo que reproduce la musica del ataque a bocajarro
     */
    public static void musicCloseCombat() {
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
    public static void musicAcrobatics() {
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
    /**
     * metodo que reproduce la musica del ataque de acua jet
     */
    public static void musicAquaJet() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/acuajetsonido.wav");
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
     * metodo que reproduce la musica del ataque de ataque oseo
     */
    public static void musicBoneRush() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/ataqueoseosonido.wav");
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
     * metodo que reproduce la musica del ataque de avalancha
     */
    public static void musicRockSlide() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/avalanchasonido.wav");
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
     * metodo que reproduce la musica del ataque de bola sombra
     */
    public static void musicShadowBall() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/bolasombrasonido.wav");
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
     * metodo que reproduce la musica del ataque de bomba acida
     */
    public static void musicAcidSpray() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/bombaacidasonido.wav");
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
     * metodo que reproduce la musica del ataque de carga toxica
     */
    public static void musicVenoshock() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/cargatoxicasonido.wav");
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
     * metodo que reproduce la musica del ataque de cola dragon
     */
    public static void musicDragonTail() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/coladragonsonido.wav");
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
     * metodo que reproduce la musica del ataque de colmillo rayo
     */
    public static void musicThunderFang() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/colmillorayosonido.wav");
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
     * metodo que reproduce la musica del ataque de desarme
     */
    public static void musicKnockOff() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/desarmesonido.wav");
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
     * metodo que reproduce la musica del ataque de enfado
     */
    public static void musicOutrage() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/enfadosonido.wav");
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
     * metodo que reproduce la musica del ataque de envite acuatico
     */
    public static void musicWaveCrash() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/enviteacuaticosonido.wav");
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
     * metodo que reproduce la musica del ataque de envite igneo
     */
    public static void musicFlareBlitz() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/enviteigneosonido.wav");
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
     * metodo que reproduce la musica del ataque de esfera aural
     */
    public static void musicAuraSphere() {
        try {
            /**
             * Cargar el archivo de audio
             */
            File audioFile = new File("canciones/esferaauralsonido.wav");
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

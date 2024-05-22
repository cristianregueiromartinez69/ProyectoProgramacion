package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.Songs.*;
import com.dam.proyectoprogramacion.pokemon.Tyranitar;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MethodsSongBattle {

    private static Clip clip;

    public static void PutPokemonSoundOnExitAndChangeInBattle(String name){
        name = name.toLowerCase();
        switch (name){
            case "drampa":
                DrampaSong.musicDrampa();
                break;
            case "empoleon":
                EmpoleonSong.musicEmpoleon();
                break;
            case "garchomp":
                GarchompSong.musicGarchomp();
                break;
            case "gengar":
                GengarSong.musicGengar();
                break;
            case "infernape":
                InfernapeSong.musicInfernape();
                break;
            case "lucario":
                LucarioSong.musicLucario();
                break;
            case "luxray":
                LuxraySong.musicLuxray();
                break;
            case "marshadow":
                MarshadowSong.musicMarshadow();
                break;
            case "milotic":
                MiloticSong.musicMilotic();
                break;
            case "snorlax":
                SnorlaxSong.musicSnorlax();
                break;
            case "tinkaton":
                TinkatonSong.musicTinkaton();
                break;
            case "tyranitar":
                TyranitarSong.musicTyranitar();
                break;
        }
    }
    /**
     * atributo privado de la clase
     */

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

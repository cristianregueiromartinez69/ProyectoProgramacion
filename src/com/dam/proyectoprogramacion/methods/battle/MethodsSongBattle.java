package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.Songs.*;
import com.dam.proyectoprogramacion.pokemon.Tyranitar;

public class MethodsSongBattle {


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
}

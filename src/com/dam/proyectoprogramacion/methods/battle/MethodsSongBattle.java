package com.dam.proyectoprogramacion.methods.battle;

import com.dam.proyectoprogramacion.Songs.*;
import com.dam.proyectoprogramacion.pokemon.Tyranitar;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
/**
 * Clase que contiene los métodos de las canciones de los pokemons en batalla
 * @author cristian
 * @version v4.0
 */
public class MethodsSongBattle {


    /**
     * Método que reproduce la canción del pokemon en batalla
     * @param name nombre del pokemon que sale a la batalla
     */
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
     * Método que reproduce la canción del ataque en batalla
     * @param nameAttack nombre del ataque que hace el pokemon
     */
    public static void putSongAttackPokemonsInBattle(String nameAttack){
        nameAttack = nameAttack.toLowerCase();
        switch(nameAttack){

            case "a bocajarro":
                AttacksSongs.musicCloseCombat();
                break;
            case "acróbata":
                AttacksSongs.musicAcrobatics();
                break;
            case "acua jet":
                AttacksSongs.musicAquaJet();
                break;
            case "ataque oseo":
                AttacksSongs.musicBoneRush();
                break;
            case  "avalancha":
                AttacksSongs.musicRockSlide();
                break;
            case "bola sombra":
                AttacksSongs.musicShadowBall();
                break;
            case "bomba ácida":
                AttacksSongs.musicAcidSpray();
                break;
            case "carga tóxica":
                AttacksSongs.musicVenoshock();
                break;
            case "cola dragon":
                AttacksSongs.musicDragonTail();
                break;
            case "colmillo rayo":
                AttacksSongs.musicThunderFang();
                break;
            case "desarme":
                AttacksSongs.musicKnockOff();
                break;
            case "enfado":
                AttacksSongs.musicOutrage();
                break;
            case "envite acuático":
                AttacksSongs.musicWaveCrash();
                break;
            case "envite ígneo":
                AttacksSongs.musicFlareBlitz();
                break;
            case "esfera aural":
                AttacksSongs.musicAuraSphere();
                break;
            case "fuerza equina":
                AttacksSongs.musicHighHorsePower();
                break;
            case "garra dragon":
                AttacksSongs.musicDragonClaw();
                break;
            case "garra metal":
                AttacksSongs.musicMetalClaw();
                break;
            case "gigaimpacto":
                AttacksSongs.musicGigaImpact();
                break;
            case "golpe bajo":
                AttacksSongs.musicSuckerPunch();
                break;
            case "golpe cuerpo":
                AttacksSongs.musicBodySlam();
                break;
            case "hidrobomba":
                AttacksSongs.musicHidroPump();
                break;
            case "hiperrayo":
                AttacksSongs.musicHyperBean();
                break;
            case "machada":
                AttacksSongs.musicHammerArm();
                break;
            case "martillo colosal":
                AttacksSongs.musicGigantonHammer();
                break;
            case "martillo de hielo":
                AttacksSongs.musicIceHammer();
                break;
            case "mordisco", "triturar":
                AttacksSongs.musicBite();
                break;
            case "onda vacío":
                AttacksSongs.musicVacuumWave();
                break;
            case "pataleta":
                AttacksSongs.musicStompingTantrum();
                break;
            case "psiococolmillo":
                AttacksSongs.musicPsychicFangs();
                break;
            case "pulso dragon":
                AttacksSongs.musicDragonPulse();
                break;
            case "pulso umbrío":
                AttacksSongs.musicDarkPulse();
                break;
            case "puño sombraa":
                AttacksSongs.musicShadowPunch();
                break;
            case "puño trueno":
                AttacksSongs.musicThunderPunch();
                break;
            case "rayo hielo":
                AttacksSongs.musicIceBeam();
                break;
            case "rayo":
                AttacksSongs.musicThunderbolt();
                break;
            case "roca afilada":
                AttacksSongs.musicStoneEdge();
                break;
            case "salmuera":
                AttacksSongs.musicBrine();
                break;
            case "sorpresa":
                AttacksSongs.musicFakeOut();
                break;
            case "surf":
                AttacksSongs.musicSurf();
                break;
            case "terremoto":
                AttacksSongs.musicEarthQuake();
                break;
            case "ultra puño":
                AttacksSongs.musicMachPunch();
                break;
            case "viento hielo":
                AttacksSongs.musicIceWind();
                break;
            case "voltio cruel":
                AttacksSongs.musicWildCharge();
                break;
            default:
                AttacksSongs.musicMetalClaw();
                break;
        }

    }

}

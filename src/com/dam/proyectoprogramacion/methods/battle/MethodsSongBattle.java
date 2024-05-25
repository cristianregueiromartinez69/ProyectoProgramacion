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
        switch(nameAttack){

            case "A Bocajarro":
                AttacksSongs.musicCloseCombat();
                break;
            case "Acróbata":
                AttacksSongs.musicAcrobatics();
                break;
            case "Acua Jet":
                AttacksSongs.musicAquaJet();
                break;
            case "Ataque Oseo":
                AttacksSongs.musicBoneRush();
                break;
            case  "Avalancha":
                AttacksSongs.musicRockSlide();
                break;
            case "Bola Sombra":
                AttacksSongs.musicShadowBall();
                break;
            case "Bomba Ácida":
                AttacksSongs.musicAcidSpray();
                break;
            case "Carga Tóxica":
                AttacksSongs.musicVenoshock();
                break;
            case "Cola Dragon":
                AttacksSongs.musicDragonTail();
                break;
            case "Colmillo Rayo":
                AttacksSongs.musicThunderFang();
                break;
            case "Desarme":
                AttacksSongs.musicKnockOff();
                break;
            case "Enfado":
                AttacksSongs.musicOutrage();
                break;
            case "Envite Acuático":
                AttacksSongs.musicWaveCrash();
                break;
            case "Envite Ígneo":
                AttacksSongs.musicFlareBlitz();
                break;
            case "Esfera Aural":
                AttacksSongs.musicAuraSphere();
                break;
            case "Fuerza Equina":
                AttacksSongs.musicHighHorsePower();
                break;
            case "Garra Dragon":
                AttacksSongs.musicDragonClaw();
                break;
            case "Garra Metal":
                AttacksSongs.musicMetalClaw();
                break;
            case "Gigaimpacto":
                AttacksSongs.musicGigaImpact();
                break;
            case "Golpe Bajo":
                AttacksSongs.musicSuckerPunch();
                break;
            case "Golpe Cuerpo":
                AttacksSongs.musicBodySlam();
                break;
            case "Hidrobomba":
                AttacksSongs.musicHidroPump();
                break;
            case "Hiperrayo":
                AttacksSongs.musicHyperBean();
                break;
            case "Machada":
                AttacksSongs.musicHammerArm();
                break;
            case "Martillo Colosal":
                AttacksSongs.musicGigantonHammer();
                break;
            case "Martillo de Hielo":
                AttacksSongs.musicIceHammer();
                break;
            case "Mordisco", "Triturar":
                AttacksSongs.musicBite();
                break;
            case "Onda Vacío":
                AttacksSongs.musicVacuumWave();
                break;
            case "Pataleta":
                AttacksSongs.musicStompingTantrum();
                break;
            case "Psicocolmillo":
                AttacksSongs.musicPsychicFangs();
                break;
            case "Pulso Dragon":
                AttacksSongs.musicDragonPulse();
                break;
            case "Pulso Umbrío":
                AttacksSongs.musicDarkPulse();
                break;
            case "Puño Sombraa":
                AttacksSongs.musicShadowPunch();
                break;
            case "Puño Trueno":
                AttacksSongs.musicThunderPunch();
                break;
            case "Rayo Hielo":
                AttacksSongs.musicIceBeam();
                break;
            case "Rayo":
                AttacksSongs.musicThunderbolt();
                break;
            case "Roca Afilada":
                AttacksSongs.musicStoneEdge();
                break;
            case "Salmuera":
                AttacksSongs.musicBrine();
                break;
            case "Sorpresa":
                AttacksSongs.musicFakeOut();
                break;
            case "Surf":
                AttacksSongs.musicSurf();
                break;
            case "Terremoto":
                AttacksSongs.musicEarthQuake();
                break;
            case "Ultrapuño":
                AttacksSongs.musicMachPunch();
                break;
            case "Viento Hielo":
                AttacksSongs.musicIceWind();
                break;
            case "Voltio Cruel":
                AttacksSongs.musicWildCharge();
                break;
            default:
                AttacksSongs.musicMetalClaw();
                break;
        }

    }

}

package com.dam.proyectoprogramacion.methods.selectionpokemon;

import com.dam.proyectoprogramacion.pokemon.*;
import com.dam.proyectoprogramacion.bbdd.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase con los metodos para crear objetos de los pokemons y añadirles atributos
 * @author cristian
 * @version v2.0
 */
public class MethosInterfaceSelectionPokemonCreatePokemons {

    /**
     * atributos estáticos de tipo pokemon
     */
    private static Drampa drampa;
    private static Empoleon empoleon;
    private static Garchomp garchomp;
    private static Gengar gengar;
    private static Infernape infernape;
    private static Lucario lucario;
    private static Luxray luxray = new Luxray();
    private static Marshadow marshadow;
    private static Milotic milotic;
    private static Snorlax snorlax;
    private static Tinkaton tinkaton;
    private static Tyranitar tyranitar;
    private static Statement stmt;

    public static Drampa makeDrampaObject() {

        /**
         * metodo para crear el objeto drampa
         * @return el objeto creado
         */

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Drampa'";
            atack = "Select * from Atacks where Name = 'Drampa'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

                drampa = new Drampa();
                drampa.setName(rs.getString("Name"));
                drampa.setType(rs.getString("Type1"));
                drampa.setLevel(Integer.valueOf(rs.getString("Level")));
                drampa.setLife(Integer.valueOf(rs.getString("Life")));
                drampa.setSex(rs.getString("Sex"));
                drampa.setSpeed(Integer.valueOf(rs.getString("Speed")));
                AttacksPokemons[] drampaAttacks = {
                        new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                        new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                        new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                        new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                };
                drampa.setAttacks(drampaAttacks);
                drampa.setSize(Float.valueOf(rs.getString("Syze")));
                drampa.setWeight(Float.valueOf(rs.getString("Weight")));

                return drampa;
            } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    /**
     * metodo para crear el objeto empoleon
     * @return el objeto creado
     */
    public static Empoleon makeEmpoleonObject() {

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Empoleon'";
            atack = "Select * from Atacks where Name = 'Empoleon'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

            empoleon = new Empoleon();
            empoleon.setName(rs.getString("Name"));
            empoleon.setType(rs.getString("Type1"));
            empoleon.setLevel(Integer.valueOf(rs.getString("Level")));
            empoleon.setLife(Integer.valueOf(rs.getString("Life")));
            empoleon.setSex(rs.getString("Sex"));
            empoleon.setSpeed(Integer.valueOf(rs.getString("Speed")));
            AttacksPokemons[] empoleonAttacks = {
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission")))
            };
            empoleon.setAttacks(empoleonAttacks);
            empoleon.setSize(Float.valueOf(rs.getString("Syze")));
            empoleon.setWeight(Float.valueOf(rs.getString("Weight")));

            return empoleon;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        /**
     * metodo para crear el objeto garchomp
     * @return el objeto creado
     */
    public static Garchomp makeGarchompObject() {

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Garchomp'";
            atack = "Select * from Atacks where Name = 'Grachomp'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

            garchomp = new Garchomp();
            garchomp.setName(rs.getString("Name"));
            garchomp.setType(rs.getString("Type1"));
            garchomp.setLevel(Integer.valueOf(rs.getString("Level")));
            garchomp.setLife(Integer.valueOf(rs.getString("Life")));
            garchomp.setSex(rs.getString("Sex"));
            garchomp.setSpeed(Integer.valueOf(rs.getString("Speed")));
            AttacksPokemons[] garchompAttacks = {
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission")))
            };
            garchomp.setAttacks(garchompAttacks);
            garchomp.setSize(Float.valueOf(rs.getString("Syze")));
            garchomp.setWeight(Float.valueOf(rs.getString("Weight")));

            return garchomp;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        /**
     * metodo para crear el objeto gengar
     * @return el objeto creado
     */
    public static Gengar makeGengarObject() {

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Gengar'";
            atack = "Select * from Atacks where Name = 'Gengar'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

            gengar = new Gengar();
            gengar.setName(rs.getString("Name"));
            gengar.setType(rs.getString("Type1"));
            gengar.setLevel(Integer.valueOf(rs.getString("Level")));
            gengar.setLife(Integer.valueOf(rs.getString("Life")));
            gengar.setSex(rs.getString("Sex"));
            gengar.setSpeed(Integer.valueOf(rs.getString("Speed")));
            AttacksPokemons[] gengarAttacks = {
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission")))
            };
            gengar.setAttacks(gengarAttacks);
            gengar.setSize(Float.valueOf(rs.getString("Syze")));
            gengar.setWeight(Float.valueOf(rs.getString("Weight")));

            return gengar;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

        /**
     * metodo para crear el objeto Infernape
     * @return el objeto creado
     */
    public static Infernape makeInfernapeObject() {

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Infernape'";
            atack = "Select * from Atacks where Name = 'Infernape'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

            infernape = new Infernape();
            infernape.setName(rs.getString("Name"));
            infernape.setType(rs.getString("Type1"));
            infernape.setLevel(Integer.valueOf(rs.getString("Level")));
            infernape.setLife(Integer.valueOf(rs.getString("Life")));
            infernape.setSex(rs.getString("Sex"));
            infernape.setSpeed(Integer.valueOf(rs.getString("Speed")));
            AttacksPokemons[] infernapeAttacks = {
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission")))
            };
            infernape.setAttacks(infernapeAttacks);
            infernape.setSize(Float.valueOf(rs.getString("Syze")));
            infernape.setWeight(Float.valueOf(rs.getString("Weight")));

            return infernape;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        /**
     * metodo para crear el objeto Lucario
     * @return el objeto creado
     */
    public static Lucario makeLucarioObject() {

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Lucario'";
            atack = "Select * from Atacks where Name = 'Lucario'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

            lucario = new Lucario();
            lucario.setName(rs.getString("Name"));
            lucario.setType(rs.getString("Type1"));
            lucario.setLevel(Integer.valueOf(rs.getString("Level")));
            lucario.setLife(Integer.valueOf(rs.getString("Life")));
            lucario.setSex(rs.getString("Sex"));
            lucario.setSpeed(Integer.valueOf(rs.getString("Speed")));
            AttacksPokemons[] lucarioAttacks = {
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission")))
            };
            lucario.setAttacks(lucarioAttacks);
            lucario.setSize(Float.valueOf(rs.getString("Syze")));
            lucario.setWeight(Float.valueOf(rs.getString("Weight")));

            return lucario;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * metodo para crear el objeto Luxray
     * @return el objeto creado
     */
    public static Luxray makeLuxrayObject() {

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Luxray'";
            atack = "Select * from Atacks where Name = 'Luxray'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

            luxray = new Luxray();
            luxray.setName(rs.getString("Name"));
            luxray.setType(rs.getString("Type1"));
            luxray.setLevel(Integer.valueOf(rs.getString("Level")));
            luxray.setLife(Integer.valueOf(rs.getString("Life")));
            luxray.setSex(rs.getString("Sex"));
            luxray.setSpeed(Integer.valueOf(rs.getString("Speed")));
            AttacksPokemons[] luxrayAttacks = {
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission")))
            };
            luxray.setAttacks(luxrayAttacks);
            luxray.setSize(Float.valueOf(rs.getString("Syze")));
            luxray.setWeight(Float.valueOf(rs.getString("Weight")));

            return luxray;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        /**
     * metodo para crear el objeto marshadow
     * @return el objeto creado
     */
    public static Marshadow makeMarshadowObject() {

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Marshadow'";
            atack = "Select * from Atacks where Name = 'Marshadow'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

            marshadow = new Marshadow();
            marshadow.setName(rs.getString("Name"));
            marshadow.setType(rs.getString("Type1"));
            marshadow.setLevel(Integer.valueOf(rs.getString("Level")));
            marshadow.setLife(Integer.valueOf(rs.getString("Life")));
            marshadow.setSex(rs.getString("Sex"));
            marshadow.setSpeed(Integer.valueOf(rs.getString("Speed")));
            AttacksPokemons[] marshadowAttacks = {
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission")))
            };
            marshadow.setAttacks(marshadowAttacks);
            marshadow.setSize(Float.valueOf(rs.getString("Syze")));
            marshadow.setWeight(Float.valueOf(rs.getString("Weight")));

            return marshadow;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * metodo para crear el objeto milotic
     * @return el objeto creado
     */
    public static Milotic makeMiloticObject() {

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Milotic'";
            atack = "Select * from Atacks where Name = 'Milotic'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

            milotic = new Milotic();
            milotic.setName(rs.getString("Name"));
            milotic.setType(rs.getString("Type1"));
            milotic.setLevel(Integer.valueOf(rs.getString("Level")));
            milotic.setLife(Integer.valueOf(rs.getString("Life")));
            milotic.setSex(rs.getString("Sex"));
            milotic.setSpeed(Integer.valueOf(rs.getString("Speed")));
            AttacksPokemons[] miloticAttacks = {
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission")))
            };
            milotic.setAttacks(miloticAttacks);
            milotic.setSize(Float.valueOf(rs.getString("Syze")));
            milotic.setWeight(Float.valueOf(rs.getString("Weight")));

            return milotic;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

        /**
     * metodo para crear el objeto snorlax
     * @return el objeto creado
     */
    public static Snorlax makeSnorlaxObject() {

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Snorlax'";
            atack = "Select * from Atacks where Name = 'Snorlax'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

            snorlax = new Snorlax();
            snorlax.setName(rs.getString("Name"));
            snorlax.setType(rs.getString("Type1"));
            snorlax.setLevel(Integer.valueOf(rs.getString("Level")));
            snorlax.setLife(Integer.valueOf(rs.getString("Life")));
            snorlax.setSex(rs.getString("Sex"));
            snorlax.setSpeed(Integer.valueOf(rs.getString("Speed")));
            AttacksPokemons[] snorlaxAttacks = {
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission")))
            };
            snorlax.setAttacks(snorlaxAttacks);
            snorlax.setSize(Float.valueOf(rs.getString("Syze")));
            snorlax.setWeight(Float.valueOf(rs.getString("Weight")));

            return snorlax;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        /**
     * metodo para crear el objeto tinkaton
     * @return el objeto creado
     */
    public static Tinkaton makeTinkatonObject() {

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Tinkaton'";
            atack = "Select * from Atacks where Name = 'Tinkaton'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

            tinkaton = new Tinkaton();
            tinkaton.setName(rs.getString("Name"));
            tinkaton.setType(rs.getString("Type1"));
            tinkaton.setLevel(Integer.valueOf(rs.getString("Level")));
            tinkaton.setLife(Integer.valueOf(rs.getString("Life")));
            tinkaton.setSex(rs.getString("Sex"));
            tinkaton.setSpeed(Integer.valueOf(rs.getString("Speed")));
            AttacksPokemons[] tinkatonAttacks = {
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission")))
            };
            tinkaton.setAttacks(tinkatonAttacks);
            tinkaton.setSize(Float.valueOf(rs.getString("Syze")));
            tinkaton.setWeight(Float.valueOf(rs.getString("Weight")));

            return tinkaton;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        /**
     * metodo para crear el objeto tyranitar
     * @return el objeto creado
     */
    public static Tyranitar makeTyranitarObject() {

        try {
            Conexion ini = new Conexion();
            ini.crearConexion();
            stmt = Conexion.con.createStatement();
            String sql;
            String atack;
            sql = "SELECT * FROM Pokemon WHERE Name = 'Tyranitar'";
            atack = "Select * from Atacks where Name = 'Tyranitar'";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet ra = stmt.executeQuery(atack);

            tyranitar = new Tyranitar();
            tyranitar.setName(rs.getString("Name"));
            tyranitar.setType(rs.getString("Type1"));
            tyranitar.setLevel(Integer.valueOf(rs.getString("Level")));
            tyranitar.setLife(Integer.valueOf(rs.getString("Life")));
            tyranitar.setSex(rs.getString("Sex"));
            tyranitar.setSpeed(Integer.valueOf(rs.getString("Speed")));
            AttacksPokemons[] tyranitarAttacks = {
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission"))),
                    new AttacksPokemons(ra.getString("Type"),ra.getString("Namea"),Integer.parseInt(ra.getString("Power")), Integer.parseInt(ra.getString("Precission")))
            };
            tyranitar.setAttacks(tyranitarAttacks);
            tyranitar.setSize(Float.valueOf(rs.getString("Syze")));
            tyranitar.setWeight(Float.valueOf(rs.getString("Weight")));
            return tyranitar;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


        /**
     * getters de los atributos de tipo pokemon
     * @return los atributos correspondientes
     */
    public static Drampa getDrampa() {
        return drampa;
    }

    public static Empoleon getEmpoleon() {
        return empoleon;
    }

    public static Garchomp getGarchomp() {
        return garchomp;
    }

    public static Gengar getGengar() {
        return gengar;
    }

    public static Infernape getInfernape() {
        return infernape;
    }

    public static Lucario getLucario() {
        return lucario;
    }

    public static Luxray getLuxray() {
        return luxray;
    }

    public static Marshadow getMarshadow() {
        return marshadow;
    }

    public static Milotic getMilotic() {
        return milotic;
    }

    public static Snorlax getSnorlax() {
        return snorlax;
    }

    public static Tinkaton getTinkaton() {
        return tinkaton;
    }

    public static Tyranitar getTyranitar() {
        return tyranitar;
    }


}

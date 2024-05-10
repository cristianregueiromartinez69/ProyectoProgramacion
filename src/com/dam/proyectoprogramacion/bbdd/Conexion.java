package com.dam.proyectoprogramacion.bbdd;


import javax.swing.*;
import java.sql.*;

/**
 * Nueva clase en la que se va a conectar con la bbdd
 */
public class Conexion {
    private Connection con;
    private String usuario = "root";
    private String contraseña = "debian";
    private String bd = "datosPokemon";
    private String ip = "localhost";
    private String port = "3306";
    private String url = "jdbc:mysql://" + ip + ":" + port + "/" + bd + "";

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,usuario,contraseña);
            JOptionPane.showMessageDialog(null, "Conexion establecida con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Errror de conexión con la base de datos");
        }
        return con;
    }

    public void CrearTabla() {

        try (Statement stmt = con.createStatement()){
                String sql = String.join("\n", "CREATE TABLE IF NOT EXISTS  Pokemon (", "Name VARCHAR(12) NOT NULL, PRIMARY KEY", "Type VARCHAR(10) NOT NULL, ", "Level INT NOT NULL, ", "Sex VARCHAR(7) NOT NULL, ", "Speed INT NOT NULL, ", "Lyfe INT NOT NULL, ", "Syze FLOAT NOT NULL, ", "Weight FLOAT NOT NULL, ", "Attacks VARCHAR(20) NOT NULL, ");
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Tabla de Pokemon registrado con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al crear la tabla");
        }
    }

    public void InsertarPokemon(String Name, String Type, Integer Level, Integer Life, String Sex, Integer Speed, Float Syze, Float Weight, String Atacks) {
        String sql = "INSERT INTO Pokemon (Name, Type, Level, Life, Sex, Speed. Syze, Weight, Attacks) VALUES (?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1,Name);
            pstmt.setString(1,Type);
            pstmt.setInt(1,Level);
            pstmt.setInt(1,Life);
            pstmt.setString(1,Sex);
            pstmt.setInt(1,Speed);
            pstmt.setFloat(1,Syze);
            pstmt.setFloat(1,Weight);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertado exitosamente");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al insertar la tabla");
        }
    }

}

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

    public Connection crearConexion() {
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
            pstmt.setString(2,Type);
            pstmt.setInt(3,Level);
            pstmt.setInt(4,Life);
            pstmt.setString(5,Sex);
            pstmt.setInt(6,Speed);
            pstmt.setFloat(7,Syze);
            pstmt.setFloat(8,Weight);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertado exitosamente");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al insertar la tabla");
        }
    }
    public void EliminarPokemon(String Name) {
        String sql = "DELETE FROM Pokemon WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setString(1,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Eliminado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Pokemon");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar la tabla");
        }
    }

    public void actualizarTypePokemon(String Name, String newType){
        String sql = "UPDATE Pokemon SET Name = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setString(1,newType);
            pstmt.setString(2,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Pokemon");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla");
        }
    }

    public void actualizarLevelPokemon(String Name, Integer newLevel){
        String sql = "UPDATE Pokemon SET Name = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setInt(1,newLevel);
            pstmt.setString(2,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Pokemon");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla");
        }
    }

    public void actualizarLifePokemon(String Name, Integer newLife){
        String sql = "UPDATE Pokemon SET Name = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setInt(1,newLife);
            pstmt.setString(2,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Pokemon");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla");
        }
    }

    public void actualizarSexPokemon(String Name, String newSex){
        String sql = "UPDATE Pokemon SET Name = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setString(1,newSex);
            pstmt.setString(2,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Pokemon");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla");
        }
    }

    public void actualizarSpeedPokemon(String Name, Integer newSpeed){
        String sql = "UPDATE Pokemon SET Name = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setInt(1,newSpeed);
            pstmt.setString(2,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Pokemon");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla");
        }
    }

    public void actualizarWeightPokemon(String Name, Float newSyze){
        String sql = "UPDATE Pokemon SET Name = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setFloat(1,newSyze);
            pstmt.setString(2,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Pokemon");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla");
        }
    }

    public void actualizarSyzePokemon(String Name, Float newSyze){
        String sql = "UPDATE Pokemon SET Name = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setFloat(1,newSyze);
            pstmt.setString(2,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Pokemon");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla");
        }
    }

}

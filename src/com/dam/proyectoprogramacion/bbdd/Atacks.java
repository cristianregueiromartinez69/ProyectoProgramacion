package com.dam.proyectoprogramacion.bbdd;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Atacks {
    Connection con;

    /**
     * metodo en el que se abre la conexion con la base de datos
     */
    public void nuevaTabla(){
        Conexion conectar = new Conexion();
        conectar.crearConexion();

    }

    /**
     * Creación de la tabla de ataques pokemon en la cual se van a registrar todos los ataques de los pokemon
     */

    public void CrearTabla() {

        try (Statement stmt = con.createStatement()){
            String sql = String.join("\n", "CREATE TABLE IF NOT EXISTS  Atacks (", "Name VARCHAR(15) NOT NULL, PRIMARY KEY", "Type VARCHAR(10) NOT NULL, ", "Power INT NOT NULL, ", "PP INT NOT NULL, ", "Precission FLOAT NOT NULL, ","FOREIGN KEY (Name), ", "REFERENCES Pokemon(Atacks);" );
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Tabla de Ataques registrado con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al crear la tabla");
        }
    }

    /**
     * Metodo en el que se va a introducir todos los datos de cada uno de los ataque los cuales se van a introducir
     * @param Name
     * @param Type
     * @param Power
     * @param PP
     * @param Precission
     */
    public void InsertAtacks(String Name, String Type, Integer Power, Integer PP, Float Precission) {
        String sql = "INSERT INTO Ataques (Name, Type, Power, PP, Precission) VALUES (?,?,?,?,?)";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1,Name);
            pstmt.setString(2,Type);
            pstmt.setInt(3,Power);
            pstmt.setInt(4,PP);
            pstmt.setFloat(5,Precission);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertado exitosamente");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al insertar la tabla");
        }
    }

    public void EliminarAtack(String Name) {
        String sql = "DELETE FROM Atacks WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setString(1,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Eliminado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Ataque");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar la tabla");
        }
    }

    public void actualizarTypeAtack(String Name, String newType){
        String sql = "UPDATE Atacks SET Type = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setString(1,newType);
            pstmt.setString(2,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Ataque");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla");
        }
    }

    public void actualizarPowerAtack(String Name, Integer newPower){
        String sql = "UPDATE Atacks SET Power = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setInt(1,newPower);
            pstmt.setString(2,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Ataque");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla");
        }
    }

    public void actualizarPPAtacks(String Name, Integer newPP){
        String sql = "UPDATE Atacks SET PP = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setInt(1,newPP);
            pstmt.setString(2,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Ataque");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla");
        }
    }

    public void actualizarPrecissionAtacks(String Name, Float newPrecision){
        String sql = "UPDATE Atacks SET Precision = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setFloat(1,newPrecision);
            pstmt.setString(2,Name);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el Ataque");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla");
        }
    }
}

package com.dam.proyectoprogramacion.bbdd;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Atacks {
    Connection con;

    public void nuevaTabla(){
        Conexion conectar = new Conexion();
        conectar.crearConexion();

    }
    public void CrearTabla() {

        try (Statement stmt = con.createStatement()){
            String sql = String.join("\n", "CREATE TABLE IF NOT EXISTS  Atacks (", "Name VARCHAR(15) NOT NULL, PRIMARY KEY", "Type VARCHAR(10) NOT NULL, ", "Power INT NOT NULL, ", "PP INT NOT NULL, ", "Precission FLOAT NOT NULL, ");
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Tabla de Ataques registrado con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al crear la tabla");
        }
    }

    public void InsertAtacks(String Name, String Type, Integer Power, Integer PP, Float Precission) {
        String sql = "INSERT INTO Ataques (Name, Type, Power, PP, Precission) VALUES (?,?,?,?,?)";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1,Name);
            pstmt.setString(2,Type);
            pstmt.setInt(3,Power);
            pstmt.setInt(4,PP);
            pstmt.setFloat(8,Precission);
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
                JOptionPane.showMessageDialog(null, "No se encontro el Pokemon");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar la tabla");
        }
    }

}
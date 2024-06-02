package com.dam.proyectoprogramacion.model.bbdd;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Players {

    Connection con;

    public void nuevaTabla(){
        Conexion conectar = new Conexion();
        conectar.crearConexion();

    }
    public void CrearTabla() {

        try (Statement stmt = con.createStatement()){
            String sql = String.join("\n", "CREATE TABLE IF NOT EXISTS  Players (", "Name VARCHAR(15) NOT NULL, PRIMARY KEY", "Type VARCHAR(10) NOT NULL, ", "Power INT NOT NULL, ", "PP INT NOT NULL, ", "Precission FLOAT NOT NULL, " );
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Tabla de Ataques registrado con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al crear la tabla");
        }
    }
}

package com.dam.proyectoprogramacion.bbdd;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * clase en la que se va a realizar all lo relacionado con los ataques de los pokemon
 */
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
     * Metodo en el que se va a introducir todos los datos de cada uno de los ataque los cuales se van a introducir
     * @param Name variable principal con la cual se va a identificar cada ataque
     * @param Type tipo de cada ataque
     * @param Power poder del ataque
     * @param PP  cantidad de veces que se puede utilizar el ataque
     * @param Precission  probabilidad de que acierte el ataque
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

    /**
     * Metodo para eliminar un ataque de la base de datos
     * @param Name nombre por el cual se va a reconocer el ataque que va a ser eliminado
     */
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

    /**
     * Ḿetodo para actuazlizar el tipo de un ataque
     * @param Name indicador de que ataque se quiere cambiar
     * @param newType nuevo tipo al que se va a cambiar
     */
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

    /**
     * Metodo para modificar el poder de un ataque
     * @param Name identificador de un ataque
     * @param newPower nuevo valor que se va a poner en la variable power
     */
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

    /**
     * Metodo para cambiar el numero de veces que puede ser utilizado un ataque
     * @param Name identificador del ataque que se va a cambiar
     * @param newPP nueva cantidad de veces que se va a poder utilizar el ataque
     */
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

    /**
     * Metodo para actualizar la precision de un ataque
     * @param Name identificador de un ataque
     * @param newPrecision nueva precision que va a tener el ataque
     */
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

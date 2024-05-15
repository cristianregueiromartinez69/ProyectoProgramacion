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


    /**
     * metodo para conectarse con la base de datos siempre que quiera ser utilizada
     * @return con
     */
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

    /**
     * Metodo en el que se va a crear la tabla pokemon con los datos Nombre, Tipo1, Tipo2, Nivel, Sexo, Velocidad, Vida. Tamaño, Peso y ataques
     */
    public void CrearTabla() {

        try (Statement stmt = con.createStatement()){
                String sql = String.join("\n", "CREATE TABLE IF NOT EXISTS  Pokemon (", "Name VARCHAR(12) NOT NULL, PRIMARY KEY", "Type1 VARCHAR(10) NOT NULL, ","Type2 VARCHAR(10),", "Level INT NOT NULL, ", "Sex VARCHAR(7) NOT NULL, ", "Speed INT NOT NULL, ", "Lyfe INT NOT NULL, ", "Syze FLOAT NOT NULL, ", "Weight FLOAT NOT NULL, ", "Attacks VARCHAR(20) NOT NULL, ");
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Tabla de Pokemon registrado con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al crear la tabla");
        }
    }

    /**
     * Metodo que es utilizado para insertar cualquier nuevo pokemon en la tabla pokemon
     * @param Name identificador de cada pokemon
     * @param Type1 Tipo principal del pokemon
     * @param Type2 Tipo secundario del pokemon
     * @param Level Nivel que va a tener el pokemon
     * @param Life Vida que va a tener el pokemon
     * @param Sex Sexo del pokemon
     * @param Speed Velocidad que va a tener el pokemon
     * @param Syze Tamaño del pokemon
     * @param Weight Peso que va a tener el pokemon
     * @param Atacks Variable ataque el cual va a servir para identificar los ataques
     */
    public void InsertarPokemon(String Name, String Type1,String Type2, Integer Level, Integer Life, String Sex, Integer Speed, Float Syze, Float Weight, String Atacks) {
        String sql = "INSERT INTO Pokemon (Name, Type1,,Type2 Level, Life, Sex, Speed. Syze, Weight, Attacks) VALUES (?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1,Name);
            pstmt.setString(2,Type1);
            pstmt.setString(3,Type2);
            pstmt.setInt(4,Level);
            pstmt.setInt(5,Life);
            pstmt.setString(6,Sex);
            pstmt.setInt(7,Speed);
            pstmt.setFloat(8,Syze);
            pstmt.setFloat(9,Weight);
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

    public void actualizarType1Pokemon(String Name, String newType1){
        String sql = "UPDATE Pokemon SET Type1 = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setString(1,newType1);
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

    public void actualizarType2Pokemon(String Name, String newType2){
        String sql = "UPDATE Pokemon SET Type2 = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setString(1,newType2);
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
        String sql = "UPDATE Pokemon SET Level = ? WHERE Name = ?";
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
        String sql = "UPDATE Pokemon SET Life = ? WHERE Name = ?";
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
        String sql = "UPDATE Pokemon SET Sex = ? WHERE Name = ?";
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
        String sql = "UPDATE Pokemon SET Speed = ? WHERE Name = ?";
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
        String sql = "UPDATE Pokemon SET Syze = ? WHERE Name = ?";
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

    public void actualizarSyzePokemon(String Name, Float newWeight){
        String sql = "UPDATE Pokemon SET Weight = ? WHERE Name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setFloat(1,newWeight);
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

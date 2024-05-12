package com.dam.proyectoprogramacion.bbdd;

public class Tyranitar {
    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.CrearTabla();
        datos.InsertarPokemon("Tyranitar","Roca","Siniestro",100,100,"Male",108,2F,202f,"Tyranitar");
        Atacks ataques = new Atacks();
        ataques.CrearTabla();
        ataques.InsertAtacks("Roca Afilada","Roca",100,5,80f);
        ataques.InsertAtacks("Avalancha","Roca",75,10,90f);
        ataques.InsertAtacks("Triturar","Siniestro",80,15,100f);
        ataques.InsertAtacks("Pataleta","Tierra",75,10,100f);
    }
}

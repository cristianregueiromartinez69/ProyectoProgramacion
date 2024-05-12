package com.dam.proyectoprogramacion.bbdd;

public class Snorlax {

    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.InsertarPokemon("Snorlax","Normal","",100,461,"Male",96,2.1F,460f,"Drampa");
        Atacks ataques = new Atacks();
        ataques.InsertAtacks("Fuerza Equina","Tierra",95,10,95f);
        ataques.InsertAtacks("Machada","Lucha",100,10,90f);
        ataques.InsertAtacks("Gigaimpacto","Normal",150,5,90f);
        ataques.InsertAtacks("Golpe Cuerpo","Normal",85,15,100f);
    }
}

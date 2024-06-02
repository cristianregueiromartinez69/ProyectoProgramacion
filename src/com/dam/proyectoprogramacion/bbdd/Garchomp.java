package com.dam.proyectoprogramacion.bbdd;

public class Garchomp {

    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.InsertarPokemon("Garchomp","Tierra","Dragon",100,357,"Female",240,1.9F,95f,"Garchomp");
        Atacks ataques = new Atacks();
        ataques.InsertAtacks("Enfado","Dragon",120,10,100f);
        ataques.InsertAtacks("Terremoto","Tierra",100,10,100f);
        ataques.InsertAtacks("Pataleta","Tierra",75,10,100f);
        ataques.InsertAtacks("Garra Dragon","Dragon",80,15,100f);
    }

}

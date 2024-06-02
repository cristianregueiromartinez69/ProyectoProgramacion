package com.dam.proyectoprogramacion.bbdd;

public class Marshadow {

    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.InsertarPokemon("Marshadow","Fantasma","Lucha",100,321,"",286,0.7F,22.2f,"Marshadow");
        Atacks ataques = new Atacks();
        ataques.InsertAtacks("Puño Sombraa","Fantasma",60,20,100f);
        ataques.InsertAtacks("A Bocajarro","Lucha",120,5,100f);
        ataques.InsertAtacks("Golpe Bajo","Fantasma",70,5,100f);
        ataques.InsertAtacks("Puño Trueno","Electrico",75,15,100f);
    }
}

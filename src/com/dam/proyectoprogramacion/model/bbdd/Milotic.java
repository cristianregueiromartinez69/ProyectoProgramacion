package com.dam.proyectoprogramacion.model.bbdd;

public class Milotic {

    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.InsertarPokemon("Milotic","Agua","",100,331,"Female",198,6.2F,162f,"Milotic");
        Atacks ataques = new Atacks();
        ataques.InsertAtacks("Rayo Hielo","Hielo",90,10,100f);
        ataques.InsertAtacks("Surf","Agua",90,15,100f);
        ataques.InsertAtacks("Hidrobomba","Agua",110,5,80f);
        ataques.InsertAtacks("Cola Dragon","Dragon",60,10,90f);
    }
}

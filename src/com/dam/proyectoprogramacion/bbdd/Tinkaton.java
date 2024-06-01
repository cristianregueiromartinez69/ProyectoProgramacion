package com.dam.proyectoprogramacion.bbdd;

public class Tinkaton {

    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.InsertarPokemon("Tinkaton","Hada-Acero",100,311,"Female",224, 0.7F,112.8f,"Tinkaton");
        Atacks ataques = new Atacks();
        ataques.InsertAtacks("Martillo Colosal","Acero",160,5,100f);
        ataques.InsertAtacks("Desarme","Siniestro",65,20,100f);
        ataques.InsertAtacks("Martillo de Hielo","Hielo",100,10,90f);
        ataques.InsertAtacks("Sorpresa","Normal",40,15,100f);
    }

}

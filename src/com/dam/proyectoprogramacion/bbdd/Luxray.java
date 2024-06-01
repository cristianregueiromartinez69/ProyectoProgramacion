package com.dam.proyectoprogramacion.bbdd;

public class Luxray {

    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.InsertarPokemon("Luxray","Electrico",100,301,"Male",176,1.4F,42f,"Luxray");
        Atacks ataques = new Atacks();
        ataques.InsertAtacks("Mordisco","Siniestro",60,25,100f);
        ataques.InsertAtacks("Voltio Cruel","Electrico",90,15,100f);
        ataques.InsertAtacks("Colmillo Rayo","Electrico",65,15,95f);
        ataques.InsertAtacks("Psicocolmillo","Psiquico",85,10,100f);
    }

}

package com.dam.proyectoprogramacion.model.bbdd;

public class Gengar {

    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.InsertarPokemon("Gengar","Fantasma","Veneno",100,261,"Male",256,1.5F,40.5f,"Gengar");
        Atacks ataques = new Atacks();
        ataques.InsertAtacks("Bola Sombra","Fantasma",80,15,100f);
        ataques.InsertAtacks("Pulso Umbrío","Siniestro",80,15,100f);
        ataques.InsertAtacks("Bomba Ácida","Veneno",40,20,100f);
        ataques.InsertAtacks("Carga Tóxica","Veneno",65,10,100f);
    }

}

package com.dam.proyectoprogramacion.bbdd;

public class Infernape {

    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.InsertarPokemon("Infernape","Fuego","Lucha",100,293,"Male",252,1.2F,55f,"Infernape");
        Atacks ataques = new Atacks();
        ataques.InsertAtacks("Ultrapuño","Lucha",40,30,100f);
        ataques.InsertAtacks("A Bocajarro","Lucha",120,5,100f);
        ataques.InsertAtacks("Envite Ígneo","Fuego",120,15,100f);
        ataques.InsertAtacks("Acróbata","Volador",55,15,100f);
    }

}

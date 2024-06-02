package com.dam.proyectoprogramacion.model.bbdd;

public class Drampa {
    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.InsertarPokemon("Drampa","Normal","Dragon",100,297,"Male",108,3F,185f,"Drampa");
        Atacks ataques = new Atacks();
        ataques.InsertAtacks("Pulso Dragon","Dragon",85,10,100f);
        ataques.InsertAtacks("Hiperrayo","Normal",150,5,90f);
        ataques.InsertAtacks("Viento Hielo","Hielo",55,15,95f);
        ataques.InsertAtacks("Rayo","Eléctrico",90,15,100f);
    }

}

package com.dam.proyectoprogramacion.bbdd;

public class Lucario {

    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.InsertarPokemon("Lucario","Lucha-Acero",100,281,"Female",216,1.2F,54f,"Lucario");
        Atacks ataques = new Atacks();
        ataques.InsertAtacks("Ataque Oseo","Tierra",25,10,90f);
        ataques.InsertAtacks("A bocajarro","Lucha",120,5,100f);
        ataques.InsertAtacks("Esfera Aural","Lucha",80,20,100f);
        ataques.InsertAtacks("Onda Vacío","Lucha",40,30,100f);
    }

}

package com.dam.proyectoprogramacion.bbdd;

public class Empoleon {

    public void crearPokemon(){
        Conexion datos = new Conexion();
        datos.crearConexion();
        datos.InsertarPokemon("Empoleon","Agua","Acero",100,309,"Male",156,1.7F,84.5f,"Empoleon");
        Atacks ataques = new Atacks();
        ataques.InsertAtacks("Envite Acuático","Agua",120,10,100f);
        ataques.InsertAtacks("Garra Metal","Acero",50,35,95f);
        ataques.InsertAtacks("Acua Jet","Aagua",40,20,100f);
        ataques.InsertAtacks("Salmuera","Agua",65,10,100f);
    }

}

package Logica;

import java.io.Serializable;

public class Categoria implements Serializable {
    private final String nombre;
    
    
    public Categoria(String nomCat){
        this.nombre = nomCat;
    }    
    public String getNombreCat(){
        return this.nombre;
    }
    
    public String toString(){
        return this.nombre;
    }
}

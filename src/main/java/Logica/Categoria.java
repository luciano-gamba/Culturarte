package Logica;

public class Categoria {
    private String nombre;
    
    
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

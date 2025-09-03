package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Categoria implements Serializable {
    private final String nombre;
    private List<Propuesta> misPropuestas = new ArrayList();
    
    public Categoria(String nomCat){
        this.nombre = nomCat;
    }    
    public String getNombreCat(){
        return this.nombre;
    }
    
    public List<Propuesta> getPropuestas(){
        return misPropuestas;
    }
    
    public void agregarPropuesta(Propuesta prop){ //Esto hara que tenga una complejidad adicional para el alta de propuesta y modificar propuestas y más para propuestas
        //canceladas que supongo no debo mostrar...
        misPropuestas.add(prop);
    }
    
    public void sacarPropuesta(Propuesta prop){ //No hago verificaciones si esta propuesta ya existe en la lista de Propuestas porque esto se usara para modifcar
        //propuesta y al estar parado en la propuesta y querer cambiar su categoria no deberia dar problemas eliminar esta propuesta de la categoria usandolo
        //luego pienso bien en la logica asi lo termino practicamente implementando yo 
        misPropuestas.remove(prop);
    }
}

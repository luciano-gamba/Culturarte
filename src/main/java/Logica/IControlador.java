package Logica;

import java.time.LocalDate;
import java.util.List;

public interface IControlador {
    
    int añadirUsuario(String nick, String nombre, String apellido, String correo, LocalDate fecNac, String direccion, String bio, String sitioWeb);
    
    int añadirUsuario(String nick, String nombre, String apellido, String correo, LocalDate fecNac);
    
    int altaCategoria(String nombreCat);
    
    int altaCategoria(String nombreCat,String nombrePadreCat);
    
    List<String> getUsuarios(); 
    
    int seguirUsuario(String nick1, String nick2);
    
}

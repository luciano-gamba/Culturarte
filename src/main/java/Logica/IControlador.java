package Logica;

import java.time.LocalDate;

public interface IControlador {
    
    int añadirUsuario(String nick, String nombre, String apellido, String correo, LocalDate fecNac, String direccion, String bio, String sitioWeb);
    
    int añadirUsuario(String nick, String nombre, String apellido, String correo, LocalDate fecNac);
    
    int altaCategoria(String nombreCat);
    
    int altaCategoria(String nombreCat,String nombrePadreCat);
    
    int altaPropuesta(String nick, String tipo, String titulo, String descripcion, String lugar, LocalDate fechaPrev, String montoXentrada, String montoNecesario, EnumRetorno posibleRetorno, LocalDate fechaActual);
    
    int altaPropuesta(String nick, String tipo, String titulo, String descripcion, String lugar, LocalDate fechaPrev, String montoXentrada, String montoNecesario, EnumRetorno posibleRetorno, LocalDate fechaActual, String imagen);
}

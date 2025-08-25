package Logica;

import java.time.LocalDate;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

public interface IControlador {
    
    int añadirUsuario(String nick, String nombre, String apellido, String correo, LocalDate fecNac, String imagen, String direccion, String bio, String sitioWeb);
    
    int añadirUsuario(String nick, String nombre, String apellido, String correo, LocalDate fecNac, String imagen);
    
    int altaCategoria(String nombreCat);
    
    int altaCategoria(String nombreCat,String nombrePadreCat);
    
    List<String> getUsuarios();
    
    List<String> getUsuariosProponentes();
    
    DataProponente consultaDeProponente(String NickName);
    
    List<String> getSeguidos(String seguidor);
    
    int seguirUsuario(String nick1, String nick2);
    
    int dejarSeguirUsuario(String nick1, String nick2);
    
    int altaPropuesta(String nick, String tipo, String titulo, String descripcion, String lugar, LocalDate fechaPrev, String montoXentrada, String montoNecesario, EnumRetorno posibleRetorno, LocalDate fechaActual);
    
    int altaPropuesta(String nick, String tipo, String titulo, String descripcion, String lugar, LocalDate fechaPrev, String montoXentrada, String montoNecesario, EnumRetorno posibleRetorno, LocalDate fechaActual, String imagen);
    
    DefaultMutableTreeNode getRaizArbolCat();
    
    List<String> getPropuestas();
    
    DataPropuesta consultaDePropuesta(String titulo);
    
    List<String> getEstados();
    
    List<String> getPropXEstado(String estado);
}

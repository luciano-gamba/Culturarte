package Logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

public class Controlador implements IControlador{

    public List<Usuario> misUsuarios = new ArrayList<>();
    public List<Proponente> misProponentes = new ArrayList<>();
    public List<Colaborador> misColaboradores = new ArrayList<>();
    private ArbolCategorias arbolCategorias;
    
    public Controlador() {
        this.arbolCategorias = new ArbolCategorias(new Categoria("Categoria"));
    //La letra dice que la raiz siempre es "Categoria" 
    //probablemente tenga que cambiarlo para evitar repetidos o errores al coenctar con la BD
    
    }
    
    @Override
    public int añadirUsuario(String nick, String nombre, String apellido, String correo, LocalDate fecNac){
        String nickNuevo = nick;
        String correoNuevo = correo;
        Boolean nickExiste = false;
        Boolean correoExiste = false;
        
        for(Usuario u : misUsuarios){
            if(u.getNickname().equals(nickNuevo)){
                nickExiste = true;
                break;
            }
        }
        
        for(Usuario u : misUsuarios){
            if(u.getEmail().equals(correoNuevo)){
                correoExiste = true;
                break;
            }
        }
        
        if(nickExiste == true || correoExiste == true){
            System.out.println("ERROR: Nickname o Correo existen en el sistema!");
            return 0;
        }else{
            Colaborador colaNuevo = new Colaborador(nick, correo, nombre, apellido, fecNac);
            misUsuarios.add(colaNuevo);
            misColaboradores.add(colaNuevo);
            return 1;
        }
    }
    
    @Override
    public int añadirUsuario(String nick, String nombre, String apellido, String correo, LocalDate fecNac, String direccion, String bio, String sitioWeb){
        String nickNuevo = nick;
        String correoNuevo = correo;
        Boolean nickExiste = false;
        Boolean correoExiste = false;
        
        for(Usuario u : misUsuarios){
            if(u.getNickname().equals(nickNuevo)){
                nickExiste = true;
                break;
            }
        }
        
        for(Usuario u : misUsuarios){
            if(u.getEmail().equals(correoNuevo)){
                correoExiste = true;
                break;
            }
        }
        
        if(nickExiste == true || correoExiste == true){
            System.out.println("ERROR: Nickname o Correo existen en el sistema!");
            return 0;
        }else{
            Proponente propNuevo = new Proponente(direccion, bio, sitioWeb, nick, correo, nombre, apellido, fecNac);
            misUsuarios.add(propNuevo);
            misProponentes.add(propNuevo);
            return 1;
        }
    }
    @Override
    public int altaCategoria(String nombreCat){
        Categoria nueva = new Categoria(nombreCat);
        arbolCategorias.insertar("Categoria",nueva);
        
        return 0;
    }
    
    @Override
    public int altaCategoria(String nombreCat,String nombrePadreCat){
        Categoria nueva = new Categoria(nombreCat);
        DefaultMutableTreeNode padre = arbolCategorias.buscar(nombrePadreCat);
        if(padre==null){
            return -1;
        }
        
        arbolCategorias.insertar(nombrePadreCat,nueva);
            
        return 0;
    }

    @Override
    public List<String> getUsuarios() {
        List<String> listaNombres = new ArrayList<>();
        String aux;
        for(Usuario u : misUsuarios){
            aux = u.getNickname();
            listaNombres.add(aux);
        }
        return listaNombres;
    }

    @Override
    public int seguirUsuario(String nick1, String nick2) {
        Usuario seguidor = null;
        Usuario seguir = null;
        for(Usuario u : this.misUsuarios){
            if(u.getNickname().equals(nick1)){
                seguidor = u;
                break;
            }
        }
        
        for(Usuario u : this.misUsuarios){
            if(u.getNickname().equals(nick2)){
                seguir = u;
                break;
            }
        }
        
//        if(seguidor == null){
//            return 0; 
//        }else{
        int resultado = seguidor.seguirUsuario(seguir);
        if (resultado == 0) {
            return 0; //error 0: ya sigue al usuario nick2
        }else{
            return 1;
        }
    }
    
}

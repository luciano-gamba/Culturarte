package Persistencia;

import Logica.Aporte;
import Logica.Categoria;
import Logica.Colaborador;
import Logica.Estado;
import Logica.Proponente;
import Logica.Propuesta;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    UsuarioJpaController usuJPA = new UsuarioJpaController();
    private CategoriaJpaController catJPA = new CategoriaJpaController();

    public Usuario buscarUsuario(String nick) {
        return usuJPA.findUsuario(nick);
    }

    public ArrayList<Usuario> getListaUsuarios() {

        List<Usuario> lista = usuJPA.findUsuarioEntities();
        ArrayList<Usuario> listaUsuarios = new ArrayList<>(lista);

        return listaUsuarios;
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    ProponenteJpaController usuPropJPA = new ProponenteJpaController();

    public void añadirUsuario(Proponente usu) {
        try {
            usuJPA.create(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Proponente buscarProponente(String nick) {
        return usuPropJPA.findProponente(nick);
    }

    public ArrayList<Proponente> getListaProponentes() {

        List<Proponente> lista = usuPropJPA.findProponenteEntities();
        ArrayList<Proponente> listaUsuarios = new ArrayList<Proponente>(lista);

        return listaUsuarios;
    }

    
    ColaboradorJpaController usuColaJPA = new ColaboradorJpaController();

    public void añadirUsuario(Colaborador usu) {
        try {
            usuJPA.create(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Colaborador> getColaboradores() {
        return usuColaJPA.findColaboradorEntities();
    }

    
    PropuestaJpaController propJPA = new PropuestaJpaController();

    public void añadirPropuesta(Propuesta p) {
        try {
            propJPA.create(p);

            Categoria cat = p.getCategoriaClase();
            if (!cat.getPropuestas().contains(p)) {
                cat.agregarPropuesta(p);
                catJPA.edit(cat);
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Propuesta> getListaPropuestas() {
        return propJPA.findPropuestaEntities();
    }
    
    public Propuesta getPropuesta(String titulo){
        return propJPA.findPropuesta(titulo);
    }

    public void modificarPropuesta(Propuesta p){
        try {
            propJPA.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    EstadoJpaController estadoJPA = new EstadoJpaController();

    public void añadirEstado(Estado e) {
        try {
            estadoJPA.create(e);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createCategoria(Categoria cat) {
        try {
            this.catJPA.create(cat);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Categoria findCategoria(String nombreCat) {
        return this.catJPA.findCategoria(nombreCat);
    }

    public List<Categoria> listarCategorias() {
        return this.catJPA.findCategoriaEntities();
    }

    
    ColaboradorJpaController colaJPA = new ColaboradorJpaController();

    public List<String> getNickColaboradores() {
        return colaJPA.getListaNick();
    }

    
    AporteJpaController aporteJPA = new AporteJpaController();

    public void añadirAporte(Aporte a) {
        try {
            aporteJPA.create(a);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void borrarAporte(Aporte a) {
        try {
            aporteJPA.destroy(a.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

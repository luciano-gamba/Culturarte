package Persistencia;

import Logica.Colaborador;
import Logica.Estado;
import Logica.Proponente;
import Logica.Propuesta;
import Logica.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
        UsuarioJpaController usuJPA = new UsuarioJpaController();
        
        public Usuario buscarUsuario(String nick){
            return usuJPA.findUsuario(nick);
        }
        
        public ArrayList<Usuario> getListaUsuarios(){
            
            List<Usuario> lista = usuJPA.findUsuarioEntities();
            ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario> (lista);
            
            return listaUsuarios;
        }
        
        public void editarUsuario(Usuario usu){
            try {
                usuJPA.edit(usu);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        ProponenteJpaController usuPropJPA = new ProponenteJpaController();
        
        public void añadirUsuario(Proponente usu){
            try {
                usuJPA.create(usu);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public Proponente buscarProponente(String nick){
            return usuPropJPA.findProponente(nick);
        }
        
        public ArrayList<Proponente> getListaProponentes(){
            
            List<Proponente> lista = usuPropJPA.findProponenteEntities();
            ArrayList<Proponente> listaUsuarios = new ArrayList<Proponente> (lista);
            
            return listaUsuarios;
        }
    
        ColaboradorJpaController usuColaJPA = new ColaboradorJpaController();
        
        public void añadirUsuario(Colaborador usu){
            try {
                usuJPA.create(usu);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        PropuestaJpaController propJPA = new PropuestaJpaController();
        
        public void añadirPropuesta(Propuesta p){
            try {
                propJPA.create(p);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        EstadoJpaController estadoJPA = new EstadoJpaController();
        
        public void añadirEstado(Estado e){
            try{
                estadoJPA.create(e);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}

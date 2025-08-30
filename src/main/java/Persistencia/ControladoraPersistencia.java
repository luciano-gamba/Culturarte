package Persistencia;

import Logica.Colaborador;
import Logica.Proponente;
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
        
        
    
        ColaboradorJpaController usuColaJPA = new ColaboradorJpaController();
        
        public void añadirUsuario(Colaborador usu){
            try {
                usuJPA.create(usu);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}

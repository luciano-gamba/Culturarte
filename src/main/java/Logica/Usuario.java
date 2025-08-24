package Logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nickname;
    String email;
    String nombre;
    String apellido;
    LocalDate fecNac;
    String imagen = "";
    List<Usuario> misSeguidos;

    public Usuario(String nickname, String email, String nombre, String apellido, LocalDate fecNac, String imagen) {
        this.nickname = nickname;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecNac = fecNac;
        this.imagen = imagen;
        this.misSeguidos = new ArrayList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }
    
    public int seguirUsuario(Usuario nick){
        for(Usuario u : this.misSeguidos){
            if(u == nick){
                return 0; //error: ya sigue al usuario nick
            }
        }
        this.misSeguidos.add(nick);
        return 1;
    }
    
    public int dejarDeSeguir(Usuario nick){
        for(Usuario u : this.misSeguidos){
            if(u == nick){
                this.misSeguidos.remove(u);
                return 1;
            }
        }
        return 0; //error 0: no se encuentra
    }
    
    public List<String> getSeguidos(){
        List<String> listaSeguidos = new ArrayList<>();
        for(Usuario u : this.misSeguidos){
            listaSeguidos.add(u.getNickname());
        }
        return listaSeguidos;
    }
}

package Logica;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "nickname")
public class Proponente extends Usuario {

    
    String direccion;
    String biografia = "";
    String sitioWeb = "";
    
    public Proponente() {
        
    }
    
    public Proponente(String direccion, String biografia, String sitioWeb, String nickname, String email, String nombre, String apellido, LocalDate fecNac, String imagen) {
        super(nickname, email, nombre, apellido, fecNac, imagen);
        this.direccion = direccion;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
    
    
}

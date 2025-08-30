package Logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "nickname")
public class Colaborador extends Usuario {
    
    private List<Aporte> misAportes = new ArrayList<>();
    
    public Colaborador(){
        
    }
    
    public Colaborador(String nickname, String email, String nombre, String apellido, LocalDate fecNac, String imagen) {
        super(nickname, email, nombre, apellido, fecNac, imagen);
    }
    
    public Aporte createAporte(String titulo, double $aporte, int cantidad, EnumRetorno retorno){
        
        if (!misAportes.isEmpty()) {
            for (Aporte mio : misAportes) {
                if (titulo.equals(mio.getTituloMiPropuesta())) {
                    return null;
                }
            }
        }
        Aporte a = new Aporte(this , $aporte, cantidad, retorno);
        misAportes.add(a);
        return a;
    }
    
    
    
    
}

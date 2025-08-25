package Logica;

import java.time.LocalDate;

public class Colaborador extends Usuario {

    public Colaborador(String nickname, String email, String nombre, String apellido, LocalDate fecNac, String imagen) {
        super(nickname, email, nombre, apellido, fecNac, imagen);
    }
    
}

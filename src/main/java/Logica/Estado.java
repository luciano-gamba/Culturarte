package Logica;

import java.time.LocalDate;

public class Estado {
    EnumEstado estado;
    LocalDate fecha;
    
    public Estado(EnumEstado est, LocalDate fec){
        this.estado = est;
        this.fecha = fec;
    }
    
    public EnumEstado getEstado(){
        return this.estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
}

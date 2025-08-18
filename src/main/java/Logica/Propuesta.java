package Logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propuesta {
    String titulo;
    String desc;
    //imagen ???
    String lugar;
    LocalDate fecha;
    double $entrada;
    double $necesaria;
    LocalDate fechaPubli;
    EnumRetorno posibleRetorno;
    Estado estadoActual;
    public List<Estado> misEstados = new ArrayList<>();
    Proponente p;
    
    public Propuesta(Proponente prop, String titulo, String descripcion, String lugar, LocalDate fechaPrev, double montoXentrada, double montoNecesario, EnumRetorno posibleRetorno, LocalDate fechaActual) {
        this.p = prop;
        this.titulo = titulo;
        this.desc = descripcion;
        this.lugar = lugar;
        this.fechaPubli = fechaPrev;
        this.$entrada = montoXentrada;
        this.$necesaria = montoNecesario;
        this.posibleRetorno = posibleRetorno;
        this.fecha = fechaActual;
        
        Estado estado = new Estado(EnumEstado.valueOf("INGRESADA"), fechaActual);
        
        this.estadoActual = estado;
        this.misEstados.add(estado);

        //HACER OTRA CON LA IMAGEN!
    }
       
}



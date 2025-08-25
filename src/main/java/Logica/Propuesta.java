package Logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propuesta {
    String titulo;
    String desc;
    String imagen;
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
    
    public Propuesta(Proponente prop, String titulo, String descripcion, String lugar, LocalDate fechaPrev, double montoXentrada, double montoNecesario, EnumRetorno posibleRetorno, LocalDate fechaActual, String imagen) {
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
        
        this.imagen = imagen;

    }
    
    public void modificarPropuesta(String descripcion, String lugar, LocalDate fechaPrev, double montoXentrada, double montoNecesario, String posibleRetorno, String estado, String imagen){
        this.desc = descripcion;
        this.lugar = lugar;
        this.fechaPubli = fechaPrev;
        this.$entrada = montoXentrada;
        this.$necesaria = montoNecesario;
        
        EnumRetorno retorno;
        switch(posibleRetorno){
            case "ENTRADAS_GRATIS" -> retorno = EnumRetorno.valueOf("ENTRADAS_GRATIS");
            case "PORCENTAJE_VENTAS" -> retorno = EnumRetorno.valueOf("PORCENTAJE_VENTAS");
            case "AMBOS" -> retorno = EnumRetorno.valueOf("AMBOS");
            default -> retorno = EnumRetorno.valueOf("ERROR");
        }
        this.posibleRetorno = retorno;
        
        Estado est = new Estado(EnumEstado.valueOf(estado), LocalDate.now());
        this.estadoActual = est;
        this.misEstados.add(est);
        
        this.imagen = imagen;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getImagen(){
        return this.imagen;
    }
    
    public Estado getEstadoActual(){
        return this.estadoActual;
    }
    
    public Proponente getProponente(){
        return this.p;
    }
    
    public String getDescripcion(){
        return this.desc;
    }
    
    public String getLugar(){
        return this.lugar;
    }
    
    public Double getEntrada(){
        return this.$entrada;
    }
    
    public Double getNecesaria(){
        return this.$necesaria;
    }
    
    public EnumRetorno getRetorno(){
        return this.posibleRetorno;
    }
    
    public LocalDate getFechaARealizar(){
        return this.fechaPubli;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}



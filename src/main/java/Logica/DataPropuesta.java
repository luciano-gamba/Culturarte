/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.time.LocalDate;

/**
 *
 * @author nahud
 */
public class DataPropuesta {
    
    String titulo;
    String imagen;
    Estado estadoActual;
    Proponente p;
    String desc;
    String lugar;
    double $entrada;
    double $necesaria;
    double $alcanzada;
    LocalDate fechaPubli;
    EnumRetorno posibleRetorno;
    
    public DataPropuesta(String titulo, String imagen, Estado estadoActual, Proponente p, String descrip, String lugar, double entrada, double necesaria, double alcanzada ,LocalDate fechaP, EnumRetorno retorno){
        this.titulo = titulo;
        this.imagen = imagen;
        this.estadoActual = estadoActual;
        this.p = p;
        this.desc = descrip;
        this.lugar = lugar;
        this.$entrada = entrada;
        this.$necesaria = necesaria;
        this.$alcanzada = alcanzada;
        this.fechaPubli = fechaP;
        this.posibleRetorno = retorno;
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

    public Double getAlcanzada() {
        return $alcanzada;
    }

    public LocalDate getFechaPubli() {
        return fechaPubli;
    }
    
    public EnumRetorno getRetorno(){
        return this.posibleRetorno;
    }
    
    public LocalDate getFechaARealizar(){
        return this.fechaPubli;
    }
}

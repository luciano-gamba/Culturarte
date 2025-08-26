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
    private double $alcanzada;
    LocalDate fechaPubli;
    EnumRetorno posibleRetorno;
    Estado estadoActual;
    private List<Aporte> misAportes = new ArrayList<>();
    public List<Estado> misEstados = new ArrayList<>();
    Proponente miProponente;
    
    public Propuesta(Proponente prop, String titulo, String descripcion, String lugar, LocalDate fechaPrev, double montoXentrada, double montoNecesario, EnumRetorno posibleRetorno, LocalDate fechaActual) {
        this.miProponente = prop;
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
    
    public String getTitulo_Nickname(){
        return this.titulo+" by "+this.miProponente.getNickname();
    }

    public double get$necesaria() {
        return $necesaria;
    }

    public double get$alcanzada() {
        return $alcanzada;
    }

    public String getTitulo() {
        return titulo;
    }

    public EnumRetorno getPosibleRetorno() {
        return posibleRetorno;
    }
        
    public void addAporte(Aporte a){
        misAportes.add(a);
        a.setMiPropuesta(this);
        $alcanzada+=a.get$aporte();
    }
    
    
}   



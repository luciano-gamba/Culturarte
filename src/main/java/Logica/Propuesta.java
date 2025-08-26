package Logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propuesta {
    private String titulo;
    private String desc;
    private String imagen;
    private String lugar;
    private LocalDate fecha;
    private double $entrada;
    private double $necesaria;
    private double $alcanzada;
    private LocalDate fechaPubli;
    private EnumRetorno posibleRetorno;
    private Estado estadoActual;
    private List<Aporte> misAportes = new ArrayList<>();
    public List<Estado> misEstados = new ArrayList<>();//A CAMBIAR
    private Proponente miProponente;
    private Categoria c;
    
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

        //DIALOGAR PARA VER QUE HACEMOS CON ESTA EN ESPECIFICO!!!!!!!!!!!!!
    }
    
    public Propuesta(Categoria c,Proponente prop, String titulo, String descripcion, String lugar, LocalDate fechaPrev, double montoXentrada, double montoNecesario, EnumRetorno posibleRetorno, LocalDate fechaActual) {
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
        this.c = c;

    }
    
    public Propuesta(Categoria c, Proponente prop, String titulo, String descripcion, String lugar, LocalDate fechaPrev, double montoXentrada, double montoNecesario, EnumRetorno posibleRetorno, LocalDate fechaActual, String imagen) {
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
        this.c = c;
        
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
    
    public String getImagen(){
        return this.imagen;
    }
    
    public Estado getEstadoActual(){
        return this.estadoActual;
    }
    
    public Proponente getProponente(){
        return this.miProponente;
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



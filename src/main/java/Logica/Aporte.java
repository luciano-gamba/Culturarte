package Logica;

import java.time.LocalDateTime;

public class Aporte {
    private Propuesta miPropuesta;
    private Colaborador miColaborador;
    private double $aporte;
    private LocalDateTime fechaHora;
    private int cantidad;
    private EnumRetorno retorno;
    
    
  

    public Aporte(Colaborador miColaborador, double $aporte, int cantidad, EnumRetorno retorno) {
            
        this.miColaborador = miColaborador;
        this.$aporte = $aporte;
        this.fechaHora = LocalDateTime.now();
        this.cantidad = cantidad;
        this.retorno = retorno;
    }
    
    public String getTituloNickMiPropuesta(){
        if(this.miPropuesta != null){
            return this.miPropuesta.getTitulo_Nickname();
        }else{
            return null;
        }        
    }
    
    public String getTituloMiPropuesta(){
        if(this.miPropuesta != null){
            return this.miPropuesta.getTitulo();
        }else{
            return null;
        }        
    }
    
    public String getNicknameMiColaborador(){
        if(this.miColaborador != null){
            return this.miColaborador.getNickname();
        }else{
            return null;
        }        
    }
    
    public void desvincular(){
        this.miPropuesta.desvincularAporte(this);
        miColaborador=null;
        miPropuesta=null;
    }
    
    public double get$aporte() {
        return $aporte;
    }

    public void setMiPropuesta(Propuesta miPropuesta) {
        this.miPropuesta = miPropuesta;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public int getCantidad() {
        return cantidad;
    }

    public EnumRetorno getRetorno() {
        return retorno;
    }
    
    public Colaborador getColaborador(){
        return miColaborador;
    }
    public DataPropuesta getPropuesta(){
        return new DataPropuesta(miPropuesta.getAlcanzada() ,miPropuesta.getTitulo(), miPropuesta.getEstadoActual(),miPropuesta.getLugar(),miPropuesta.getProponente().getNickname());
    }
}

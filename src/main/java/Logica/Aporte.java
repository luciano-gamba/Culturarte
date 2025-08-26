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
    
    public String getTituloMiPropuesta(){
        if(this.miPropuesta != null){
            return this.miPropuesta.getTitulo();
        }else{
            return null;
        }        
    }

    public double get$aporte() {
        return $aporte;
    }

    public void setMiPropuesta(Propuesta miPropuesta) {
        this.miPropuesta = miPropuesta;
    }
    
    
}

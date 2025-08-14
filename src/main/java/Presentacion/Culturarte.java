package Presentacion;

import Logica.Fabrica;
import Logica.IControlador;

public class Culturarte {

    public static void main(String[] args) {
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        
        Fabrica fb = new Fabrica();
        IControlador ic = fb.getIControlador();
        
        String ejemplo = ic.saludo();
        System.out.println(ejemplo);
        
    }
}

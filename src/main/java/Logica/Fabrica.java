package Logica;

public class Fabrica {
    
    public IControlador getIControlador(){
        return new Controlador();
    }
}

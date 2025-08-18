package Logica;


import javax.swing.tree.DefaultMutableTreeNode;
import java.util.Enumeration;

public class ArbolCategorias {

    private DefaultMutableTreeNode raiz;
    
    public ArbolCategorias(Categoria categoriaRaiz){
        this.raiz = new DefaultMutableTreeNode(categoriaRaiz);
    }
    
    public DefaultMutableTreeNode getRaiz(){
        return raiz;
    }
    
    public DefaultMutableTreeNode buscar(String nombre){
        Enumeration<?> enumeration = raiz.breadthFirstEnumeration();
        while(enumeration.hasMoreElements()){
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) enumeration.nextElement();
            Categoria cat = (Categoria) nodo.getUserObject();
            if(cat.getNombreCat().equals(nombre)){
                return nodo;
            }
    
        }
        return null;
    }
    
    public void insertar(String nombrePadre,Categoria hijo){
        DefaultMutableTreeNode padre = buscar(nombrePadre);
        if(padre != null){
            padre.add(new DefaultMutableTreeNode(hijo));
        } else{
            System.out.println("No se encontró el padre: " + nombrePadre);
        }
    }
    
}

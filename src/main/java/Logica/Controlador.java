package Logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;


public class Controlador implements IControlador{

    public List<Usuario> misUsuarios = new ArrayList<>();
    public List<Proponente> misProponentes = new ArrayList<>();
    public List<Colaborador> misColaboradores = new ArrayList<>();
    public List<Propuesta> misPropuestas = new ArrayList<>();
    private ArbolCategorias arbolCategorias;
    
    public Controlador() {
        this.arbolCategorias = new ArbolCategorias(new Categoria("Categoria"));
    //La letra dice que la raiz siempre es "Categoria" 
    //probablemente tenga que cambiarlo para evitar repetidos o errores al conectar con la BD
    
    }
    
    @Override
    public int añadirUsuario(String nick, String nombre, String apellido, String correo, LocalDate fecNac, String imagen){
        String nickNuevo = nick;
        String correoNuevo = correo;
        Boolean nickExiste = false;
        Boolean correoExiste = false;
        
        for(Usuario u : misUsuarios){
            if(u.getNickname().equals(nickNuevo)){
                nickExiste = true;
                break;
            }
        }
        
        for(Usuario u : misUsuarios){
            if(u.getEmail().equals(correoNuevo)){
                correoExiste = true;
                break;
            }
        }
        
        if(nickExiste == true || correoExiste == true){
            System.out.println("ERROR: Nickname o Correo existen en el sistema!");
            return 0;
        }else{
            Colaborador colaNuevo = new Colaborador(nick, correo, nombre, apellido, fecNac, imagen);
            misUsuarios.add(colaNuevo);
            misColaboradores.add(colaNuevo);
            return 1;
        }
    }
    
    @Override
    public int añadirUsuario(String nick, String nombre, String apellido, String correo, LocalDate fecNac, String imagen, String direccion, String bio, String sitioWeb){
        String nickNuevo = nick;
        String correoNuevo = correo;
        Boolean nickExiste = false;
        Boolean correoExiste = false;
        
        for(Usuario u : misUsuarios){
            if(u.getNickname().equals(nickNuevo)){
                nickExiste = true;
                break;
            }
        }
        
        for(Usuario u : misUsuarios){
            if(u.getEmail().equals(correoNuevo)){
                correoExiste = true;
                break;
            }
        }
        
        if(nickExiste == true || correoExiste == true){
            System.out.println("ERROR: Nickname o Correo existen en el sistema!");
            return 0;
        }else{
            Proponente propNuevo = new Proponente(direccion, bio, sitioWeb, nick, correo, nombre, apellido, fecNac, imagen);
            misUsuarios.add(propNuevo);
            misProponentes.add(propNuevo);
            return 1;
        }
    }
    @Override
    public int altaCategoria(String nombreCat){
        Categoria nueva = new Categoria(nombreCat);
        
        DefaultMutableTreeNode nuevaCat = arbolCategorias.buscar(nombreCat);
        if(nuevaCat != null){
            return -2;
        }
        arbolCategorias.insertar("Categoria",nueva);
        
        return 0;
    }
    
    @Override
    public int altaCategoria(String nombreCat,String nombrePadreCat){
        Categoria nueva = new Categoria(nombreCat);
        DefaultMutableTreeNode padre = arbolCategorias.buscar(nombrePadreCat);
        if(padre==null){
            return -1;
        }
        DefaultMutableTreeNode nuevaCat = arbolCategorias.buscar(nombreCat);
        if(nuevaCat != null){
            return -2;
        }
        arbolCategorias.insertar(nombrePadreCat,nueva);
            
        return 0;
    }
    
    @Override
    public int altaAporte(String strmiColaborador, String strmiPropuesta,  double $aporte, int cantidad, EnumRetorno retorno){
        
        Propuesta miPropuesta = null;
        Colaborador miColaborador = null;
                
        for (Colaborador c : misColaboradores){
            if(c.getNickname().equals(strmiColaborador)){
                miColaborador = c;
                break;
            }
        }
        
        for (Propuesta p : misPropuestas) {
            if (p.getTitulo_Nickname().equals(strmiPropuesta)) {
                miPropuesta = p;
                break;        
            }
        }
                
        if($aporte > miPropuesta.get$necesaria() || $aporte > miPropuesta.get$necesaria()-miPropuesta.get$alcanzada()){
            return -2;//ERROR: Aporte superior a lo permitido
        }
        
        if (miColaborador.createAporte(miPropuesta.getTitulo(), $aporte, cantidad, retorno) == null) {
            return -3;  //Error: El usuario ya colabora con la Propuesta
        } 
        
        if (miPropuesta.getPosibleRetorno()!=EnumRetorno.AMBOS && miPropuesta.getPosibleRetorno()!=retorno){
            return -4; //Error: Retorno no valido en esta Propuesta
        }
        
        Aporte a = miColaborador.createAporte(miPropuesta.getTitulo(), $aporte, cantidad, retorno);
        miPropuesta.addAporte(a);
        return 0; //PROPUESTA AGREGADA CORRECTAMENTE        
    }
    
    @Override
    public List<String> getUsuarios() {
        List<String> listaNombres = new ArrayList<>();
        String aux;
        for(Usuario u : misUsuarios){
            aux = u.getNickname();
            listaNombres.add(aux);
        }
        return listaNombres;
    }
    
     @Override
    public List<String> getColaboradores() {
        List<String> lista = new ArrayList<>();
        for(Colaborador c : misColaboradores){
            lista.add(c.getNickname());
        }
        return lista;
    }
    
    @Override
    public List<String> getPropuestas_Proponentes() {
        List<String> lista = new ArrayList<>();
        for(Propuesta p : misPropuestas){
            lista.add(p.getTitulo_Nickname());
        }
        return lista;
    }
    public List<String> getUsuariosProponentes() {
        List<String> listaNombres = new ArrayList<>();
        String aux;
        for(Proponente p : misProponentes){
            aux = p.getNickname();
            listaNombres.add(aux);
        }
        return listaNombres;
    }
    public List<String> getUsuariosColaboradores() {
        List<String> listaNombres = new ArrayList<>();
        String aux;
        for(Colaborador c : misColaboradores){
            aux = c.getNickname();
            listaNombres.add(aux);
        }
        return listaNombres;
    }
    
    @Override
    public List<String> getSeguidos(String seguidor) {
        List<String> listaNombres = new ArrayList<>();
        for(Usuario u : this.misUsuarios){
            if(u.getNickname().equals(seguidor)){
                listaNombres = u.getSeguidos();
                break;
            }
        }
        return listaNombres;
    }

    @Override
    public int seguirUsuario(String nick1, String nick2) {
        Usuario seguidor = null;
        Usuario seguir = null;
        for(Usuario u : this.misUsuarios){
            if(u.getNickname().equals(nick1)){
                seguidor = u;
                break;
            }
        }
        
        for(Usuario u : this.misUsuarios){
            if(u.getNickname().equals(nick2)){
                seguir = u;
                break;
            }
        }
        
//        if(seguidor == null){
//            return 0; 
//        }else{
        int resultado = seguidor.seguirUsuario(seguir);
        if (resultado == 0) {
            return 0; //error 0: ya sigue al usuario nick2
        }else{
            return 1;
        }
    }
    
    @Override
    public int dejarSeguirUsuario(String nick1, String nick2){
        Usuario seguidor = null;
        Usuario seguir = null;
        for(Usuario u : this.misUsuarios){
            if(u.getNickname().equals(nick1)){
                seguidor = u;
                break;
            }
        }
        
        for(Usuario u : this.misUsuarios){
            if(u.getNickname().equals(nick2)){
                seguir = u;
                break;
            }
        }
        
        int res = seguidor.dejarDeSeguir(seguir);
        if(res == 1){
            return 1;
        }else{
            return 0;
        }
    }
    
    public int altaPropuesta(String nick, String tipo, String titulo, String descripcion, String lugar, LocalDate fechaPrev, String montoXentrada, String montoNecesario, EnumRetorno posibleRetorno, LocalDate fechaActual){
        
        Proponente prop = null;
        
        boolean encontrado = false;
        for (Proponente p : misProponentes) {
            if (p.getNickname().equalsIgnoreCase(nick)) {
                encontrado = true;
                prop = p;
                //falta poner la propuesta en la lista de propuestas del proponente
                break;
            }
        }
        
        //DEPENDE DE COMO SE HAGA HAY QUE ENCONTRAR SI ESTA TAMBIEN LA CATEGORIA INGRESADA!!!!!!
        if (encontrado) {
            
            Propuesta nuevaProp = new Propuesta(prop, titulo, descripcion, lugar, fechaPrev, Double.parseDouble(montoXentrada), Double.parseDouble(montoNecesario), posibleRetorno, fechaActual);
            misPropuestas.add(nuevaProp);
            
            return 1;
        } else {
            return 0;
        }
        
    }
    
    @Override
    public int altaPropuesta(String nick, String tipo, String titulo, String descripcion, String lugar, LocalDate fechaPrev, String montoXentrada, String montoNecesario, EnumRetorno posibleRetorno, LocalDate fechaActual, String imagen){
        
        Proponente prop = null;
        
        boolean encontrado = false;
        for (Proponente p : misProponentes) {
            if (p.getNickname().equalsIgnoreCase(nick)) {
                encontrado = true;
                prop = p;
                break;
            }
        }
        
        //DEPENDE DE COMO SE HAGA HAY QUE ENCONTRAR SI ESTA TAMBIEN LA CATEGORIA INGRESADA!!!!!!
        if (encontrado) {
            
            Propuesta nuevaProp = new Propuesta(prop, titulo, descripcion, lugar, fechaPrev, Double.parseDouble(montoXentrada), Double.parseDouble(montoNecesario), posibleRetorno, fechaActual, imagen);
            misPropuestas.add(nuevaProp);
            
            return 1;
        } else {
            return 0;
        }
    }
   
    
    @Override
    public int modificarPropuesta(String titulo, String descripcion, String lugar, LocalDate fechaPrev, String montoXentrada, String montoNecesario, String posibleRetorno, String estado, String imagen){
        
        for(Propuesta p : this.misPropuestas){
            if(p.getTitulo().equals(titulo)){
                p.modificarPropuesta(descripcion, lugar, fechaPrev, Double.parseDouble(montoXentrada),Double.parseDouble(montoNecesario), posibleRetorno, estado, imagen);
                return 0;
            }
        }
        return 1; //error 1: no deberia llegar acá
    }

    
    @Override
    public DefaultMutableTreeNode getRaizArbolCat(){ //Con esto accedo a la raiz del arbol de categorias
        //para poder crear el JTree
        return this.arbolCategorias.getRaiz();
    }
    
    @Override
    public List<String> getPropuestas() {
        List<String> listaPropuestas = new ArrayList<>();
        String aux;
        for(Propuesta p : misPropuestas){
            aux = p.getTitulo();
            listaPropuestas.add(aux);
        }
        return listaPropuestas;
    }
    
    @Override
    public DataPropuesta consultaDePropuesta(String titulo){
        
        DataPropuesta DP = null;
        
        boolean encontrado = false;
        for (Propuesta p : misPropuestas) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = true;
                DP = new DataPropuesta(titulo, p.getImagen(), p.getEstadoActual(), p.getProponente(), p.getDescripcion(), p.getLugar(), p.getEntrada(), p.getNecesaria(), p.getFechaARealizar(), p.getRetorno());
                return DP;
            }
        }
        
        return DP;
    }
    
    public DataProponente consultaDeProponente(String NickName){
        
        DataProponente DProp = null;
        
        boolean encontrado = false;
        for (Proponente p : misProponentes) {
            if (p.getNickname().equals(NickName)) {
                encontrado = true;
                DProp = new DataProponente(NickName, p.getNombre(),p.getApellido(),p.getEmail(),p.getFecNac(),p.getImagen(),p.getDireccion(),p.getBiografia(),p.getSitioWeb());
                return DProp;
            }
        }
        
        return DProp;
    }
    
    public DataColaborador consultaDeColaborador(String NickName){
        
        DataColaborador DCola = null;
        
        boolean encontrado = false;
        for (Colaborador c : misColaboradores) {
            if (c.getNickname().equals(NickName)) {
                encontrado = true;
                DCola = new DataColaborador(NickName, c.getNombre(),c.getApellido(),c.getEmail(),c.getFecNac(),c.getImagen());
                return DCola;
            }
        }
        
        return DCola;
    }
    
    public List<String> getEstados(){
    List<String> listaEstados = new ArrayList<>();
    for (EnumEstado e : EnumEstado.values()) {
        listaEstados.add(e.name());
    }
    return listaEstados;
    }
    
    @Override
    public List<String> getPropXEstado(String estado){
        List<String> listaPropuestas = new ArrayList<>();
        String aux;
        for(Propuesta p : misPropuestas){
            aux = p.getTitulo();
            System.out.println(p.getEstadoActual().getEstado().toString());
            System.out.println(estado);
            if(p.getEstadoActual().getEstado().toString().equalsIgnoreCase(estado)){
                listaPropuestas.add(aux);
            }
        }
        return listaPropuestas;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;



public class BaseDatosProductos {
    private HashMap<Integer, Producto> listaProductos = new HashMap<>();

    public BaseDatosProductos() {
        this.listaProductos.put(1, new Producto (1, "Martillo", 3000, 15, "Heredia"));
        this.listaProductos.put(2, new Producto (2, "Cama matrimonial", 70000, 10, "Heredia"));
        this.listaProductos.put(3, new Producto (3, "Sillón", 50000, 14, "Guanacaste"));
        this.listaProductos.put(4, new Producto (4, "Mesa de noche", 20000, 11, "Puntarenas"));
        this.listaProductos.put(5, new Producto (5, "Armario", 40000, 20, "Puntarenas"));
        this.listaProductos.put(6, new Producto (6, "Smart Tv 50p", 120000, 13, "Guanacaste"));
        this.listaProductos.put(7, new Producto (7, "PS 5", 150000, 8, "Heredia"));
        this.listaProductos.put(8, new Producto (8, "Nintendo Switch", 130000, 9, "Heredia"));
        this.listaProductos.put(9, new Producto (9, "Celular", 40000, 20, "Puntarenas"));
        this.listaProductos.put(10, new Producto (10, "Laptop", 100000, 30, "Guanacaste"));
        this.listaProductos.put(11, new Producto (11, "Metado", 30000, 15, "Heredia"));
        this.listaProductos.put(12, new Producto (12, "Taladro", 25000, 16, "Guanacaste"));
        this.listaProductos.put(13, new Producto (13, "Lijadora", 20000, 21, "Heredia"));        
        this.listaProductos.put(14, new Producto (14, "Pulidora", 27000, 17, "Puntarenas"));
        this.listaProductos.put(15, new Producto (15, "Comedor", 35000, 18, "Heredia"));
        
    }
    public List<Producto> getListaProductos (){
    
        return new ArrayList<>(this.listaProductos.values());
  
    }

    public void setListaProductos(HashMap<Integer, Producto> listaProductos){
    
        this.listaProductos = listaProductos; 
    }
    
    public boolean verificarExistencias(Producto producto){
        
        return this.listaProductos.containsKey(producto.getCodigo());
    
    }
    
    public boolean verificarExistecias(String nombre) {
        
        for (Producto p : this.listaProductos.values()) {
            if (nombre.toLowerCase().equals(p.getNombre().toLowerCase())){
            
            }
        }
        return false; 
  
    }
    
    public int ultimoCodigo(){
        
        int codigo = 0;
        for (Producto p : this.listaProductos.values()) {
            codigo = p.getCodigo();  
        }
        return codigo;
    }
    
    public void agregar(Producto p){
        this.listaProductos.put(p.getCodigo(), p);
    }
    
    public void actualizar(Producto p){
        this.listaProductos.replace(p.getCodigo(),p);
    
    }
    public void borrar(Producto p){
        this.listaProductos.remove(p.getCodigo());
    
    }
    
    public String generarInforme(){
        List<Producto> listaM = obtenerMayores();
        return listaM.get(0).getNombre()+" "+listaM.get(1).getNombre()+" "+listaM.get(2).getNombre();
    
    }
    
    private List<Producto> obtenerMayores(){
        List<Producto> lista = new ArrayList<>(this.listaProductos.values());
        List<Producto> listaMayores = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Producto p = new Producto();
            for (Producto pTemporal : lista) {
                if(pTemporal.getPrecio() > p.getPrecio()){
                    p = pTemporal;
                }
                
            }
            listaMayores.add(p);
            lista.remove(p);
        }
        return listaMayores;
    
    }


}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author raimond
 */
public class TableModelProducto  extends AbstractTableModel {
    
    private String[] colunmas = {"Codigo", "Nombre", "Precio", "Inventario", "Ubicacion"};
    private List<Producto> producto = new ArrayList<>();

    public TableModelProducto(List<Producto> prod) {
        this.producto = prod;
    }

    @Override
    public int getRowCount() {
        return this.producto.size();
        
    }

    @Override
    public int getColumnCount() {
        return this.colunmas.length;
        
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Object resp;
        
        switch(columna){
            case 0:
                resp = this.producto.get(fila).getCodigo();
                break;
            case 1:
                resp = this.producto.get(fila).getNombre();
                break;
            case 2:
                resp = this.producto.get(fila).getPrecio();
                break;
            case 3:
                resp = this.producto.get(fila).getInventario();
                break;
            default: 
                resp = this.producto.get(fila).getUbicacion();

        }
        return resp;
    }
    @Override
    public String getColumnName(int colum){
        return this.colunmas[colum];
        
    }
    public void actualizarTabla(){
        fireTableDataChanged();

    }
    public Producto detalle(int fila){
        return this.producto.get(fila);
    
    
    
    }
}

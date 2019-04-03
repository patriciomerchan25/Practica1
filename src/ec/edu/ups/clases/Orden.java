/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Patricio Merchán
 */
public class Orden {
    
    private int codigo;
    private String descripcion;
     private int cantidad;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Orden\n{" + "\ncodigo=" + codigo + "\n descripcion=" + descripcion + "\n cantidad=" + cantidad + '}';
    }
     
       public void agregarOrden(){  //metodo para agragar orden en la clase Orden
        
    }
    
    public void imprimirOrden(){ //metodo para imprimir orden en la clase Orden
    
    }
    
    public void buscarOrden(){//metodo para buscar orden en la clase Orden
        
    } 
    
    
}

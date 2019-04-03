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
public class Producto {
    
    private int codigo;
    private String producto;
    private int cantidad;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Producto\n{" + "\ncodigo=" + codigo + "\nproducto=" + producto + "\n cantidad=" + cantidad + '}';
    }
    
    
       public void agregarProducto(){  //metodo para agragar producto en la clase Producto
        
    }
    
    public void imprimirProducto(){ //metodo para imprimir roducto en la clase Producto
    
    }
    
    public void eliminarProducto(){//metodo para eliminar producto en la clase Producto
        
    }
}

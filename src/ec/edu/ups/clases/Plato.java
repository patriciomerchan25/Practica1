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
public class Plato {
    
     private int codigo;
    private String nombre;
    private double precio;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Plato\n{" + "\ncodigo=" + codigo + "\n nombre=" + nombre + "\n precio=" + precio + '}';
    }

      public void agregarPlato(){  //metodo para agragar plato en la clase Plato
        
    }
    
    public void imprimirPlato(){ //metodo para imprimir plato en la clase Plato
    
    }
    
    public void eliminarPlato(){//metodo para eliminar plato en la clase Plato
        
    }
    
    
}

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
public class Cliente {
    
    private String cedula;
    private String nombre;
    private String celular ; 

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return "\nCliente: \n{" + "cedula=" + cedula + "\n nombre=" + nombre + "\n celular=" + celular + '}';
    }
    
    
    
   
    
    public void agregarCliente(){  //metodo para agragar cliente en la clase Cliente
        
    }
    
    public void imprimirCliete(){ //metodo para imprimir cliente en la clase Cliente
    
    }
    
    public void eliminarCliente(){//metodo para eliminar cliente en la clase Cliente
        
    }
}

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
public class Mesa {
    
    private int codigo;
    private String nombreMesero;
    private String pocicion;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public void setPocicion(String pocicion) {
        this.pocicion = pocicion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public String getPocicion() {
        return pocicion;
    }

    @Override
    public String toString() {
        return "Mesa\n{" + "\ncodigo=" + codigo + "\n nombreMesero=" + nombreMesero + "\n pocicion=" + pocicion + '}';
    }
     
     
       public void agregarMesa(){  //metodo para agragar mesa en la clase Mesa
        
    }
    
    public void imprimirMesa(){ //metodo para imprimir mesa en la clase Mesa
    
    }
    
    public void eliminarMesa(){//metodo para eliminar mesa en la clase Mesa
        
    }
    
    
}

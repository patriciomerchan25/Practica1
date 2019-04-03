/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.uedu.ups.inicio;

import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Mesa;
import ec.edu.ups.clases.Orden;
import ec.edu.ups.clases.Plato;
import ec.edu.ups.clases.Producto;
import java.util.Scanner;

/**
 *
 * @author Patricio Merchán
 * see wmerchanc1@est.ups.edu.ec
 */
public class Main {
    
    public static void main(String[] args) {
       
        Scanner inicio=new Scanner(System.in);
        Scanner tex=new Scanner(System.in);
        Scanner num=new Scanner(System.in);
       
        
        Cliente cliente=new Cliente();
        Mesa mesa=new Mesa();
        Orden orden=new Orden();
        Plato plato=new Plato();
        Producto pro=new Producto();
        
        
        String op;
        do{
            System.out.println("Menu\n Seleccione una Opcion\n");
        
        System.out.println(
        "1-)Cliente\n"
        +"2-)Orden\n"
        +"3-)Mesa\n"
        +"4-)Producto\n"
        +"5-)Plato\n"
        );
        
        int opcion=inicio.nextInt();
      
        switch(opcion){
            
            case 1:
                
                System.out.println("\n Ingresar Datos del Cliente\n");
                System.out.println("ingrese cedula:");
                String cedula=tex.nextLine();
                cliente.setCedula(cedula);
                
                System.out.println("ingrese nombre:");
                String nombre=tex.nextLine();
                cliente.setNombre(nombre);
                
                System.out.println("ingrese celular:");
                String celular=tex.nextLine();
                cliente.setCelular(celular);
                
                System.out.println(cliente); 
                break;
            case 2:
                 System.out.println("\n Ingresar Datos de Mesa \n");
                System.out.println("ingrese codigo:");
                int codigo=num.nextInt();
                mesa.setCodigo(codigo);
                
                System.out.println("ingrese nombre:");
                String nomMesero=tex.nextLine();
                mesa.setNombreMesero(nomMesero);
                
                System.out.println("ingrese celular:");
                String pocicion=tex.nextLine();
                mesa.setPocicion(pocicion);
                
                System.out.println(mesa); 
                
                break;
            case 3:
                 System.out.println("\n Ingresar Datos del Producto\n");
                System.out.println("ingrese cedula:");
                int codigoPro=num.nextInt();
               pro.setCodigo(codigoPro);
                
                System.out.println("ingrese nombre:");
                String producto=tex.nextLine();
                pro.setProducto(producto);
                
                System.out.println("ingrese celular:");
                int cantidad=num.nextInt();
                pro.setCantidad(cantidad);
                
                System.out.println(pro); 
                
                break;    
            case 4:
                System.out.println("\n Ingresar Datos del Orden\n");
                System.out.println("ingrese Codigo:");
                int codigoOrd=num.nextInt();
                orden.setCodigo(codigoOrd);
                
                System.out.println("Que desea Ordenar:");
                String descripcion=tex.nextLine();
                orden.setDescripcion(descripcion);
                
                System.out.println("ingrese Numero de Orden:");
                int cantidadOrden=num.nextInt();
                orden.setCantidad(cantidadOrden);
                
                 System.out.println(orden); 
                
                
                break;
            case 5:
                System.out.println("\n Ingresar Descripcion del Plato\n");
                
                System.out.println("ingrese el codigo :");
                int codigoPla=num.nextInt();
                plato.setCodigo(codigoPla);
                
                System.out.println("Ingrese el nombre del Plato:");
                String nombrePla=tex.nextLine();
                plato.setNombre(nombrePla);
                
                
                
                System.out.println("ingrese el Precio:");
                double precio=num.nextDouble();
                plato.setPrecio(precio);
                
                 System.out.println(plato); 
                
                break;
               }
         System.out.println("\ningrese si para continuar");
    	 System.out.println("ingrese no para salir");
         op=tex.next();
       }while(op.equals("si"));
        
    }
}

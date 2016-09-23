/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package instituto;

import java.util.Scanner;

/**
 *
 * @author Nella
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Persona(String nombre, String apellido, String dni, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
    }

    public Persona() {
    }
   
    public void RegistrarDatos(){
        
  	   	  System.out.println ("=============================");
  	   	  System.out.println ("Nombre: " + this.getNombre());
  	   	  
  	   	  System.out.println (" Apellidos: " + this.getApellido());
  	   	 
                 System.out.println (" DNI: " + this.getDni());
                
                 System.out.println (" Direccion: "+ this.getDni());
                 
                 
        
    }

   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package instituto;

/**
 *
 * @author Nella
 */
public class Alumno extends Persona{
    
    private String n_legajo;
    

    /**
     * @return the n_legajo
     */
    public String getN_legajo() {
        return n_legajo;
    }

    /**
     * @param n_legajo the n_legajo to set
     */
    public void setN_legajo(String n_legajo) {
        this.n_legajo = n_legajo;
    }

    
   

    public Alumno() {
    }

    public Alumno(String n_legajo) {
        this.n_legajo = n_legajo;
        
    }
    
  @Override
    public void RegistrarDatos(){
        
  	   	  System.out.println ("=============================");
  	   	  System.out.println ("Nombre: " + getNombre());
  	   	  
  	   	  System.out.println (" Apellidos: " + getApellido());
  	   	 
                 System.out.println (" DNI: " + getDni());
                
                 System.out.println (" Direccion: "+ getDni());
                 System.out.println (" Legajo: " + this.getN_legajo());
                       
    }
    
}

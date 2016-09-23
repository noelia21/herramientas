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
public class Instituto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona persona = new Persona();
        Alumno alumno = new Alumno();
        
        alumno.setNombre("Noe");
        alumno.setApellido("lopez");
        alumno.setDni("45678");
        alumno.setN_legajo("54656");
        
        alumno.RegistrarDatos();
    }
    
}

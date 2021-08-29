
package Semana12;

import Semana12.Direccion;

public class Estudiante extends Persona {
    private int legajo;
    public int grado; 
    
    public Estudiante(String nombreEstudiante){
        nombre = nombreEstudiante;
    }
    
    public Estudiante(String nombreEstudiante, String apellido1, String apellido2, int valorLegajo){
        super(nombreEstudiante, apellido1, apellido2);
        legajo = valorLegajo;
    }
    
    public Estudiante(String nombreEstudiante, int valorLegajo, int grado){
        legajo = valorLegajo;
        nombre = nombreEstudiante;
        this.grado = grado;
    }
    
    public int getLegajo(){
        return legajo;
    }
    
    public void setLegajo(int valorLegajo){
        legajo = valorLegajo;     
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public void setApellido2(String rodriguez) {
        this.apellido2 = apellido2;
    }

    public String getNombre() {
       return nombre;
    }

    public void setDireccion(Direccion dir) {
        
    }
    
}

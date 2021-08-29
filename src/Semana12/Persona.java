
package Semana12;

import Semana12.Direccion;

public class Persona {
    byte edad;
    float estatura;
    float peso;
    String nombre;
    String apellido1;
    String apellido2;
    Direccion direccion;
    
    
    //***** Comportamientos *******
    public void hablar(){
        System.out.println("hola");
    }

    public void caminar(){
    
    }
    
    //**** Constructores *****
    public Persona(){
        System.out.println("Ejemplo");
    }

    
    public Persona(String nombre, String apellido1, String apellido2) {
        System.out.println("Ejemplo2");
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public Persona(byte edad, float estatura, float peso, String nombre, String apellido1, String apellido2) {
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
        
    
    //****** Gets y Set *******
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        if(nombre==null){
            System.out.println("Nombre invalido");
        }
        else{
            this.nombre = nombre;
        }
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
 
}

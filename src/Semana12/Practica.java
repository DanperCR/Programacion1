
package Semana12;


public class Practica {
    
    public static void main(String[] args) {
        int numero = 0;
        Persona per;
        per = new Persona();
        per.nombre = new String("Juan");
        per.apellido1 = new String("More"); 
        per.direccion = new Direccion("CostaRica","Sanjose");
        per.setDireccion(new Direccion("CR","SJ"));   
        
        per.setNombre("juan");
        Persona per2=null;
        System.out.println("La info del obj per es:" + per);
        System.out.println("la info de la variable numero es"+ numero);
    }
}

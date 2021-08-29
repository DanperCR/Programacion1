
package Examen2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Opcion1 {
      Scanner entrada = new Scanner(System.in);
        int año;
        int cantVehiculos;
        String modelo,estilo,color;
        Float peso;
        String modeloMotor;
        int numSerie;
        
   
       
    public void infoCoche(){
        int año;
        int cantVehiculos;
        String modelo,estilo,color;
        int años;
        Float peso ;
        String modeloMotor ;
        int numSerie;
    
        System.out.println("Digite la cantidad de vehiculos que hay en la fabrica: ");
        cantVehiculos = entrada.nextInt();
        
        
        AutoModelo coches[] = new AutoModelo[cantVehiculos];
        for(int i=0;i<coches.length;i++){
            System.out.println("\nDigite las caracteristicas de coche "+(i+1)+":\n");
         
            
            System.out.print("Digite el Modelo del coche "+(i+1)+":\n");
            modelo = entrada.next();
            System.out.print("Digite el Estilo del coche "+(i+1)+":\n");
            estilo = entrada.next();
            System.out.print("Digite el color del coche "+(i+1)+":\n");
            color = entrada.next();
            System.out.print("Digite el año del coche "+(i+1)+":\n");
            año = entrada.nextInt();
            
//            coches[i] = new AutoModelo(modelo,estilo,color,años);
           
        }
        
        
        Motor coches2[] = new Motor[cantVehiculos];
             for(int j=0;j<coches2.length;j++){
            System.out.println("\nDigite las caracteristicas del Motor del coche "+(j+1)+":\n");
                 System.out.println("Digite el peso del motor"+(j+1)+":\n");
                 peso=entrada.nextFloat();
                 System.out.println("Digite el modelo del motor "+(j+1)+":\n");
                 modeloMotor = entrada.next();
                 System.out.println("Digite el numero de serie del motor"+(j+1)+":\n");
                 numSerie=entrada.nextInt();
//                 coches2[j] = new Motor(peso,modeloMotor,numSerie);
                 

             }

        
    }
    
    public void DatosCoche(){
        System.out.println(modelo+estilo+color+año);
    }
    

}

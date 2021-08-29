
package PrcticaExamen;

import java.util.Scanner;

public class Problema4 {
    int año;
    
    Scanner entrada = new Scanner(System.in);
    
    
    public void EntradAño(){
        System.out.println("Ingrese el año que desea evaluar: ");
        año = entrada.nextInt();
    }
    public void proceso(){
        if((año % 4 == 0) && (año % 100 != 0 || año % 400 ==0 ) ){
            System.out.println(año + " es un año bisiesto");
        }else{
            System.out.println(año +  " no es un año bisiesto ");
        }
            
    }
    public static void main(String[] args) {
        Problema4 Ab = new Problema4();
        Ab.EntradAño();
        Ab.proceso();
        
        
    }
           
    
    
}


package PrcticaExamen;

import java.util.Scanner;

public class problema7 {
    public static void main(String[] args) {
       
        Scanner inicio = new Scanner(System.in);

        
        double resultado;
        int x = 0;
        int y = 0;
        int a=1;
        
        System.out.println("Seleccion el valor de la base \"x\" ");
        x = inicio.nextInt();
        System.out.println("Seleccion el valor del exponente \"y\" ");
        y= inicio.nextInt();
        
         for (int i = 1; i <= y; i++) {
            a *= x;
        }
        System.out.println(a);
        
        
        
       
        
        
       
   
        
        
    }

    
            
}

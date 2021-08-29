
package Proyecto;

import java.util.Scanner;


public class Intercalacionv2 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.print("digite cuantos valores desea tener el arreglo:");
        int cant = entrada.nextInt();
        
        int a[],b[],c[],z[];
        
        a = new int[cant];
        b = new int[cant];
        c = new int[(cant*2)];
        
        
        
        System.out.println("\nDigite el arreglo a: ");
        for(int i=0;i<a.length;i++){
           System.out.print((i+1)+ ". Digite el  valor: ");
           a[i]=entrada.nextInt();
        }
        
        System.out.println("\nDigite el arreglo b: ");
        for(int i=0;i<b.length;i++){
            System.out.print((i+1)+ ". Digite el valor: ");
            b[i] = entrada.nextInt();
        }
        int j=0;
        
        for(int i=0;i<a.length;i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        System.out.print("\n El tercer arreglo es: ");
            for(int i=0;i<c.length;i++){
                System.out.print(c[i]+" ");
            }
            System.out.println();
        
    }
}

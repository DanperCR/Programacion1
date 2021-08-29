
package Proyecto;

import java.util.Scanner;

public class Intercalacionv1 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
       int a[],b[],c[];
       
       a = new int[10];
       b = new int[10];
       c = new int[20];
       
        System.out.println("\nDigite el arreglo a: ");
        for(int i=0;i<a.length;i++){
            System.out.print((i+1)+ " Digite el primer valor: ");
            a[i] = entrada.nextInt();
        }
        System.out.println("\nDigite el arreglo b: ");
        for(int i=0;i<b.length;i++){
            System.out.print((i+1)+ ".  Digite el primer valor: ");
            b[i] = entrada.nextInt();
        }
        
        // iterador i para a y b
        // iterador j para el arreglo c
        int j=0;
        for(int i=0;i<10;i++){
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

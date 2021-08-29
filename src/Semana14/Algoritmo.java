
package Semana14;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Algoritmo {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int arreglo[], NumeroElementos,aux;
        
        
        NumeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Ponga la cantidad de arreglos"));
        arreglo = new int[NumeroElementos];
        
        
        for(int i=0;i<NumeroElementos;i++){
            System.out.println((i+1)+" . Digite algun numero: ");
            arreglo[i] = a.nextInt();
        }
        
        
        
        for(int i=0;i<(NumeroElementos-1);i++){
            for(int j=0; j<(NumeroElementos-1);j++){
                if(arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
 
    }
        System.out.println("\nArreglo ordenado en forma creciente: ");
        for(int i=0;i<NumeroElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("Arreglo ordenado en forma decreciente:");
         for(int i=(NumeroElementos-1);i>=0;i--){
             System.out.println(arreglo[i]+"-");
         }
}
}

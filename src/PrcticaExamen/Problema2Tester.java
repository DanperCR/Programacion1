package PrcticaExamen;

import java.util.Scanner;

public class Problema2Tester {

    public int sumar(int n1, int n2, int n3, int n4) {

        int resultado = 0;
        resultado = n1 + n2 + n3 + n4;
        return resultado;

    }

    public int restar(int n1, int n2, int n3, int n4) {

        int resultado = 0;
        resultado = n1 - n2 - n3 - n4;
        return resultado;

    }

     public int mulriplicar(int n1, int n2, int n3, int n4) {

        int resultado = 0;
        resultado = n1 + n2 + n3 + n4;
        return resultado;

    }
     public int dividir(int n1, int n2, int n3, int n4) {

        int resultado = 0;
        resultado = n1 / n2 / n3 / n4;
        return resultado;
     }
     public double factorial(int n1) {
         double aux = 1;
         for(int i =2; i<= n1; i++){
             aux*= i;
         }
    
         return aux;
     } 
     public float promedio(int n1, int n2, int n3, int n4){
         
    float resultado;
    resultado = n1 + n2 + n3 + n4;
    resultado = resultado / 4;
    
    return resultado;
     }
     public int buscarNumMax(int CantNumeros){
         int resultado = 0;
         String MostrarTexto = "";
         
         Scanner escaner = new Scanner(System.in);
         int numMax = 0;
         
         
         for(int i = 0; i< CantNumeros; i++){
             System.out.println("Por favor dijite un numero: ");
             int num = escaner.nextInt();
             
             if (i == 0){
                 numMax = num;
             } else{
                 if(num > numMax){
                     numMax = num;
                 }
             }
             MostrarTexto += ("|" + num); 
         }
         resultado = numMax;
         System.out.println("MostrarTexto");
         return resultado;
     
         
     }
     
     
   
        
    
    
    
    
    
    }
     

   








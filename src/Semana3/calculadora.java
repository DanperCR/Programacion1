    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

import java.util.Scanner;

/**
 *
 * @author cdrpa
 */
public class calculadora {
  
        
    
    public static float promedio(int a, int b){
    
    float resultado;
    resultado = a + b;
    resultado = resultado / 2;
    
    return resultado; 
    }
    
    public static void main(String[] args){
        int num1;
        int num2;
        float resultado;
        
        for(int i=0; i < args.length ;i++){
        System.out.println(args[i]);
    }
        
        
        Scanner Sett = new Scanner(System.in); 
        System.out.println("Favor digite un numero: ");
        num1 =Sett.nextInt();
        System.out.println("Favir digite otro numero ");
        num2 = Sett.nextInt();
        
        resultado = promedio(num1,num2);
        System.out.println("El resultado es: "+resultado);
        
    }
    
}


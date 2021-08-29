/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

/**
 *
 * @author cdrpa
 */
public class Metodos {
     
   static int iva =100;

    public static int sumar(int num1, int num2){
    
    int resultado;
    resultado = num1 + num2 + iva;
    return resultado;
    
  
    
    }
    public static float sumar(float num1, float num2){
    
    float resultado;
    resultado = num1 + num2 + iva;
    return resultado;
    
    
    
    
    }
     
    public static void main(String[] args){
        
       
        int salarioBase =1231231;
        int bonoVentas = 23434553;
     
        float resultadoParajefe; 
        
        resultadoParajefe = sumar(salarioBase,bonoVentas);
        
        System.out.println(resultadoParajefe);
    }
}

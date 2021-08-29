/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana9;

/**
 *
 * @author cdrpa
 */
public class Repaso {
    double salario =10d; 
    public double calcularImpuesto(int numDependientes, double salario, double taza){
        double retorno = 0.0d;
        retorno = salario * taza;
        retorno = retorno/numDependientes;
                
        return 0;   
    
    }
    public void calcularImpuesto(){
        // System.out.println(salario);
        
    }
     
    

    
}

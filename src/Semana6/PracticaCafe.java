/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana6;

/**
 *
 * @author cdrpa
 */
public class PracticaCafe {
    public static void main(String[] args) {
        int nivelAzucar = 0;
        boolean haycafehecho = false;
        boolean estaDulce = false;
        System.out.println("Quiero cafe");
        
        if(haycafehecho){
            System.out.println("'calenatr cafe");
        
        }
        else{System.out.println("Hacer cafe");
        }
        System.out.println("servir en taza y añadir azucar");
        
        while(!estaDulce){
            System.out.println("añadir azucar");
            nivelAzucar++;
            if(nivelAzucar==10){
                estaDulce=true;
                System.out.println("Tomar cafe");
            }
        }
       
    }
    
}

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
public class EstructuraDeControl {
      public static void main(String[] args){
    
        Scanner Sett = new Scanner(System.in);
        int edad = Sett.nextInt();
        
        if(edad >= 60){
            System.out.println("Es requerida la vacunación");
        }
        else if(edad >= 40){
            System.out.println("Es relativamente la vacunación");
        }
        else{
            System.out.println("No es urgente la inyección");
        }
        
        
    }
    
}

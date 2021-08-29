/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana5;

/**
 *
 * @author cdrpa
 */
public class Compugrama3 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i <n; i ++){
            if(i == 0 || i == (n-1)){
                for(int j=0;j < n; j++){
                System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=0;j < n; j++){
                System.out.print("-");
                }
                System.out.println();
                
            }
                
                
            
        }
    }
    
}

package Proyecto;


import java.util.Scanner;


public class Conversor {
    public void convertir1(double valorDolar, double valorColon) {
        
        
        double valorFinal = valorColon/valorDolar;
        
        valorFinal = (double) Math.round(valorFinal*100d)/100;
        
        System.out.println("****------------------------------****");
        System.out.println("|   El valor en dolares es $"+valorFinal+"Dolares  |");
        System.out.println("****-------------------------------****");
        
    }
    public void convertir2(double valorDolar, double valorEuro) {
        
        
        double valorFinal = valorEuro*valorDolar;
        
        valorFinal = (double) Math.round(valorFinal*100d)/100;
        
        System.out.println("****--------------------------------****");
        System.out.println("|   El valor en dolares es $"+valorFinal+"Dolares  |");
        System.out.println("****---------------------------------****");
        
    }
    
    

            
}

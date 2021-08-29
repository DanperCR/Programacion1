
package Semana5;

import java.util.Scanner;


public class Pizzeria {
    public static void main(String[] args) {
             
        
        int DeseoIngrediente1 = 0;
        int DeseoIngrediente2 = 0;
        int DeseoIngrediente3 = 0;
        int tamano = 0; // predeterminada pequeña
   
        String ingrediente1 = "Jamon";
        String ingrediente2 = "Queso";
        String ingrediente3 = "Hongos";
        
        var precioIngrediente1 = 200;
        var precioIngrediente2 = 400;
        var precioIngrediente3 = 500;
        double MontoTotal = 0.0d;
        
        
      
        
        
        
        Scanner Sett = new Scanner(System.in);
        
     
        System.out.println("Presione \"1\" si lo quiere grande o \"0\" sino lo desea pequena: ");
        tamano = Sett.nextInt();
    
        System.out.println("Presione 1 si quiere o 0 sino lo desea");
        System.out.println("Quiere" + ingrediente1+ "?");
        DeseoIngrediente1 = Sett.nextInt();
        
        System.out.println("Presione 1 si quiere o 0 sino lo desea");
        System.out.println("Quiere" + ingrediente2);
        DeseoIngrediente2 = Sett.nextInt();
        
        System.out.println("Presione 1 si quiere o 0 sino lo desea");
        System.out.println("Quiere" + ingrediente3);
        DeseoIngrediente3 = Sett.nextInt();
        
        
        
        
        
        
        
        if(tamano == 0){
            if(DeseoIngrediente1 == 1){
                MontoTotal = precioIngrediente1 + (precioIngrediente1* 0.10);
            }
            if(DeseoIngrediente2 == 1){
                MontoTotal = precioIngrediente2 +(precioIngrediente2* 0.10);
            }
            if(DeseoIngrediente3 == 1){
                MontoTotal = precioIngrediente3 + (precioIngrediente3* 0.10);
              
            }
           
        }
        else if(tamano == 1){

            if(DeseoIngrediente1 == 1){
                MontoTotal = precioIngrediente1 + (precioIngrediente1* 0.40);
            }
            if(DeseoIngrediente2 == 1){
                MontoTotal = precioIngrediente2  +(precioIngrediente2 * 0.40);
            }
            if(DeseoIngrediente3 == 1){
                MontoTotal = precioIngrediente3  + (precioIngrediente3 * 0.40);
            }
            
            
        
    }
   
        
        
       Factura(MontoTotal,DeseoIngrediente1,DeseoIngrediente2,DeseoIngrediente3,tamano,ingrediente1,ingrediente2,ingrediente3); 
     }
       
    
    
   
    
    public static void Factura(
            double MontoTotal,
            int DeseoIngrediente1, 
            int DeseoIngrediente2, 
            int DeseoIngrediente3, 
            int tamano, 
            String ingrediente1,
            String ingrediente2,
            String ingrediente3){
    
  
        
       
            System.out.println("Su monto total es de: " + MontoTotal );
            if(DeseoIngrediente1 == 1){
                System.out.println(ingrediente1);
            }
            if(DeseoIngrediente2 == 1){
                System.out.println(ingrediente2);
            }
            if(DeseoIngrediente3 == 1){
                System.out.println(ingrediente3);
            }
            
            
            
            if(tamano == 0){
                System.out.println("el tamaño elegido es pequeña ");
            
            }
            else{
                 System.out.println("el tamaño elegido es grande ");

            }
                    
    
    }
}

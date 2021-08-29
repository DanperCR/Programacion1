
package Examen2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Autovista   {
    private int menu;
    Opcion1 q = new Opcion1();
  
    

Scanner entrada = new Scanner(System.in);

    public int Menu(){
        
        while(true){
            int opcion;
             
            System.out.println("Ingrese la opcion que desea:"
                +"\n1.Agregar un vehiculo fabricado en el sistema"
                +"\n2.Mostrar lista de vehiculos que se vendieron con la informacion del motor"
                +"\n3.Mostrar lista de vehiculos devueltos con la informacion del motor"
                +"\n4.Mostrar lista de vehiculos en bodega e informacion del motor"
                +"\n5.imprimir informacion vehiculos"
                +"\n6.salir");
            opcion = entrada.nextInt();
         
         if(opcion == 6){
             System.out.println("Se termino el proceso");
             break;
         }
         else{
            switch(opcion){
        case 1: {
           q.infoCoche();
            break;
        }
        case 2:{
            
            break;
        }
        case 3:{
            
            break;
        }
        case 4:{
          
            

      break;
    }
        case 5 : {
        
        
        break;
        }
        
    
       
        
      
}
             
         }

    
}

        
     
    
 return  menu;
}

}

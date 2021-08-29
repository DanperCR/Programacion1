
package Semana4;


public class PracticaDeClase {
    
   public String DiasEspera(short numfactores){
       String resultado;
       
       
       
       if(numfactores == 1){
           resultado = "1 semana";
      
       }
       else if(numfactores == 2){
           resultado = "3 dias";
       }
       else{
           resultado = "dia siguiente";
       }
          
       return resultado;
       
   } 
   
   

    
}

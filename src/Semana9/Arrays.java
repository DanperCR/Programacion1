
package Semana9;



public class Arrays {
    int[] array = new int[10];
    
    public void llenarArreglo(){
        for(int i = 0; i <= array.length -1; i++) {
            array[i] = generarNumerorandom();
        }
      
}
 
public int generarNumerorandom(){
    return (int) (Math.random() *25) + 1;
}
 
public int sumaArreglo(){
    int sumatoria = 0;
    for (int i =0; i <= array.length-1; i++){
        sumatoria = sumatoria + array[i];
    }
    return sumatoria;
}


 public String imprimirArreglo(){
     String imprimir = "Datos Del Arreglo \n ";
     for(int i=0; i <= array.length -1; i++){
         imprimir += "Posicion:" + i + ":" + array[i] + "\n";
 }
 imprimir += "Datos de la Sumatoria \n"
              + sumaArreglo();
              
 return imprimir;
 }


 
    public static void main(String[] args) {
        
    }















    
    
}

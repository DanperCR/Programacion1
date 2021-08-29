
package Semana5;


public class Compugrama {
    public static void main(String[] args) {
        int n =5;
        
        
        for(int i = 0; i <n; i ++){
            System.out.print("*");
        }
        System.out.println();
        
        for(int i=0;i<(n-1);i++){
            if(i <(n -2))
                System.out.println("*");
            else
                System.out.print("*");
                
        }
        for(int i = 0; i <(n-1); i ++){
            System.out.print("*");
        }

    
    }
    
}



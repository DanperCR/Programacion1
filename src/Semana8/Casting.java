 //
package Semana8;

public class Casting {
    public static void main(String[] args) {
        int a = 128;
        short b = 0;
        System.out.println("valor a =" + a);
        System.out.println("b = " + b);
        a = b;
        b = (short)a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
    
}

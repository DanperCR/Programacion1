package ProyectoP6;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SistemaNotasInterfaz {

    int modo = 0;
    int ModoInteractivo;
    int ModoGrafico;
    Scanner entrada = new Scanner(System.in);
    Alumno obj1 = new Alumno();
    Examen obj2 = new Examen();
    
    
public void modos(){
    int op;
    
    while(true){
        System.out.println("Seleccione la opcion de preferencia");
        System.out.println("1.Modo Grafico");
        System.out.println("2.Modo Interactivo");
        System.out.println("3.Salir");
        
        op = entrada.nextInt();
        
        switch(op){
            case 1:{
                
         

        obj1.setNombre(JOptionPane.showInputDialog("Digite el nombre del Estudiante: "));
        obj1.setApellido1(JOptionPane.showInputDialog("Digite el primer apellido del Estudiante: "));
        obj1.setApellido2(JOptionPane.showInputDialog("Digite el segundo apellido del Estudiante: "));
        obj1.setGrado(Integer.parseInt(JOptionPane.showInputDialog("Digite el grado del estudiante: ")));
        
        
         
        obj2.setNota(Integer.parseInt(JOptionPane.showInputDialog("Digite la Nota del Estudiante: ")));
        obj2.setNombreMateria(JOptionPane.showInputDialog("Digite el nombre de la materia: "));
        obj2.setPuntosTotal(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad total de puntos: ")));
        obj2.setPuntosObtenidos(Integer.parseInt(JOptionPane.showInputDialog("Digite los puntos obtenidos: ")));
        
        break;

                
                
                
            }
            case 2:{
                
                System.out.println("Digite el nombre del Estudiante:");
                obj1.setNombre(entrada.next());
                System.out.println("Digite el primer apellido del Estudiante:");
                obj1.setApellido1(entrada.next()); 
                System.out.println("Digite el segundo apellido del Estudiante:");
                obj1.setApellido2(entrada.next());
                System.out.println("Digite el grado del estudiante:");
                obj1.setGrado(entrada.nextInt());
                
                
                
                
                
                System.out.println("Digite la Nota del Estudiante");
                obj2.setNota(entrada.nextInt());
                System.out.println("Digite el nombre de la materia:");
                obj2.setNombreMateria(entrada.next());
                System.out.println("Digite la cantidad total de puntos:");
                obj2.setPuntosTotal(entrada.nextInt());
                System.out.println("Digite los puntos obtenidos:");
                obj2.setPuntosObtenidos(entrada.nextInt());
                
            }
            
            
        }
    }
    
    
}
    
    
 

    
    
    
    
    
    
   
    
    
}




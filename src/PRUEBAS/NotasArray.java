
package PRUEBAS;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NotasArray {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String [] alumnos = new String[3];
        int [] notas = new int[3];
        
        for(int i=0;i<3;i++){
            System.out.println("Introduce un nombre: ");
            alumnos[i]= teclado.nextLine();
            
            System.out.println("Introduce una nota: ");
            notas[i]=teclado.nextInt();
            teclado.nextLine();
            
        }
        
        for(int i=0;i<3;i++){
            System.out.println(alumnos[i]+" = "+notas[i]);
        }

        
    }  
}

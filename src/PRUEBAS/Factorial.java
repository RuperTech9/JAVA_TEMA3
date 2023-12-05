
package PRUEBAS;

import java.util.Scanner;

/**
 *
 * @author alumno
 */


public class Factorial {
    public static int factorial(int num){ 
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;      
        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();
        System.out.println("Factorial: "+factorial(num));
    }
}

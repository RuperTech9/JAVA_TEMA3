package Examen1;


import java.util.Scanner;


/**
 *
 * @author Ruper
 */
public class Fibonnacci {
    static int fibo1 = 4;
    static int fibo2 = 0;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, i;
        
        do{
            System.out.print("Introduce un numero: ");
            numero = teclado.nextInt();
        }while(numero<=1);
        
        System.out.println("Los "+numero+ " primeros números de la serie Fibonacci");
    
        System.out.print(fibo1 + " ");
        for(i=2; i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println("");
        
    }
    
}

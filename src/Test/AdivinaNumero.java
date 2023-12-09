
package Test;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class AdivinaNumero {
    public static void main(String[] args) {
        int numeroParaAdivinar = (int) (Math.random()*100) + 1; // Número entre 1 y 100
        Scanner teclado = new Scanner(System.in);
        int intento;
        System.out.println("He escogido un número entre 1 y 100. ¡Intenta adivinarlo!");

        do {
            System.out.print("Introduce un número: ");
            intento = teclado.nextInt();

            if (intento < numeroParaAdivinar) {
                System.out.println("El número es mayor que " + intento + ".");
            } else if (intento > numeroParaAdivinar) {
                System.out.println("El número es menor que " + intento + ".");
            }
        } while (intento != numeroParaAdivinar);

        System.out.println("¡Correcto! El número era " + numeroParaAdivinar);

    }
}



package OrdenacionAlgoritmos;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Ruper
 */
public class Quicksort {

    public static void main(String[] args) {
        // Declaración de variables
        int[] numeros = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};
        int longitud = numeros.length;
        String[] nombres = {"Juan", "Pepe", "Sara", "Elena", "Ana", "Felipe"};
        Integer[] numeros2 = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};

        // Ordenar forma ascendente array de enteros
        System.out.println("Array inicial:");
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros); // forma ascendente
        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(numeros));

        // Ordenar forma ascendente array de nombres
        System.out.println("Array de nombres:");
        System.out.println(Arrays.toString(nombres));
        Arrays.sort(nombres); // forma ascendente
        System.out.println("Nombres ordenados:");
        System.out.println(Arrays.toString(nombres));

        // Ordenar los arrays de forma descendente
        // Arrays.sort(numeros2, Collections.reverseOrder()); // solo funciona con caracteres
        System.out.println("Arrays de números:");
        System.out.println(Arrays.toString(numeros2));
        Arrays.sort(numeros2, Collections.reverseOrder());
        System.out.println("Números ordenados de forma descendente:");
        System.out.println(Arrays.toString(numeros2));
    }
}
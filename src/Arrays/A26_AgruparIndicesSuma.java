package Arrays;
/* Escribe la función
 * int[] suma(int t[], int numElementos)
 * que crea y devuelve una tabla con las sumas de los numElementos elementos consecutivos de t.*/

import java.util.Arrays;
import java.util.Scanner;

public class A26_AgruparIndicesSuma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//CREAMOS TABLA DE 10 ELEMENTOS
		int[] tabla = {15, 5, 8, 3, 2, 10, 8, 10, 12, 1};
		
		//MOSTRAMOS LOS ELEMENTOS DE LA TABLA
		System.out.println("Tabla: " + Arrays.toString(tabla));
		
		//INDICAMOS CUANTOS ELEMENTOS CONSECUTIVOS QUEREMOS SUMAR
		System.out.println("La tabla tiene 10 indices ¿en cuantos los quiere agrupar?: ");
		int numElementos = sc.nextInt();
		
		//LLAMAMOS A LA FUNCIÓN
		suma(tabla,numElementos);
		sc.close();
	}
		
	static int[] suma(int tabla[], int numElementos) {
		
		//CREAMOS TABLA VACÍA
		int[] n = new int[0];
		
		for (int i = 0; i < tabla.length-numElementos +1; i++) {
			int sumaTotal = 0;
			
			for (int j = 0; j < numElementos; j++) {
				sumaTotal += tabla[i+j];
			}
			
			n = Arrays.copyOf(n, n.length+1);
			n[n.length-1] = sumaTotal;
		}
		
		System.out.println(Arrays.toString(n));
		return tabla;
	}

}

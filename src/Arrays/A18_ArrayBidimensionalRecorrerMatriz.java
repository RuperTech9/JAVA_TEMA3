package Arrays;

import java.util.Scanner;

public class A18_ArrayBidimensionalRecorrerMatriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int datos [][];	//Declaramos "datos" como una tabla bidimensional.
		datos = new int [5][5];	//Tabla de 5x5.
		
		for (int i=0; i<5; i++) { //eje X.
			for (int j=0; j<5; j++) { //eje Y.
				datos [i][j] = 10*i + j;
				
			}
		}
		for (int fila[]:datos) {			//mostramos recorriendo nosotros la matriz.
			for (int columna: fila) {
				System.out.println(columna + " ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}
	
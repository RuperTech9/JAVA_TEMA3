package Arrays;
/* Escribe un programa que solicite los elementos de una matriz de 4 x 4. La aplicación debe decidir si la matriz introducida corresponde a una matriz mágica.
 * Se dice que una matriz o un cuadrado es mágico cuando la suma de los elementos de cualquier fila o cualquier columna vale lo mismo.*/


import java.util.Arrays;
import java.util.Scanner;

public class A27_MatrizMagicaSumaColumnasSumaFilas {

	public static void main(String[] args) {
		//MATRIZ 4x4
		int matriz[][]=new int[4][4];
		
		//TABLA para la suma de las COLUMNAS
		int sumaColumnas[] = new int[matriz.length];
		//TABLA para la suma de las FILAS
		int sumaFilas [] = new int[matriz.length];
		

		Scanner sc = new Scanner (System.in);
		System.out.println("Escribir datos de la matriz ");
			//Para introducir los datos en la matriz bidimensional recorremos con 2 for (i),(j) y asignamos valores
		    for (int i=0;i<=3;i++){
		        for (int j=0;j<=3;j++){
		            System.out.print("Escribir valor " + i + " , " + j + " : ");
		            matriz [i][j] = sc.nextInt();
		        }
		    }
		    //Para leer los datos introducidos recorremos con un for y mostramos
		    for (int k = 0 ; k < matriz.length ; k++) {
		    	System.out.println(Arrays.toString(matriz[k]));
		    }
		    for (int l = 0 ; l < matriz.length ; l++) {
		    	for (int k = 0 ; k < matriz.length ; k++) {
		    		sumaColumnas[l] += matriz[k][l];
		    		sumaFilas [k] += matriz[k][l];
		    	}
		    }
		   
	        if (Arrays.equals(sumaColumnas, sumaFilas)) 
	            System.out.println("ES UNA MATRIZ MÁGICA"); 
	        else
	            System.out.println("NO ES UNA MATRIZ MÁGICA"); 
	  
		    System.out.println("Resultado suma de las columnas = "+ Arrays.toString(sumaColumnas));
		    System.out.println("Resultado suma de las filas = "+ Arrays.toString(sumaFilas));
		    sc.close();
	}
}


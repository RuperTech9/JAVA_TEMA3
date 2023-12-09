package Arrays;
/*
 * En un juego de rol el mapa puede implementarse como una matriz donde las filas y las columnas
 * representan lugares (lugar 0, lugar 1, lugar 2, etc.) que estarán conectados.
 * Si desde el lugar X podemos ir hacia el lugar Y, entonces la matriz en la posición [x][y] valdrá
 * verdadero; en caso contrario valdrá falso.
 * Escribe una función que, dada una matriz que representa el mapa y dos lugares, indique si es posible
 * viajar desde el primer lugar al segundo (directamente o pasando por lugares intermedios).
 */

public class A25_MapaDosLugares {

	public static void main(String[] args) {
		int [][] matriz=new int [4][4];

		matriz [0][0]= 15;
		matriz [0][1]= 16;
		matriz [0][2]= 17;
		matriz [0][3]= 18;
		
		matriz [1][0]= 20;
		matriz [1][1]= 36;
		matriz [1][2]= 88;
		matriz [1][3]= 9;
		
		matriz [2][0]= 25;
		matriz [2][1]= 75;
		matriz [2][2]= 16;
		matriz [2][3]= 2;
		
		matriz [3][0]= 42;
		matriz [3][1]= 1;
		matriz [3][2]= 4;
		matriz [3][3]= 6;
		
		
		for (int i = 0; i<4; i++) {
			System.out.println();
			for (int j = 0; j<4; j++) {
				
				boolean resultado;
				if (i == j) {
					resultado = true;
				} else {
					resultado = false;
				}
				
					
				System.out.print(" | " + matriz[i][j]+ " " + resultado +" | ");
			}
				
		}			
	}
	
}
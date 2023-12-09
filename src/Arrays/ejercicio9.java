package Arrays;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		int[] miTabla = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] suma = (miTabla);
		
		System.out.println("desordenar");
		for (int i = 0; i < miTabla.length; i++) {
			System.out.println(miTabla[i]);
		}
    }	
		
	public static int [] suma(int t[], int numElementos){
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica la longitud de la tabla: ");
		numElementos = sc.nextInt();
		int []num = new int[numElementos];
		int index = 0;    
		for(int i=0; i <= numElementos-1 ;i++){
		    num[index++] = i;
		    System.out.println(i);
		}
		
		return num;
	}	
		
		

	
	
}

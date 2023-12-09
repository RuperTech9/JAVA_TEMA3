package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class A13_ParesImparesArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int numero=0;
		int pares[]=new int[0];
		int impares[]=new int[0];
		
		System.out.println("Introducir el tamaño de la tabla: ");
		n = sc.nextInt();

		for(int i=0; i<n; i++) {
			System.out.println("Introduce un número");
			numero = sc.nextInt();
			if (numero%2==0) {
				pares = Arrays.copyOf(pares, pares.length+1);
				pares[pares.length-1]=numero;
				Arrays.sort(pares);
			}else {
				impares=Arrays.copyOf(impares, impares.length+1);
				impares[impares.length-1]=numero;
				Arrays.sort(impares);
			}
		}
		System.out.println("Pares: " + Arrays.toString(pares));
		System.out.println("Impares: " + Arrays.toString(impares));
		sc.close();
	}
}

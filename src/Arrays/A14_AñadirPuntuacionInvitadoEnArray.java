package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class A14_AñadirPuntuacionInvitadoEnArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int puntuacionProgramador=0;
		int puntuaciones[]= new int[0];
		int puntuacionInvitado=0;
		for(int i=0; i<5; i++) {
			System.out.println("Introduce la puntuación: ");
			puntuacionProgramador = sc.nextInt();
			int indiceInsercion = Arrays.binarySearch(puntuaciones, puntuacionProgramador);
			if (indiceInsercion < 0){
				indiceInsercion = -indiceInsercion - 1;
			}
			int copia[] = new int[puntuaciones.length + 1];
			System.arraycopy(puntuaciones, 0, copia, 0, indiceInsercion);
			System.arraycopy(puntuaciones, indiceInsercion, copia, indiceInsercion + 1, puntuaciones.length - indiceInsercion);
			copia[indiceInsercion] = puntuacionProgramador;
			puntuaciones=null;
			puntuaciones=copia;
		}
		System.out.println(Arrays.toString(puntuaciones));
		do {
			System.out.println("Introduce la puntuación del invitado: ");
			puntuacionInvitado=sc.nextInt();
			if (puntuacionInvitado <0) 
				break;
			int indiceInsercion = Arrays.binarySearch(puntuaciones, puntuacionInvitado);
			if (indiceInsercion < 0){
				indiceInsercion = -indiceInsercion - 1;
			}
			int copia2[] = new int[puntuaciones.length + 1];
			System.arraycopy(puntuaciones, 0, copia2, 0, indiceInsercion);
			System.arraycopy(puntuaciones, indiceInsercion, copia2, indiceInsercion + 1, puntuaciones.length - indiceInsercion);
			copia2[indiceInsercion] = puntuacionInvitado;
			puntuaciones=null;
			puntuaciones=copia2;
		}while(puntuacionInvitado>=0);
		
		System.out.println(Arrays.toString(puntuaciones));
		sc.close();
	}
}

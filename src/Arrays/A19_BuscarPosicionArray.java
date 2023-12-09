package Arrays;
/*
 * Escribe la función	int[] buscarTodos(int t[], int clave)
 * que crea y devuelve una tabla con todos los índices de los elementos donde se encuentra la clave de búsqueda. 
 * En el caso de que la clave no se encuentre en la tabla t, la función devolverá una tabla vacía.
 */

import java.util.Arrays;
import java.util.Scanner;

public class A19_BuscarPosicionArray {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] tabla = new int[10];
		int pos, i;
		
		for (i=0;i<10;i++){
			System.out.print("Posición ("+(i+1)+"): ");
			tabla[i]=sc.nextInt();
		}
		
		System.out.println("Introduzca el número a buscar entre 1 y 10: ");
		pos = sc.nextInt();
		
		System.out.println("El número se encuentra en la posición: " + buscarTodos(tabla,pos));
		sc.close();
	}
	
	static int buscarTodos(int t[], int clave) {
		int tabla[]=Arrays.copyOf(t, clave);
		for (int i=0;i<tabla.length;i++) {
		
			
		}
		System.out.println(Arrays.toString(tabla));
		
		int indiceBusqueda=0; //indice que usamos para recorrer la tabla
		
		while (indiceBusqueda < t.length &&  t[indiceBusqueda] != clave)
		{ 
			indiceBusqueda++;
		}
		if (indiceBusqueda < t.length){
			//claveBusqueda está en la posición indiceBusqueda
		} else { //indiceBusqueda se ha salido del rango
			indiceBusqueda=-1; // no encontrado
		}	
		return indiceBusqueda;
	}
	

}
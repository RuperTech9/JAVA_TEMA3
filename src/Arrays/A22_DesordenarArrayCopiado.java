package Arrays;
/*
 * Modifica la función del ejercicio 2.- para que no modifique la tabla que se le pasa como
 * parámetro y, en su lugar, cree y devuelva una copia de la tabla donde se han desordenado los valores
 * de los elementos.
 */

	import java.util.Arrays;
	import java.util.Random;
	 
public class A22_DesordenarArrayCopiado {
	 
	public static void main(String[] args) {
	 
	    int[] miTabla = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    desordenar(miTabla);
	    int[] copiaTabla = Arrays.copyOf(miTabla, miTabla.length);
			
		System.out.println("Tabla copiada desordenada");
		for (int i = 0; i < miTabla.length; i++) {
			System.out.println(copiaTabla[i]);
		}
	}
	       
	    
	private static void desordenar(int t[]){

		int indice, temp;
	    Random random = new Random();
	    for (int i = t.length - 1; i > 0; i--)
	    {
	    	indice = random.nextInt(i + 1);
	    	temp = t[indice];
	    	t[indice] = t[i];
	    	t[i] = temp;
	    }
	}
}

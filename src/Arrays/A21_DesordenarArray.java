package Arrays;
/*
 * Escribe la función:	void desordenar(int t[])
 * que cambia de forma aleatoria los elementos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo.
 */

import java.util.Random;
 
public class A21_DesordenarArray {
 
    public static void main(String[] args) {
 
    	int[] miTabla = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		desordenar(miTabla);
		
		System.out.println("desordenar");
		for (int i = 0; i < miTabla.length; i++) {
			System.out.println(miTabla[i]);
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

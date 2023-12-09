package Arrays;
/*
 * El Ayuntamiento de tu localidad te ha encargado una aplicación para realizar encuestas con el
 * fin de evaluar el nivel económico de los habitantes. Para ello tendrás que preguntar el sueldo a cada
 * persona encuestada. A priori, no conoces el número de encuestados. Para finalizar la entrada de
 * datos, introduce un sueldo con valor -1.
 * Una vez terminada la entrada de datos, muestra la siguiente información:
 * • Todos los sueldos introducidos, ordenados de forma decreciente.
 * • El sueldo máximo y el mínimo.
 * • La media de los sueldos.
 */

import java.util.Scanner;

public class A23_SueldosMaximoMinimo {		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el numero de personas que vas a encuestar: ");
			int numPersonas = sc.nextInt();
			
			double sueldoPersona=0;
			double sumaSueldos=0;
			
			int t[] = new int[numPersonas];
			
			
			int maximo = t[0]; // Declaramos e inicializamos el máximo.
			int minimo = t[0]; // Declaramos e inicializamos el máximo.
			
			
			for(int i=0; i<t.length; i++) { 		//getLength() método para obtener la longitud de la array especificada.
				System.out.println("Introduce Sueldo " +i);
				t[i]= sc.nextInt();
				
				if (maximo < t[i])
					maximo = t[i];
				if (minimo > t[i])
					minimo = t[i];
				sueldoPersona++;
				sumaSueldos = sumaSueldos+t[i];		
			}
			
			burbuja(t);		//función burbuja "ordenados de forma decreciente"
			System.out.println("Los sueldos introducidos son: ");
			for (int i = 0; i < t.length; i++) {
				System.out.println(t[i]);
			}
			
			System.out.println("\nEl sueldo máximo es " + maximo);
			System.out.println("El sueldo mínimo es " + minimo);
			System.out.println("La nota media de los sueldos es: "+(sumaSueldos/sueldoPersona));
			sc.close();
			                                                                               
		}	
		
		public static void burbuja(int indices[]) { 		//se llama burbuja porque los mas pequeños van subiendo
			int cuentaintercambios = 0;
															//usamos un bucle anidado, saldra cuando esté ordenado el array
			for (boolean ordenado = false; !ordenado;) { 	//mientras no este ordenado no salgas de aqui
				
				for(int i=0; i < indices.length -1; i++) { 	//cogemos desde 0 hasta el "-1"(Porque, como estoy cogiendo el primero y el siguiente cuando llegue al último cogería el siguiente y daría ERROR)
					if (indices[i] < indices[i+1]) { 		//en  caso de que sea mayor
						int variableauxiliar = indices[i];
						indices[i]= indices[i+1];
						indices[i+1] = variableauxiliar;
						
						cuentaintercambios++;
					}
				}
				
				if (cuentaintercambios == 0) {
					ordenado = true;
				}
				
				cuentaintercambios = 0;
				
			}
			
		}
}
	
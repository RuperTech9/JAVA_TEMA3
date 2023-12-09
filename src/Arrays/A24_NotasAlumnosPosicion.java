package Arrays;
/*Desarrolla una aplicación que ayude a gestionar las notas de un centro educativo. Los alumnos
 *se organizan en grupos compuestos por 5 personas. Leer las notas (números enteros) del primer,
 *segundo y tercer trimestre de un grupo. Debes mostrar al final la nota media del grupo en cada
 *trimestre y la media del alumno que se encuentra en una posición dada (que el usuario introduce por
 *teclado).*/


import java.util.Scanner;

public class A24_NotasAlumnosPosicion {
	
	public static void main(String[] args) {
		
		int primer[]= new int [5];	//notas del primer trimestre
		int segundo []= new int [5];//notas del segundo trimestre
		int tercer[]= new int [5];  //notas del tercer trimestre
		int pos;
		int suma_primer = 0;
		int suma_segundo = 0;
		int suma_tercer = 0;
		double media_alumno;

		
		Scanner sc = new Scanner(System.in);
		// leemos las notas del primer trimestre
		System.out.println("Notas de primer trimestre:");
		for (int i=0;i<5;i++){
			System.out.print("Alumno ("+(i+1)+"): ");
			primer[i]=sc.nextInt();
		}
		
		// leemos las notas del segundo trimestre
		System.out.println("\nNotas del segundo trimestre:");
		for (int i=0;i<5;i++){
			System.out.print("Alumno ("+(i+1)+"): ");
			segundo[i]=sc.nextInt();
		}
		
		// leemos las notas del tercer trimestre
		System.out.println("\nNotas del tercer trimestre:");
		for (int i=0;i<5;i++){
			System.out.print("Alumno ("+(i+1)+"): ");
			tercer[i]= sc.nextInt();
		}
		
		
		for (int i =0; i < 5; i++){
			suma_primer += primer[i];
			suma_segundo += segundo[i];
			suma_tercer += tercer[i];
		}
		
		// mostramos datos
		System.out.println("\nMedia primer trimestre: "+ suma_primer/5.0);
		System.out.println("Media segundo trimestre: "+ suma_segundo/5.0);
		System.out.println("Media tercer trimestre: "+ suma_tercer/5.0);
		// leemos la posición del alumnos que nos interesa
		// una posible mejora es comprobar que el índice se encuentre
		// entre 0 y 4
		System.out.print ("\nIntroduzca posición del alumno (de 0 a 4): ");
		pos = sc.nextInt();
		// la media del alumno es la suma de sus notas entre 3
		media_alumno = (double) (primer[pos]+segundo[pos]+tercer[pos])/3;
		System.out.println("La media del alumno es: " + media_alumno);
		sc.close();
	}
}
package Arrays;

import java.util.Arrays;

public class A15_EliminarMayoresEnArray {
	
	public static void main(String[] args) {
		int r[]= {33, 20, 25, 12, 38, 4};
		int s[]= eliminarMayores(r,20);
		System.out.println(Arrays.toString(s));
	}
	static int[] eliminarMayores(int t[], int valor) {
		int sinMayores[]= Arrays.copyOf(t, t.length);
		
		for(int i=0; i<sinMayores.length;i++) {
			if(sinMayores[i]>=valor) {
				sinMayores[i] = sinMayores[sinMayores.length - 1];
				sinMayores = Arrays.copyOf(sinMayores, sinMayores.length - 1);
				i--;
			}
		}
		return sinMayores;
	}
}

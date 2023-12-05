
package PRUEBAS;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TablaMultiplicar {
    
    public static int MultiplicarWhile(int num){
        int contador =0;
        int resultado=0;
        while(contador<=10){
            resultado = contador*num;            
            System.out.println(contador+"*"+num+" = "+resultado);
            contador++;
        }
        return resultado;
    }
    
    public static int MultiplicarDoWhile(int num){
        int contador =0;
        int resultado=0;
        do{
            resultado = contador*num;            
            System.out.println(contador+"*"+num+" = "+resultado);
            contador++;
        }while(contador<=10);
        return resultado;
    }
    
    public static int MultiplicarFor(int num){
        int resultado=0;
        for(int i = 0;i<=10;i++){
            resultado=num*i;
            System.out.println(num+"*"+i+" = "+resultado);
        }
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();
        
        System.out.println("\nWHILE");
        MultiplicarWhile(num);
        
        System.out.println("\nDO_WHILE");
        MultiplicarDoWhile(num);
        
        System.out.println("\nFOR");
        MultiplicarFor(num);
              
    }
    
}

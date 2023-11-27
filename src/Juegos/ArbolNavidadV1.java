
package Juegos;

import java.util.Scanner;

/**
 * Crear una aplicación capaz de crearte un árbol de navidad por pantalla, 
 * donde el usuario indicará el símbolo a rellenar y los datos necesarios para su impresión:
 * Altura de la copa
 * Símbolo de relleno
 *
 * @author Ruper
 */
public class ArbolNavidadV1 {

    public static void main(String[] args) {
        int altura;
        String simbolo;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura de la copa del árbol: ");
        altura = teclado.nextInt();
        System.out.println("Introduce el carácter de relleno: ");
        simbolo = teclado.next();
        System.out.println("");
        arbolNavidad(simbolo, altura);
    }// FIN MAIN

    
    /**
     * Imprime una figura centrada en un ancho de pantalla dado.
     * @param figura La figura (cadena de caracteres) a centrar.
     * @param anchoPantalla El ancho de la pantalla donde se centra la figura.
     */
    private static void centrarFigura(String figura, int anchoPantalla) {
        int espaciosDelante = (anchoPantalla - figura.length()) / 2;
        for (int i = 0; i < espaciosDelante; i++) {
            System.out.print(" ");
        }
        System.out.println(figura);
    }

    /**
     * Dibuja un árbol de Navidad.
     * @param simbolo El carácter de relleno para el árbol.
     * @param altura La altura de la copa del árbol.
     */
    private static void arbolNavidad(String simbolo, int altura) {
        // Construye y centra la copa del árbol línea por línea
        for (int i = 1; i <= altura; i++) {// Altura de la copa
            String arbol = "";// Inicializo como cadena vacía
            for (int j = 1; j <= (2 * i - 1); j++) {
                arbol += simbolo;
            }// FIN FOR INTERNO
            centrarFigura(arbol, 80); // Centro la línea actual de la copa
        }// FIN FOR EXTERNO
        
        
        // Calculo la altura y el ancho del tronco
        int alturaTronco = (int) Math.ceil((double) altura / 3);// Redondeo hacia arriba para no perder altura si la division da decimal.
        int anchoTronco = (2 * altura - 1) / 3;
        
        // Me aseguro de que el ancho del tronco sea impar para que este centrado.
        if (anchoTronco % 2 == 0) {
            anchoTronco++;
        }
        
        String tronco = "";// Inicializo como cadena vacía
        
        for (int j = 1; j <= anchoTronco; j++) {// Creo la línea del tronco con el ancho calculado
            tronco += simbolo;
        }// FIN FOR 
        
        for (int j = 1; j <= alturaTronco; j++) {// Imprimo la altura del tronco, centrando cada línea
            centrarFigura(tronco, 80);
        }// FIN FOR 
    }
}
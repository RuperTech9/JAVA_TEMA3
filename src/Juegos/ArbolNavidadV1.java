
package Juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ArbolNavidadV1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicita la altura de la copa y el carácter de relleno al usuario
        System.out.println("Introduce la altura de la copa del árbol: ");
        int altura = teclado.nextInt();
        System.out.println("Introduce el carácter de relleno: ");
        String simbolo = teclado.next();
        System.out.println("");
        arbolNavidad(simbolo, altura);
    }

    /**
     * Imprime una figura centrada en un ancho de pantalla dado.
     * @param figura La figura (cadena de caracteres) a centrar.
     * @param anchoPantalla El ancho de la pantalla donde se centra la figura.
     */
    private static void centrarFigura(String figura, int anchoPantalla) {
        int espaciosDelante = (anchoPantalla - figura.length()) / 2;//resto la longitud de la figura del ancho de la pantalla y divido el resultado por 2.
        for (int i = 0; i < espaciosDelante; i++) {
            System.out.print(" ");
        }
        System.out.println(figura);
    }

    /**
     * Dibuja un árbol de Navidad con una copa y un tronco centrados.
     * @param simbolo El carácter de relleno para el árbol.
     * @param altura La altura de la copa del árbol.
     */
    private static void arbolNavidad(String simbolo, int altura) {
        // Construye y centra la copa del árbol línea por línea
        for (int i = 1; i <= altura; i++) {
            String arbol = "";
            // Crea una línea de la copa del árbol con un efecto de pirámide
            for (int j = 1; j <= (2 * i - 1); j++) {
                arbol += simbolo;
            }
            centrarFigura(arbol, 80); // Centra la línea actual de la copa
        }

        // Calcula la altura y el ancho del tronco y lo centra
        int alturaTronco = (int) Math.ceil((double) altura / 3);
        int anchoTronco = (2 * altura - 1) / 3;
        String tronco = "";
        // Crea la línea del tronco con el ancho calculado
        for (int j = 1; j <= anchoTronco; j++) {
            tronco += simbolo;
        }
        // Imprime la altura del tronco, centrando cada línea
        for (int j = 1; j <= alturaTronco; j++) {
            centrarFigura(tronco, 80);
        }
    }
}
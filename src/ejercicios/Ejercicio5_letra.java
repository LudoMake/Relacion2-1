package ejercicios;

import java.util.Scanner;

/**
 * 5. Dadas dos casillas de un tablero de ajedrez por la 
 * fila y columna que ocupan, comprobar si están en la misma
 *  fila, columna, o en la misma diagonal.
 * @author David
 *
 */
public class Ejercicio5_letra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cálculo de las piezas de ajhedrez");
		System.out.println("Introuduce la fila de la primera pieza:");
		int fil1 = teclado.nextInt();
		System.out.println("Introuduce la columna de la primera pieza:");
		int col1 = teclado.nextInt();
		System.out.println("Introuduce la fila de la segunda pieza:");
		int fil2 = teclado.nextInt();
		System.out.println("Introuduce la columna de la segunda pieza:");
		int col2 = teclado.nextInt();
		
		System.out.printf("Las piezas están en (%d,%d) y (%d,%d)\n",fil1,col1,fil2,col2);
		
		if (fil1==fil2 && col1==col2) {
			System.out.println("Son la misma casilla");
			teclado.close();
			//return;
			System.exit(0); // sale del programa indicando un código de error. El 0 indica todo va bien
		} 
		if (fil1==fil2) {
			System.out.println("Las dos piezas están en la misma fila");
		} else if (col1 == col2) {
			System.out.println("La dos piezas están en la misma columna");
		} else if(Math.abs(fil1-fil2) == Math.abs(col1-col2)) {
			System.out.println("Las piezas están en la misma diagonal");
		} else {
			System.out.println("La piezas no están ni en la misma fila, ni en la misma columna ni en la diagonal");
		}
		teclado.close();
	}

}

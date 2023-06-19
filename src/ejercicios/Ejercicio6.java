package ejercicios;

import java.util.Scanner;

/**
 * 6. Algoritmo que pida los parámetros (a, b y c de tipo 
 * double) de dos rectas, correspondientes a su ecuación 
 * implícita (ax + by + c = 0), e indique si son 
 * coincidentes, paralelas o secantes. 
 * @author David
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println("Calcilo de la posición de dos rectas");
		Scanner teclado = new Scanner(System.in);

		System.out.printf("Introduce la primera recta:");
		System.out.println("Introduce el coeficiente A");
		double a1 = teclado.nextDouble();
		System.out.println("Introduce el coeficiente B");
		double b1 = teclado.nextDouble();
		System.out.println("Introduce el coeficiente C");
		double c1 = teclado.nextDouble();
		
		System.out.printf("Introduce la segunda recta:");
		System.out.println("Introduce el coeficiente A");
		double a2 = teclado.nextDouble();
		System.out.println("Introduce el coeficiente B");
		double b2 = teclado.nextDouble();
		System.out.println("Introduce el coeficiente C");
		double c2 = teclado.nextDouble();
		
		if (a1/a2==b1/b2) {
			System.out.print("Las rectas son paralelas ");
			if (a1/a2 == c1/c2) {
				System.out.println("y son coincidentes");
			}
		} else {
			System.out.print("Las rectas son secantes ");
			if (a1/b1 == -b2/a2) {
				System.out.println("y son perpendiculares");
			}
		}
		teclado.close();
	}

}

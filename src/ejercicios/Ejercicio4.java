package ejercicios;

import java.util.Scanner;

/**
 * 4. Algoritmo que pida tres números de tipo entero y 
 * compruebe si es posible que exista un triángulo con esas
 *  dimensiones
 * @author David
 *
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa que calcula si un triángulo existe dados sus lados");
		System.out.println("Introduce lado1:");
		int lado1 = teclado.nextInt();
		System.out.println("Introduce lado2:");
		int lado2 = teclado.nextInt();
		System.out.println("Introduce lado3:");
		int lado3 = teclado.nextInt();
		
		if ((lado1+lado2 > lado3) && 
			(lado2+lado3 > lado1) &&
			(lado1+lado3 > lado2) ) {
			System.out.printf("Existe un triángulo de lados %d,%d y %d",lado1,lado2,lado3);
		} else {
			System.out.printf("El triángulo de lados %d, %d y %d no existe", lado1,lado2,lado3);
		} 
		
		teclado.close();
	}
}

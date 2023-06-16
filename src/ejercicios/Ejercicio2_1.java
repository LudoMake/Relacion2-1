package ejercicios;

import java.util.Scanner;

/**
 * 2. Algoritmo que pida 3 números e indique cual es 
 * el menor de los tres
 * @author David
 *
 */
public class Ejercicio2_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		double num1 = teclado.nextDouble();
		System.out.println("Introduce otro número:");
		double num2 = teclado.nextDouble();
		System.out.println("Introduce otro número más:");
		double num3 = teclado.nextDouble();
		
		if ((num1 <= num2) && (num1<=num3) ) {
			System.out.printf("El menor es %.2f",num1);
		}else if ((num2 <= num1) && (num2<=num3) ) {
			System.out.printf("El menor es %.2f",num2);
		} else {
			System.out.printf("El menor es %.2f",num3);
		}

	}

}

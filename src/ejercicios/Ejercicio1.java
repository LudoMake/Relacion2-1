package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Algoritmo que pida dos enteros y que indique el mayor
 *  y el menor, o si ambos son iguales. 
 * @author David
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1=0;
		try {
			System.out.printf("Introduce un número:");
			num1 = teclado.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Listo que has puesto una lertra-...");
			System.exit(0);
		}
		
		
		System.out.printf("Introduce otro número:");
		int num2 = teclado.nextInt();
		
		if (num1==num2) {
			System.out.println("Los dos numeros son iguales");
		} else if(num1<num2) {
			System.out.printf("el menor es %d y el mayor es %d",
					num1,num2);
		} else {
			System.out.printf("el menor es %d y el mayor es %d",
					num2,num1);
		}
		
	}

}

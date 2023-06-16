package ejercicios;

import java.util.Scanner;

/**
 * 2. Algoritmo que pida 3 números e indique cual es 
 * el menor de los tres
 * @author David
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		double num1 = teclado.nextDouble();
		System.out.println("Introduce otro número:");
		double num2 = teclado.nextDouble();
		System.out.println("Introduce otro número más:");
		double num3 = teclado.nextDouble();
		
		double menor=num1;
		if (num2<menor) menor=num2;
		if (num3<menor) menor=num3;
		
		System.out.printf("El menpr es %.2f",menor);

	}

}

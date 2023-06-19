package ejercicios;

import java.util.Scanner;

/**
 * 8. Escribir un programa que implemente una pequeña 
 * calculadora con switch-case. El  programa pedirá al 
 * usuario los operandos (a y b) y la operación a realizar: 
 * suma, resta, multiplicación, división, raíz cuadrada del 
 * primer número y elevar el primer número al segundo. 
 * En función de la opción seleccionada se realizará una 
 * de las operaciones aritméticas. 
 * @author David
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora");
		
		
		System.out.println("=====================");
		System.out.println("= 1. Sumar          =");
		System.out.println("= 2. Restar         =");
		System.out.println("= 3. Multiplicar    =");
		System.out.println("= 4. Dividir        =");
		System.out.println("= 5. Raíz cuadrada  =");
		System.out.println("= 6. Potencia       =");
		System.out.println("=====================");
		System.out.println("Opción (1-6): ");
		int opcion = teclado.nextInt();
		
		
		double num1 =0;
		double num2=0;
		if (opcion>=1 && opcion <=6)  {
			System.out.println("Introduce el primer número:");
			num1=teclado.nextDouble();
			if (opcion!=5) {
				System.out.println("Introduce el segundo número:");
				num2 =teclado.nextDouble();
			}
		}
		
		
		double res=0;
		switch(opcion) {
		case 1:
			res = num1+num2;
			break;
		case 2:
			res = num1-num2;
			break;
		case 3:
			res = num1*num2;
			break;
		case 4:
			res = num1/num2;
			break;
		case 5:
			res = Math.sqrt(num1);
			break;
		case 6:
			res = Math.pow(num1,num2);
			break;
		default: 
			System.out.println("Opción incorrecta");
			return;
		}
		System.out.printf("El resultado es %.2f",res);
		
		teclado.close();
	}

}

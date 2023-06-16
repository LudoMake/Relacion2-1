package ejercicios;

import java.util.Scanner;

/**
 * 3. Algoritmo que pida tres números distintos de tipo 
 * float e indique cual es el que ocupa la posición central 
 * si los tres se ordenasen. 
 * @author David
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		float num1 = teclado.nextFloat();
		System.out.println("Introduce otro número:");
		float num2 = teclado.nextFloat();
		System.out.println("Introduce otro número más:");
		float num3 = teclado.nextFloat();
		
		if (
			((num1 < num2) && (num2 < num3)) || 
			((num2 > num3) && (num2 < num1))
		   ){

            System.out.println("El numero " + num2 + " ocupa la posicion central");

        } else if (((num1 > num2) && (num1 < num3)) || ((num1 > num3) && (num1 < num2))) {

            System.out.println("El numero " + num1 + " ocupa la posicion central");

        } else if (((num3 > num1) && (num3 < num2)) || ((num3 > num2) && (num3 < num1))) {

            System.out.println("El numero " + num3 + " ocupa la posicion central");

        } else if ((num1==num2) && (num2==num3)) {

            System.out.println("Todos los numeros son iguales");

        } else if (num1==num2) {

            System.out.println("Los numeros 1º y 2º introducidos son iguales") ;

        } else if (num2==num3) {

            System.out.println("Los numeros 2º y 3º introducidos son iguales") ;

        }else {

            System.out.println("Los numeros 1º y 3º introducidos son iguales") ;

        }		
		
		

	}

}

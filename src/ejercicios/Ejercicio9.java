package ejercicios;

import java.util.Scanner;

/**
 * 9. Dado el sueldo bruto de un trabajador y su número de
 * hijos, realizar un algoritmo que calcule los impuestos
 * que debe pagar según la siguiente tabla de tramos: 
	Tramo Impuesto (%) Descuento 
	0 a 1000 0 No aplicable 
	1000 a 1600 5 1% por hijo (máximo 
	10%) 
	1600 a 3000 10 1% por hijo (máximo 
	10%) 
	3000 a 4600 15 1% por hijo (máximo 
	10%) 
	> 4600 20 1.5% por hijo 
	(máximo 15%)
 * @author David
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo de impuestos");
		System.out.println("Introduce número de hijos");
		int numHijos= teclado.nextInt();
		
		System.out.println("Sueldo: ");
		double sueldo= teclado.nextDouble();
		double retencion = 0;
		if (sueldo <=0) {
			System.out.println("El sueldo debe ser positivo");
		} else if (sueldo < 1000) {
			System.out.println("Estas exento de impuestos, yuhuuuu!");
		} else if (sueldo <1600) {
			retencion = sueldo * 0.05;
//			if (numHijos<10) {
//				retencion = retencion * (1-numHijos*0.01);
//			} else {
//				retencion = retencion *(1-0.1);
//			}
			
			retencion = retencion *(1-Math.min(numHijos*0.01, 0.1));
		} else if(sueldo <3000) {
			retencion = sueldo * 0.1;
			retencion = retencion *(1-Math.min(numHijos*0.01, 0.1));
		} else if (sueldo<4600) {
			retencion = sueldo*0.15;
			retencion = retencion *(1-Math.min(numHijos*0.01, 0.1));
		} else {
			retencion = sueldo*0.2;
			retencion = retencion *(1-Math.min(numHijos*0.015, 0.15));
		}
		System.out.printf("El sueldo es %.2f, la retencion %.2f y el salario neto %.2f\n",
				sueldo, retencion, sueldo-retencion);
		teclado.close();
	}

}

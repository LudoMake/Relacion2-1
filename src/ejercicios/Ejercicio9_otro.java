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
public class Ejercicio9_otro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo de impuestos");
		System.out.println("Introduce número de hijos");
		int numHijos= teclado.nextInt();
		
		System.out.println("Sueldo: ");
		double sueldo= teclado.nextDouble();
		double resto=sueldo;
		double retencion = 0;
		double totalRetencion=0;
		if (sueldo <=0) {
			System.out.println("El sueldo debe ser positivo");
			return;
		} 
		if (resto < 1000) {
			System.out.println("Estas exento de impuestos, yuhuuuu!");
		} 
		else {
			resto = resto -1000;
			if (resto>1600-1000) {
				retencion = 600 * 0.05;
				resto=resto-600;
			} else {
				retencion =resto * 0.05;
				resto=0;
			}
			retencion = retencion *(1-Math.min(numHijos*0.01, 0.1));
			totalRetencion = totalRetencion+retencion;
			
			if (resto > 3000-1600) {
				retencion = 1600 * 0.1;
				resto=resto-1600;
			} else {
				retencion = resto*0.1;
				resto=0;
			}
			retencion = retencion *(1-Math.min(numHijos*0.01, 0.1));
			totalRetencion = totalRetencion+retencion;
			
			if (resto > 4600-3000) {
				retencion = 1600 * 0.15;
				resto=resto-1600;
			} else {
				retencion = resto*0.15;
				resto=0;
			}
			retencion = retencion *(1-Math.min(numHijos*0.01, 0.1));
			totalRetencion = totalRetencion+retencion;
			
			if (resto > 0) {
				retencion = 1600 * 0.2;
				resto=0;
			}
			retencion = retencion *(1-Math.min(numHijos*0.015, 0.15));
			totalRetencion = totalRetencion+retencion;
		}
		System.out.printf("El sueldo es %.2f, la retencion %.2f y el salario neto %.2f\n",
				sueldo, totalRetencion, sueldo-totalRetencion);
		teclado.close();
	}

}

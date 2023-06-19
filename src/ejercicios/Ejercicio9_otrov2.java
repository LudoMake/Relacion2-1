package ejercicios;

import java.util.Scanner;

public class Ejercicio9_otrov2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuál es el sueldo bruto de Paquito?");
		double sueldo=teclado.nextDouble();
		System.out.println("¿Cuántos hijos tiene Paquito?");
		double hijos=teclado.nextDouble();
		double tramo1=0,tramo2=0,tramo3=0,tramo4=0;


		if (sueldo<=1000) {System.out.print("No se le aplican impuestos.");
		} else {
				if (hijos>10) hijos=10;
				tramo1=(Math.min(sueldo, 1600)-1000)*0.05;
				tramo1=tramo1-tramo1*(hijos/100);
				if (sueldo>1600) {
					tramo2=(Math.min(sueldo, 3000)-1600)*0.1;
					tramo2=tramo2-tramo2*(hijos/100);
					if (sueldo>3000) {
						tramo3=(Math.min(sueldo, 4600)-3000)*0.15;
						tramo3=tramo3-tramo3*(hijos/100);
						if (sueldo>4600) {
							if (hijos>15) hijos=15;
							tramo4=(sueldo-4600)*0.20;
							tramo4=tramo4-tramo4*(hijos/100);
						}
					}					
				}			
			double resultado=sueldo-tramo1-tramo2-tramo3-tramo4;
			System.out.printf("Paquito tiene que pagar %.2f€ de impuestos, quedándole un sueldo de %.2f€.",resultado,sueldo-resultado);
			//System.out.print(sueldo+" "+tramo1+" "+tramo2+" "+tramo3+" "+tramo4);
		};
			
	
	teclado.close();
	}
}

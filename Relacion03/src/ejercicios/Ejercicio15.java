package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// 15. Algoritmo que pida un número natural y determine si es primo o no
		
		System.out.println("Ejercicio Es primo");
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Introduce un número");
		int num = teclado.nextInt();
		int contador =2; //porque si es divisible entre 1 sería primo
		boolean primo=true;
		
		while (contador < num && primo) {
			if (num %contador==0) {
				primo=false;
			}
			contador++;
		}
		if (primo) {
			System.out.println("Es número primo");
		}else {hg
			System.out.println("No es primo, es compuesto");
				
		}
		
	}

}

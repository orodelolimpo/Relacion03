package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// 13. Algoritmo que pida el alto y el ancho de un rectángulo (número entero) e imprima 
		//un rectángulo de asteriscos. Por ejemplo, si introducen 7 de ancho y 4 de alto 
		////el resultado será:
		//*******
		//*******
		//*******
		//*******
		
		System.out.println("Rectangulo asteriscos");
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduce el ancho:");
		int ancho = teclado.nextInt();
		System.out.println("Introduce el alto:");
		int alto = teclado.nextInt();
		for (int i=0; i < alto*ancho;i++)
	
				if (i%ancho==0) {
					System.out.println();
			}
				System.out.print("*");
				

		

	}

}

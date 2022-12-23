package ejercicios;

import java.util.Scanner;

public class Ejercicio14bisfacil {

	public static void main(String[] args) {
		// 	public static void main(String[] args) {
		// 14. Hazlo igual que el anterior, pero en este caso debe mostrar el rectángulo de la 
		//siguiente manera:
		//	*******
		//	*     *
		//	*     *
		//	*******
		System.out.println("Rectangulo asteriscos");
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduce el ancho:");
		int ancho = teclado.nextInt();
		System.out.println("Introduce el alto:");
		int alto = teclado.nextInt();
		
		for (int i=1; i <= alto;i++) {
			for (int j=0; j< ancho; j++) {
				if (i==1 || i==alto||j==1 ||j==ancho) {
				
				System.out.println("*");
			} else {
			System.out.println(" ");
		}	
	}
			System.out.println();
		}
	}
}

	}

}

package ejercicios;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// 8. Programa que pide un número del 1 al 10 hasta que el usuario acierte el número 
		//definido en el programa

		System.out.println("Adivina el número del 1 al 10");
		Scanner teclado = new Scanner (System.in);
//		System.out.println("Introduce un número entre 1 y 10");
		int numero=0;
		int fijo =5;
		
		while (numero !=fijo) {
			System.out.println("Introduce un número:");
			numero = teclado.nextInt();
		}
		System.out.println("Has adivinado");
		teclado.close();
	}

}

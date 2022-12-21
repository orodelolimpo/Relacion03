package ejercicios;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// 7. Algoritmo que cuente cuántos múltiplos de 7 hay entre dos enteros dados
		// por el
		// usuario.

		System.out.println("Multiplos de 7");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int numero1 = teclado.nextInt();
		System.out.println("Introduce otro número");
		int numero2 = teclado.nextInt();
		int menor = numero1, mayor = numero2;
		if (numero2 < numero1) {
			menor = numero2;
			mayor = numero1;
		}
		int i = menor;
		while (i % 7 != 0) {
			i++;
		}

		while (i <= mayor) {
			System.out.println(i);
			i = i + 7;

		}

	}

}

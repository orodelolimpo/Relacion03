package ejercicios;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// 1. Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
		//comprendido entre uno y diez, introducido por el usuario, usando un esquema for. 
		System.out.println("Tabla de multiplicar de un número");
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un numero entre 1 y 10");
		int numero =teclado.nextInt();
		
		if (numero<1 ||numero>10) {
			System.out.println("El número debe estar entre 1 y 10");
		}
			else
			{		
		
		for (int i=0; i <11; i++) {
			System.out.printf("%d x %d = %d\n", numero, i, numero*i);
		}
		};
		
		
		// 

	}

}

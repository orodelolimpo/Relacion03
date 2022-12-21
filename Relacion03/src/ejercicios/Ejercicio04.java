package ejercicios;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// 4. Algoritmo que escriba los números impares comprendidos entre dos enteros 
		// por el usuario. 
		System.out.println("Número Impares");
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escribe un número entero");
		int numero1 = teclado.nextInt();
		
		System.out.println("Escribe otro número entero");
		int numero2 = teclado.nextInt();
		
		int menor = numero1, mayor=numero2;
		if (numero2<numero1) {
			menor=numero2;
			mayor=numero1;
		}
		
		int i = menor;
		if (i%2 ==0) {
			i++;
		}
		
		while (i<=mayor) {
			System.out.println(i);
			i=i+2;
		}

	}

}

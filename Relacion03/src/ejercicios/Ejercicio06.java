package ejercicios;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// 6. Algoritmo que calcule el factorial de un número entero introducido por el usuario
		System.out.println("Factorial de número entero");
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un número");
		int numero= teclado.nextInt();
		int n=numero, res =1;
		
		while (n>0) {
			
			res=res*n;
			n=n-1;
		}
		
		System.out.println(res);
		teclado.close();

	}

}

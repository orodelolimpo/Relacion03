package ejercicios;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// 5. Algoritmo que sume los n primeros números enteros, siendo n un número 
		//introducido por el usuario. 
		
		System.out.println("Suma de números enteros");
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un número");
		int numero= teclado.nextInt();
		int n=numero, res =0;
		
		while (n>0) {
			
			res=res+n;
			n=n-1;
		}
		
		System.out.println(res);

	}

}
//







import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// 2. Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
		//comprendido entre uno y diez, introducido por el usuario, usando un esquema 
		//while. 
		System.out.println("Tabla de multiplicar de un número");
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un numero entre 1 y 10");
		int numero =teclado.nextInt();
		int i=0;
		if (numero<1 ||numero>10) {
			System.out.println("El número debe estar entre 1 y 10");
		}
			else
			{		
		while (i<11) {
				System.out.printf("%d x %d = %d\n", numero, i, numero*i);
				i++;
		}
	}

}
}


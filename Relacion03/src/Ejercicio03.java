import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// 3. Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
		//comprendido entre uno y diez, introducido por el usuario, usando un esquema do 
		//	while. Nota: En los tres ejercicios anteriores, el programa ha de controlar mediante 
		//	un esquema do-while, que el número está comprendido entre 1 y 10.
		
		System.out.println("Tabla de multiplicar de un número");
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un numero entre 1 y 10");
		int numero =teclado.nextInt();
		int i=0;

		 do{
			System.out.printf("%d x %d = %d\n", numero, i, numero*i);
			i++;
		} while (i<11); //do while si lleva ; la diferencia ha sido quitar while de arriba con su condición y ponerla abajo

	}

}

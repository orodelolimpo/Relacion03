package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// 9. Algoritmo que pida 10 números por teclado, después de pedirlos deberá indicar 
//		cuanto eran positivos, cuantos eran negativos y cuantos eran cero
		System.out.println("Positivos, Negativos y Cero");
		Scanner teclado = new Scanner (System.in);
		int num, contador=1;
		int ceros =0;
		int negativos =0;
		int positivos =0;
		
	while (contador <11) {
		
		System.out.println("introduce numero:");
		num =teclado.nextInt();
		
		
		if (num ==0) {
			ceros ++;
		}
		else if (num >0) {
			positivos ++;
		}
		else {
			negativos ++;
			
		}
		contador ++;
	}
			System.out.println("Total ceros: " +ceros);
			System.out.println("Total positivos: "+positivos);
			System.out.println("Total negativos: " +negativos);
		
		
		}
	}
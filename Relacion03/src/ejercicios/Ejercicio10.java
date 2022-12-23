package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// 10. Algoritmo que escriba las tablas de multiplicar del 1 al 10 usando esquemas for
		System.out.println("Tabla de multiplicar");
		int tabla=0;
		int num=1;
		for (int i =1; i <= 100; i++) {
			if (i%10==0)
				tabla++;
			System.out.println("Tabla del " +tabla);
			num=1;
		}
		
		System.out.printf("%d x %d = %d\n", tabla, num, tabla*num);
		num++;


	}

}

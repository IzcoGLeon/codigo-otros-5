package org.generation;

import java.util.Scanner;

/**
 * El código toma un valor por parte del usuario en la consola a través de 
 * Scanner, este valor de tipo int es almacenado en la variable ni, asi como 
 * también la variable c, este ultimo con fines de impresión final del valor inicial
 * para la consola. Mediante un loop while se declara una condición, la cual mientras
 * sea verddera ejectuará el bloque de código dentro de este. Dentro de este bloque 
 * encontramos que el valor introducido por el usuario mediante Scanner es sujeto a 
 * una serie de operaciones y condiciones para determinar si el número es afortunado o no con 
 * base a los resultados filtrados de cada último digito, hasta el punto que se llega al valor 0
 * para salir del bucle.
 */

public class Codigo5 {

	public static void main(String[] args) {

		// Se llama apropiadamente Scanner
		Scanner sc = new Scanner(System.in);
		
		int afo = 0;
		int noAfo = 0;
		System.out.print("Introduzca un número: ");
		//Se cambia input a int con nextInt()
		int ni = sc.nextInt();
		int c = ni;

		while (ni > 0) {
			int digito = ni % 10; 
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++; //Se ubican lineas de codigo dentro del alcance adecuado
			}
			ni /= 10;
		}
		if (afo > noAfo) {
			System.out.println("El " + c + " es un número afortunado.");
		} else {
			System.out.println("El " + c + " no es un número afortunado.");
		}
		
		sc.close(); // Se cierra el scanner
	}

}

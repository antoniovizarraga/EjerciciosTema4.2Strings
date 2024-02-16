package ejerciciostema42strings;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		// Tabla de char conjunto1

		char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};

		

		// Tabla de char conjunto2

		char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

		

		// Variable donde se almacenará la palabra

		String palabra = "";

		

		// Variable donde se almacenará el caracter

		char car = 0;

		

		// Creamos el Scanner

		Scanner sc = new Scanner(System.in);

		

		// Le pedimos la palabra al usuario

		System.out.println("Introduzca una palabra");

		palabra = sc.nextLine().toLowerCase();

		

		// Bucle que llama a la función pasando cada carácter según la posición en la cadena

		for (int i = 0; i < palabra.length(); i++) {

			// Obtenemos el caracter en la posición i de la cadena

			car = palabra.charAt(i);

			

			// Llamamos a la función para mostrar el mensaje

			System.out.print(codifica(conjunto2, conjunto1, car));

		}

		

		// Cerramos el Scanner

		sc.close();

	}

	

	/**

	 * Método que obtiene dos tablas de char y un char y devuelve la codificación

	 * @param conjunto1 Tabla de char

	 * @param conjunto2 Tabla de codificación

	 * @param c Char a codificar

	 * @return Devuelve el char codificado

	 */

	static char codifica(char conjunto1[], char conjunto2[], char c) {

		// Variable donde se almacenará el char codificado

		// Lo inicializo a c ya que si no se encuentra en el conjunto debe retornar el mimso caracter

		char charCodificado = c;

		

		// Variable que determina si se he encontrado

		boolean encontrado = false;

		

		// Contador

		int i = 0;

		

		// Bucle para buscar el carácter en el primer conjunto y luego obtener el carácter codificado

		while (i < conjunto1.length && !encontrado) {

			// Comprueba si es el mismo caracter

			if (c == conjunto1[i]) {

				// Obtenemos el caracter codificado

				charCodificado = conjunto2[i];

				

				// Cambiamos el valor de encontrado a true

				encontrado = true;

			}

			

			// Aumentamos el contador

			i++;

		}

		

		// Devuelve el char codificado

		return charCodificado;

	}

}

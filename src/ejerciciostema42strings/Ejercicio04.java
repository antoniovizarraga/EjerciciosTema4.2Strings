package ejerciciostema42strings;

import java.util.Arrays;

/**
 * Vamos a crear un ejercicio el cual pasándole una frase 
 * escrita por el usuario al programa, es capaz de
 * ordenarlo alfabéticamente e imprimirlo.
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Cadena que tendrá el input del usuario
		String userValue = "";
		
		// Tabla de cadenas que tendrá las palabras de la cadena.
		String[] listsOfWords;
		
		// Pedimos el input al usuario.
		userValue = GetValue.getString("Introduzca tantas frases como quiera.");
		
		// Separamos las palabras por espacios.
		listsOfWords = userValue.split(" ");
		
		// Ordenamos alfabéticamente el Array.
		Arrays.sort(listsOfWords);
		
		// Pasamos el array de cadenas a cadena.
		userValue = String.join(" ", listsOfWords);
		
		// Imprimimos la cadena.
		System.out.println(userValue);
		
		// Cerramos el Scanner.
		GetValue.SCANNER.close();
	}

}

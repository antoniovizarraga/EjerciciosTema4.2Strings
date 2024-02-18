package ejerciciostema42strings;

import java.util.Random;

/**
 * Realizaremos un juego el cual, un usuario escribe una palabra, y el programa
 * intercambiará de forma aleatoria el orden de las letras. Mostrará dicha
 * palabra a otro usuario para darle una pista, ya que tendrá que adivinar la
 * palabra que escribió el usuario anterior.
 */

public class Ejercicio15 {

	/**
	 * Atributo que será la palabra que el usuario tenga que adivinar.
	 */
	private static final String WORDTOGUESS = GetValue.getString("Introduzca una frase o palabra: ");

	/**
	 * Función que creará un anagrama de una palabra o frase dada como parámetro.
	 * @param text Texto con el que haremos un anagrama.
	 * @return
	 */
	private static String randomLetters(String text) {
		// Pasamos a array las letras de la frase.
		char[] letters = text.toCharArray();
		
		// Creamos la variable para generar un valor aleatorio.
		int randomValue = 0;
		
		// Creamos el Random.
		Random rand = new Random();

		// Creamos un bucle que empiece desde el final
		/* y vaya comparando letras desde la posición i
		 * hasta la posición generada aleatoriamente.
		 * Esto es cómo se hace siguiendo el algoritmo
		 * Fisher-Yates. */
		for (int i = text.length() - 1; i > 0; i--) {
			randomValue = rand.nextInt(0, text.length());
			char temp = letters[i];
			letters[i] = letters[randomValue];
			letters[randomValue] = temp;

		}

		// Devolvemos el anagrama ya hecho y lo pasamos a String.
		return String.valueOf(letters);
	}

	public static void main(String[] args) {

		// String que tendrá el valor del usuario.
		String userValue = "";
		
		// String que tendrá el anagrama.
		String anagram = "";

		// Imprimimos varias líneas para que el usuario
		// no vea la palabra original.
		for(int i = 0; i < 50; i++) {
			System.out.println();
		}
		
		System.out.println("¡Intente escribir la palabra o frase que escribió el otro usuario!");
		
		// Bucle en el que tendrá que adivinar la palabra o frase.
		do {
			userValue = GetValue.getString("Escriba aquí: ");
			anagram = randomLetters(userValue);
			System.out.println(anagram);
			
		}while(!userValue.equals(WORDTOGUESS));
		
		/* Si salimos del bucle, significa que el usuario ha adivinado la palabra
		 * o frase. Por lo que imprimimos un mensaje de victoria. */
		System.out.println("¡Felicidades, acertaste! \n La frase o palabra era: " + WORDTOGUESS);

		// Cerramos el Scanner.
		GetValue.SCANNER.close();
	}

}

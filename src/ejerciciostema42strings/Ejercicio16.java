package ejerciciostema42strings;

import java.util.Random;

/**
 * Realizaremos el mismo juego que el ejercicio anterior, pero la diferencia será que
 * mostraremos cuántas letras adivina el usuario al intentar adivinar la palabra.
 */
public class Ejercicio16 {

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
			if(letters[i] == ' ' || letters[randomValue] == ' ') {
				continue;
			}
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
		
		// Número de letras que el usuario acertará
		int Coincidences = 0;

		// Imprimimos varias líneas para que el usuario
		// no vea la palabra original.
		for(int i = 0; i < 50; i++) {
			System.out.println();
		}
		
		System.out.println("¡Intente escribir la palabra o frase que escribió el otro usuario!");
		
		// Bucle en el que tendrá que adivinar la palabra o frase.
		do {
			userValue = GetValue.getString("Escriba aquí: ");
			anagram = randomLetters(WORDTOGUESS);
			System.out.println(anagram);
			
			// Bucle anidado para saber si las letras que escribe el usuario
			// coinciden con la palabra a adivinar.
			for(int i = 0; i < userValue.length(); i++) {
				if(WORDTOGUESS.charAt(i) == userValue.charAt(i)) {
					Coincidences++;
				}
			}
			
			System.out.println("Letras coincidentes: " + Coincidences);
			
			// Reseteamos la variable.
			Coincidences = 0;
			
		}while(!userValue.equalsIgnoreCase(WORDTOGUESS));
		
		/* Si salimos del bucle, significa que el usuario ha adivinado la palabra
		 * o frase. Por lo que imprimimos un mensaje de victoria. */
		System.out.println("¡Felicidades, acertaste! \n La frase o palabra era: " + WORDTOGUESS);

		// Cerramos el Scanner.
		GetValue.SCANNER.close();
	}

}

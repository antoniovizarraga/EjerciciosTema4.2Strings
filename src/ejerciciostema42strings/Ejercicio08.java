package ejerciciostema42strings;

/**
 * Crearemos una función que reciba como parámetro una frase. En dicha función,
 * comprobaremos que la frase dada por parámetro sea palíndroma. Es decir, que
 * se lee igual de izquierda a derecha que de derecha a izquierda. Devolverá
 * true o false dependiendo de si lo es o no.
 */
public class Ejercicio08 {

	/**
	 * Función que devolverá true o false para saber si la frase dada por parámetro
	 * es palíndroma o no.
	 * 
	 * @param auxPhrase La frase que comprobaremos si es palíndroma o no.
	 * @return palindromeCheck Devolveremos un boolean para saber si es palíndroma o
	 *         no (True o false).
	 */
	public static boolean isPalindrome(String phrase) {
		// Este será el boolean con el que comprobaremos si la
		// frase es palíndroma o no.
		boolean palindromeCheck = false;
		
		// Creamos este String para que contenga el valor original
		// y así no machacamos el String dado como parámetro.
		String auxPhrase = phrase;

		/*
		 * Este será el contador de cuántas coincidencias encuentre entre los carácteres
		 * de la cadena. Lo usaremos para después compararlo con la longitud del Array y
		 * así saber si la palabra es palíndroma o no.
		 */
		int counter = 0;

		// Reducimos el String a minúsculas para que no
		// distinga de mayúsculas o minúsculas.
		auxPhrase = auxPhrase.toLowerCase();
		
		// Reemplazamos todos los espacios por un carácter vacío.
		auxPhrase = auxPhrase.replace(" ", "");

		/* Bucle que recorrerá todo el String y comprobará en
		 * todo momento si la posición i de la cadena contiene
		 * el mismo carácter que su posición contraria (La
		 * posición contraria se calcularía cogiendo la longitud
		 * de la cadena y restándole i). */
		for (int i = 0; i < auxPhrase.length(); i++) {
			// Si las letras coinciden, suma 1 a la variable contador.
			// De lo contrario, detén el bucle.
			if (auxPhrase.charAt(i) == auxPhrase.charAt(auxPhrase.length() - i - 1)) {
				counter++;
			} else {
				break;
			}
		}

		// Si el contador vale lo mismo que la longitud de la cadena, entonces
		// la frase es palíndroma. Por lo que, equivale a true el boolean.
		if (counter == auxPhrase.length()) {
			palindromeCheck = true;
		}

		// Lo devolvemos.
		return palindromeCheck;
	}

	public static void main(String[] args) {
		// Creamos el String que contendrá la frase.
		String frase = "Dabale arroz a la zorra el abad";
		
		// Creamos el boolean que dirá al usuario
		// si la frase es Palíndroma o no.
		boolean palindromeCheck = false;

		// Ejecutamos la función y guardamos lo que retorna
		// en el boolean.
		palindromeCheck = isPalindrome(frase);

		// Imprimimos el resultado final.
		System.out.println("¿Es la frase palíndroma? " + palindromeCheck);

	}

}

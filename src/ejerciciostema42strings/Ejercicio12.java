package ejerciciostema42strings;

/**
 * Clase que buscará con una función o método la palabra más larga dado un texto
 * como parámetro.
 */
public class Ejercicio12 {

	/**
	 * Método que buscará la palabra más larga de un String que le pasemos como parámetro.
	 * @param text Texto en el que buscaremos la palabra.
	 * @return wordFound Retorna la palabra más larga que ha encontrado.
	 */
	public static String findWord(String text) {
		
		// Hacemos una copia del texto que se le pasó como parámetro
		// a la función.
		String textToSearchWord = text;
		
		// Tabla que tendrá las palabras del texto.
		// También dividiremos las palabras por espacios.
		String[] wordsFromText = textToSearchWord.split(" ");
		
		// Variable que contendrá la palabra más larga.
		String wordFound = "";
		
		// Recoreremos el String palabra por palabra, hasta
		// que encuentre la palabra más larga.
		for(String valueIn : wordsFromText) {
			// Comprobamos que la longitud sea mayor que la de la variable
			// wordFound.
			if(valueIn.length() > wordFound.length()) {
				wordFound = valueIn;
			}
		}
		
		// Devolvemos la palabra.
		return wordFound;
	}
	
	public static void main(String[] args) {
		// Texto en el que encontrar la palabra.
		String text = "Javalín javalón. Esternocleidomastoideo, dijo el maestro. Mientras que su discípulo dijo otra cosa.";
		
		// Variable que contendrá la palabra encontrada.
		String word = "";
		
		// Buscamos la palabra con la función.
		word = findWord(text);
		
		// Imprimimos la palabra.
		System.out.println(word);
		
		//Imprimimos el número de carácteres de dicha palabra.
		System.out.println(word.length());

	}

}

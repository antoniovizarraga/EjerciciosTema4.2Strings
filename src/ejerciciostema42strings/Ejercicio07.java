package ejerciciostema42strings;

/**
 * Crearemos un programa con una función que reciba por parámetros una frase y una palabra.
 * Debe devolver cuántas veces aparece la palabra en la frase.
 */
public class Ejercicio07 {

	/**
	 * Esta función dividirá las palabras de la frase dada por parámetro usando el método:
	 * "Split", y las separará por la palabra que también se le pasará como parámetro.
	 * @param phrase La frase original en la que buscaremos la palabra
	 * @param word La palabra que buscaremos en la frase
	 * @return wordCounter Devolverá cuántas veces ha encontrado la palabra que
	 * se le ha pasado como parámetro a la función.
	 */
	public static int wordsCounter(String phrase, String word) {
		// Esta será la variable que cuente las veces que encontramos
		// la palabra y la devolverá.
		int wordCounter = 0;
		
		// Array que contendrá la frase dividida por palabras usando
		// la función Split.
		String[] originalPhrase;
		
		// Dividimos las: "palabras" por la palabra que se nos pasó
		// como parámetro.
		originalPhrase = phrase.split(word);
		
		// Asignamos la longitud del array al contador y le restaremos 1.
		wordCounter = originalPhrase.length - 1;
		
		// Lo devolvemos.
		return wordCounter;
	}
	
	public static void main(String[] args) {
		// Asignamos una frase cualquiera.
		String frase = "Hola Paco, dijo él. Hola Pedro, dijo el otro.";
		
		// Ponemos la palabra que queremos encontrar en el String.
		String palabra = "Hola";
		
		// Creamos el contador de las palabras.
		int counter = 0;
		
		// Lo asignamos a la función para que le devuelva cuántas veces
		// encuentra el valor dado.
		counter = wordsCounter(frase, palabra);
		
		// Imprimimos el resultado.
		System.out.println(counter);
		
	}

}

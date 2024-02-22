package ejerciciostema42strings;

/**
 * Crearemos un programa que dado una frase con comentarios, eliminará
 * dichos comentarios y lo devolverá al Main.
 * 
 */
public class Ejercicio17 {

	/**
	 * Método para procesar una frase y eliminar comentarios
	 * @param phrase La frase en la que buscaremos los comentarios
	 * @return textToReturn Devolverá el texto sin comentarios.
	 */
	public static String processor(String phrase) {
		// Creamos una copia de la frase original para no modificar la original
		String phraseAsReference = phrase;
		// Inicializamos una variable para almacenar el texto procesado
		String textToReturn = "";

		// Iteramos sobre la frase para buscar comentarios
		for (int i = 0; i < phraseAsReference.length(); i++) {
			int pos1;
			int pos2;
			String replaceableText = "";
			// Verificamos si encontramos el inicio de un comentario
			if (phraseAsReference.charAt(i) == '/' && phraseAsReference.charAt(i + 1) == '*') {
				// Guardamos la posición del inicio del comentario
				pos1 = i;
				// Buscamos la posición del final del comentario
				pos2 = phraseAsReference.indexOf("*/");
				// Extraemos el texto del comentario
				replaceableText = phraseAsReference.substring(pos1, (pos2 + 2));
				// Removemos el comentario de la frase
				phraseAsReference = phraseAsReference.replace(replaceableText, "");
			}
		}

		// Guardamos el texto procesado
		textToReturn = phraseAsReference;
		// Devolvemos el texto sin comentarios
		return textToReturn;
	}

	public static void main(String[] args) {
		// Definimos la frase
		String texto = "Legend Of Zelda es un juego muy bueno."
		+ "/* (Sin embargo...) */ Yo lo recomiendo. /* (Link no es Zelda). */";

		// Procesamos la frase para eliminar comentarios
		texto = processor(texto);

		// Imprimimos la frase sin comentarios
		System.out.println(texto);
	}
}

package ejerciciostema42strings;

/**
 * Crearemos un programa que convierte una frase en el nombre de una variable
 * que utilice la nomenclatura Camel.
 */
public class Ejercicio19 {

	/**
	 * Función que transforma el texto dado como parámetro a camelCase.
	 * @param phrase Texto que convertiremos a camel case.
	 * @return camelPhrase El texto ya escrito a nomenclatura camel case.
	 */
    public static String toCamel(String phrase) {
        // Copia de la frase original
        String phraseCopy = phrase;
        // Variable para almacenar la frase convertida a CamelCase
        String camelPhrase = "";
        // Convertimos la frase a minúsculas
        phraseCopy = phrase.toLowerCase();
        
        // Dividimos la frase en palabras
        String words[] = phraseCopy.split(" ");

        // Iteramos sobre todas las palabras, excepto la primera
        for (int i = 1; i < words.length; i++) {
            // Convertimos la primera letra de cada palabra a mayúscula
            char[] lettersFromWord = words[i].toCharArray();
			char upperCaseLetter = lettersFromWord[0];
            upperCaseLetter = Character.toUpperCase(upperCaseLetter);
            lettersFromWord[0] = upperCaseLetter;
            
            
            // Construimos la palabra con la letra ya convertida en Mayúscula.
            String valueModified = String.valueOf(lettersFromWord);
            
            // Lo asignamos
            words[i] = valueModified;
        }

        // Unimos las palabras para formar la frase en CamelCase
        camelPhrase = String.join("", words);

        return camelPhrase;
    }

    public static void main(String[] args) {
        // El texto a convertir en camel case.
        String text = "Mi perro se llama perico.";

        // Convertimos la cadena de texto a CamelCase
        text = toCamel(text);

        // Imprimimos el resultado
        System.out.println(text);
    }
}

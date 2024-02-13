package ejerciciostema42strings;

/**
 * Vamos a crear una clase la cual tenga dos strings. Le preguntará
 * al usuario por introducir 2 palabras o frases, y luego
 * compararemos los dos Strings y diremos cuál de estos
 * 2 Strings es el más corto o el que menos longitud
 * tiene.
 * @author Antonio
 * @version 1.0
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		// La cadena que tendrá el primer valor.
		String firstValue = "";

		// La cadena que tendrá el segundo valor.
		String secondValue = "";
		
		// Pedimos los valores al usuario.
		firstValue = GetValue.getString("Introduce una palabra: ");
		secondValue = GetValue.getString("Introduce la otra palabra: ");
		
		// Comprobamos cuál es más corto. Imprimiremos un mensaje
		// u otro en función de cuál sea más corto.
		if(firstValue.length() < secondValue.length()) {
			System.out.println("La palabra: \"" + firstValue + "\" es la más corta.");
		} else {
			System.out.println("La palabra: \"" + secondValue + "\" es la más corta.");
		}
		
		// Cerramos el Scanner.
		GetValue.SCANNER.close();
	}

}

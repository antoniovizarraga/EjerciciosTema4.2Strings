package ejerciciostema42strings;

/**
 * Vamos a crear un programa que cuando se le pase una palabra,
 * la imprima invertida.
 */
public class Ejercicio05 {
	
	public static String inverseOrder (String word) {
		// String que tendrá la palabra invertida.
		String inverseWord = "";
		
		// Bucle for que invertirá la palabra.
		for(int i = word.length() - 1; i >= 0; i--) {
			inverseWord += word.charAt(i);
		}
		
		// Retornamos la palabra ya invertida.
		return inverseWord;
	}

	public static void main(String[] args) {
		// String que contendrá la palabra.
		String palabra = "";
		
		// String que contendrá el resultado final.
		String result = "";
		
		// Pedimos el input al usuario.
		palabra = GetValue.getString("Introduzca una palabra.");
		
		// El resultado que tendrá la palabra invertida.
		result = inverseOrder(palabra);
		
		// Imprimimos el resultado.
		System.out.println(result);

		// Cerramos el Scanner.
		GetValue.SCANNER.close();
	}

}

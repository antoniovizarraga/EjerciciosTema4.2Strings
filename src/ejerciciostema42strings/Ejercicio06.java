package ejerciciostema42strings;

/**
 * Ejercicio el cual vamos a pedir al programa un String hasta
 * que el usuario introduzca la palabra: "fin". Cuando lo
 * introduzca, no se introducirá dicha palabra. Sólo se
 * introducirán las anteriores e imprimiremos todas ellas
 * con espacios entre dichas palabras.
 */
public class Ejercicio06 {

	public static void main(String[] args) {
		// String que tendrá el input del usuario.
		String userValue = "";
		
		// String que tendrá las palabras.
		String words = "";
		
		// El input del usuario
		userValue = GetValue.getString("Introduzca una palabra.");
		
		
		while (!userValue.equalsIgnoreCase("fin")) {
			words += userValue + " ";
			
			userValue = GetValue.getString("Introduzca otra palabra. Introduzca la palabra: \"fin\""
			+ " para que el programa deje de pedirte que introduzcas un texto.");
			
		}
		
		// Imprimimos el resultado final.
		System.out.println(words);

	}

}

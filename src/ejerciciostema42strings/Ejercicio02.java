package ejerciciostema42strings;

/**
 * Vamos a crear el juego de acertar la contraseña. Habrán dos jugadores. El
 * primero meterá una contraseña, y el segundo intentará acertar la palabra. La
 * clave está en que el juego mostrará unos asteriscos, y cada vez que el
 * usuario vaya acertando las letras, sustituirá dichos asteriscos por las
 * letras que el segundo jugador haya acertado.
 * 
 * @author Antonio
 * @version 1.0
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		// Creamos el String que contendrá la contraseña
		// o palabra que tendrá que adivinar el jugador 2.
		String password = "";
		
		/* Esta cadena contendrá la palabra que hay que
		 * adivinar pero sustituyéndola por arteriscos. */
		String wordToGuess = "";
		
		// Esta cadena será el input del usuario para
		// no machacar los valores originales.
		String userValue = "";
		
		// Este char contendrá la primera letra del
		// input del usuario.
		/* NOTA: Creé un char porque originalmente
		 * mi idea para hacer este ejercicio era
		 * usando funciones de los Strings. Luego
		 * me di cuenta que lo mejor era pasarlo
		 * todo a un Array de carácteres. */
		char firstCharOfPassword = 'O';
		
		// El array que tendrá los carácteres de la contraseña.
		char[] passCharacters;
		
		// El array de la contraseña con asteriscos.
		char[] wordCharacters;
		
		// Le pedimos al usuario la contraseña.
		password = GetValue.getString("Jugador 1, introduzca la contraseña: ");
		
		
		// Ve añadiendo asteriscos a la cadena de asteriscos
		// tantas veces como carácteres tenga password.
		for (int i = 0; i < password.length(); i++) {
			wordToGuess += "*";
		}
		
		// Imprime varias líneas para que el segundo jugador no vea
		// la contraseña que escribe el usuario.
		/* Esto sería como un equivalente a un: "cls" en CMD, o un
		 * "Clear" en la terminal de Linux. */
		for (int i = 0; i < 50; ++i) System.out.println();

		
		System.out.println("La palabra a acertar es: " + wordToGuess);
		System.out.println("¡Escriba letras hasta formar la palabra completa!");

		// Pasamos las cadenas a tablas de carácteres.
		passCharacters = password.toCharArray();
		wordCharacters = wordToGuess.toCharArray();
		
		// Y repite este código hasta que el usuario acierte la palabra.
		do {
			// Ve pidiendo el valor.
			userValue = GetValue.getString("Introduzca una letra: ");
			
			// Coge la primera letra de la cadena introducida por el usuario.
			firstCharOfPassword = userValue.charAt(0);

			/* Recorre el array de la contraseña hasta que encuentres
			 * la primera letra que introduce el usuario. Si la
			 * encuentras, escribe en la misma posición en la
			 * que estaría dicha letra en el Array de asteriscos. */
			for (int i = 0; i < passCharacters.length; i++) {
				if (passCharacters[i] == firstCharOfPassword) {
					wordCharacters[i] = firstCharOfPassword;
				}
			}
			
			// Pasamos la tabla a String.
			wordToGuess = String.valueOf(wordCharacters);
			
			// Imprimimos el progreso del usuario.
			System.out.println("Ahora la palabra es: " + wordToGuess);
			
			
		}while(!wordToGuess.equalsIgnoreCase(password));
		
		// Si sale del bucle, significa que por fin ha acertado la palabra.
		System.out.println("¡Felicidades! Acertaste la palabra.");
		
		// Cerramos el Scanner.
		GetValue.SCANNER.close();
	}

}

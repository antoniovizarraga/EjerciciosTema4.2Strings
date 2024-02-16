package ejerciciostema42strings;

/**
 * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan
 * siempre comienzan sus frases con “Javalín, javalón”, para después hacer una
 * pausa más o menos larga (la pausa se representa mediante espacios en blanco o
 * tabuladores) y a continuación expresan el mensaje. Existe un dialecto que no
 * comienza sus frases con la muletilla anterior, pero siempre las terminan con
 * un silencio, más o menos prolongado y la coletilla “javalén, len, len”. Se
 * pide diseñar un traductor que, en primer lugar, nos diga si la frase
 * introducida está escrita en el idioma de Javalandia (en cualquiera de sus
 * dialectos), y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
 * 
 */
public class Ejercicio09 {
	/**
	 * Atributo que contiene el dialecto: "javalén, len, len."
	 */
	private static final String DIALECTO_JAVALEN = "javalén, len, len.";
	
	
	/**
	 * Atributo que tiene el dialecto: "Javalín, javalón."
	 */
	private static final String DIALECTO_JAVALIN = "Javalín, javalón.";

	
	/**
	 * Método que traducirá las frases que contengan dialectos.
	 * @param text El texto que traduciremos luego en la función
	 * @return messageToReturn Devuelve l mensaje ya traducido sin los dialectos.
	 */
	public static String translator(String text) {
		
		// Creamos una copia del texto a traducir para no machacarlo.
		String textToTranslate = text;
		
		// El String que devolveremos.
		String messageToReturn = ""; 
		
		// Hacemos un trim para eliminar posibles espacios al principio y final del texto.
		messageToReturn = textToTranslate.trim();
		
		// Comprobamos si tiene el dialecto: "Javalín, Javalón".
		if(textToTranslate.startsWith(DIALECTO_JAVALIN)) {
			
			// Reemplazamos dicho dialecto por texto vacío.
			messageToReturn = text.replace(DIALECTO_JAVALIN, "");
			
			// Esto se hace para eliminar los posibles espacios después de
			// la frase: "Javalín, javalón".
			messageToReturn = messageToReturn.trim();
			
			// Si no tiene el dialecto, como no contemplamos la posibilidad
			// de que no tenga ambos dialectos a la vez, comprobamos en caso
			// de fallo si contiene el dialecto: "javalén, len, len".
		} else if(textToTranslate.endsWith(DIALECTO_JAVALEN)) {
			
			// Reemplazamos dicho dialecto por texto vacío.
			messageToReturn = text.replace(DIALECTO_JAVALEN, "");
			
			// Esto se hace para eliminar los posibles espacios después de
			// la frase: "Javalén, len, len.".
			messageToReturn = messageToReturn.trim();
		}
		
		// Devolvemos el String ya traducido.
		return messageToReturn;
		
	}

	public static void main(String[] args) {
		// El mensaje que contiene un dialecto.
		String mensaje = "Javalín, javalón.			 Este cuento se ha acabado.";
		
		// Segundo mensaje que contiene otro dialecto.
		String mensaje2 = "Y esa es la historia de cómo conocí a vuestra madre.             javalén, len, len.";
		
		// Traducimos ambos mensajes.
		mensaje = translator(mensaje);
		mensaje2 = translator(mensaje2);
		
		// Imprimimos los mensajes.
		System.out.println(mensaje);
		System.out.println(mensaje2);
		
		
	}

}

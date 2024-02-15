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
	
	public static String translator(String text) {
		String textToTranslate = text;
		String messageToReturn = "";
		int position = 0;  
		if(text.indexOf("Javalín") != 0 || text.indexOf("Javalén") != 0) {
			messageToReturn = text.replace("Java", 0)
		}
		
	}

	public static void main(String[] args) {
		String mensaje = "Javalín, javalón.			 Este cuento se ha acabado.";
		
		String mensaje2 = "Y esa es la historia de cómo conocí a vuestra madre.             Javalén, len, len.";
		
		
	}

}

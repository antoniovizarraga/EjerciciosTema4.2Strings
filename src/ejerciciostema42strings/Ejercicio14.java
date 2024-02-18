package ejerciciostema42strings;

import java.util.Arrays;

/**
 * Clase que contendrá un algoritmo o función que reciba como parámetro una
 * frase leída del teclado por el usuario, y devuelva cuántas veces se repite
 * cada letra de la frase.
 */
public class Ejercicio14 {

	public static void main(String[] args) {

		// Pedimos al usuario la frase.
		String phrase = GetValue.getString("Introduzca una frase: ");

		// Contamos las letras de la frase.
		phrase = countChar(phrase);

		// Imprimimos el resultado final.
		System.out.println(phrase);
		
		// Cerramos el Scanner.
		GetValue.SCANNER.close();

	}

	/**
	 * Función que contará cuántas letras tiene una frase dada.
	 * 
	 * @param text La frase que comprobaremos cuántas veces se repiten las 
	 * letras que tiene.
	 * @return textToReturn Devuelve una cadena que contiene las veces que
	 * se repiten las letras.
	 */
	public static String countChar(String text) {
		// Hacemos referencia al texto original para no machacarlo.
        String textAsReference = text.toLowerCase();
        
        // El texto que devolveremos.
        String textToReturn = "";
        
        /* Creamos un bucle el cual recorra toda la tabla unicode (El
         * abecedario) desde la a hasta la z. */
        for (char character = 'a'; character <= 'z'; character++) {
        	// Variable que contará cuántas veces se repite una letra.
            int count = 0;
            
            /* Recorremos la frase y comprobamos si sus letras
             * corresponden con las letras del abecedario. */
            for (int i = 0; i < textAsReference.length(); i++) {
                if (textAsReference.charAt(i) == character) {
                	// De ser ser así, suma 1 al contador.
                    count++;
                }
            }
            
            // Finalmente, comprobamos si la frase no está vacía.
            if (count > 0) {
            	// Si no lo está, asigna los valores.
                textToReturn += "\n" + character + ": " + count + " veces.";
            }
        }
        
        // Devolvemos cuántas veces se han repetido las letras.
        return textToReturn;
    }
	
	

}

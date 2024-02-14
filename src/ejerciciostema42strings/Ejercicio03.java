package ejerciciostema42strings;

/**
 * Vamos a crear un programa que contenga una función la cual reciba una
 * frase como parámetro, y devuelva cuántos espacios en blanco tiene
 * dicha frase.
 */
public class Ejercicio03 {

	/**
	 * Método que recibe una frase como parámetro y devuelve cuántos
	 * espacios tiene.
	 * @param phrase Frase que se le pasará como parámetro y que usaremos de referencia
	 * para contar los espacios.
	 * @return howManySpaces Lo que devolveremos realmente será la longitud del Array con un
	 * howManySpaces.length, restándole 1.
	 */
	public static int quote(String phrase) {
		// El array que dividirá la frase pasada como parámetro
		// y contará cuántos espacios tiene.
		String[] howManySpaces;
		
		// Insertamos los elementos en el Array con un split.
		howManySpaces = phrase.split(" ");
		
		// Devolvemos la longitud restándole 1.
		return howManySpaces.length - 1;
	}
	
	public static void main(String[] args) {
		// Creamos la variable que contendrá el número de espacios.
		int spacesCount = 0;
		
		// Guardamos la cantidad de espacios que contendrá cualquier
		// frase que pongamos aquí.
		spacesCount = quote("Hola Soy Tony");
	
		// Imprimimos el resultado.
		System.out.println(spacesCount);

	}

}

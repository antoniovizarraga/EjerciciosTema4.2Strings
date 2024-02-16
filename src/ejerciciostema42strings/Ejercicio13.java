package ejerciciostema42strings;

import java.util.Arrays;

/**
 * Crearemos un programa que con una función que tendrá como parámetros dos palabras,
 * 
 */
public class Ejercicio13 {

	public static boolean isAnagram(String firstWord, String secondWord) {
		boolean anagramCheck;
		
		char[] firstWordTable = firstWord.toLowerCase().toCharArray();
		char[] secondWordTable = secondWord.toLowerCase().toCharArray();
		
		Arrays.sort(firstWordTable);
		Arrays.sort(secondWordTable);

		anagramCheck = Arrays.equals(firstWordTable, secondWordTable);
		
		
		return anagramCheck;
	}
	
	public static void main(String[] args) {
		boolean isAnagram;
		
		String word1 = "Amar";
		String word2 = "Rama";
		
		isAnagram = isAnagram(word1, word2);
		
		System.out.println(isAnagram);

	}

}

package ej3;

/*
Implemente un algoritmo recursivo que convierta un número en notación decimal a su
equivalente en notación binaria.
*/

public class ConvertirDecimalABinario {

	public String convertirABinario(int numero){
		String binario = "";
		
		while(numero >= 1) {
			binario += numero % 2 + " ";
			numero = (int) Math.floor((numero / 2));
			convertirABinario(numero);
		}
		
		binario = reverseInputString(binario);
		
		return binario;
	}
	
	public static String reverseInputString(String myString) {

		if (myString == null)
			return myString;

		String reverseString = "";

		for (int i = myString.length() - 1; i >= 0; i--) {

			reverseString = reverseString + myString.charAt(i);
		}
		
		return reverseString;
	}
}

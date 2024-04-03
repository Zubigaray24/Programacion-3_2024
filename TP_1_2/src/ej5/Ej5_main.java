package ej5;

public class Ej5_main {
	public static void main(String [] Args) {
		Ej5 prueba = new Ej5();
		
		int [] arr = {-3, -1, 0, 2, 4, 6, 10};
		int inicio = 0;
		
		System.out.println(prueba.valorIgualIndiceBoolean(arr, inicio));
		
		System.out.println(prueba.valorIgualIndiceString(arr, inicio));
	}
}

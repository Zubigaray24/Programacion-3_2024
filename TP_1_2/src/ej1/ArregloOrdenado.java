package ej1;

/*
Implemente un algoritmo recursivo que determine si un arreglo de tamaño N está ordenado y
responda:
1. ¿Qué complejidad O tiene? (La complejidad en el peor caso)
2. ¿Trae algún problema hacerlo recursivo? ¿Cuál?
3. ¿Qué cambiaría si la estructura fuera una lista en lugar de un arreglo?
*/

public class ArregloOrdenado {
	
	public void main(String [] Args) {
		int [] arr = {2, 7, 4, 8, 3, 9, 1, 5, 10, 6};
		System.out.println(comprobarSiElArregloEstaOrdenado(arr, 0));
	}
	
	public boolean comprobarSiElArregloEstaOrdenado(int[] arr, int inicio) {
	    if (inicio >= arr.length - 1) {
	        // Llegamos al final del arreglo, no hay más elementos para comparar
	        return true;
	    }

	    if (arr[inicio] > arr[inicio + 1]) {
	        // El arreglo no está ordenado
	        return false;
	    }

	    // Continuamos con el siguiente elemento
	    return comprobarSiElArregloEstaOrdenado(arr, inicio + 1);
	}
}

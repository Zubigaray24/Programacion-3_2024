package ej2;

/*
Implemente un algoritmo recursivo para buscar un elemento en un arreglo ordenado
ascendentemente.
*/

public class BuscarElemento {
	public void main(String [] Args) {
		
	}
	
	public int buscarElemento(int [] arr, int numeroBuscado, int inicio) {
		if(inicio >= arr.length) {
			System.out.println("El elemento no se encuentra");
			return -1;
		}
		
		if(arr[inicio] == numeroBuscado) {
			return inicio;
		}
		
		return buscarElemento(arr, numeroBuscado, inicio + 1);
	}
}

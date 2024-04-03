package ej5;

/*
Dado un arreglo ordenado de números distintos A se desea construir un algoritmo que
determine si alguno de los elementos de dicho arreglo contiene un valor igual a la posición en la
cuál se encuentra, es decir, A[i] = i.
1. Construir un algoritmo recursivo que responda a dicha verificación.
2. Mostrar la pila de ejecución para la invocación algoritmo([-3, -1, 0, 2, 4, 6, 10])
*/

public class Ej5 {
	
	public boolean valorIgualIndiceBoolean(int [] arr, int pos) {

		if(arr[pos] == pos) {
			return true;
		}
		else {
			return valorIgualIndiceBoolean(arr, pos+1);
		}
	}
	
	public String valorIgualIndiceString(int [] arr, int pos) {
		
		if(arr[pos] == pos) {
			return "En la posicion "+ pos + " contiene un valor igual a su indice " + arr[pos];
		}
		else {
			return valorIgualIndiceString(arr, pos+1);
		}
	}
}


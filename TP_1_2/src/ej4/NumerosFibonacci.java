package ej4;

/*
Implemente un algoritmo recursivo que presente los primeros N términos de la secuencia de
Fibonacci.
Por ej. los 6 primeros términos son: 0 1 1 2 3 5
*/

public class NumerosFibonacci {
	
	public int fibonacciRecursivo(int n) {
		 
        //CASO BASE, si es cero devuelve un cero
        //Puedes poner n<=0 tambien para incluir negativos
        if (n == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1    
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
 
	}
	
	public void fibonacciComun(int n) {
		int num1 = 0, num2 = 1, suma = num1 + num2;
		
		int indice = 0;
		
		if(indice < 2) {
			System.out.println(num1);
			System.out.println(num2);
			indice = 2;
		}
		
		while(indice < n) {
			System.out.println(suma);
			num1 = num2;
			num2 = suma;
			suma = num1 + num2;
			indice++;
		}
	}

}


package ej4;

public class Ej4_main {
	public static void main(String [] Args) {
		NumerosFibonacci a = new NumerosFibonacci();
		int serie = 6;
		
       /* for (int i = 0; i < serie; i++) {
        	 
            System.out.println(a.fibonacciRecursivo(i));
        }*/
		
		a.fibonacciComun(serie);
		
	}
}

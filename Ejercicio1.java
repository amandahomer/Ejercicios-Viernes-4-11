/*Este programa muestra la suma, la resta, la division y la
multiplicacion de dos valores.
@AmandaNR */

public class Ejercicio1 {

	public static void main (String [] args) {
//Declaro las variables x, y, y las operaciones//
		int x;
		int y;
		double suma,resta,division,multiplicacion;
		
		x = 144;
		y = 999;
		
		suma = x + y;
		resta = x - y;
		division = x / y;
		multiplicacion = x * y;
		
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la resta es: " + resta);
		System.out.println("El resultado de la division es: " + division);
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
		
	}
}

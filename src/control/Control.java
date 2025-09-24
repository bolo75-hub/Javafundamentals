package control;

import java.lang.annotation.ElementType;
import java.util.Random;

public class Control {

	public static void main(String[] args) {
	Random random = new Random();
	
	int num1 = 22;
	int num2 = 50;
	int result;
	result = num1 * num2;
	System.out.println(result);
	/**
	 * the number stored in "result"
	 */
	if (result > 0) {
		System.out.println("El numero 1 es mayor que el numero 2");
	} else {
		//
		System.out.println("El numero 1 es menor que el numer 2");
     	}
	}
}

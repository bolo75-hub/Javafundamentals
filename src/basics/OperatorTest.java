package basics;



public class OperatorTest {

	public static void main(String[] args) {
		
		arithmeticOperationTest();
		unaryOperatosTest();
		//Assignment operators test
		assigmentOperatorsTest();
	}
	
	private static void assigmentOperatorsTest() {
		int number1 = 3;
		int number2 = 28;
		float result = number1 + number2;
		System.out.println(result);
		result += number1;//result = result + number1;
		System.out.println(result);
		result /= number1;//result = result / number1;
		System.out.println(result);

	}

	private static void unaryOperatosTest() {
		/**
		 * Unary plus (positive value) -
		 * Unary minus (negation)
		 * Increment (pre/post)
		 * Decrement (pre/post)
		 * Logical NOT
		 * Bitwise complement
		 */
		int num1 = -234;
		num1++;//Increment
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		System.out.println(num1++);
		/**
		 * In this case, the compiler first print the value of the variable,
		 * them add 1 to the variable, as if there were two lines of code like
		 * the following:
		 * system.out.println(num1);
		 * num1 = num1 +1;
		 */
		System.out.println(num1++);
		num1--;
		--num1;
		//logical not
		System.out.println(num1 == 234);
		System.out.println(!(num1 == 234));
		
	}


	
	
	private static void arithmeticOperationTest() {
		//declaring three integer variables
		int num1 = 5, num2, num3 =50;
		System.out.println(num1);
		num1 = 3;
		System.out.println(num1);
		num2 = 3;
		int result;
		/**1 Se leen los valores de los operandes
		 * 2 se realiza la operacion con los operandes
		 * 3 Se asigna el resultado de la generacion a la 
		 * variable de al lado izquierdo
		 * */
		result = num1 + num2;
		System.out.println("the result is " + result);
		
		//subtraction
		result = result - num3;
		System.out.println("the result is " + result);
		//multiplication
		result = result * 2;
		System.out.println("the result is " + result);
		//division
		result = result / 2;
		System.out.println("the result is " + result);
	}
}

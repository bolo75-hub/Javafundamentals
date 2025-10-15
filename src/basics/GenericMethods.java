package basics;

import java.lang.annotation.ElementType;
import java.util.Arrays;

public class GenericMethods {
	public static void main(String[] args) {
		String[] names = { "jorge", "juan", "alvaro", "diego", "nicolas" };
		Integer[] scores = { 12, 1000, 3423, 34, 2, 20, 3, 2 };
		switchValues(names, 0, 1);
		switchValues(scores, 0, 1);
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(scores));
	}

/**
 * we can create generic methods to reach its maximum reusability
 * @param <Element> The name of the generic type
 * @param arr
 * @param index1
 * @param index2
 */	
	
public static <Element> void swithValues(Element[] arr, int index1, int idex2) {
	
	if (arr == null) {
		return;
	}
	
	if (index1 < 0 || index2 < 0) {
	
	
	
	
	
	
	}

	private void switchValues(String[] names, int i, int j) {
		// TODO Auto-generated method stub

	}
}

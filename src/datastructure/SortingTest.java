package datastructure;

import java.util.Arrays;

public class SortingTest {

	public static void main(String[] args) {
		String[] names = { "jorge", "juan", "alvaro", "diego", "nicolas" };
		int[] scores = { 12, 1000, 3423, 34, 2, 20, 3, 2 };
		Sort(scores);

	}

	private static void Sort(int[] arr) {

		int j = 0;
////
////		for (int i = 0; i < arr.length - 1 - j; i++) {
////			int previous = arr[i];
////			int next = arr[i + 1];
////			if (previous > next) {
////				Arraytest.switchValues(arr, i, i + 1);
////				System.out.println(Arrays.toString(arr));
////			}
////		}
////		j++;

		while (j < arr.length) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				int previous = arr[i];
				int next = arr[i + 1];
				if (previous > next) {
					Arraytest.switchValues(arr, i, i + 1);
					System.out.println(Arrays.toString(arr));
				}
			}
			j++;

		}
	}
}
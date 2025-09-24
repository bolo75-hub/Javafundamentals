package datastructure;

import java.util.Random;

import oopmodeling.planet;

public class Arraytest {

	public static void main(String[] args) {
		
		
		String[] names = { "Pablo", "Juan" };
		System.out.println(names[1]);
		planet[] planets = { new planet(), new planet() };

		
		
		sumup();
		
		// create an array with a capacity of storing 10000 integers
		int[] nums = new int[1000];
		System.out.println("the length of the number array is " + nums.length);
		
		initializeArray(nums);

		FindMaxMin(nums);

		while (true) {
			break;

		}
	}

	private static void sumup() {
		int[] scores = { 12, 34, 3423, 32 };
		System.out.println(scores[0]);// Access is the first element in the array
		System.out.println(scores[1]);// Retrieve is The second
		System.out.println(scores[2]);
		System.out.println(scores[3]);

		try {
			System.out.println(scores[3445]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		int total = scores[0] + scores[1] + scores[2];
		System.out.println("the total score is" + total);
		int totalscore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalscore = totalscore + scores[i];
			System.out.println("total sacore = " + totalscore);
		}
	}

	/**this method is used to find the maximum and minimum values 
	 * contained in an array passed as parameter and print them
	 * @param nums */
	private static void FindMaxMin(int[] nums) {
		// TODO Auto-generated method stub
		int maximum = nums[0];
		int minimum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			
			/**If the current maximum is less than the element
			 * that we are accessing, we change the maximum to 
			 * the value of the element */
			
			
			
			
			if (maximum < nums[i]) {
				maximum = nums[i];
			}
			
			if (minimum < nums [i]) {
				minimum = nums[i];
			}
			
			
		}
		
		
		
		
		}
	

	private static void initializeArray(int[] nums) {
		// TODO Auto-generated method stub

		Random random = new Random();
		random.nextInt(-100000, 10000000);
		nums[0] = random.nextInt(-100000, 10000000);

		int len = nums.length;
		int j = 0;
		while (len > j) {
			nums[j] = random.nextInt(-100000, 10000000);
			j = j + 1;// this operation is the same as j++

		}

	}
}

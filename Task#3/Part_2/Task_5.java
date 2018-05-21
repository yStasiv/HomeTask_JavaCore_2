package Part_2;

import java.util.Random;

public class Task_5 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] Array1 = new int[5];
		int[] Array2 = new int[5];
		int sum1 = 0, sum2 = 0;
		System.out.print("Array_1 : ");
		for (int i = 0; i < Array1.length; i++) {
			Array1[i] = rand.nextInt(6);
			sum1 += Array1[i];
			System.out.print(Array1[i] + " ");
		}
		System.out.println();
		System.out.print("Array_2 : ");
		for (int i = 0; i < Array2.length; i++) {
			Array2[i] = rand.nextInt(6);
			sum2 += Array2[i];
			System.out.print(Array2[i] + " ");
		}
		System.out.println();
		System.out.print("First array sum= " + sum1 + "\n");
		System.out.print("Second array sum = " + sum2);
		System.out.println();
		if (sum1 > sum2) {System.out.println("First array is igger");}
		else if (sum1 == sum2) {System.out.println("First array like a second array, or vice versa");}
		else {System.out.println("Second array is bigger");	}
	}
}

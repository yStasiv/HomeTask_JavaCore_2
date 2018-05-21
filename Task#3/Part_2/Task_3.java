package Part_2;

import java.util.Random;

public class Task_3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] Array = new int[15];
		int Even = 0;
		for (int i = 0; i < Array.length; i++) {
			Array[i] = rand.nextInt(10);
			System.out.print(Array[i] + " ");
			if (Array[i] % 2 == 0 && Array[i] != 0) {
				Even++;
			}
		}
		System.out.println();
		System.out.print("The number of even numbers - " + (Even));
	}
}

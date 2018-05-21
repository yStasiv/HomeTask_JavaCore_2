package Part_2;

import java.util.Random;

public class Task_4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] Array = new int[8];
		int[] Array1 = new int[8];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = 1 + rand.nextInt(10);
			System.out.print(Array[i] + " ");
			if (Array[i] % 2 != 0) {
				Array1[i] = 0;
				System.out.print("- " + Array1[i]);
			}
			System.out.println();
		}
	}
}

// не зм≥г реал≥зувати в р€рок
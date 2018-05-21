package Part_2;

import java.util.Random;

public class Task_8 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] Array = new int[12];
		int index = 0;
		for (int i = 0; i < Array.length; i++) {
			Array[i] = rand.nextInt() % 16;
			System.out.print(Array[i] + " ");
		}
		int max = Array[0];
		for (int i = 1; i < Array.length; i++) {
			if (max < Array[i]) {
				max = Array[i];
				index = i;
			}
		}
		System.out.println();
		System.out.println("Max element is : " + max + ", and his index is : " + index);
	}
}

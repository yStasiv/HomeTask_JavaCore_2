package Part_2;

import java.util.Random;

public class Task_9 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] Array1 = new int[10];
		int[] Array2 = new int[10];
		int[] Array3 = new int[10];
		int sum = 0;

		System.out.print("First Array  : ");
		for (int i = 0; i < Array1.length; i++) {
			Array1[i] = rand.nextInt(10);
			System.out.print(Array1[i] + " ");
		}
		System.out.println();
		System.out.print("Second Array : ");
		for (int i = 0; i < Array2.length; i++) {
			Array2[i] = rand.nextInt(10);
			System.out.print(Array2[i] + " ");
		}
		System.out.println();
		System.out.print("Third Array : ");
		for (int i = 0; i < Array3.length; i++) {
			Array3[i] = Array1[i] + Array2[i];
			System.out.print(Array3[i] + " ");
			if (Array3[i] % 1 == 0) {
				sum++;
			}
		}
		System.out.println();
		System.out.println("Full elements " + sum + "?");
	}
}

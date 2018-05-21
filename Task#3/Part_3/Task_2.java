package Part_3;

import java.util.Random;

public class Task_2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][] Array = new int[5][8];
		int maxI = 0, maxJ = 0;
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				Array[i][j] = rand.nextInt() % 100;
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				if (Array[maxI][maxJ] < Array[i][j]) {
					maxI = i; maxJ = j;	}
			}
		}
		System.out.println("Maximum element for such coordinates: i = " + maxI + ", j = " + maxJ);
	}
}

package Part_3;

import java.util.Random;

public class Task_1 {
public static void main(String[] args) {
	Random rand = new Random();
	int[][] Array = new int[8][5];
	for(int i =0; i< Array.length; i++) {
		for(int j = 0; j< Array[i].length; j++) {
			Array[i][j] = 10 + rand.nextInt(90);
			System.out.print(Array[i][j] + " ");
		}System.out.println();
	}
}
}

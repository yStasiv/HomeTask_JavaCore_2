package Part_2;

import java.util.Random;

public class Task_10 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] Array = new int[11];
		int num0 = 0, num1 = 0, num_1 = 0;
		for (int i = 0; i < Array.length; i++) {
			Array[i] = rand.nextInt() % 2;
			System.out.print(Array[i] + " ");
			if (Array[i] == 0) {num0++;}
			if (Array[i] == 1) {num1++;}
			if (Array[i] == -1) {num_1++;}
		}
		System.out.println();
		if(num0>num1 && num0>num_1) {System.out.println("null is more!");}
		else if(num1>num0 && num1 > num_1){System.out.println("ones is more!");}
		else if(num_1>num0 && num_1 > num1){System.out.println("minus one is more!");}
		else if(num0 == num1 || num0 == num_1 ||num1==num_1) {System.out.println();}

	}
}

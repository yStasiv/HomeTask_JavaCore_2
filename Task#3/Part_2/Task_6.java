package Part_2;

import java.util.Random;

public class Task_6 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] Array = new int[4];
		for(int i = 0; i < Array.length;i++) {
			Array[i] = 10 + rand.nextInt(80);
			System.out.print(Array[i]+" ");

		}
		System.out.println();
		if(Array[0]< Array[1]&& Array[1]<Array[2] && Array[2] < Array[3]) {System.out.print("Nice! It's a growing consistency");}
		else System.out.print("Wow, we have some problem! it's not a growing consistency");
	}
}

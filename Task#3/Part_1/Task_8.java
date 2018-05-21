package Part_1;

import java.util.Scanner;

public class Task_8 {
	public static void main(String[] args) {
		System.out.print("Enter \"n\": ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.print("Positive divisors your number are: ");
		for (int i = 1; i >= 0; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}

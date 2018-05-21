package Part_1;

import java.util.Scanner;

public class Task_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter natural number: ");
		int a = scan.nextInt();
		for (int i = (int) Math.sqrt(a); i >= 1; i--) {
			if (a % i == 0 && i != 1) {
				System.out.println(a + " - is a composite");
				break;
			}
			if (i == 1)
				System.out.println(a + " - is simple");
		}
	}
}

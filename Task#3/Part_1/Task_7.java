package Part_1;

import java.util.Scanner;

public class Task_7 {
	public static void main(String[] args) {
		System.out.print("Enter \"n\": ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n1 = 1;
		for (int i = 1; i <= n; i++) {
			n1 = n1 * i;
		}
		System.out.println(n + "! = " + n1);
	}
}

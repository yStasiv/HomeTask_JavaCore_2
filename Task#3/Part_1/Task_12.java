package Part_1;

import java.util.Scanner;

public class Task_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long sum = 0;
		System.out.print("Enter your nimber: ");
		for (long n = scan.nextLong(); n != 0; n /= 10) {
			sum += n % 10;
		}
		System.out.println("The sum of all numbers is: "+sum);
	}
}

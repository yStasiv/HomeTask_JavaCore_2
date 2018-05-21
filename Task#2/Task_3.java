package $HomeTask_2;

import java.util.Scanner;

public class Task_3 {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter \'a\', \'b\'and \'c\' for quadratic equation: ");
		double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble(), x1, x2;
		double sqrtDesk = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		if (sqrtDesk >= 0) {
			x1 = (-b + sqrtDesk) / 2 * a;
			x2 = (-b - sqrtDesk) / 2 * a;
			System.out.print("x1 = " + x1 + " and x2 = " + x2);
		}else{System.out.println("Truble");}

	}

}

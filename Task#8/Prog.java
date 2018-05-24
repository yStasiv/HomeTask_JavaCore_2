package Money;

import java.util.Scanner;

public class Prog {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String type;
		
		do {
			System.out.print(
					"How type salary you want to look?\nFor mounth press \"1\" or for hour press \"2\", for Exit press \"s\"\nSo, what your choose is : ");
			type = scan.next();
			if (!type.equals("1") && !type.equals("2") && !type.equals("s")) {
				System.out.println("Mistake! Please enter \"1\" or \"2\"");
			} 
				if (type.equals("1")) {
					System.out.print("Enter name worker by Mounth :");
					String name = scan.next();
					System.out.print("Enter experience this  worker :");
					double exp = scan.nextDouble();
					Salary w1 = new Worker1(name, exp, SalaryConst.MOUNTH);
					w1.earnSalary1();
					System.out.println();
				} else if (type.equals("2")) {
					System.out.print("Enter name worker by Hour :");
					String name = scan.next();
					System.out.print("Enter experience this  worker :");
					double exp = scan.nextDouble();
					Salary w1 = new Worker1(name, exp, SalaryConst.HOUR);
					w1.earnSalary1();
					System.out.println();
			}
		} while (!type.equals("s"));

	}
}

package $HomeTask_2;

import java.util.Scanner;

public class Task_2 {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input different number for m: ");
		double m = scan.nextDouble();
		System.out.println("Input different number for n: ");
		double n = scan.nextDouble();
		if(n<=0 || m<=0) {System.out.println("Enter number only > 0 ");}
		else if(m==10 || n==10 ) {System.out.println("Error, you enter\"10\"");}
		else if(m-n==0) {System.out.println("The distance is the same");}
		else {System.out.print("Up to 10 closest " + ((10-m) > (10-n) ? m : n));}
	}

}

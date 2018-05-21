package $HomeTask_2;

import java.util.Scanner;

public class Task_1 {
	public static void main(String[] arg) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your naumbe: ");
		int a= scan.nextInt();
		if(a==0) {System.out.println("You enter \"ZERO\"");}
		else {System.out.println(a%2==0?"Even":"Odd");}
	}
}

//if((a%2)==0) System.out.println("Even");
//else System.out.println("Odd");
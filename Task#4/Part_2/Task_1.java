package Part_2;

import java.util.Scanner;

public class Task_1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double a = scan.nextDouble();
	double b;
	b =  a - (int) a;
	if(b!=0) {System.out.println("Mistake");}
	else if(b%2==0) {System.out.println("Even");}
	else if(b%2!=0) {System.out.println("Odd");}
	}
}

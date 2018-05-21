package Part_2;

import java.util.Scanner;

public class Task_2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double a = scan.nextDouble(),b=scan.nextDouble(), fullA,fullB;
	fullA=a-(int)a;fullB=b-(int)b;
	if(fullA!=0 || fullB!=0) {System.out.println("error");}
	else {System.out.println((int)(a+b));}
}
}

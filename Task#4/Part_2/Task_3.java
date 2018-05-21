package Part_2;

import java.util.Scanner;

public class Task_3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a=Math.abs(scan.nextInt()), b=Math.abs(scan.nextInt()), c=Math.abs(scan.nextInt());
	if(a<b && a<c) {System.out.println(a);}
	else if(b<c)System.out.println(b);
	else if(a>b && a>c) {System.out.println(c);}
}
}

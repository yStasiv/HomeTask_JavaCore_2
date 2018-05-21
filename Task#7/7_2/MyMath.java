import java.util.Scanner;

public class MyMath {
 public static final double MY_PI = 3.141517;
 public static final double MY_NEW_EPSELON = 2.741517;
 Scanner scan = new Scanner(System.in);

 public void a_Plus_b_na_MY_PI() {
	 System.out.print("Enter a: ");
	 double a = scan.nextDouble();
	 System.out.print("Enter b: ");
	 double b = scan.nextDouble();
	 System.out.print(a + "+" + b +"*"+ MY_PI +" = ");
	 System.out.println((a + b)* MY_PI );
 }
 public void a_Minus_b_na_MY_PI() {
	 System.out.print("Enter a: ");
	 double a = scan.nextDouble();
	 System.out.print("Enter b: ");
	 double b = scan.nextDouble();
	 System.out.print(a + "-" + b +"*"+ MY_PI +" = ");
	 System.out.println((a - b)* MY_PI );
 }
 
 public void a_Plus_b_na_MY_NEW_EPSELON() {
	 System.out.print("Enter a: ");
	 double a = scan.nextDouble();
	 System.out.print("Enter b: ");
	 double b = scan.nextDouble();
	 System.out.print(a + "-" + b +"*"+ MY_NEW_EPSELON +" = ");
	 System.out.println((a - b)* MY_NEW_EPSELON );
 }
 
 public void a_Minus_b_na_MY_NEW_EPSELON() {
	 System.out.print("Enter a: ");
	 double a = scan.nextDouble();
	 System.out.print("Enter b: ");
	 double b = scan.nextDouble();
	 System.out.print(a + "-" + b +"*"+ MY_NEW_EPSELON +" = ");
	 System.out.println((a - b)* MY_NEW_EPSELON );
 }
 
}

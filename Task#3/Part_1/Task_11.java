package Part_1;

public class Task_11 {
	public static void main(String[] args) {
		int a = 1, b = 1;
		System.out.print(a+" "+b+" ");
		for (int i = 2; i < 11; i++) {
			int c= a+b;
			System.out.print(c+" ");
			a=b;b=c;
		}
	}
}

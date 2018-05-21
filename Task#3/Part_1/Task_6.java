package Part_1;

public class Task_6 {
	public static void main(String[] args) {
		int a = -166;
		for (int i = 0; i >= 0; i++) {
			int b = 2 * a * i - 1 + 200;
			if (b > 99 || b < 0) {
				break;
			}
			System.out.println(b);// жодне число не входить в цей діапазон...
		}
	}
}

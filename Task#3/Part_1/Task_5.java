package Part_1;

public class Task_5 {
	public static void main(String[] args) {
		int a = 2;
		for (int i = 0; i < 10000; i++) {
			int b = 2 * a * i - 1 - 1;
			if (b >= 10000) {
				break;
			}
			System.out.println(b);
		}
	}
}

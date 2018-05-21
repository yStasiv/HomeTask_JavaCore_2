package Part_1;

public class Task_10 {
	public static void main(String[] args) {
		int a1 = 2, a2 = 3;
		System.out.print("If n = 2: ");
		for (int n = 0; n < 12; n++) {
			int b = 2 * a1 * n - 2 - 2;
			System.out.print(b + " ");
		}
		System.out.print("\nIf n = 3: ");
		for (int n = 0; n < 12; n++) {
			int b1 = 2 * a2 * n - 2 - 2;
			System.out.print(b1 + " ");
		}
	}
}

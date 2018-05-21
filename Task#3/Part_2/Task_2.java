package Part_2;

public class Task_2 {
	public static void main(String[] args) {
		int[] Array = new int[100];
		for (int i = 1; i < Array.length; i++) {
			Array[i] = i;
			System.out.print(Array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < Array.length - 1; i++) {
			Array[i] = Array.length - i - 1;
			System.out.print(Array[i] + " ");
		}
	}
}

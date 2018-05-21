package Part_2;

public class Task_1 {
	public static void main(String[] args) {
		int[] Array = new int[20];
		for (int i = 0; i < Array.length; i += 2) {
			Array[i] = i + 2;
			System.out.print(Array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < Array.length; i += 2) {
			Array[i] = i + 2;
			System.out.println(Array[i]);
		}
	}
}

package Part_2;

public class Task_7 {
	public static void main(String[] args) {
		int[] Array = new int[20];
		for (int i = 0; i < Array.length; i++) {
			if (i < 2) {Array[i] = 1;}
			else {Array[i] = Array[i - 2] + Array[i - 1];}
			System.out.print(Array[i] + " ");
		}
	}
}

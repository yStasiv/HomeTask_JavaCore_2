package MyOriginalClass;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String again = "n";
		System.out.println("Мої рослини(містить багу)\n");
		Plants orange = new Plants("Апельсин", 14, 7, 0);
		Plants lemon = new Plants("Лимон", 14, 9, 1);
		Plants mandarin = new Plants("Мандарин", 14, 7, 1);
		Plants kiwi = new Plants("Ківі", 14, 18, 6);

		orange.fullResult();
		lemon.fullResult();
		mandarin.fullResult();
		kiwi.fullResult();

		do {
		Plants newPlant = new Plants();
		System.out.print("\nЗадайте тип рослини : ");
		newPlant.setType(scan.nextLine());
		System.out.print("Введіть термін від посадки : ");
		newPlant.setAge(scan.nextDouble());
		System.out.print("Введіть кількість сажанців : ");
		newPlant.setCount(scan.nextInt());
		System.out.print("Введіть скільки сажанців зійшло : ");
		newPlant.setCountResult(scan.nextInt());
		newPlant.fullResult();
		System.out.println("\n\nЩоб додати ще одну рослину натисніть \"y\"");
		again = scan.next();
		}while(again!="n");
		
		
		
	}
}

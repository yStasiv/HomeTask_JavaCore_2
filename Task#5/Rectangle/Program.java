package Rectangle;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Parametrs rec1 = new Parametrs();
		String again = "n";
		do {
			System.out.print("Задайте висоту прямокутника : ");
			rec1.setRectHeight(Math.abs(scan.nextDouble()));
			System.out.print("Задайте Ширину прямокутника : ");
			rec1.setRectWeight(Math.abs(scan.nextDouble()));
			System.out.print("Введіть кут нахилу прямокутника до горизонтальної осі : ");
			rec1.setRectAgn(Math.abs(scan.nextDouble()));
			rec1.setRectStyle('B');
			System.out.println("Задано прямокутник з параметрами: висота= "+rec1.getRectHeight()+" см, ширина = "+rec1.getRectWeight()+" см, кут нахилу = "+rec1.getRectAgn()+ " градусів та стилем \"" +rec1.getRectStyle() +"\"\n" );
			rec1.Perimeter("см");
			rec1.Square("см");
			System.out.println("\n\nЩеразок? Натісніть \"y\"");
			again = scan.next();
		} while (again != "n");

	}
}

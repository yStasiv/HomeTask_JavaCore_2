package Rectangle;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Parametrs rec1 = new Parametrs();
		String again = "n";
		do {
			System.out.print("������� ������ ������������ : ");
			rec1.setRectHeight(Math.abs(scan.nextDouble()));
			System.out.print("������� ������ ������������ : ");
			rec1.setRectWeight(Math.abs(scan.nextDouble()));
			System.out.print("������ ��� ������ ������������ �� ������������� �� : ");
			rec1.setRectAgn(Math.abs(scan.nextDouble()));
			rec1.setRectStyle('B');
			System.out.println("������ ����������� � �����������: ������= "+rec1.getRectHeight()+" ��, ������ = "+rec1.getRectWeight()+" ��, ��� ������ = "+rec1.getRectAgn()+ " ������� �� ������ \"" +rec1.getRectStyle() +"\"\n" );
			rec1.Perimeter("��");
			rec1.Square("��");
			System.out.println("\n\n�������? ������� \"y\"");
			again = scan.next();
		} while (again != "n");

	}
}

package MyOriginalClass;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String again = "n";
		System.out.println("�� �������(������ ����)\n");
		Plants orange = new Plants("��������", 14, 7, 0);
		Plants lemon = new Plants("�����", 14, 9, 1);
		Plants mandarin = new Plants("��������", 14, 7, 1);
		Plants kiwi = new Plants("ʳ�", 14, 18, 6);

		orange.fullResult();
		lemon.fullResult();
		mandarin.fullResult();
		kiwi.fullResult();

		do {
		Plants newPlant = new Plants();
		System.out.print("\n������� ��� ������� : ");
		newPlant.setType(scan.nextLine());
		System.out.print("������ ����� �� ������� : ");
		newPlant.setAge(scan.nextDouble());
		System.out.print("������ ������� �������� : ");
		newPlant.setCount(scan.nextInt());
		System.out.print("������ ������ �������� ����� : ");
		newPlant.setCountResult(scan.nextInt());
		newPlant.fullResult();
		System.out.println("\n\n��� ������ �� ���� ������� �������� \"y\"");
		again = scan.next();
		}while(again!="n");
		
		
		
	}
}

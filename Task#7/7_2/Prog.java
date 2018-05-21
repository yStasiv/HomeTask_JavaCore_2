import java.util.Scanner;

public class Prog {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String place;
	MyMath r1 = new MyMath();

	
	do {
		System.out.print("Choose (1-4) or 'n' for stope : ");
	switch (place = scan.next()) {
	case "1": r1.a_Plus_b_na_MY_PI(); break;
	case "2": r1.a_Minus_b_na_MY_PI(); break;
	case "3": r1.a_Plus_b_na_MY_NEW_EPSELON(); break;
	case "4": r1.a_Minus_b_na_MY_NEW_EPSELON(); break;
	case "n": System.out.println("To see you laiter!");
	}
		
	}while(!place.equals("n"));
		
		
	}
}


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Prog {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Student> list = new ArrayList<>();

		list.add(new Student("Yura", 1, Gender.MALE));
		list.add(new Student("Ivanka", 2, Gender.FEMALE));
		list.add(new Student("Ihor", 3, Gender.MALE));
		list.add(new Student("Olia", 4, Gender.FEMALE));
		list.add(new Student("Rostislav", 5, Gender.MALE));
		list.add(new Student("Vloldia", 6, Gender.MALE));
		list.add(new Student("Tetiana", 7, Gender.FEMALE));
		list.add(new Student("Sergy", 8, Gender.MALE));

		System.out.println("List with name :");
		for (Student stud : list) {
			System.out.println(stud);
		}
		System.out.print("Enter name that you want to delete : ");

		do {
			String name = scan.next();
			String deletedName = null;
			Iterator<Student> i = list.iterator();
			while (i.hasNext()) {
				Student stud2 = i.next();
				if (stud2.getName().equals(name)) {
					deletedName = stud2.getName();
					i.remove();
				}
			}
			if (deletedName != null) {System.out.println(deletedName + " was deleted\n");} 
			else {System.out.println("You enter mistake in this name\n");}
			if(list.isEmpty()) {System.out.println("List is empty");}
			else {System.out.println("New list : ");}
			
			for (Student stud : list) {
				System.out.println(stud);
			}
			
		} while (!list.isEmpty());
	}
}

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Prog {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Set<Commodity> goodslist = new TreeSet<>();
		goodslist.add(new Commodity("Door", "Grey", 170));
		goodslist.add(new Commodity("Window", "Blue", 170));

		int a;
		do {
			System.out.println("Hello! You can make this move: \n\"1\" - Add new Goods\n   \"2\" - Delete Goods");
			a = scan.nextInt(); int count ;
			switch (a) {
			case 1:
				do {
				System.out.println("How mach you want to add?");
				count = scan.nextInt();
				if(count >= 1) {
					for(int i=0; i< count; i++) {
						System.out.print("Enter type : "); String type = scan.next();
						System.out.print("Enter colour : "); String colour = scan.next();
						System.out.print("Enter price : "); int price = scan.nextInt();
						goodslist.add(new Commodity(type, colour, price));
					}}else if(count < 1) {System.out.println("Error");}				
				}while(count<1);				
				for(Commodity b : goodslist) {System.out.println(b);}break;	
				
			case 2:
				System.out.println("This is all list, what you want to delete?");
				for (Commodity stud : goodslist) {System.out.println(stud);}
				do {
					String type = scan.next(), deletedType = null;
					Iterator<Commodity> i = goodslist.iterator();
					while (i.hasNext()) {
						Commodity stud2 = i.next();
						if (stud2.getType().equals(type)) {
							deletedType = stud2.getType();
							i.remove();}
						}
					if (deletedType != null) {System.out.println(deletedType + " was deleted\n");} 
					//else if(deletedType.equals("s")) {break;}
					else {System.out.println("You enter mistake in this type\n");}
					if(goodslist.isEmpty()) {System.out.println("List is empty");}
					else {System.out.println("New list : ");}
					
					for (Commodity stud : goodslist) {System.out.println(stud);}					
				} while (!goodslist.isEmpty());
				
				
				
				
				default: System.out.println("Mistake! Choose from this list:");
			}
		}while(a>=1);
			
			
			
	}
}
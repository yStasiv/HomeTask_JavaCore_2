//import java.util.Scanner;
public class Commodity implements Comparable<Commodity>{
	private String type;
	private String colour;
	private int price;

	public Commodity(String type, String colour, int price) {
		super();
		this.type = type;
		this.colour = colour;
		this.price = price;
	}
	
	public String getType() {return type;}	public void setType(String type) {this.type = type;}
	public String getColour() {return colour;}	public void setColour(String colour) {this.colour = colour;}
	public int getPrice() {return price;}	public void setPrice(int price) {this.price = price;}


	@Override
	public String toString() {
		return "Commodity [type=" + type + ", colour=" + colour + ", price=" + price + "]";
		
	}

	@Override
	public int compareTo(Commodity o) {
		int sort = type.compareTo(o.type);
		if(sort == 0) {sort = colour.compareTo(o.colour);}
		if(sort == 0) {sort = price - o.price;}
		return sort;
	}
	
	
//	public void addGoods() {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter type : "); String type = scan.next();
//		System.out.print("Enter colour : "); String colour = scan.next();
//		System.out.print("Enter price : "); int price = scan.nextInt();
//			
//	}
}

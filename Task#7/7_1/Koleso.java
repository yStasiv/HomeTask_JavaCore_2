
public class Koleso {
	private int size;
	private String colour;

	
	public Koleso(int size, String colour) {
		this.size = size;
		this.colour	= colour;
	}
	
	public int getSize() {return size;}
	public void setSize(int size) {this.size = size;}
	public String getColour() {return colour;}
	public void setColour(String model) {this.colour = model;}

	@Override
	public String toString() {
		return "Koleso [size=" + size + ", colour=" + colour + "]";
	}
	
	public void colesoMove() {System.out.println(colour + " koleso is move"); }
	
}


public class Kuzov {
	private int size;

	public Kuzov(int size) {
		this.size = size;
	}

	public int getSize() {return size;}

	public void setSize(int size) {this.size = size;}

	@Override
	public String toString() {
		return "Kuzov [size=" + size + "]";
	}
	
	
	public void kuzovMove() {System.out.println("Kuzov is move"); }

}

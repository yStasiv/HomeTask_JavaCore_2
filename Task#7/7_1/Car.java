
public class Car {
	private Kermo kermo;
	private Kuzov kuzov;
	private Koleso koleso;
	private String name;

	public Car(String name, Kermo kermo, Kuzov kuzov, Koleso koleso) {
		this.name = name;
		this.kermo = kermo;
		this.kuzov = kuzov;
		this.koleso = koleso;
		
	}

	public Kermo getKermo() {return kermo;}
	public void setKermo(Kermo kermo) {this.kermo = kermo;}
	public Kuzov getKuzov() {return kuzov;}
	public void setKuzov(Kuzov kuzov) {this.kuzov = kuzov;}
	public Koleso getKoleso() {return koleso;}
	public void setKoleso(Koleso koleso) {this.koleso = koleso;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	@Override
	public String toString() {
		return "Car [CarName ="+ name+ ", kermo=" + kermo + ", kuzov=" + kuzov + ", koleso=" + koleso + "]";
	}
	public void kermoMove() {kermo.kermoMove();}

}

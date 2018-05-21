
public class Prog {
	public static void main(String[] args) {
		Koleso koleso = new Koleso(17, "Dark");
		Kuzov kuzov = new Kuzov(21);
		Kermo kermo = new Kermo("Suzuki");
		
		
		Car audi = new Car("Audi", kermo, kuzov, koleso);
		System.out.println(audi);
		koleso.colesoMove();
		kuzov.kuzovMove();
		audi.kermoMove();
	}

}

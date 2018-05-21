
public abstract class Pet {
	private String cat;
	private String dog;
	private String cow;

	public Pet(String cat, String dog, String cow) {
		this.cat = cat;
		this.dog = dog;
		this.cow = cow;
	}
	public Pet() {	}
	public String getCat() {return cat;}
	public void setCat(String cat) {this.cat = cat;}
	public String getDog() {return dog;}
	public void setDog(String dog) {this.dog = dog;}
	public String getCow() {return cow;}
	public void setCow(String cow) {this.cow = cow;}

	//public abstract void voice();

}

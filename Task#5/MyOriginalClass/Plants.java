package MyOriginalClass;

public class Plants {
	private String type;
	private double age;
	private int count;
	private int result;
	
	Plants() {
	}
	
	public String getType() {
		return type;}
	public double getAge() {
		return age;}
	public int getCount() {
		return count;}
	public int getResult() {
		return result;}
	
	public void setType(String type) {
		this.type = type;}
	public void setAge(double age) {
		this.age = age;}
	public void setCount(int count) {
		this.count = count;}
	public void setCountResult(int result) {
		this.result = result;}
	
	Plants(String type, double age, int count, int result){
		this.type = type;
		this.age = age;
		this.count = count;
		this.result = result;
	}
	
	public void fullResult() {
		System.out.println("Рослина \""+ type + "\" була посаджена " + age + " днів тому в кількості "+ count + " шт. Проросло "+ result +" шт.");
	}
	

}

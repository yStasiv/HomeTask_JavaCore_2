package Rectangle;

import javax.swing.text.Highlighter.Highlight;

public class Parametrs {
	private double height;
	private double weight;
	private double agn;//Кут нахилу
	private char style;//Ширина лінії
	
	
	public Parametrs() {
	}
	public Parametrs(double height,double weight, double agn, char style) {
		this.height = height;
		this.weight = weight;
		this.agn = agn;
		this.style = style;
	}
	public double getRectHeight() {
		return height;}
	public double getRectWeight() {
		return weight;}
	public double getRectAgn() {
		return agn;}
	public char getRectStyle() {
		return style;}

	
	
	public void setRectHeight(double height) {
		this.height = height;}
	public void setRectWeight(double weight) {
		this.weight = weight;}
	public void setRectAgn(double agn) {
		this.agn = agn;}
	public void setRectStyle(char style) {
		this.style = style;}

	
	public void Square(String dimension) {
		System.out.println("Площа прямокутника = " + height*weight +" "+ dimension + "(кв)");}
	public void Perimeter(String dimension) {
		System.out.println("Периметр прямокутника = "+(height+weight)*2 + " "+ dimension);
	}
}

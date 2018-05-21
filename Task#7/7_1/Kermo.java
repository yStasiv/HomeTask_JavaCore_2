
public class Kermo {
private String model;

public Kermo(String model) {
	this.model = model;
}

public String getModel() {return model;}

public void setModel(String model) {this.model = model;}

@Override
public String toString() {
	return "Kermo [model=" + model + "]";
}
public void kermoMove() {System.out.println(model + " is kermo model"); }

}

public class Cylinder extends Circle {
	private double height = 1.0;
	
	Cylinder(){
		
	}

	public Cylinder(double height) {
		this.height = height;
	}
	
	public Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double height, double radius, String color) {
		super(radius,color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return ("Cylinder Radius: " + this.getRadius() + " Cylinder Height: " + this.height + " Cylinder color: " + this.getColor());
	}
	
	public double getVolume() {
		return (this.getArea()*this.height);
	}
}
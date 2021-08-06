
public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	Circle(){
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return ("Circle Radius: " + this.radius + " Circle color: " + this.color);
	}
	
	public double getArea() {
		return (3.14*this.radius*this.radius);
	}
}

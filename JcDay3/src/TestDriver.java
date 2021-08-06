
public class TestDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(2,"blue");
		System.out.println(circle.toString());
		System.out.println(circle.getArea());
		Circle circle2 = new Circle(3);
		System.out.println(circle2.toString());
		System.out.println(circle2.getArea());
		
		Circle circle3 = new Circle();
		System.out.println(circle3.toString());
		System.out.println(circle3.getArea());
		
		
		Cylinder cylinder = new Cylinder(1,3,"yellow");
		System.out.println(cylinder.toString());
		System.out.println(cylinder.getVolume());
		Cylinder cylinder2 = new Cylinder(4,2);
		System.out.println(cylinder2.toString());
		System.out.println(cylinder2.getVolume());
		Cylinder cylinder3 = new Cylinder(5);
		System.out.println(cylinder3.toString());
		System.out.println(cylinder3.getVolume());
		
		Cylinder cylinder4 = new Cylinder();
		System.out.println(cylinder4.toString());
		System.out.println(cylinder4.getVolume());
		
		

	}
}

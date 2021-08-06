package com.shape;

interface Polygon {
	static void calcArea() {
		
	};
	default void calcPeri() {
		
	};
	
	}

class square implements  Polygon{
		float side=10;
		
		public void calcArea() {
			
			System.out.println("Square area:"+side*side);
		}

		public void calcPeri() {
			System.out.println("Square Perimeter:"+side*side);	
		}
	}

	class Rectangle implements  Polygon{
		float l=100,b=50;
		

		public void calcArea() {
			System.out.println("Rectangle area:"+l*b);
		}


		public void calcPeri() {
			System.out.println("Rectangle Perimeter:"+l*b);	
		}
}

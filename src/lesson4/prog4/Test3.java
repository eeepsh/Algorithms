package lesson4.prog4;

import lesson4.prog4.Rectangle;
import lesson4.prog4.Square;
import lesson4.prog4.Triangle;

public class Test3 {
	public static void main(String[] arg) {
		Polygon[] pg = { new Rectangle(3, 4),
				         new Triangle(4, 5, 6), 
				         new Square(3) };
		for(Polygon objects: pg){
			String name=objects.getClass().getSimpleName();
			System.out.println("For this "+ name + " \n\t "
					+ "perimeter is : "
					+ ""+objects.computePerimeter());
			
		}
	}
}

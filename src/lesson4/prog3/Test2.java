package lesson4.prog3;

public class Test2 {
	public static void main(String[] arg) {
		Polygon[] objects = { new Square(3),
				new Rectangle(3, 4),
				new Triangle(4, 5, 6) };

		for (Polygon pg : objects) {
			int sides=pg.getNumberOfSides();
			String name=pg.getClass().getSimpleName();
			System.out.println("The number of sides of "+ name + "is "+ sides);
			
			double perimeter=pg.computePerimeter();
			System.out.println("The primeter of " + name + " is " + perimeter + " meter ");
			System.out.println("");

		}

	}

}

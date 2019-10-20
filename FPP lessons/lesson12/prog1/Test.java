package lesson12.prog1;

import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) throws IllegalClosedCurveException {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3,7),
								 new Circle(3)};
		
		Triangle t = null;
		try {
		t = new Triangle(4,5,11);
		}
		catch(IllegalClosedCurveException e) {
		String msg = e.getMessage();
		JOptionPane.showMessageDialog( null, msg, "Error",
		 JOptionPane.ERROR_MESSAGE, null);
		System.exit(0);
		}

		//compute areas
		for(ClosedCurve cc : objects) {
			String nameOfCurve = cc.getClass().getSimpleName();

			System.out.println("The area of this "+
								nameOfCurve+ 
								" is "+
								cc.computeArea());
							
			}	
	}

}

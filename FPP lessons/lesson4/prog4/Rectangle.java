package lesson4.prog4;

public final class Rectangle implements Polygon {
	double width;
	double length;

	public Rectangle(double w, double len) {
		this.width = w;
		this.length = len;
	}

	public double[] getArrayOfSides() {
		// double[] arrayOfSides=new double[];
		return new double[] { this.width,
				              this.width, 
				              this.length, 
				              this.length };
	}

}

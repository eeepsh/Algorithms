package lesson4.prog4;

public interface Polygon {
	// public int getNumberOfSides();
	// public double computePerimeter();

	abstract public double[] getArrayOfSides();

	static double sum(double[] arr) {
		double sum=0;
		for(double sides:arr){
			sum+=sides;
		}
		return sum;
	}

	default double computePerimeter() {
		return sum(this.getArrayOfSides());
		
	}

}

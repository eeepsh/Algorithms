package lesson4.prog4;

public final class Square implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	
	public double computePerimeter(){
		return 4*side;
	}


	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		return new double[]{this.side, this.side,this.side, this.side};
	}
	

}

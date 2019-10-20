package lesson4.prog3;

public final class Rectangle extends ClosedCurve implements Polygon{
	double width;
	double length;
	
	public Rectangle(double w, double len){
		this.width=w;
		this.length=len;
	}
	@Override
	double computeArea() {
		return width*length;
		// TODO Auto-generated method stub
	
	}
	
		public int getNumberOfSides(){
			return 4;
		}
		public double computePerimeter(){
			return 2*(width+length);
		}

	

}

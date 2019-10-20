package lesson4.prog2;

public final class Rectangle extends ClosedCurve{
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

}

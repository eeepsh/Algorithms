package lesson6.prog2;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	//returns the value in the instance vble of Bottom
	int readBottom() {
		//implement
		mid=new Middle();
		midbot=mid.new Bottom();
		return midbot.b;
	}
	class Middle {
		int m = 2;
		//returns sum of instance vble in Top and
		//instance vble in Bottom
		Bottom bot=new Bottom();
		int addTopAndBottom() {
			//implement
			return t+bot.b;
		}
		class Bottom {
			int b = 3;
			//returns the product of the instance vbles
			//in all three classes
			int multiplyAllThree() {
				//implement
				return t*m*b;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();

		  System.out.println(top.readBottom());
		  System.out.println(top.mid.addTopAndBottom());
		  System.out.println(top.midbot.multiplyAllThree());

	}

}
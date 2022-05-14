package week1.day1.assignments;

public class MyCar {
	public static void main(String[] args)
	{
		Car mycarObj = new Car();
		System.out.println("Working with the instance of different class");	
		mycarObj.switchonAc();
		mycarObj.applyBreak();
		mycarObj.applyAccelerate();
		mycarObj.applyGear();
	}
}

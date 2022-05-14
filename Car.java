package week1.day1.assignments;

public class Car {
	
	public void applyBreak() {
		System.out.println("Applying Break");
	}
	
	public void applyGear() {
		System.out.println("Applying Gear");
	}
	
	public void switchonAc() {
		System.out.println("Switching on Ac");	
	}
	
	public void applyAccelerate() {
		System.out.println("Applying Accelerate");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car mycarObj = new Car();
		System.out.println("Working inside Same class");	
		mycarObj.switchonAc();
		mycarObj.applyBreak();
		mycarObj.applyAccelerate();
		mycarObj.applyGear();
		
	}

}

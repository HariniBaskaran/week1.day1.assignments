package week1.day1.assignments;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 1;
	long chassisNumber = 542356 ;
	boolean isPunctured = false;
	String bikeName = "Hero Pleasure Plus";
	double runningKM = 70;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWheeler mytwoWheeler = new TwoWheeler();
		System.out.println("noOfWheels: " + mytwoWheeler.noOfWheels);
		System.out.println("noOfMirrors: "+ mytwoWheeler.noOfMirrors);
		System.out.println("chassisNumber: "+ mytwoWheeler.chassisNumber );
		System.out.println("isPunctured: "+ mytwoWheeler.isPunctured);
		System.out.println("bikeName: "+ mytwoWheeler.bikeName);
		System.out.println("runningKm: "+ mytwoWheeler.runningKM);
		
	}

}

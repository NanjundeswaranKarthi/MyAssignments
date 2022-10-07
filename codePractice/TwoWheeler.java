package codePractice;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 89739347232383L;
	boolean isPunctured =false;
	String bikeName = "Hornet";
	double runningKM = 40899.12;

	public static void main(String[] args) {

		TwoWheeler bike = new TwoWheeler();

		System.out.println("No of Wheels "+bike.noOfWheels);
		System.out.println("No of Mirrors "+bike.noOfMirrors);
		System.out.println("Chassis Number "+bike.chassisNumber);
		System.out.println("Is Punctured "+bike.isPunctured);
		System.out.println("Bike Name "+bike.bikeName);
		System.out.println("Running KM "+bike.runningKM);

	}
}
package practise;

//Demo for non Access Modifier
public class _2_Car2 {
	public String sModel;
	public int iHighestSpeed;
	public static int iSteering;
	public static int iWheels;
	public static int iDoors;

	static {
		iSteering = 2;
		iWheels = 5;
		System.out.println("This block executed first");
	}

	public _2_Car2(){
		iSteering = 1;
		iWheels = 4;
	}

	//A.2
	public void DisplayCharacterstics() {
		System.out.println("Model of the Car: " + sModel);
		System.out.println("Max speed of the Car: " + iHighestSpeed);
		System.out.println("Number of Doors in the Car: " + iDoors);
	}

	public static void DisplayStaticCharacterstics() {
		//    DisplayCharacterstics();										//Compile time error
		//    System.out.println("Max speed of the Car: " + iHighestSpeed);	//Compile time error
		System.out.println("Number of Steering in the Car: " + iSteering + iDoors);
		System.out.println("Number of Wheels in the Car: " + iWheels);
	}         
}

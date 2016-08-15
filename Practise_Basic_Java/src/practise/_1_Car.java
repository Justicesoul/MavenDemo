package practise;

public class _1_Car {
	public static 	String iWheel;
	//Class Member Variables & Fields
	public 			String sModel;
	private 		int iGear;
	protected 		int iHighestSpeed;
					String sColor;
	protected 		int iMake;
					boolean bLeftHandDrive;
					String sTransmission;
					int iTyres;
					int iDoors;

	//Constructor1 - Passing values to the constructor
	public _1_Car(String Model, int Make,boolean LeftHandDrive ){
		sModel = Model;
		iMake = Make;
		bLeftHandDrive = LeftHandDrive;
	}

	//Constructor2 - Assigning default values to Constructor
	public _1_Car(){
		sModel = "Camry";
		iMake = 2014;
		bLeftHandDrive = true;
	}


	//METHODS//
	private void DisplayCharacterstics(){
		System.out.println("Model of the Car: " +  sModel);
		System.out.println("Number of gears in the Car: " +  iGear);
		System.out.println("Max speed of the Car: " +  iHighestSpeed);
		System.out.println("Color of the Car: " +  sColor);
		System.out.println("Make of the Car: " +  iMake);
		System.out.println("Transmission of the Car: " +  sTransmission);
	}
	public void Print(){
		DisplayCharacterstics();	//Can use this to ACCESS THE PRIVATE METHOD
	}
}

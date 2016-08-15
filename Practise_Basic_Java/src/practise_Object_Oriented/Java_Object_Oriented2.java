//INHERITANCE. 
//Class including: Car2

//Non-ACCESS MODIFIER
//Class including: Car2
package practise_Object_Oriented;

import practise._2_Car2;

public class Java_Object_Oriented2 {

	public static void main(String[] args) {
		//////////Access Mofifier (Car2)////////////
		//Description: This Example is the proof that: static variables can be changed by other classes, 

		//~~> EXPERIENCE://
		//In class, using non-static METHOD to use both non-static & static variables
		//In class, using static METHOD to use only static variables
		//And, static VARIABLES & METHOD can only be used using original class, not instanced class
		//while non-static VARIABLES & METHOD can only be used using instanced class, It means must create an Object to use it.
		
		_2_Car2 Toyota = new _2_Car2();
		Toyota.sModel="Camry";
		Toyota.iHighestSpeed = 230;
		_2_Car2.iDoors = 2;
		
		//Toyota.iDoors = 100;	//Compile Time Error. Because iDoors is static variable, It must be used with original class instead of instanced class

		//        A.1
		/*System.out.println("Model of the Car: " + Toyota.sModel);
        System.out.println("Max speed of the Car: " + Toyota.iHighestSpeed);
//      System.out.println("Number of Wheels in the Car: " + Toyota.iWheels); //Compile Time Error. Because iDoors is static variable, It must be used with original class instead of instanced class
        System.out.println("Number of Wheels in the Car: " + Car2.iWheels);
        System.out.println("Number of Steering in the Car: " + Car2.iSteering);
        System.out.println("Number of Doors in the Car: " + Car2.iDoors);
		 */
		//        A.2
		System.out.println("\n");
		_2_Car2.DisplayStaticCharacterstics();
		System.out.println("\n");
		Toyota.DisplayCharacterstics();
	}
}
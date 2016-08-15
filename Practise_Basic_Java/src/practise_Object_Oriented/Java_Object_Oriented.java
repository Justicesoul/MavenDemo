//ACCESS MODIFIER
//Class Including: Car
package practise_Object_Oriented;

import practise._1_Car;

public class Java_Object_Oriented extends _1_Car {

	public static void main(String[] args) {
		//////////A - Access Mofifier (Car)////////////
		//A.1 In Case without extending
		_1_Car	Merc = new _1_Car();
		Merc.sModel = "Mercedes";
//		Merc.iGear = 2;	//Error because iGear is private
		Merc.Print();
//		Merc.iMake = 6;	//Error because iMake is protected

		//A.2 In Case with extending, must declare the extended Object instead of original Object (Car)
		Java_Object_Oriented Hitachi = new Java_Object_Oriented();
		Hitachi.iMake = 10;
		
	}
}

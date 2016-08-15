//INHERITANCE
//Class including: Vehicle - Car3 - SportsCar

package practise_Object_Oriented;

import practise._3_Car3;
import practise._3_SportsCar;
import practise._3_Vehicle;

public class Java_Object_Oriented3 {

	public static void main(String[] args) {
		_3_Vehicle test1 = new _3_Vehicle();
		_3_Car3 test2 = new _3_Car3(5);
		_3_SportsCar test3 = new _3_SportsCar(6, 9);
		
		test1.setLicensePlate("INVALID 11");
		test2.setLicensePlate("VALID 22");
		test3.setLicensePlate("PENDING 33");
		
		test1.Print();
		test2.Print(); //Or: 		System.out.println(test2);
		test3.Print(); //Or: 		System.out.println(test3);
	}

}

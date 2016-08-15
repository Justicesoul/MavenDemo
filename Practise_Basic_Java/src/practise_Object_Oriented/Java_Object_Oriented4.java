//POLYMORPHISM
//Class including: Animal

package practise_Object_Oriented;

import practise._4_Animal;
import practise._4_Cat;
import practise._4_Dog;

public class Java_Object_Oriented4 {
	public static void main(String[] args) {
		_4_Animal[] pet = new _4_Animal[2];
		pet[0] = new _4_Cat();
		pet[1] = new _4_Dog();
//		pet[2] = new _4_Animal();	//Error because _4_Animal class is abstract
		
		for (_4_Animal spet : pet) {
			spet.Say();
		}
	}
}

package practise;

public class Java_Basic {
	public static void main (String [] args){
		String[] arraytest = aData();	//Get an defined array
		Print_Array(arraytest);			//Use the For loop
		Print_Array2(arraytest);		//Use the Foreach loop
		///////JAVA_Object_Oriented_2 DEMO//////////
		_1_Car Huyndai = new _1_Car();
		Huyndai.sModel = "Kia Morning";
//		Huyndai.iGear = 3;	//Error because iGear is private
		Huyndai.Print();
		Huyndai.iMake = 7;
	}

	//Create an defined array
	public static String[] aData(){
		String[] aMade = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		return aMade;
	}

	
	
	//For loop to print the items
	public static void Print_Array (String[] data){
		for (int i = 0; i < data.length; i++) {
			System.out.println("This is: " + data[i]);
		}
		System.out.println("\n");
	}
	
	//Foreach loop to print the items
	public static void Print_Array2 (String[] data){
		for (String data1 : data) {
			System.out.println("The car is "+data1);
		}
		System.out.println("\n");
	}
}

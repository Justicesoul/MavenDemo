package practise_Object_Oriented;

public class Exception_Handling {
	static double a[];
	public static void main(String[] args) throws MyException {
		a = new double[4];
		try {
			printElement(5);
		}catch(ArrayIndexOutOfBoundsException e){
			//Handle exception of type ArrayIndexOutOfBoundsException
			System.out.println(e);
		}catch(Exception e1){
			//Handle exception of type Exception
		}
		
		MyException abc = new MyException("\n hehe");
		System.out.println(abc.what());
	}

	static void printElement(int i) {
		if (i == 5) {
			throw new ArrayIndexOutOfBoundsException("Access element " + (i + 1) + " of an array of length " + a.length);
		} 
		if (i >=6){
			throw new ArrayIndexOutOfBoundsException("Wrong element");
		}
		System.out.println("The 5th element is :" + a[i]);
	}
	
	
}

package practise;

public class _3_Car3 extends _3_Vehicle{
	protected int numberOfSeats = 0;

	//Constructor
	public _3_Car3(int i_NumberOfSeats) {
		super();
		//perform other initialization here
		numberOfSeats = i_NumberOfSeats;	
	}

	//Methods
	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}

	@Override
	public void setLicensePlate(String license) {
		super.setLicensePlate(license);
		//Or:  licensePlate = license;
		//Or: super.licensePlate = license; 

		/*Conclude: Try to assign value to super variable. 
		BUT: licensePlate == this.licensePlate == super.licensePlate ???
		It seems the 'super' keyword only affect to Method*/
	}

	//Print
	@Override
	public void Print() {
		System.out.println(toString());
	}

	public String toString() {
		return "Its license is " + licensePlate + ". The car has " + numberOfSeats + " seats" ;
	}
}
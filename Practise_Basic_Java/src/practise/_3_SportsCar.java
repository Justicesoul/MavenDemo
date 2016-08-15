package practise;

public class _3_SportsCar extends _3_Car3 {
    protected double maxSpeed = 0;
    
	//Constructor
    public _3_SportsCar(int i_NumberOfSeats, double d_MaxSpeed) {
        super(i_NumberOfSeats);
        //perform other initialization here
        maxSpeed = d_MaxSpeed;
    }
	//Methods
    @Override
    public void setLicensePlate(String license) {
        this.licensePlate = license.toLowerCase();
    }
    
    //Print
    @Override
    public String toString() {
        return super.toString() + ". Its max speed is " + maxSpeed;
    }
}

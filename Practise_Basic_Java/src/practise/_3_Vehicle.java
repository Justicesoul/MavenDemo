package practise;

public class _3_Vehicle {
    protected String licensePlate = null;
    
    //Methods
    public void setLicensePlate(String license) {
        licensePlate = license;
    }
    
    //Print
    public void Print(){
    	System.out.println("LicensePlate is: " + licensePlate);
    }
}

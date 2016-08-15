//DEPENDENCY not work. Run with XML file
package testNG_Framework;

import org.testng.annotations.Test;

public class Grouping {
	
	  @Test (dependsOnGroups={"Sedan Car"})
	  public void Dependency1() {
		    System.out.println("This is Dependency1");
	  }
	  
	  @Test (dependsOnMethods={"Sedan1"})
	  public void Dependency2() {
		    System.out.println("This is Dependency2");
	  }
	  
	  @Test (groups = { "Car" })
	  public void Car1() {
	    System.out.println("Batch Car - Test car 1");
	  }
	  
	  @Test (groups = { "Car" })
	  public void Car2() {
	    System.out.println("Batch Car - Test car 2");
	  }
	  
	  @Test (groups = { "Scooter" })
	  public void Scooter1() {
	    System.out.println("Batch Scooter - Test scooter 1");
	  }
	  @Test (groups = { "Scooter" })
	  public void Scooter2() {
	    System.out.println("Batch Scooter - Test scooter 2");
	  }
	    
	  @Test (groups = {"Car","Sedan Car"})
	  public void Sedan1() {
	    System.out.println("Batch Sedan Car - Test sedan 1");
	  }

}

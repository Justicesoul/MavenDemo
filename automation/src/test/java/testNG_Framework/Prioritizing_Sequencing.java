//DEPENDENCY not work. Run with XML file
package testNG_Framework;

import org.testng.annotations.Test;

public class Prioritizing_Sequencing {
	
	  @Test (dependsOnGroups="Sedan Car")
	  public void Dependency1() {
		    System.out.println("This is Dependency1");
	  }
	  
	  @Test (dependsOnMethods="Sedan1")
	  public void Dependency2() {
		    System.out.println("This is Dependency2");
	  }
	  
	  @Test (priority=2)
	  public void Car1() {
	    System.out.println("Batch Car - Test car 1");
	  }
	  
	  @Test (priority=3)
	  public void Car2() {
	    System.out.println("Batch Car - Test car 2");
	  }
	  
	  @Test (priority=4)
	  public void Scooter1() {
	    System.out.println("Batch Scooter - Test scooter 1");
	  }
	  @Test (priority=5)
	  public void Scooter2() {
	    System.out.println("Batch Scooter - Test scooter 2");
	  }
	    
	  @Test (groups={"Car","Sedan Car"},priority=0)
	  public void Sedan1() {
	    System.out.println("Batch Sedan Car - Test sedan 1");
	  }

}

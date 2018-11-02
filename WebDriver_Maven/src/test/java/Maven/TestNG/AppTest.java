package Maven.TestNG;

import org.testng.annotations.Test;

import java.io.InputStream;

public class AppTest 
{
	@Test
	public void oneMoreTest() {
		final String dir = System.getProperty("user.dir");
		System.out.println("Thu muc hien tai la: " + dir);
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("\\testng.xml");
		System.out.println(in);
		//System.out.println("\n@@@@@@@@@@@@@@@@@@@\nThis is a TestNG-Maven based test\n@@@@@@@@@@@@@@@@@@@\n");
	}
}

//
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

//
//public class AppTest 
//    extends TestCase
//{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}

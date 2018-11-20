package initialize;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;

public class Source {
    public static String Spath = "F:/Selenium/Automation Tools/Drivers/";


    public static String DriverPath() {
        return new File("__Drivers").getAbsolutePath();
    }


    // Tips from Internet
/*    public String CurrentPath2() {
        return new File(getClass().getClassLoader().getResource("App.java").getFile()).getAbsolutePath();
    }*/


    public static String getSpath() {
        return Spath;
    }

    public static void setSpath(String spath) {
        Spath = spath;
    }

    public static void verifyEquals(Object actual, Object expected) {
        try {
            Assert.assertEquals(expected, actual);
        } catch (Throwable e) {
            System.out.println("The comparison is Failed!");
        }
    }

    public static void checkexistence(WebDriver driver){

    }
}
package initialize;

import java.io.File;

public class Source {
    public static String Spath = "F:/Selenium/Automation Tools/Drivers/";


    public static String DriverPath() {
        return new File("__Drivers").getAbsolutePath();
    }


/*    public String CurrentPath2() {
        return new File(getClass().getClassLoader().getResource("App.java").getFile()).getAbsolutePath();
    }*/



    public static String getSpath() {
        return Spath;
    }
    public static void setSpath(String spath) {
        Spath = spath;
    }
}
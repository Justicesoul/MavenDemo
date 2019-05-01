//GOOD. Run with XML file
package testNG_Framework;

import utilities.Source;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser_ParallelTesting {
    public WebDriver driver;

    @BeforeMethod // Passing Browser parameter from TestNG xml
    @Parameters("browser")
    public void beforeTest(String browser) {
        final String dir = System.getProperty("user.dir");
        if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", Source.DriverPath() + "/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver",Source.DriverPath() + "/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", Source.DriverPath() + "/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.get("https://www.facebook.com");
    }

    @Test
    public void Test() {
        try {
            WebElement ele1 = driver.findElement(By.id("email"));
            WebElement ele2 = driver.findElement(By.id("pass"));
            WebElement ele3 = driver.findElement(By.id("loginbutton"));
            ele1.sendKeys("your username");
            ele2.sendKeys("your password");
            ele3.click();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Can't find element");
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }
}
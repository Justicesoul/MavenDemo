package selenium2_webdriver;

import Objects.Oxii;
import initialize.Source;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Practise {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", Source.DriverPath() + "/geckodriver.exe");
        /*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);*/
        WebDriver driver = new FirefoxDriver();
        driver.get(Oxii.BaseURL);

        String expectedTitle = "Mạng xã hội nội dung dành cho người Việt. Chúng tôi có nội dung bạn thích và chỉ dành cho bạn.";
        String actualTitle = driver.getTitle(); /**/
        System.out.println(actualTitle);

        verifyEquals(expectedTitle, actualTitle);
        /*try {
            Assert.assertEquals(expectedTitle,actualTitle);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Assert Failed!");
        }*/
        /*if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }*/


        WebElement Ele1 = driver.findElement(By.xpath(Oxii.Main_Image));
        System.out.println(Ele1.getSize().height + Ele1.getSize().width);
        System.out.println(Ele1.getText());
        System.out.println(Ele1.getAttribute("class"));


        driver.close();
        System.exit(0);

    }

    public static void verifyEquals(Object actual, Object expected) {
        try {
            Assert.assertEquals(expected, actual);
        } catch (Throwable e) {
            System.out.println("Assert Failed!");
        }
    }
}
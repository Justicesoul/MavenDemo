package selenium2_webdriver;

import Objects.Oxii_Home;
import initialize.Source;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", Source.DriverPath() + "/geckodriver.exe");
        /*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);*/
        WebDriver driver = new FirefoxDriver();
        driver.get(Oxii_Home.BaseURL);

        String expectedTitle = "Mạng xã hội nội dung dành cho người Việt. Chúng tôi có nội dung bạn thích và chỉ dành cho bạn.";
        String actualTitle = driver.getTitle(); /**/
        System.out.println("Real Title: " + actualTitle);

        Source.verifyEquals(expectedTitle, actualTitle);
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


        WebElement Ele1 = driver.findElement(By.xpath(Oxii_Home.Rank5.Main_Image));
        System.out.println("Height of Main Image: " + Ele1.getSize().height + "&& " + "Width of Main Image: " + Ele1.getSize().width);
        System.out.println(Ele1.getText());
        System.out.println("Class of Main Image: " + Ele1.getAttribute("class"));


        // Verify each element:
        // Hot Rank

        // Navigation Bar

        // Select topic button

        // Discussion section

        // Feature Story section


        driver.close();
        System.exit(0);
    }

}
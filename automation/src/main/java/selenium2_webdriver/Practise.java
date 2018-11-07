package selenium2_webdriver;

import Objects.Oxii;
import initialize.Source;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", Source.DriverPath() + "/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String expectedTitle = "Mạng xã hội nội dung dành cho người Việt. Chúng tôi có nội dung bạn thích và chỉ dành cho bạn.";
        //String actualTitle = "";

        driver.get(Oxii.BaseURL);
        String actualTitle = driver.getTitle(); /**/
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }


        WebElement Ele1 = driver.findElement(By.xpath(Oxii.Main_Image));
        System.out.println(Ele1.getClass());
        System.out.println(Ele1.getText());
        System.out.println(Ele1.getAttribute("src"));


        driver.close();
        System.exit(0);

    }
}
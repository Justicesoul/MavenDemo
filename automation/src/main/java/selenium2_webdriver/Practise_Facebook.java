package selenium2_webdriver;

import initialize.Sel_Form;
import utilities.Source;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practise_Facebook extends Sel_Form {
	public static void main(String[] args){
			//// Automate on Facebook site
		String baseUrl = "https://www.facebook.com/";



		Practise_Facebook.Setup(baseUrl);

		String expectedTitle = "Chào mừng bạn đến với Facebook - Đăng nhập, Đăng ký hoặc Tìm hiểu thêm";
		//String actualTitle = "";


		WebElement Ele1 = driver.findElement(By.id("u_0_1"));
		WebElement Ele2 = driver.findElement(By.xpath("//html/body/div/div[2]/div[1]/div/div[1]/div/div/div[2]/div[1]/div[1]"));
		WebElement Ele3 = driver.findElement(By.xpath("//html/body/div/div[1]/div/div/div/div/div/div/form/table/tbody/tr[2]/td[3]/label/input"));

		String value1 = Ele1.getAttribute("name");
		System.out.println(value1);

		String value2 = Ele2.getText();
		System.out.println(value2);

		String value3 = Ele3.getAttribute("value");
		System.out.println(value3);

		String actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}

		Ele3.click();



			//// Automate on Oxii site
		/*       driver.get(Oxii_Home.BaseURL);

        String expectedTitle = "Mạng xã hội nội dung dành cho người Việt. Chúng tôi có nội dung bạn thích và chỉ dành cho bạn.";
        String actualTitle = driver.getTitle(); *//**//*
        System.out.println("Real Title: " + actualTitle);

        Source.verifyEquals(expectedTitle, actualTitle);*/
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

        /*
        WebElement Ele1 = driver.findElement(By.xpath(Oxii_Home.Rank5.Main_Image));
        System.out.println("Height of Main Image: " + Ele1.getSize().height + " && " + "Width of Main Image: " + Ele1.getSize().width);
        System.out.println(Ele1.getText());
        System.out.println("Class of Main Image: " + Ele1.getAttribute("class"));


        // Verify each element:
        // Hot Rank

        // Navigation Bar

        // Select topic button

        // Discussion section

        // Feature Story section*/

		driver.close();
		System.exit(0);
}
}

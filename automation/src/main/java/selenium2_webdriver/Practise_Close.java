package selenium2_webdriver;

import initialize.Source;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practise_Close {
	public static void main(String[] args){
		//// Automate on Selenium.Googlecode site
		System.setProperty("webdriver.gecko.driver", Source.DriverPath() + "/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html";
		driver.get(baseUrl);
		
		driver.switchTo().frame("classFrame");
		WebElement myEle = driver.findElement(By.linkText("Deprecated"));
		myEle.click();
		
		driver.quit();
		System.out.println("Done!");


		//// Automate on Facebook site
/*		String baseUrl = "http://facebook.com";

		System.setProperty("webdriver.gecko.driver", Source.DriverPath() + "/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String expectedTitle = "Chào mừng bạn đến với Facebook - Đăng nhập, Đăng ký hoặc Tìm hiểu thêm";
		//String actualTitle = "";

		driver.get(baseUrl);

		WebElement Ele1 = driver.findElement(By.id("u_0_1"));
		WebElement Ele2 = driver.findElement(By.xpath("//html/body/div/div[2]/div[1]/div/div[1]/div/div/div[2]/div[1]/div[1]"));
		WebElement Ele3 = driver.findElement(By.xpath("//html/body/div/div[1]/div/div/div/div/div/div/form/table/tbody/tr[2]/td[3]/label/input"));

		String value1 = Ele1.getAttribute("name");
		System.out.println(value1);

		String value2 = Ele2.getText();
		System.out.println(value2);

		String value3 = Ele3.getAttribute("value");
		System.out.println(value3);

		String actualTitle = driver.getTitle(); *//**//*
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}

		Ele3.click();

		driver.close();
		System.exit(0);*/
}
}

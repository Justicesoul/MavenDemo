package selenium2_webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class Accessing_link_tables_Sel_webdriver {
	public static void main(String[] args){
		
		String baseUrl = "file:///C:/Users/Thinh%20Luong/Downloads/Welcome%20%20Mercury%20Tours.htm";
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		
		WebElement Ele1 = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[3]/td"));
		String a = Ele1.getText();
		System.out.println(a);
		
		WebElement Ele2 = driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/"
				+ "table/tbody/tr[4]/td/"
				+ "table/tbody/tr/td[2]/"
				+ "table/tbody/tr[2]/td[1]/"
				+ "table[1]/tbody/tr[3]/td/"
				+ "table/tbody/tr[4]/td[2]/div/font/b"));
		String b = Ele2.getText();
		System.out.println(b);
		
		WebElement Ele3 = driver.findElement(By.xpath("//td[@width=\"190\"]"));
		String c = Ele3.getText();
		System.out.println(c);
		
		driver.quit();
	}
}

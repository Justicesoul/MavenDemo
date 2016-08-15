package examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lan_project {
	static WebDriver driver;
	static WebElement Obj1;
	static String baseURL = "http://www.lazada.vn/uu-dai-khach-hang-moi/?ref=popular-search";
	static String baseURL2 = "http://www.lazada.vn/uu-dai-khach-hang-moi/?sort=pricedesc&dir=desc";
	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.get(baseURL2);

		List<WebElement> prices = driver.findElements(By.cssSelector("[class='product-card__price']"));
		String abc;
		for (WebElement price : prices)
		{
			abc = price.getText().toString();
			System.out.println(abc);
		}

		/* C#		List<WebElement> prices = driver.FindElements(By.CssSelector("[class='product-card__price']"));
		String abc;
		foreach (WebElement price in prices)
		{
			abc = price.Text;
			Console.WriteLine(abc);		
		}*/

		System.out.println("DONE");
		driver.quit();
	}

}

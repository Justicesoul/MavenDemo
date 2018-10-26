package selenium_zAdvance;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import initialize.Sel_Form;

public class Javascript_Selenium extends Sel_Form{

	static String BaseURL2	= "http://demoqa.com/";
	static String BaseURL	= "C:\\Users\\Thinh Luong\\Desktop\\test.html";
//	static String Xpath_Object1	= "//html/body/div/div/div[1]/main/article/div/div[1]/div/p[1]/a/img";
	
	public static void main(String[] args) {
		Sel_Form.Setup(BaseURL);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long Width 		= (Long) js.executeScript("return window.innerWidth;");
		Long Height 	= (Long) js.executeScript("return window.innerHeight;");
		System.out.println("The size of Window is: "+Width+" x "+Height);
		
		element = (WebElement) js.executeScript("return document.getElementById('ui-id-2');");
		element.click();
		
		element = (WebElement) js.executeScript("return document.evaluate('//html/body/div/div/div[1]/main/article/div/div[1]/div/p[1]/a/img' ,document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue;");
		element.click();
		
//		 Navigate to different page
		js.executeScript("window.location = 'http://yahoo.com'");
		
		
////		 Add a button
//		js.executeScript("var btn=document.createElement('BUTTON');"
//                     + "document.body.appendChild(btn);");
		
		
//		Sel_Form.Clean();
	}
}

package selenium_Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import initialize.Sel_Form;

public class Upload_File extends Sel_Form{
	public static final String BaseURL	= "http://www.upsieutoc.com/";
	public static final String BaseURL2	= "http://uphinhnhanh.com/";
	public static final String BaseURL3 = "https://www.freepdfconvert.com/pdf-word";
	public static final String BaseURL4 = "http://www.zamzar.com/";
	public static final String BaseURL5 = "http://www.uploadify.com/demos/";
	public static final String BaseURL6	= "http://qa_thinh_publicationname1b-.audiencemedia.com/admin/content/view/full/43";
	// Path
	public static String File			= "E:\\Car_Industry.jpg";
	public static String File2			= "D:\\PC_Extreme_Cool.jpg";
	// Multiple Paths
	public static String ExcelFile_path		= "F:\\Selenium\\Sel_Data\\Upload_Images.xlsx";
	public static String ExcelFile_path2	= "D:\\HOC_TAP\\LAP_TRINH\\Automation_Selenium\\Selenium\\SelProjects\\zData\\Upload_Images2.xlsx";
	public static int start_item_row	= 1;
	public static int start_item_col	= 1;
	public static int local_link_row	= 1;
	public static int local_link_col	= 3;
	public static int end_item_row		= 5;

	public static void Upload_Activity(String filepath){
		StringSelection ss = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		try {
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(1000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	

	
	public static void Upload_Activity6(List<String> filepaths) throws Exception{
		String css_Browsebtn	= "input.realupload";
		int i=1;

		List<String> files = filepaths;
		for (String file : files) {
			driver.findElement(By.cssSelector(css_Browsebtn)).click();

			Upload_Activity(file);
			Thread.sleep(3000);
			
			System.out.println("Upload image " + i + " successfully!");
			i++;
		}
	}

	public static void UploadImage(String filepath) throws InterruptedException{
		String link_Browsebtn	= "Start uploading";
		String css_Uploadcategory = "select#upload-category-id";
		String css_Uploadbtn	= "button[data-action='upload']";
		String xpath_statusText	= "//*[@id='anywhere-upload']/div[1]/div/div[1]/div/div[5]/div[2]";
		// Click on Start upload
		driver.findElement(By.linkText(link_Browsebtn.toUpperCase())).click();

		// Robot class
		Upload_Activity(filepath);

		// Upload process
		element = driver.findElement(By.cssSelector(css_Uploadcategory));
		Select list = new Select(element);
		list.selectByIndex(1);
		driver.findElement(By.cssSelector(css_Uploadbtn)).click();

		// Assert
		element = driver.findElement(By.xpath(xpath_statusText));
		Assert.assertTrue(element.isDisplayed());
	}

	public static void UploadImage2(String filepath) throws InterruptedException {
		String css_Browsebtn	= "input.input2";
		String css_Uploadbtn = "input#submit1";
		String xpath_Linkxemhinh = "//*[@id='wrapper']/div/span/form/center/center/strong";

		// Click on Start upload
		driver.findElement(By.cssSelector(css_Browsebtn)).click();

		// Robot class
		Upload_Activity(filepath);		

		// Upload process
		driver.findElement(By.cssSelector(css_Uploadbtn)).click();
		element = driver.findElement(By.xpath(xpath_Linkxemhinh));
		Assert.assertTrue(element.isDisplayed());
	}

	public static void UploadImage5(String filepath) {
		String css_Browsebtn	= ".uploadify";
		// Click on Start upload
		driver.findElement(By.cssSelector(css_Browsebtn)).click();

		// Robot class
		Upload_Activity(filepath);
	}

	public static void UploadImage6(List<String> filepaths) throws Exception {
		String link_OpenUploadpopup	= "Upload New Media";
		String css_Item				= "form#image_list>ul>li";
		String css_Closebtn			= "a#fancybox-close";
		// Login
		Login_Valid();
		// Open Upload pop-up
		driver.findElement(By.linkText(link_OpenUploadpopup.toUpperCase())).click();
		// Upload multiple file
		Upload_Activity6(filepaths);
		// Assert
		element = driver.findElement(By.cssSelector(css_Item));
		Assert.assertTrue(element.isDisplayed());
		driver.findElement(By.cssSelector(css_Closebtn)).click();
	}
}

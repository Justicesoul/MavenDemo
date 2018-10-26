package selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import initialize.Sel_Form;

public class Handle_Dynamic_WebTables extends Sel_Form{
	public static String BaseURL = "http://www.toolsqa.com/automation-practice-table/";
	//Exercise1
	private static String RowA 		= "1";
	private static String ColumnA 	= "2";
	private static String RowB 		= "1";
	private static String ColumnB 	= "6";
	private static By Cell1			= By.xpath("//*[@id='content']/table/tbody/tr[" + RowA + "]/td[" + ColumnA + "]");
	private static By Link1			= By.xpath("//*[@id='content']/table/tbody/tr[" + RowB + "]/td[" + ColumnB + "]/a");
	//Exercise2
	private static String RowC		= "4";
	private static String ColumnC 	= "3";
	private static String RowD 		= "4";
	private static String ColumnD 	= "7";
	private static By Cell2	= By.cssSelector("table.tsc_table_s13>tbody>tr:nth-child(" + RowC + ")>td:nth-child(" + ColumnC + ")");
	private static By Link2	= By.cssSelector("table.tsc_table_s13>tbody>tr:nth-child(" + RowD + ")>td:nth-child(" + ColumnD + ")>a");
	private static String sRow		= "Clock Tower Hotel";

	private static WebElement Cell1(){
		return driver.findElement(Cell1);
	}
	private static WebElement Link1(){
		return driver.findElement(Link1);
	}
	private static WebElement Cell2(){
		return driver.findElement(Cell2);
	}
	private static WebElement Link2(){
		return driver.findElement(Link2);
	}

	public static void Exercise1(){
		System.out.println(Cell1().getText());
		Link1().click();
		System.out.println("Link has been clicked otherwise an exception would have thrown");
	}


	public static void Exercise2() {
		System.out.println(Cell2().getText());
		System.out.println(Link2().getText());

		//First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i = 1; i <= 4; i++) {
			element = driver.findElement(By.cssSelector
					("table.tsc_table_s13>tbody>tr:nth-child(" + i + ")>th"));
			if (element.getText().equalsIgnoreCase(sRow)) {
				System.out.println("\n"+ "Row name: " + element.getText());
				// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
				for (int j = 2; j <=7; j++) {
					element = driver.findElement(By.cssSelector
							("table.tsc_table_s13>tbody>tr:nth-child("+ i +")>td:nth-child("+ j +")"));
					System.out.println(element.getText());
				}
				break;
			}
		}
	}
}

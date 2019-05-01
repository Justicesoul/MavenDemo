package selenium2_webdriver;

import initialize.Sel_Form;
import org.openqa.selenium.By;

public class Practise extends Sel_Form {
    public static void main(String[] args) {
        String Sendo_URL = "https://www.sendo.vn/";
        String ExpectedTitle = "Siêu chợ SEN ĐỎ FPT Thế Giới SHOPPING Mua Bán Online Giá TỐT";
        String Logo_Xpath = "//a[@class='logo_qf4D']";


        Practise.Setup(Sendo_URL);
//        Sel_Form.Wait(Logo_Xpath);
        Practise.verifyEquals(driver.getTitle(),ExpectedTitle);


        Practise.Clean();
    }

}
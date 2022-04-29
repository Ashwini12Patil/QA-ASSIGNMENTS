package Package_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drp_art_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         WebDriver driver;
		
		 System.setProperty("webdriver.chrome.driver","D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Softwares\\chromedriver.exe");
		
         driver=new ChromeDriver();
         
         driver.manage().window().maximize();
         
         driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
         
         WebElement testDropDown = driver.findElement(By.id("testingDropdown"));
         Select dropdown = new Select(testDropDown);
         dropdown.selectByIndex(3);


	}

}

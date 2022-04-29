package Package_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fruits_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Softwares\\chromedriver.exe");
		
         driver=new ChromeDriver();
         
         driver.manage().window().maximize();
         
         driver.get("http://output.jsbin.com/osebed/2");
         
         Select dropdown = new Select (driver.findElement(By.id("fruits")));
         
         dropdown.selectByIndex(0);
         
         dropdown.selectByIndex(2);
         
         dropdown.selectByIndex(3);
         
         dropdown.selectByIndex(4);
         
         dropdown.selectByIndex(1);
	}

}





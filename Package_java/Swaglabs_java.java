package Package_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs_java {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Softwares\\chromedriver.exe");
         
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.saucedemo.com/");
		 
		 WebElement element=driver.findElement(By.id("user-name"));
		 
		 element.sendKeys("standard_user");
		 
         WebElement element1=driver.findElement(By.id("password"));
		 
		 element1.sendKeys("secret_sauce");
		 
		 driver.findElement(By.id("login-button")).click();
		 
		 Thread.sleep(5000);
		 
         driver.findElement(By.id("react-burger-menu-btn")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("logout_sidebar_link")).click();
		 
	}
	
}

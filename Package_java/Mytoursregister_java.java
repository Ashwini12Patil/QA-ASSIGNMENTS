package Package_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mytoursregister_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver;
     
     System.setProperty("webdriver.chrome.driver","D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Softwares\\chromedriver.exe");
     
     driver=new ChromeDriver();
     
     driver.manage().window().maximize();
     
     driver.get("https://demo.guru99.com/test/newtours/register.php");
     //Contact information
     
     WebElement element = driver.findElement(By.name("firstName"));
     element.sendKeys("Ashwini");
     
     
     WebElement element1 = driver.findElement(By.name("lastName"));
     element1.sendKeys("Patil");
     
     WebElement element2 = driver.findElement(By.name("phone"));
     element2.sendKeys("1234567890");
     
     WebElement element3 = driver.findElement(By.id("userName"));
     element3.sendKeys("ash@gmail.com");
     
     //mailing information
     
     WebElement element4 = driver.findElement(By.name("address1"));
     element4.sendKeys("12, KCS IT GLOBAL");
      
     WebElement element5 = driver.findElement(By.name("city"));
     element5.sendKeys("Ahemedabad");
     
     WebElement element6 = driver.findElement(By.name("state"));
     element6.sendKeys("Gujarat");
     
     WebElement element7 = driver.findElement(By.name("postalCode"));
     element7.sendKeys("87654");
     
     WebElement testDropDown = driver.findElement(By.name("country"));
     Select dropdown = new Select(testDropDown);
     
     dropdown.selectByIndex(15);
	
     //User information

     WebElement element8 = driver.findElement(By.id("email"));
     element8.sendKeys("ash@gmail.com");
     
     WebElement element9 = driver.findElement(By.name("password"));
     element9.sendKeys("@123456");
     
     WebElement element10 = driver.findElement(By.name("confirmPassword"));
     element10.sendKeys("@123456");
     
     driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
      
     driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
     
     }
}
     
     
     

     
     
     
     
     
     
     
     
      
     
     
     
     
     
     
     
     
		
		
		
		
		
		
		
		
		
		

	

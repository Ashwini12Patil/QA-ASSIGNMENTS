package Package_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Evaluation_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Softwares\\chromedriver.exe");
		
         driver=new ChromeDriver();
         
         driver.manage().window().maximize();
         
         driver.get("https://demoqa.com/webtables");
         
         driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
         
         WebElement element=driver.findElement(By.id("firstName"));
 		 
		 element.sendKeys("Ashwini");
		 Thread.sleep(2000);
		 
		 WebElement element1 =driver.findElement(By.id("lastName"));
 		 
		 element1 .sendKeys("Patil");
		 Thread.sleep(2000);
		 
         WebElement element2 =driver.findElement(By.id("userEmail"));
 		 
		 element2 .sendKeys("Ash@gmail.com");
		 Thread.sleep(2000);
		 
         WebElement element3 =driver.findElement(By.id("age"));
 		 
		 element3 .sendKeys("23");
		 Thread.sleep(2000);
		 
         WebElement element4 =driver.findElement(By.id("salary"));
 		 
		 element4 .sendKeys("25000");
		 Thread.sleep(2000);
		 
         WebElement element5 =driver.findElement(By.id("department"));
 		 
		 element5 .sendKeys("QA");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		 
	}

}

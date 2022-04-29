package Package_java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class class2 {
   public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Softwares\\chromedriver.exe");
         
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://artoftesting.com/samplesiteforselenium");
		 
		 driver.findElement(By.id("fname")).sendKeys("Ashwini");
		 Thread.sleep(2000);
		 driver.findElement(By.id("fname")).clear();
		 driver.findElement(By.id("idOfButton")).click();
		 driver.findElement(By.id("female")).click();
		 driver.findElement(By.xpath("//*[@id=\"post-1089\"]/div/div/form[2]/input[1]")).click();
		 driver.findElement(By.xpath("//*[@id=\"post-1089\"]/div/div/form[2]/input[2]")).click();
	}
}
		 

		 
		 
	     

		


		 
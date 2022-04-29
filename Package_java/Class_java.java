package Package_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Softwares\\chromedriver.exe");
		
         driver=new ChromeDriver();
         
         driver.manage().window().maximize();
         driver.get("https://www.google.com");
         
	}

}

package Package_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_javaf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Softwares\\geckodriver.exe");
	
		driver = new FirefoxDriver();
		
		   driver.manage().window().maximize();
		   
		 driver.get("https://www.google.com");
		
	}

}
	


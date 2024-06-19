package seleniumbasicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementByCssSelectorWIthTagAndAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		//maximize window
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		
		WebElement FirstName=driver.findElement(By.cssSelector("input[name='firstName']"));
		FirstName.sendKeys("manoj");
		
	}

}

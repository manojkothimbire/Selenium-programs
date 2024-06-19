package seleniumbasicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementByLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		//maximize window
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/login");
		Thread.sleep(2000);
		
//		WebElement forgottenAccount=driver.findElement(By.linkText("Forgotten account?"));
//		forgottenAccount.click();
//	
		
		WebElement forgottenAccount=driver.findElement(By.partialLinkText("Forg"));
		forgottenAccount.click();
		
		
	}

}

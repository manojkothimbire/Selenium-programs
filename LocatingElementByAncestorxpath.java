package seleniumbasicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementByAncestorxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		Thread.sleep(2000);
		
		WebElement form=driver.findElement(By.xpath("//input[@id='fname']//ancestor::form"));
		System.out.println(form.isDisplayed()+"=form is visible");
	}

}

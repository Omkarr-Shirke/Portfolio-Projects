package co.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Samsung Mobiles");
		WebElement SearchIcon= driver.findElement(By.id("nav-search-submit-button"));
		SearchIcon.click();
		WebElement CheckBox= driver.findElement(By.xpath("//*[@id=\"p_123/253649\"]/span/a/div/label/i"));
		CheckBox.click();
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(4000);
		driver.quit();

	}

}

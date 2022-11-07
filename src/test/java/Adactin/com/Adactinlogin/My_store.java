package Adactin.com.Adactinlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class My_store {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\eclipse-workspace\\Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("cutzzbaby@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Thursday!");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

		WebElement element = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions hover = new Actions(driver);
		hover.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[text()='Evening Dresses']")).click();
		
		driver.findElement(By.xpath("Add to cart")).click();







	}

}

package Adactin.com.Adactinlogin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class myntra {

	public static WebDriver driver;
	
	public static void browser_launch() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/shop/men");
		
	}
	
		public static void clickingmen() {
		Actions hover = new Actions(driver);
		WebElement menhover = driver.findElement(By.linkText("Men"));
		hover.moveToElement(menhover).perform();
		
		WebElement tshirts = driver.findElement(By.linkText("T-Shirts"));
		tshirts.click();
		
	}
		public static void shirts() {
		
		List<WebElement> alltshirts = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		System.out.println("Total number of Tshirts" + " " + alltshirts.size());
		for (WebElement shirts : alltshirts) {
			
			System.out.println("List number of Tshirts" + " " + shirts);
			
		}
		
		
		}
	
	

        public static void main(String[] args) {
        	
        	browser_launch();
        	clickingmen();
        	shirts();
        	
        	
        	
        	
	
}











}

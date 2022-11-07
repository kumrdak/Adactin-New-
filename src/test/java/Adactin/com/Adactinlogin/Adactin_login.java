package Adactin.com.Adactinlogin;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactin_login {

	public static void main(String[] args) throws IOException {
		
		
		
        
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\eclipse-workspace\\com.Adactinlogin\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("trendswhatsapp80");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thursday!1");
		driver.findElement(By.xpath("//input[@id='login']")).click();

		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File dest = new File("./target/img.png");
		FileHandler.copy(src, dest);


		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select location1 = new Select(location);
		location1.selectByVisibleText("Melbourne");


		WebElement Hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select hotel1 = new Select(Hotel);
		hotel1.selectByVisibleText("Hotel Creek");


		WebElement Room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select Room1 = new Select(Room);
		Room1.selectByVisibleText("Double");


		WebElement RoomNumber = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select Rooms = new Select(RoomNumber);
		Rooms.selectByVisibleText("5 - Five");


		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("14/10/2022");
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("15/10/2022");
		WebElement AdultRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select AdultRooms = new Select(AdultRoom);
		AdultRooms.selectByVisibleText("3 - Three");
		WebElement ChildRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select childRoomsNo = new Select(ChildRoom);
		childRoomsNo.selectByVisibleText("2 - Two");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		File src1 = screen.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./target/img1.png");
		FileHandler.copy(src1, dest1);
		driver.findElement(By.xpath("//input[@type='radio']")).click();

		File src2 = screen.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./target/img2.png");
		FileHandler.copy(src2, dest2);


		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("arvind");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("kumar");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("267 Grey Street, South Brisbane, 4101 Brisbane, Australia");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");
		WebElement cc = driver.findElement(By.xpath("//select[@name='cc_type']"));
		
		Select cctype = new Select(cc);
		cctype.selectByVisibleText("Master Card");

		WebElement SM = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select ccmonth = new Select(SM);

		ccmonth.selectByVisibleText("March");
		WebElement SY = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));

		Select ccyear = new Select(SY);
		ccyear.selectByVisibleText("2015");

		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");

		File src3 = screen.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("./target/img3.png");
		FileHandler.copy(src3, dest3);


		driver.findElement(By.xpath("//input[@type='button']")).click();

		System.out.println(driver.getCurrentUrl());

		File src4 = screen.getScreenshotAs(OutputType.FILE);
		File dest4 = new File("./target/img4.png");
		FileHandler.copy(src4, dest4);


		driver.quit();






































	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_class {

	public static void main(String[] args) throws InterruptedException  {
		
//		This is a setup for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh\\Downloads\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
//		link is get and open from chrome via driver
		driver.get("https://www.makemytrip.com/railways/");
		
//		Print the Title Name And Current Link
		System.out.println("Title is : "+driver.getTitle());
		System.out.println("Link is : "+driver.getCurrentUrl());

//		Maximize the Window
		driver.manage().window().maximize();
		
//		This is exception handling for time
		Thread.sleep(1000,2000);
		
//		Find the from element
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(1000,2000);
		
//		Creating WebElement for From Search
		WebElement from_search = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(1000,2000);
		
//		Insert the value in From Element
		from_search.sendKeys("DELHI");
		Thread.sleep(1000,2000);
		
//		Using suggestion from drop down list And select the require one
		from_search.sendKeys(Keys.ARROW_DOWN);
		from_search.sendKeys(Keys.ENTER);
		
//		This is exception handling for time
		Thread.sleep(1000,2000);
		
//		Find the To element
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(1000,2000);
		
//		Creating WebElement for To Search
		WebElement to_search = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(1000,2000);
		
//		Insert the value in To Element
		to_search.sendKeys("LUCKNOW");
		Thread.sleep(1000,2000);
		
//		Using suggestion from drop down list And select the require one
		to_search.sendKeys(Keys.ARROW_DOWN);
		to_search.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000,2000);
		
//		Creating WebElement for Date
		WebElement date = driver.findElement(By.xpath("//*[@id=\"travelDate\"]"));
		date.click();
		
//		This is exception handling for time
		Thread.sleep(1000,2000);
		
//		Select the require date from date picker 20 May 2022 had gone that's why i am selecting 20 june 2022
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[2]")).click();
		Thread.sleep(1000,2000);
		
//		Creating WebElement for Class
		WebElement down = driver.findElement(By.xpath("//span[text()='Class']"));
		down.click();
		
//		This is exception handling for time
		Thread.sleep(1000,2000);
		
//		Select the require Class from drop down list
		driver.findElement(By.xpath("//li[text()='Third AC']")).click();
		Thread.sleep(1000,2000);
		
//		Click for search and getting the require data
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
	}
}

package org.omio;

import java.util.List;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OmioMain {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omio.com/");
		driver.manage().window().maximize();

		WebElement cookies = driver.findElement(By.xpath("//button[text()='Accept all']"));
		cookies.click();

		// WebElement travel = driver.findElement(By.xpath("//a[text()='Buses']"));
		// travel.click();
		//
		// WebElement buses = driver.findElement(By.xpath("//span[contains(text(),' in
		// Germany')]"));
		// buses.click();
		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		from.sendKeys("Gurgaon, India", Keys.ENTER);

		WebElement to = driver.findElement(By.xpath("(//input[@class='_e7066 _2a1c7'])[2]"));
		to.sendKeys("Bratislava, Slovakia", Keys.ENTER);

		// WebElement dateDepartrure = driver.findElement(By.xpath("//div[@class='_eddc0
		// _559b2 _703c9 oneWayReturn']"));
		// dateDepartrure.click();

		WebElement table = driver.findElement(By.xpath("(//div[@class='_daa83'])[1]"));
		table.click();
	
		WebElement date = driver.findElement(By.xpath("//span[text()='Sun, Feb 19']"));
		date.click();
	}

}

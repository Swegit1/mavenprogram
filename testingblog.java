package com.practice.com.practice.maven.eclipse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class testingblog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/sriswedhav/Downloads/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
	
		boolean cookie;
		if(cookie=driver.findElement(By.id("cookieChoiceDismiss")).isDisplayed())
		{
			driver.findElement(By.id("cookieChoiceDismiss")).click();
			
		}else {
			Thread.sleep(1000);
			
		}
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		/*String mess=driver.findElement(By.xpath("//input[@id='name']")).getText();
		String expect ="You pressed OK!";
		if (mess==expect)
		
				
		
		{
			System.out.println("Message is displayed");
		
		}else 
		{
			Thread.sleep(5000);
		}*/
		driver.switchTo().frame("frame-one1434677811");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).click();
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("rti");
		//input[@id='RESULT_TextField-1']
		
		WebElement last=driver.findElement(By.xpath("//input[@type='text' and @name='RESULT_TextField-2']"));
		((WebElement) last).click();
		last.sendKeys("semm");
		WebElement radio=driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_1']"));
		radio.click();
		WebElement brow=driver.findElement(By.xpath("//input[@id='RESULT_FileUpload-10']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",brow);
		brow.sendKeys("/Users/sriswedhav/Documents/Tour plan.xlsx");
		
	}

}

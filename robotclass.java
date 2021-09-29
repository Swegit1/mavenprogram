package com.practice.com.practice.maven.eclipse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robotclass {
	public static void main(String[] args) throws AWTException {
	//System.setProperty("webdriver.chrome.driver", "/Users/sriswedhav/Downloads/chromedriver");
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
	WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.get("https://www.monsterindia.com/");
driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
WebElement upload=driver.findElement(By.id("file-upload"));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();",upload);
Robot rb=new  Robot();
rb.keyPress(KeyEvent.VK_LEFT);
rb.keyRelease(KeyEvent.VK_LEFT);
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
/*StringSelection ss=new StringSelection("/Users/sriswedhav/Documents/Smoke Test _Aviation .xlsx");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);



rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);*/






}
}

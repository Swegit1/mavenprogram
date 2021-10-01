package com.practice.com.practice.maven.eclipse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Live Posting')]")).click();
		WebElement drpdwn=driver.findElement(By.name("category_id"));
		Select drpselect=new Select(drpdwn);
		List<WebElement> options=drpselect.getOptions();
		ArrayList org=new ArrayList();
		ArrayList temp=new ArrayList();
		for (WebElement option:options)
		{
			org.add(option.getText());
			temp.add(option.getText());
			
		}
		System.out.println("Original list "+org);
		System.out.println("Temp list "+temp);
		Collections.sort(temp);
		System.out.println("aftersorting"+temp);
		
		
		
	}

}

package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login_without_xpath {
	static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Practice java and selenium from 13-08-2017\\Selenium_Practice\\src\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

}

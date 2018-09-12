package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver driver;
	
	@Test
	public void dropdownTestForIndigoApp(){
		//System.out.println(System.getProperty("user.dir")+"\\src\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Practice java and selenium from 13-08-2017\\Selenium_Practice\\src\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		WebElement ele=driver.findElement(By.xpath("//div[@id='oneWay']/following::input[1]"));
		Select s=new Select(ele);
		s.selectByIndex(2);
	}

}

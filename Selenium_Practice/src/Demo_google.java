import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.co.in");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Ant");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='sbse3']/div[2]")).click();
		
		
		
		

	}

}

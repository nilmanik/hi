package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Practice java and selenium from 13-08-2017\\Selenium_Practice\\src\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://my.monsterindia.com/create_account.html");
		driver.findElement(By.id("wordresume")).click();
		
		//Below 2 statement used as a cntrl+c..means copy the file path to the clipboard for the popup 
		StringSelection sel = new StringSelection("E:\\resume\\resume for 3+ exp\\HCL RESUME.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);;
		
		//create robot class which is already present into the java.awt package
		Robot robot=new Robot();
		
		//now press the ctrl and v keys from the keyboard for paste to the file path of the popup
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		// Release both the key CTRL and V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
		        
		// Press virtual Enter button which is clicked to open button 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 System.out.println("photo uploaded successfully");
		
		
		
		
	}
}

package sarika;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framework {

	private static final Object ActualUID = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aditya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("OKP335");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("WSX12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("7654321");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		String actualUID =driver.findElement(By.xpath("//span[text()='OKP335']")).getText();
		String expectedUId="OKP335";
		if(expectedUId.equals(ActualUID))
		{
			System.out.println("TC pass");
		}
		else {
			System.out.println("TC fail");
		}
	
	}

	}



package sarika;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withdraganddrop {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream file= new FileInputStream("D:\\excell sheet\\Book1.xlsx");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aditya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aditya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}

}

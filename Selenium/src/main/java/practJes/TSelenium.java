package practJes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String exePath= "./driver/chromedriver.exe"; // 
 System.setProperty("webdriver.chrome.driver", exePath); 
 WebDriver driver = new ChromeDriver ();
 driver.get ("https://www.google.com.mx"); 
	}

}

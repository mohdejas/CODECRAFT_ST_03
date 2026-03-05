package task02;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromebrows {

	

		public static void main(String[] args) {	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://shoplane-by-lassie.netlify.app/");
			driver.manage().window().maximize();
					
			}

	}
	

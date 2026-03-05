package task02;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefoxbrows {

	public static void main(String[] args) {	
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://shoplane-by-lassie.netlify.app/");
		driver.manage().window().maximize();
				
		}

		}

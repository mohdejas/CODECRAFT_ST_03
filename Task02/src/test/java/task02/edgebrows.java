package task02;

import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class edgebrows {

	public static void main(String[] args) {	
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://shoplane-by-lassie.netlify.app/");
		driver.manage().window().maximize();
				
		}

		}

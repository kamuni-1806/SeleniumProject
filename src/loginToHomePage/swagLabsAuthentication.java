package loginToHomePage;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.edge.EdgeDriver;

public class swagLabsAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Selenium Project!");
		
		/*
		 Edge options to add the Edge Options
		 Example to maximize the Windows
		 */
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\seleniumProject\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(options);
		
		driver.get("https://www.saucedemo.com/v1");
		
		System.out.println(driver.getCurrentUrl());
		
//		driver.close();  Closed the session which the browser has opened 
//		driver.quit();    Closes all the browsers which are opened
	}

}

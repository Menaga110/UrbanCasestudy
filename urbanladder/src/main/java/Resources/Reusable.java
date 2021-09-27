package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reusable {

	
		// TODO Auto-generated method stub
		public static WebDriver driver;
		public Properties p;
		public String url;
		public WebDriver initialize() throws IOException {
			p=new Properties();
			FileInputStream s=new FileInputStream("C:\\Users\\Menaga K\\Downloads\\UrbanBDD (2)\\UrbanBDD\\src\\main\\java\\Resources\\data.properties");
		    p.load(s);
		     url=p.getProperty("url");
		    String browserName=p.getProperty("browser");
		    if(browserName.equals("Chrome")) {
		    	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
		    }
		    else if(browserName.equals("firefox")) {
		    	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				
			}
			else if(browserName.equals("edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Program Files\\msedgedriver.exe");
				driver=new EdgeDriver();
		    }
			return driver;

		}
		public void getscreenshot(String result) throws IOException {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(src,new File("C://test//"+result+"screenshot.png"));
			
		}
}

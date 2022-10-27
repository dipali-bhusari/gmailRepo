package cucumber.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.log4testng.Logger;

//import com.fastrack22.keywords.UIKeywords;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITestKeyword {
	
	public static RemoteWebDriver driver;
	private static final Logger log=Logger.getLogger((UITestKeyword.class));
		
	public static void openBrowser(String browserName) {
			
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}else if (browserName.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}else if (browserName.equalsIgnoreCase("IE")) { 
				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();

			} else if(browserName.isEmpty()) {
				browserName="Chrome";
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				System.out.println("Setting default browser as Chrome");
			} else {
				browserName="Chrome";
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				log.info("Setting default browser as Chrome");
			}
		}

		public static void launchURL(String url) {
			driver.get(url);
			System.out.println(url + "url is launched successfully!!");
			driver.manage().window().maximize();
		}

		public static void tearDown() {
			driver.close();
			//log.info("Browser is closed successfully!!");
		}
		public static void getTitle() {
			String title= driver.getTitle();
			log.info(title);
			System.out.println(title);
		}

		/*
		 * public static void clickOnSearchBar(WebElement element) {
		 * UITestKeyword.click(element); }
		 */

		//WebElement element=null;
		/*
		 * public static void enterText(WebElement element,String productName) {
		 * driver.findElement(element).sendKeys(productName); }
		 */
				
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;            
		 * js.executeScript("window.scrollBy(0,350)", "");
		 */
		}

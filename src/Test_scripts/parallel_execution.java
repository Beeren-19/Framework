package Test_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel_execution {

	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void par_exe(String browser)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		if (browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
	}
}

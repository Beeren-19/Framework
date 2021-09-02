package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Base_page;

public class facebook_login extends Base_page
{

	@FindBy(xpath="//input[@id='email']")
	private WebElement untbox;
	@FindBy(id="pass")
	private WebElement pwdtbox;
	@FindBy(xpath="//button[@name='login']")
	private WebElement lgnbtn;
	
	public facebook_login(WebDriver driver)
	{
		super(driver);
	}
	
	public void setmail(String mail)
	{
		untbox.sendKeys(mail);
	}
	
	public void setpwd(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		lgnbtn.click();
	}
	
}

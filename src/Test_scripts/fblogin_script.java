package Test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_test;
import Generic.excelgeneric;
import POM_class.facebook_login;

public class fblogin_script extends Base_test
{

	@Test
	public void login()
	{
		String uname = excelgeneric.getData("Sheet1", 0, 0);
		String pwd = excelgeneric.getData("Sheet1", 1, 0);
		facebook_login fb=new facebook_login(driver);
		fb.setmail(uname);
		fb.setpwd(pwd);
		fb.clicklogin();
		Assert.fail();
	}
}

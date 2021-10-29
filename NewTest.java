package example;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	@Test(dataProvider = "testData")
	public void f(String username, String password)
	{
		Reporter.log(username);
		Reporter.log(password);
	}
	@DataProvider
	public Object[][] testData(){
		Object[][] obj = new Object[3][2];
		obj[0][0] = "admin";
		obj[0][1] = "manager";
		obj[1][0] = "user";
		obj[1][1] = "pwd";
		obj[2][0] = "qa";
		obj[2][1] = "password@123";
		return obj;
	}
}

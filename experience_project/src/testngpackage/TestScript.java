package testngpackage;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestScript extends Launch
{
	@DataProvider(name = "hemanth")
	String[][] data()
	{
		String[][] arr= {{"hemanth123","3546"},{"hefjhjh","344"},{"ahgvahg","567"},{"adhgfs","3464"},{"ashgfahg","9786865"}};
		return arr;
	}
	
	@Test(dataProvider = "hemanth")
	void funcTest(String un,String pwd) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement emailtxt = driver.findElement(By.xpath("//input[@id='email']"));
		emailtxt.sendKeys(un);
		Thread.sleep(2000);
		WebElement pwdtxt = driver.findElement(By.xpath("//input[@id='pass']"));
		pwdtxt.sendKeys(pwd);
	}
}

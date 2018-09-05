package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Retro {

	public static void main(String[] args)
	{
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--disable-notifications");
		System.out.println("test");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		System.out.println("test1");
		WebDriver web = new ChromeDriver();
		web.get("https://www.nseindia.com");
	}

}
